
public class printingex7 {

	public static void main(String[] args) {
		int a=9, b=1;
		for(int x=1;x<=a;x++) {
			for(int y=1;y<=b;y++) {
				System.out.print("*");
			}
			System.out.println(" ");
			if(x<=a/2) {
				b++;}
				else {
					b--;
			}
				
		}
		// TODO Auto-generated method stub

	}

}
