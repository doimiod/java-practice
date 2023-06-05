import javax.swing.JOptionPane;
import java.util.Scanner;

public class DisposableIncome {
	
	public static final double INCOME_TAX_RATE=0.35;
	public static final double DISPOSABLE_INCOME_AV=500; 
	
	public static void main(String[] args) {
		
     	String salary = JOptionPane.showInputDialog("What is your salary in a month before tax? (Euros.Cents)");
	    Scanner salaryScanner = new Scanner(salary);
	    double pureSalary = salaryScanner.nextDouble(); 
	    
		String accommodation =JOptionPane.showInputDialog("How much do you spend in rent/mortgage a month?");
		Scanner accommodationScanner =new Scanner(accommodation);
		double rent=accommodationScanner.nextDouble();
		
		String commute = JOptionPane.showInputDialog("How much does your commute cost a month?");
		Scanner commuteScanner = new Scanner(commute);
		double travelCost=commuteScanner.nextDouble();
		
		String food= JOptionPane.showInputDialog("How much do you spend on food per month?");
		Scanner foodScanner =new Scanner(food);
		double foodCost=foodScanner.nextDouble();
		
		salaryScanner.close();
		accommodationScanner.close();
		commuteScanner.close();
		foodScanner.close();
		
		  double disposableSalary = ((double)pureSalary)*(1-INCOME_TAX_RATE)-((double)rent)-((double)travelCost)-((double)foodCost);
		  double disposableIncome = Math.round( (double)disposableSalary*(double) 100)/(double)100;
		  // I used Math.round to make the decimal places shorter
		  
		  double percentageOfDisposableSalary = ( (double)disposableSalary/pureSalary)*100;
		  double proportionOfDisposableSalary = Math.round( (double)percentageOfDisposableSalary*(double)100 )/(double)100;
	
		  
		  
	        JOptionPane.showMessageDialog(null, "Your monthly disposable income is €"+disposableIncome+",which is "+proportionOfDisposableSalary+"%of your salary");
		
	        
	        if (disposableIncome >= 750) {
	        	JOptionPane.showMessageDialog(null,"Your disposable income is much more than the average.(av=€"+DISPOSABLE_INCOME_AV+")");
	        }
	        else if (disposableIncome > 500 && disposableIncome < 750) {
	        	JOptionPane.showMessageDialog(null,"Your disposable income is more than the average.(av=€"+DISPOSABLE_INCOME_AV+")"); 
	        }
	        else if (disposableIncome == 500) {
	        	JOptionPane.showMessageDialog(null,"Your disposable income is exactly the average.(av=€"+DISPOSABLE_INCOME_AV+")");
	        }
	        else if (disposableIncome >= 250 && disposableIncome < 500) {
	        	JOptionPane.showMessageDialog(null,"Your disposable income is less than the average.(av=€"+DISPOSABLE_INCOME_AV+")");
	        }
	        else if (disposableIncome < 0 && disposableIncome < 250) {
	        	JOptionPane.showMessageDialog(null,"Your disposable income is much less than the average.(av=€"+DISPOSABLE_INCOME_AV+")"); 
	        }
	        else if (disposableIncome == 0) {
	        	JOptionPane.showMessageDialog(null,"You do not have disposable income.");
	        }
	
	}
	
}
	   