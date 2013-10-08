import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class question3 {

		public static void main(String args[]){
			
			int numwidgets;
			int sCharge=3;
			float price;
			String widInput=null;
			
			widInput=JOptionPane.showInputDialog ("Enter How many widgets you want");
			numwidgets=Integer.parseInt(widInput);
			DecimalFormat f = new DecimalFormat("##.00");
                   

			if(numwidgets>30){
				sCharge=5;
			}
			
			
			if(numwidgets>=1&&numwidgets<=12){
				price=(float) (numwidgets*12.39)+sCharge;
				System.out.print(numwidgets + " @ 12.39 "+"+ "+ f.format(sCharge)+ " = $"+price);
				
			}
			else if(numwidgets>13&&numwidgets<50){
				price=(float) (numwidgets*11.99)+sCharge;
				System.out.print(numwidgets + " @ 11.99 "+"+ "+ f.format(sCharge)+ " = $"+price);
			}
			else if(numwidgets>=51){
				price=(float) (numwidgets*11.49)+sCharge;
				System.out.println(numwidgets + " @ 11.49 "+"+ "+ f.format(sCharge)+ " = $"+price);
			}
		}
}
