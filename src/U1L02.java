import javax.swing.JOptionPane;

public class U1L02 {

	public static void main(String[] args) {
		//define variables for amounts of each coin
		/*
		 * ok so I just put these in comments because I tried to figure out how to solve
		 * this but it won't work so now I;m just going to try with modular.
		 * 
		int pennies = 1;
		
		//get input from user (change to usable value)
		String answer = JOptionPane.showInputDialog("Enter a monetary value (ex: 1.56): ");
		double cash = Double.parseDouble(answer);
		pennies = (int)(cash * 100);
		 int nickels = 5;
		 int dimes = 10;
		 int quarters = 25;
		//System.out.println(pennies);
	

		
		//loop subtracting coin amount until money < coin amount
		while (pennies > 5) {
			pennies -= 5;
			
		}
		while (nickels > 5) {
			nickels -= 5;
		}
		while (dimes > 10) {
			dimes -= 10;
		}
		while (quarters > 1) {
			quarters -= 25;
		}
			
			
		// MATHEMATICAL METHOD
		// GET INPUT FROM USER
		// divide by 5 and round down
		System.out.println(nickels);
		System.out.println(dimes);
		System.out.println(quarters);
		// subtract # of nickels times 5 from amount to get pennies
		// print answer
	
			
		
		//pennies = money * 100 <-- don't need b/c converted to integer value
		
		//print answer
		JOptionPane.showMessageDialog(null, cash + " is " + nickels + " nickels " + pennies + " pennies " + dimes + " dimes " + "and " + quarters + " quarters.");
		*/
		
		
		
		String answer = JOptionPane.showInputDialog("Enter a monetary value (ex: 1.56): ");
		double cash = Double.parseDouble(answer);
		//pennies = (int)(cash * 100);
		//nickels = (int)(cash * 20);
		//dimes = (int)(cash * 10);
		//quarters = (int)(cash * 4);
		
		double pennies = 1;
		double nickels = 5;
		double dimes = 10;
		double quarters = 25;
		
		double totalquarters = (cash / quarters);
		cash %= quarters;
		double totalnickels = (cash / nickels);
		cash %= nickels;
		double totaldimes = (cash / dimes);
		cash %= dimes;
		double totalpennies = (cash / pennies);
		cash %= pennies;
		
		JOptionPane.showMessageDialog(null, cash + " is " + totalnickels + " nickels " + totalpennies + 
				" pennies " + totaldimes + " dimes " + "and " + totalquarters + " quarters.");
		

	}

}
