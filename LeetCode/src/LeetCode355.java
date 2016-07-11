import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class LeetCode355 {


    private HashMap<Integer, HashMap<Integer, Integer>> hm;
    private Stack<int[]> stack;
    /** Initialize your data structure here. */
    public LeetCode355() {
        hm=new HashMap<>();
        stack=new Stack<>();
        
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        int [] inf=new int[2];
        inf[0]=userId;
        inf[1]=tweetId;
        stack.push(inf);
        
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
         HashMap<Integer, Integer> followeeList=hm.get(userId);
         Stack<int[]> tempStack=new Stack<>();
         List<Integer> list=new ArrayList<>();
         
         
         while(!stack.isEmpty()&&list.size()<10)
         {
             int[] inf=stack.pop();
             if(inf[0]==userId)
             list.add(inf[1]);
             if(followeeList!=null){
             if(followeeList.containsKey(inf[0]))
             list.add(inf[1]);}
             tempStack.push(inf);
         }
         while(!tempStack.isEmpty())
         {
             stack.push(tempStack.pop());
         }
         
        return list;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
    	if(followerId!=followeeId){
        if(hm.containsKey(followerId))
        {
            HashMap<Integer, Integer> followeeList=hm.get(followerId);
            if(!followeeList.containsKey(followeeId))
            {
                int counter=followeeList.size();
                followeeList.put(followeeId,counter);
            }
        }
        else {
            HashMap<Integer, Integer> followeeList=new HashMap<>();
            followeeList.put(followeeId,1);
            hm.put(followerId,followeeList);
        }
    	}
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
    	if(followerId!=followeeId){
        if(hm.containsKey(followerId))
        {
            HashMap<Integer, Integer> followeeList=hm.get(followerId);
            if(followeeList.containsKey(followeeId))
            {
                followeeList.remove(followeeId);
                if(followeeList.size()==0)
                hm.remove(followerId);
               
            }
        }}
    }
    
    public static void main(String[] args)
    {
    	/*
    	 * ["Twitter","postTweet","getNewsFeed","follow","postTweet","getNewsFeed","unfollow","getNewsFeed"]
[[],[1,5],[1],[1,2],[2,6],[1],[1,2],[1]]
    	 */
    	LeetCode355 obj = new LeetCode355();
    		 obj.postTweet(1,5);
    		 List<Integer> param_2 = obj.getNewsFeed(1);
    		 obj.follow(1,2);
    		 obj.postTweet(2,6);
    		 List<Integer> param_3 = obj.getNewsFeed(1);
    		 obj.unfollow(1,2);
    		 List<Integer> param_4 = obj.getNewsFeed(1);
    }
}
