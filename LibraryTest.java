import java.util.Scanner;
public class LibraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please Enter Your Location");

		String Library_Location = scanner.nextLine();

		System.out.println("Please Enter Your The Total Books");

		String Library_Total_Books = scanner.nextLine();

		System.out.println ("Please Enter Your Staff Total");

		String Library_Staff_Total = scanner.nextLine();
		
		System.out.println ("Please Enter Your Yearly Expense");
		
		String YearlyExpense = scanner.nextLine();
		
		Library Library1 = new Library (Library_Location,Library_Total_Books,Library_Staff_Total ,YearlyExpense );
		
		System.out.println(Library1.Library_Location + Library1.Library_Total_Books + Library1.Library_Staff_Total +Library1.YearlyExpense);
		
		System.out.println("Please Enter Your Location");

		String Library_Location2 = scanner.nextLine();

		System.out.println("Please Enter Your The Total Books");

		String Library_Total_Books2 = scanner.nextLine();

		System.out.println ("Please Enter Your Staff Total");

		String Library_Staff_Total2 = scanner.nextLine();
		
		System.out.println ("Please Enter Your Yearly Expense");
		
		String YearlyExpense2 = scanner.nextLine();
		
Library Library2 = new Library (Library_Location2,Library_Total_Books2,Library_Staff_Total2 ,YearlyExpense2 );
		
		System.out.println(Library2.Library_Location + Library2.Library_Total_Books + Library2.Library_Staff_Total +Library2.YearlyExpense);
		
		System.out.println("Please Enter Your Location");

		String Library_Location3 = scanner.nextLine();

		System.out.println("Please Enter Your The Total Books");

		String Library_Total_Books3 = scanner.nextLine();

		System.out.println ("Please Enter Your Staff Total");

		String Library_Staff_Total3 = scanner.nextLine();
		
		System.out.println ("Please Enter Your Yearly Expense");
		
		String YearlyExpense3 = scanner.nextLine();
		
Library Library3 = new Library (Library_Location3,Library_Total_Books3,Library_Staff_Total3 ,YearlyExpense3 );
		
		System.out.println(Library3.Library_Location + Library3.Library_Total_Books + Library3.Library_Staff_Total +Library3.YearlyExpense);
		
		System.out.println("Please Enter Your Location");

		String Library_Location4 = scanner.nextLine();

		System.out.println("Please Enter Your The Total Books");

		String Library_Total_Books4 = scanner.nextLine();

		System.out.println ("Please Enter Your Staff Total");

		String Library_Staff_Total4 = scanner.nextLine();
		
		System.out.println ("Please Enter Your Yearly Expense");
		
		String YearlyExpense4 = scanner.nextLine();
		
Library Library4 = new Library (Library_Location4,Library_Total_Books4,Library_Staff_Total4 ,YearlyExpense4 );
		
		System.out.println(Library4.Library_Location + Library4.Library_Total_Books + Library4.Library_Staff_Total + Library4.YearlyExpense);
		
System.out.println(Library3.Library_Location + Library3.Library_Total_Books + Library3.Library_Staff_Total +Library3.YearlyExpense);
		
		System.out.println("Please Enter Your Location");

		String Library_Location5 = scanner.nextLine();

		System.out.println("Please Enter Your The Total Books");

		String Library_Total_Books5 = scanner.nextLine();

		System.out.println ("Please Enter Your Staff Total");

		String Library_Staff_Total5 = scanner.nextLine();
		
		System.out.println ("Please Enter Your Yearly Expense");
		
		String YearlyExpense5 = scanner.nextLine();
		
Library Library5 = new Library (Library_Location5,Library_Total_Books5,Library_Staff_Total5 ,YearlyExpense5 );
		
		System.out.println(Library5.Library_Location + Library5.Library_Total_Books + Library5.Library_Staff_Total + Library5.YearlyExpense);

	}

}
