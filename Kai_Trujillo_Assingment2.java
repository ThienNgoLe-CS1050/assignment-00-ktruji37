import javax.swing.JOptionPane;

public class Kai_Trujillo_Assingment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring Variables
		String firstName;
		char middleInitial;
		String lastName;
		int age;
		double grossAnnualPay;
		double taxRate;
		double netAnnualPay;
		
		// Reading input
		firstName = JOptionPane.showInputDialog("Enter your first name: ");
		String middleInitialString = JOptionPane.showInputDialog("Enter your middle Initial: ");
		middleInitial = middleInitialString.charAt(0); // Makes first character of the middle name as middle initial
		lastName = JOptionPane.showInputDialog("Enter your last name: ");
		age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
		grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog("Enter your gross annual pay: "));
		taxRate = Double.parseDouble(JOptionPane.showInputDialog("Enter your tax rate (ex: 0.08 for 8%): "));
		
		//Processing data
		netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);
		
		//Displaying the output
		System.out.println("Hello " + firstName + " " + middleInitial + ". " + lastName + ",");
		System.out.println("You are " + age + " years old now.");
		System.out.println("It is amazing that you made $" + grossAnnualPay + " this year.");
		System.out.println("With the tax rate of " + taxRate + ", you can take home $" +netAnnualPay + ".");
		
		// Step 1: Get user input 
		// Step 2: Calculate the net pay
		// Step 3: Display the results
	}

}
