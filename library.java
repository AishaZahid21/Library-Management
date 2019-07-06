import java.util.Scanner;
public class Publication {
	Scanner input = new Scanner(System.in);
	String name;
	double price;
	
	public String book_title() {
		System.out.println("Enter the Title of the Book: ");
		name = input.nextLine();
		return name;
	}
	
	public String Caset_title() {
		System.out.println("Enter the record Title: ");
		name = input.nextLine();
		return name;
	}
	
	public static void main(String[] args) {
		Publication pub = new Publication();
		Book book = new Book();
		Audio audio = new Audio();
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		switch(choice) {
		case 1:
			String name = pub.book_title();
			int pages = book.getdata();
			book.putdata(name, pages);
			break;
			
		case 2:
			String Name = pub.Caset_title();
			double Pages = audio.getdata();
			audio.putdata(Name, Pages);
			break;
		}

	}

}

 class Book extends Publication{
	Publication pub = new Publication();
	public int getdata() {
		System.out.println("Enter number of pages you want to print: ");
		int pages = pub.input.nextInt();
		return pages;
	}
	
	public void putdata(String name , int pages ) {
		System.out.println("Title of the Book is: " + name + " and page of the book is: " + pages);
		System.out.println("Service charges: 150 & 8.5 per page rate: ");
		double rates = 150 + (8.5 * pages);
		System.out.println("Price is: " + rates);
	}
}
 
 class Audio extends Publication{
	 Publication pub = new Publication();
	 public double getdata() {
		 System.out.println("Enter duration of audio in minutes: ");
		 double time = pub.input.nextDouble();
		 return time;
	 }
	 
	 public void putdata(String name , double time) {
		 System.out.println("Name of the caset is: " + name + " and duration is: " + time);
		 System.out.println("Service charges 250 \n 25.5 per minute");
		 double rate = 250 + (25.5 * time);
		 System.out.println("Price is: " + rate);
	 }
 }