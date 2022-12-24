public class FunctionEx7 {
	static boolean findEvenOdd(int a) {
		if(a%2==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int n=9;
		boolean result=findEvenOdd(n);
		if(result) {
			System.out.println(n+" is EVEN");
		}else {
			System.out.println(n+" is ODD");
		}
	}
}