
public class nestedIfElse1 {

	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		if (age<=0 || age>120)
			System.out.println("INVALID AGE ");
		else
			if(age>=10 &&age<=16) {
				System.out.println("you are a teenager");}
			else {
				System.out.println("You are not a teenager");
				
				
			}
		// TODO Auto-generated method stub

	}

}
