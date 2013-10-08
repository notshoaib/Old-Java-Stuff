import java.io.IOException;

import javax.swing.JOptionPane; 

public class Assignment {

	
	public static void main (String args[]){
		String Choice = null;
		
		Choice=JOptionPane.showInputDialog ("Choose a b or c");
		
		char c = Choice.charAt(0);
					switch (c){
			case 'a': System.out.println("Echo "+c);
			break;
			case 'b': System.out.println("Echo "+c);
			break;
			case 'c': System.exit(0) ;
			break;
			default: System.out.println("Error");
			break;
			}
					
					

}
	

}
	
	
		
	

