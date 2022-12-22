
public class shorthandoperator {
	public static void main(String ... sachin) {
		int a =10,b;
	b=++a-a;
	b=++a-a+a++;
		b=a--+a++-a+a++;
		b=--a+a++-a--+a;
		b=a++-++a+a--+a--+--a;
		b=++a*a--+a--*--a;
		b=--a+a++-a;
		b=a++-++a-a--;
		b=a++-++a-a--;
		b=--a*a++/a--%a--+--a*a;
		System.out.println(a);
		System.out.println(b);
		
	}
	

}
