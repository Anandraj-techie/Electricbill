package test;

import java.util.*;

public class ebillMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("**************************************");
		System.out.println("Welcome to Online EB Payment System");
		System.out.println("**************************************");
		System.out.print("Enter name: ");
        String customerName = scanner.nextLine();
		System.out.print("Enter Consumer  EB no : ");
		int Consumerno=scanner.nextInt();
        System.out.print("Consumed units: ");
		int unit=scanner.nextInt();
		
		
		
		double amt = 0;
		if(unit<500) {
			if (unit < 0) {
	            System.out.println("Meter reading cannot be negative.");
	            return;
	        }
			
			if(unit<=100) {
				amt=unit*0;
				System.out.println("*********************************");

				System.out.println("\nElectricity Bill");
				
				System.out.println("\nConsumer name : "+ customerName);
				System.out.println("Consumer EB no : "+ Consumerno);
				System.out.println("Consumed  : "+ unit + " Units");
				System.out.println("Bill to pay:"+amt);
				System.out.println("*********************************");
                 return ;
			
			}
			else if(unit>=101 && unit<=200) {
				
				amt=(unit-100)*2.25;
				System.out.println("*********************************");

				System.out.println("\nElectricity Bill");
				System.out.println("\nConsumer name : "+ customerName);
				System.out.println("Consumer EB no : "+ Consumerno);
				System.out.println("Consumed  : "+ unit + " Units");
				System.out.println("Bill to pay:"+amt);
				System.out.println("*********************************");

				
			}
			else if(unit>=201 && unit<=300) {
				amt=(unit-100)*3.50;
				System.out.println("*********************************");

				System.out.println("\nElectricity Bill");
				System.out.println("\nConsumer name : "+ customerName);
				System.out.println("Consumer EB no : "+ Consumerno);
				System.out.println("Consumed  : "+ unit + " Units");
				System.out.println("Bill to pay:"+amt);
				System.out.println("*********************************");

				
			}
			else if(unit>=301 && unit<=400) {
				amt=(unit-100)*4.50;
				System.out.println("*********************************");

				System.out.println("\nElectricity Bill");
				System.out.println("\nConsumer name : "+ customerName);
				System.out.println("Consumer EB no : "+ Consumerno);
				System.out.println("Consumed  : "+ unit + " Units");
				System.out.println("Bill to pay:"+amt);
				System.out.println("*********************************");

				
			}
			else if(unit>=401 && unit<=499) {
				amt=(unit-100)*5.50;
				System.out.println("*********************************");

				System.out.println("\nElectricity Bill");
				System.out.println("\nConsumer name : "+ customerName);
				System.out.println("Consumer EB no : "+ Consumerno);
				System.out.println("Consumed  : "+ unit + " Units");
				System.out.println("Bill to pay:"+amt);
				System.out.println("*********************************");

		}
		}
		else if(unit>=500) {
			
			
			 if(unit>=500 && unit<=600) {
				amt=(unit-100)*6;
				System.out.println("*********************************");

				System.out.println("\nElectricity Bill");
				System.out.println("\nConsumer name : "+ customerName);
				System.out.println("Consumer EB no : "+ Consumerno);
				System.out.println("Consumed  : "+ unit + " Units");
				System.out.println("Bill to pay:"+amt);
				System.out.println("*********************************");

				
			}
			else if(unit>=601 && unit<=700) {
				amt=(unit-100)*8;
				System.out.println("*********************************");

				System.out.println("\nElectricity Bill");
				System.out.println("\nConsumer name : "+ customerName);
				System.out.println("Consumer EB no : "+ Consumerno);
				System.out.println("Consumed  : "+ unit + " Units");
				System.out.println("Bill to pay:"+amt);
				System.out.println("*********************************");

				
			}
			else if(unit>=701 && unit<=800) {
				amt=(unit-100)*9;
				System.out.println("*********************************");

				System.out.println("\nElectricity Bill");
				System.out.println("\nConsumer name : "+ customerName);
				System.out.println("Consumer EB no : "+ Consumerno);
				System.out.println("Consumed  : "+ unit + " Units");
				System.out.println("Bill to pay:"+amt);
				System.out.println("*********************************");

				
			}
			else if(unit>=801 && unit<=900) {
				amt=(unit-100)*10;
				System.out.println("*********************************");
				System.out.println("\nElectricity Bill");
				System.out.println("\nConsumer name : "+ customerName);
				System.out.println("Consumer EB no : "+ Consumerno);
				System.out.println("Consumed  : "+ unit + " Units");
				System.out.println("Bill to pay:"+amt);
				System.out.println("*********************************");

				
			}
			else if(unit>900) {
				amt=(unit-100)*11;
				System.out.println("*********************************");
				System.out.println("\nElectricity Bill");
				System.out.println("\nConsumer name : "+ customerName);
				System.out.println("Consumer EB no : "+ Consumerno);
				System.out.println("Consumed  : "+ unit + " Units");
				System.out.println("Bill to pay:"+amt);
				System.out.println("*********************************");

				
			}
			
		}
		
	        	
	      	
		System.out.println("*********************************");
    	       
		System.out.println("Welcome to the Payment System!");
		
		System.out.println("*********************************");
		System.out.println("\n Choose a payment method:");
            System.out.println("1. Debit or Credit card ");
            System.out.println("2. Net Banking");
            System.out.println("3. UPI");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    processCreditCardPayment();
                    break;
                case 2:
                    processNetBankingPayment();
                    break;
                case 3:
                    processUpiPayment();
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid payment method.");
            }
        
            System.out.println("**************************************");
            System.out.println("            Payment Receipt           ");
            System.out.println("**************************************");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Consumer Number: " + Consumerno);
            System.out.println("Amount Paid: ₹" + amt);
            System.out.println("Transaction id:  T2309281435503929086033" );
            System.out.println("**************************************");
            System.out.println("Thank you for your payment, " + customerName + "!");

	
}
    public static boolean authenticate(String username, String password) {
       
        return username.equals("edubridge") && password.equals("10141");
    }

    public static void processCreditCardPayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.print("Enter credit card  / Debit card number: ");
        String cardNumber = scanner.next();
        System.out.print("Enter expiration date: ");
        String expirationDate = scanner.next();
        System.out.print("Enter CVV: ");
        String cvv = scanner.next();

        System.out.println("Connecting to Payment Server .......... ");
        
      
        
        System.out.println("Processing credit card payment...");
        System.out.println("Payment successful! !");
    }

    public static void processNetBankingPayment() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter your Netbanking username id: ");
        String username = scanner.next();
        System.out.print("Enter your  password: ");
        String password = scanner.next();
        if (authenticate(username, password)) {
        System.out.println("Processing net banking payment...");
        System.out.println("Payment successful!");
        
        
    }
    	else {
            System.out.println("Login failed. Invalid username or password.");
        	}
    }
    public static void processUpiPayment() {
    	Scanner scanner = new Scanner(System.in);
    	 System.out.println("Enter Your Virtual Payment Id: ");
    	String sss=scanner.nextLine(); 
    	System.out.println("Payment link sended to UPI app  , Don't close this Window ");
    	 System.out.println("Processing UPI payment...");
        System.out.println("Payment successful!");
    

    }
  

}

	
