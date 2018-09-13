import javax.swing.JOptionPane;

public class U1L02 {

	public static void main(String[] args) {
		//define variables for amounts of each coin
		int pennies = 0;
		
		//get input from user (change to usable value)
		String answer = JOptionPane.showInputDialog("Enter a monetary value (ex: 1.56): ");
		double cash = Double.parseDouble(answer);
		pennies = (int)(cash * 100);
		 int nickels = 0;
		//System.out.println(pennies);
	

		
		//loop subtracting coin amount until money < coin amount
		while (pennies > 5) {
			nickels++;
			pennies -= 5;
			
			
		// MATHEMATICAL METHOD
		// GET INPUT FROM USER
		// divide by 5 and round down
		int money = (int)(cash/0.05);
		System.out.println(nickels);
		// subtract # of nickels times 5 from amount to get pennies
		// print answer
	
		}
			
		
		//pennies = money * 100 <-- don't need b/c converted to integer value
		
		//print answer
		JOptionPane.showMessageDialog(null, cash + " is " + nickels + " nickels " + pennies + " pennies.");
		

	}

}
