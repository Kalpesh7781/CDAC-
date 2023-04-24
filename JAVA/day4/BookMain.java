package day4;

public class BookMain {
public static void main(String[] args) {
	Book b1=new Book();
	b1.setName("Harry potter");
	b1.setPrice(1500.110);
	b1.setQty(50);
 
 System.out.println(b1.getName());
 System.out.println(b1.getPrice());
 System.out.println(b1.getQty());
 b1.getAuth();
}
}
