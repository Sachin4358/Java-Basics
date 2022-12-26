
public class IfElseEx6 {

	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age>120 || age <0)
			System.out.println("invalid age");
		else if(age<=4) {
			System.out.println("Infant");}
		else if(age<=13) {
			System.out.println("you are kid");}
			else if(age<=19) {
				System.out.println("YOU ARE TEENAGER");}
			else if(age<=50) {
				System.out.println("you are adult");
			}
			else if(age<=80) {
				System.out.println("you are old age");}
			else {
				System.out.println("you are very old");}
				System.out.println("Bye app");
				
			
		// TODO Auto-generated method stub

	}

}
