 class Trie2 {
	class Value{
	    private int value;
	    public Value()
	    {
	        
	    }
	    public Value(int value)
	    {
	        this.value=value;
	    }
	}
	class TrieNode {
	    // Initialize your data structure here.
	    private Value valueObject;
	    private char charValue;
	    private TrieNode[] nodes;
	    public TrieNode() {
	       valueObject=null;
	       charValue=' ';
	      TrieNode[] nodes=null;
	    }
	    
	     public TrieNode(char charValue)
	    {
	         this.charValue=charValue;
	        nodes=new TrieNode[26];
	    }
	}

	 private TrieNode root;
	    private int counter;
	    public Trie2() {
	          root=new TrieNode( ' ');
	          
	    }

	    // Inserts a word into the trie.
	    public void insert(String word) {
	        if(word!=null&&word.length()!=0)
	        {
	            char[] charArray=word.toCharArray();
	            TrieNode currentNode=root;
	            TrieNode newRoot=currentNode;
	            
	            for(int i=0;i<charArray.length;i++)
	            {
	                int position=getPosition(charArray[i]);
	                if(currentNode.nodes[position]==null)
	                {
	                	TrieNode node=new TrieNode();
	                	currentNode.nodes[position]=node;
	                    if(i==charArray.length-1)
	                    {     
	                         node.valueObject=new Value(counter);
	                         counter++;
	                    }
	                    else 
	                 node.valueObject=null;
	                    currentNode.nodes[position].charValue=charArray[i]; 
	                    node.nodes=new TrieNode[26];
	                     currentNode=currentNode.nodes[position];
	                }
	                else if(currentNode.nodes[position].charValue==charArray[i])
	                	  if(i==charArray.length-1)
		                    {     
	                		  currentNode.nodes[position].valueObject=new Value(counter);
		                         counter++;
		                    }
	                	  else  currentNode=currentNode.nodes[position];
	            }
	            root=newRoot;
	        }
	        
	    }

	    // Returns if the word is in the trie.
	    public boolean search(String word) {
	    	TrieNode cr=root;
	    	return search(word, cr);
	    }
	    public boolean search(String word, TrieNode node) {
	    	if(node==null) return false;
	           char[] charArray=word.toCharArray();
	           TrieNode currentNode =node;
	             for(int i=0;i<charArray.length;i++)
	            {
	                if(charArray[i]=='.'&&i!=charArray.length-1)
	                {
	                    for(int j=0;j<26;j++)
	                    {
	                    	if(currentNode==null) return false ;
	                        currentNode=currentNode.nodes[j];
	                        if(currentNode!=null){
	                        boolean result=search(word.substring(i+1),currentNode);
	                        if (result==true)
	                        	return true;}
	                        currentNode=node;
	                    }
	                    return false;
	                }
	                else if(charArray[i]=='.'&&i==charArray.length-1)
	                {
	                     for(int j=0;j<26;j++)
	                    {
	                     if(currentNode.nodes[j]!=null &&currentNode.nodes[j].valueObject!=null) return true;
	                    
	                    }
	                    return false;
	                    
	                }
	                else {
	                 int position=getPosition(charArray[i]);
	                 if(i==charArray.length-1)
	                 {
	                     if(currentNode.nodes[position]==null) return false;
	                     else if(currentNode.nodes[position].valueObject==null) return false;
	                    	 return true;
	                 }
	                 else {
	                     if(currentNode.nodes[position]==null)
	                     return false;
	                     else  return search(word.substring(i+1),currentNode.nodes[position]);
	                     
	                 }
	                    
	                }
	            }
	             return false ;
	    }
	    public int getPosition(char charValue)
	    {
	        if(charValue=='a') return 0;
	        else if(charValue=='b') return 1;
	        else if(charValue=='c') return 2;
	        else if(charValue=='d') return 3;else if(charValue=='e') return 4;else if(charValue=='f') return 5;else if(charValue=='g') return 6;else if(charValue=='h') return 7;else if(charValue=='i') return 8;else if(charValue=='j') return 9;else if(charValue=='k') return 10;else if(charValue=='l') return 11;
	        else if(charValue=='m') return 12;else if(charValue=='n') return 13;else if(charValue=='o') return 14;else if(charValue=='p') return 15;else if(charValue=='q') return 16;else if(charValue=='r') return 17;else if(charValue=='s') return 18;else if(charValue=='t') return 19;else if(charValue=='u') return 20;else if(charValue=='v') return 21;else if(charValue=='w') return 22;else if(charValue=='x') return 23;else if(charValue=='y') return 24;else  return 25;
	    }
	    
}


public class LeetCode211 {
	   Trie2 trieObject=new Trie2();

	    // Adds a word into the data structure.
	    public void addWord(String word) {
	        trieObject.insert(word);
	        
	    }

	    // Returns if the word is in the data structure. A word could
	    // contain the dot character '.' to represent any one letter.
	    public boolean search(String word) {
	       return  trieObject.search(word);
	    }
	public static void main(String[] args) {
		LeetCode211 obj211=new LeetCode211();
		obj211.addWord("a");
		obj211.addWord("a");
		System.out.println(obj211.search("."));
		
		System.out.println(obj211.search("a"));
		System.out.println(obj211.search("aa"));
		System.out.println(obj211.search(".a"));
		System.out.println(obj211.search("a."));
	}

}
