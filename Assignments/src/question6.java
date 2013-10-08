import javax.swing.JOptionPane;


public class question6 {

	public static void main (String args[]){
		String rWord=null;
		rWord=JOptionPane.showInputDialog ("Enter a word");
		printChar(rWord);
	}
	public static void printChar(String word){
		int length=word.length();
		char a;
		for(int i=0;i<length;i++){
			a=word.charAt(i);
					if(Character.isDigit(a)){
						System.out.println("Digit "+i+ " "+ a);
					}
					else
					System.out.println("Letter " + i + " " + a);
		}
		
	}
}
