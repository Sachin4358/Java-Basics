
public class printingex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9, b=1,c=4;
		for(int x=1;x<=a;x++) { 
			for(int y=1;y<=c;y++) {
				System.out.print(" ");
			}
			for(int y=1;y<=b;y++) {
				System.out.print("*");
			}
			System.out.println();
			if(x<=a/2) {
				b+=2;
				c--;}
				else {
					b-=2;
					c++;
			}
				
		}
		// TODO Auto-generated method stub

	}

}

		// TODO Auto-generated method stub


