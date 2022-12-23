
public class prntingex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int a=5, b=4, c=-1;
		for(int x=1;x<=a;x++) {
			for(int y=1;y<=b;y++) {
				System.out.print("*");
				
			}
			for(int y=1;y<=c;y++) {
				System.out.print( " ");
			}
			if(x==1) {
				b++;
				
			}
			for(int y=1;y<=b;y++) {
				System.out.print("*");
			}
			System.out.println();
			b--;
			c+=2;
			
		}
		

	}

}
