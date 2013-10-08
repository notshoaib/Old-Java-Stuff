import javax.swing.JOptionPane;


public class Question_4 {

		public static void main (String args []){
			
			int intMile;
			String strMile=null;
			
			strMile=JOptionPane.showInputDialog ("Enter The number of miles");
			intMile=Integer.parseInt(strMile);
			
			conversionChart(intMile);
			
			
		}
		
		public static void conversionChart (int miles){
			String border="--------------------------------------------";
			int mYard=1760;
			int mFeet=5280;
			int totalYard=0;
			int totalFeet=0;
			
			System.out.println(border);
			System.out.println("Miles"+"\t"+"Yards" + "\t"+ "Feet");
			
			for (int i=1;i<=miles;i++){
				totalYard=i*mYard;
				totalFeet=i*mFeet;
				System.out.println(i+"\t"+totalYard + "\t" + totalFeet);
				
				
			}
			System.out.println(border);
		
		}
}
