import javax.swing.JOptionPane;


public class question7 {
	
	public static void main(String args[]){
		String num1=JOptionPane.showInputDialog ("Enter num1");
		String num2=JOptionPane.showInputDialog ("Enter num2");
		isInteger(num1);
		isInteger(num2);
		int number1=Integer.parseInt(num1);
		int number2=Integer.parseInt(num2);
		int var=number1*number2;
		System.out.println(num1 +" x "+ num2 +" = " +var);
		
	}
	public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
        	System.out.println("Invalid input");
            return false; 
        }
     
        return true;
    }

}
