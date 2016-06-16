import java.util.ArrayList;
import java.util.List;

public class LeetCode102 {

	public static List<List<Integer>> levelOrder(TreeNode root) {
		if(root==null)
        {
        	 List<List<Integer>> listOfList=new ArrayList<>();
             
             return listOfList;
        }
        else if(root.right==null&&root.left==null) 
        {
            List<List<Integer>> listOfList=new ArrayList<>();
            List<Integer> list=new ArrayList<>();
            list.add(root.val);
            listOfList.add(list);
            return listOfList;
        }
        else {
            
            List<List<Integer>> rightListOfList=levelOrder(root.right);
            List<List<Integer>> leftListOfList=levelOrder(root.left);
            List<List<Integer>> newListOfList=new ArrayList<>();
             List<Integer> list=new ArrayList<>();
            list.add(root.val);
            newListOfList.add(list);
            int listLength=Math.min(rightListOfList.size(),leftListOfList.size());
            for(int i=0;i<listLength;i++)
            {  
                 list=new ArrayList<>();
                  for(int j=0;j<leftListOfList.get(i).size();j++)
                {
                    list.add(leftListOfList.get(i).get(j));
                }
                for(int j=0;j<rightListOfList.get(i).size();j++)
                {
                    list.add(rightListOfList.get(i).get(j));
                }
                 
                newListOfList.add(list);
            }
            if(rightListOfList.size()>=leftListOfList.size())
            {
                 for(int i=listLength;i<rightListOfList.size();i++)
            {  
                 list=new ArrayList<>();
                for(int j=0;j<rightListOfList.get(i).size();j++)
                {
                    list.add(rightListOfList.get(i).get(j));
                }
                 
                newListOfList.add(list);
            }
             
            }
            else if(rightListOfList.size()<leftListOfList.size())
            {
                 for(int i=listLength;i<leftListOfList.size()-listLength;i++)
            {  
                 list=new ArrayList<>();
                for(int j=0;j<leftListOfList.get(i).size();j++)
                {
                    list.add(leftListOfList.get(i).get(j));
                }
                 
                newListOfList.add(list);
            }
             
            } 
            
           return newListOfList;
            
        }
        
    }
	public static void main(String arg[])
	{
		/*TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		TreeNode node=root.right;
		node.left=new TreeNode(15);
		node.right=new TreeNode(7);*/
		TreeNode root =new TreeNode(1);
		root.left=new TreeNode(2);
		List<List<Integer>>l=levelOrder(root);
		System.out.println("[");
		for(int i=0;i<l.size()-1;i++)
		{
			System.out.print("[");
			for(int j=0;j<l.get(i).size()-1;j++)
			{
				System.out.print(l.get(i).get(j)+",");
			}
			System.out.print(l.get(i).get(l.get(i).size()-1));
			System.out.print("]");
			System.out.println(",");
		}
		System.out.print("[");
		for(int j=0;j<l.get(l.size()-1).size()-1;j++)
		{
			System.out.print(l.get(l.size()-1).get(j)+",");
		}
		System.out.print(l.get(l.size()-1).get(l.get(l.size()-1).size()-1));
		System.out.println("]");
		
		
		System.out.println("]");
	}
}
