package LisnkedList;
public class LinkedList {
	  LinkedList l;
	    Node head; 
	    
       public void insert(int data) {
    	  Node node = new Node();
    	   node.data=data;
    	   node.next = null;
    	   if(head==null) {
    		   head=node;
    	   }
    	   else {
    		   Node n =head;
    		   while(n.next!=null) {
    			   n=n.next;
    		   }
    		   n.next=node;
    	   }
       }
       public void insertatpos(int data,int index) {
    	   if(index==0) {
    		   insertatstart(data);
    	   }
    	   else {
    	   Node node = new Node();
    	   node.data=data;
    	   node.next = null;
    	   Node temp =head;
    	   for(int i=0;i<=index-2;i++) {
    		  temp=temp.next;
    	   }
    	   node.next=temp.next;
    	   temp.next=node;
    	   }
       }

public void insertatstart(int data) {
	Node node = new Node();
	   node.data=data;
	   node.next = null;
	   node.next=head;
	   head=node;
}
      public void show() {
    	   Node node = head;
    	   while(node!=null) {
    		   System.out.println(node.data);
    		   System.out.println(node.next);
    		   node=node.next;
    	   }
       }
      public void delete(int x) {
    	  while(head.next!=null) {
    		  if(head.data==x) {
    			  head=head.next;
    			 
    		  }
    		  else {
    			 System.out.println("not found"); 
    		  }
    		  
    	  }
    	  head=head.next;
	  }
}

      
       

