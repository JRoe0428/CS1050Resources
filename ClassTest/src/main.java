import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int numStudent = 27;
		//int roomNum = 250;
		//String roomLatter = "AES";
		
		//double goodGrade = 99.9;
		
		//System.out.println("In room" + roomLatter + roomNum + " we have" + numStudent + "got" + goodGrade );
		
		//System.out.printf("In room %s%d we have %d students got %f",roomLatter,roomNum,numStudent,goodGrade);
		
		//System.out.println();
		//System.out.println(3 % 1);
				
		
		String stringNumber;
		stringNumber = JOptionPane.showInputDialog("Enter a Number to be Multiplied by 32");
		int intNumber = Integer.parseInt(stringNumber);
		stringNumber = JOptionPane.showInputDialog("Get multiplied nerd: " + (intNumber*32) + "\nSay thank you");
		JOptionPane.showMessageDialog(null, "Bruh");
		System.exit(0);
		
		//keyBoardInput.close(); Side note, this closes the keyboard operation. Not wasting any CPU space and shit

	}
	
	

}
