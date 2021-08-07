package bank;

import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;


public class BankTest {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		CustomerDetails cd;
		CustomerDetailsServices cds = new CustomerDetailsServices();

		int ch;
		do {
			System.out.println("\n@@@@@@@@@@@ WELCOME TO SM INDIA BANK @@@@@@@@@@@@@");
			System.out.println("==============================================");
			System.out.println("              HOME			"); 
			System.out.println("==============================================");
			System.out.println( "\n1.Open Account"
					+ "\n2.Withdraw"
					+ "\n3.Deposit"
					+ "\n4.Check Balance"
					+ "\n5.Statement"
					+ "\n6.Display All"
					+ "\n7.Delete Account"
					+ "\n8.Exit");
			System.out.println("==============================================");
			System.out.println("		Enter an option			");
			System.out.println("==============================================");
			 ch=sc.nextInt();
			switch (ch) {
			
			case 1:
				System.out.println("==============================================");
				System.out.println("		ACCOUNT CREATION			");
				System.out.println("==============================================");
				System.out.println("Enter Account Holder Name: ");
				String name =sc.next();
				System.out.println("Enter Age : ");
				int age =sc.nextInt();
				
				if(age>=18){
					cd = new CustomerDetails(name,age);
					cds.insert(cd);
					System.out.println("\n\nTo activate your account, deposite a minimum amount of 1000 rupees"
							+ "\n\n"
							+ "---------Thankyou for using SM India Bank-----------------");
				}
				
				else {
					System.out.println("\nSorry!!! You are not eligible for opening an account ");
				}
								
				
				break;
				
			case 2:
				System.out.println("==============================================");
				System.out.println("		WITHDRAW			");
				System.out.println("==============================================");
				System.out.println("\nEnter Account Number :");
				//String acno= sc.next();
				
				break;
				
			case 3: 
				System.out.println("==============================================");
				System.out.println("		DEPOSIT			");
				System.out.println("==============================================");
				System.out.println("\nEnter Account Number :");
				//String acno4= sc.next();
				
				break;
				

			case 4: 
				
				System.out.println("\nEnter Account Number :");
				//String acno1= sc.next();
				break;
			case 5:
				System.out.println("\nEnter Account Number :");
				
				break;
				

			case 6: 
				System.out.println("==============================================");
				System.out.println("		ALL ACCOUNTS		");
				System.out.println("==============================================");

				
				break;
			case 7:
				System.out.println("==============================================");
				System.out.println("		DELETE ACCOUNT		");
				System.out.println("==============================================");
				System.out.println("\nEnter Account Number :");
				
				break;
			case 8:
				System.out.println("****************Thank you for choosing our service !!!*****************");
				break;
			
			default:
				System.out.println("==============================================");
				System.out.println("              INVALID OPTION          ");
				System.out.println("==============================================");

				break;
			}
			
		} while (ch!=8);
		sc.close();

	}

}