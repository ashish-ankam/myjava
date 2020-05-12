package LisnkedList;

public class Runner {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insert(52);
		l.insert(65);
		l.insert(565);
		l.insert(78);
		l.insert(99);
		l.insert(100);
	   l.insertatstart(85);
	   
	   l.insertatpos(1000,2);
	   l.delete(78);
       l.show();
	}

}
