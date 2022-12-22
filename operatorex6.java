
public class operatorex6 {

	public static void main(String[] args) {
		int a =10 , b;
		b=a++;
		b=++a;
		b=++a -a;
		b=++a-a;
		b=a++-++a+a--+a++;
		b=++a -a++;
		b=--a+a++-a-a;
		b=a++-++a+a--+a++;
		b=a++*a--/++a+a--%a++;
		b=a+++a;
		b=a++ + a;
		//errorb=a++++a;
		b=a++-++a;
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		

	}

}
