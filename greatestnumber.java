package firsthand;

public class greatestnumber {

	public static void main(String[] args) {
		int num1 = 450;
		int num2 = 175;
		int num3 = 65; 
		if (num1 >= num2 && num1 >= num3) 
			System.out.println(num1);
		
		
		else if (num2 >= num3 && num2 >= num1) 
			System.out.println(num2);
		
		
		else 
			System.out.print(num3 );
		
	}

}
