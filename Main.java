package Assignment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opt,choice,select;
		
		
		do {
		System.out.println("Please Select User as : \n1-Admin \n2-Customer");
		choice = scan.nextInt();
		switch(choice) {
		
		case 1 : System.out.println("** Grocery System **");
				 System.out.println("As an Admin you are allowed to enter : ");
		         do {
		         System.out.println("\n1.Finance System ");
		         opt = scan.nextInt();
		         switch(opt) {
		         case 1 :Finance em = new Finance();
		        	 	 System.out.println(em);break;
		         
		         }
		         System.out.println("Continue As Admin?(1-Yes,2-No)");
		 		 select = scan.nextInt();
		         }while(select==1);break;
		         
		         
		case 2 :do { 
				 System.out.println("** Welcome to the grocery **");
        		 System.out.println("\n1.Billing System \n2.Grocery Items \n3.Exit");
                 System.out.println("Please select your option : ");
                 opt = scan.nextInt();
                 switch(opt) {
                 case 1 :BillingSystem b = new BillingSystem();
                 		 System.out.println(b);break;
                 case 2 :GroceryItems a = new GroceryItems();
                	 	 System.out.println(a);break;
                	 	 
                 }
                 if(opt<1 && opt>3) {
                	 System.out.println("\n1.Grocery Background \n2.Grocery Items \n3.Exit");			         
                	 System.out.println("Please Choose");
			         opt = scan.nextInt();
		         }
                 System.out.println("Continue As Customer?(1-Yes,2-No)");
		 		 select = scan.nextInt();
		         }while(select==1);break;
        		 }
		System.out.println("Continue Using Grocery System?(1-Yes,2-No)");
		select = scan.nextInt();
		
		}while(select==1);
		System.out.println("Thankyou for come this Grocery.");
		
	}

}




