
public class Trie {
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

	    public Trie() {
	          root=new TrieNode( ' ');
	    }

	    // Inserts a word into the trie.
	    public void insert(String word) {
	        if(word!=null&&word.length()!=0)
	        {
	            char[] charArray=word.toCharArray();
	            TrieNode currentNode=root;
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
	        }
	        
	    }

	    // Returns if the word is in the trie.
	    public boolean search(String word) {
	           char[] charArray=word.toCharArray();
	            TrieNode currentNode=root;
	             for(int i=0;i<charArray.length;i++)
	            {
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
	                     else  currentNode=currentNode.nodes[position];
	                     
	                 }
	            }
	             return false ;
	    }

	    // Returns if there is any word in the trie
	    // that starts with the given prefix.
	    public boolean startsWith(String prefix) {
	         char[] charArray=prefix.toCharArray();
	            TrieNode currentNode=root;
	             for(int i=0;i<charArray.length;i++)
	            {
	                 int position=getPosition(charArray[i]);
	                 if(i==charArray.length-1)
	                	 {
	                	 if(currentNode.nodes[position]==null) return false;
	                	 else  return true;
	                	 }
	                 else {
	                     if(currentNode.nodes[position]==null)
	                     return false;
	                     else  currentNode=currentNode.nodes[position];
	                     
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
	    
	    public static void main(String[] args)
	    {
	    	Trie obj=new Trie();
	    	obj.insert("abcd");
	    	obj.insert("ab");
	    	obj.insert("abcde");
	    	obj.insert("abcdef");
	    	obj.insert("bcd");
	    	System.out.println(obj.search("abcd"));
	    	System.out.println(obj.search("ab"));
	    	System.out.println(obj.search("bcd"));
	    	System.out.println(obj.search("ac"));
	    	System.out.println(obj.search("abcdefghijk"));
	    	System.out.println(obj.startsWith("abc"));
	    	System.out.println(obj.startsWith("bf"));
	    	
	    	
	    	
	    }
}
