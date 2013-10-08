import javax.swing.JOptionPane;


public class Question_8 {

	public static void main (String args[]){
		
		String name=JOptionPane.showInputDialog ("Enter name");
		String age=JOptionPane.showInputDialog ("Enter age");
		String num=JOptionPane.showInputDialog("Enter number");
		
		int intAge=Integer.parseInt(age);
		int number=Integer.parseInt(num);
		
		int var;
		var=intAge+number;
		
		System.out.println(name+" is "+intAge+" years old. In " + number+" years they will be " + var + " years old");
	}
}
