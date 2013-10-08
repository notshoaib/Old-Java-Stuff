import javax.swing.JOptionPane;


public class question2 {
	
	public static void main (String args[]){
		String Name=null;
		
		String SPLimit,Speed;
		int limit, speed, overlimit;
		Name=JOptionPane.showInputDialog ("Enter Your Name");
		SPLimit=JOptionPane.showInputDialog("Enter the Speed Limit");
		Speed=JOptionPane.showInputDialog("Enter your Speed");
		
		speed=Integer.parseInt(Speed);
		limit=Integer.parseInt(SPLimit);
		
		overlimit= speed-limit;
		
		if(overlimit>=1&&overlimit<=10){
			System.out.println(Name+" will pay a $50 fine");
			
		}
		else if(overlimit>=11&&overlimit<=20){
			System.out.println(Name+" will pay a $75 fine");
			
		}
		else if(overlimit>20){
			System.out.println(Name+" will pay a $100 fine and lose their license for 3 months");
			
		}
		else 
			System.out.println(Name+" was not speeding");
		

		

		
		
		
		
		
}
	
}
