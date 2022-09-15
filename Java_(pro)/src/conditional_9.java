
public class conditional_9 {

	public static void main(String[] args) {
		int a=9;
		int b=5;
		int c=67;
		if (a>b && a>c) {
			System.out.println("greatest number is"+a);
		}
		else if(b>c && c>a) {
			System.out.println("greatest number is"+b);
		}
		else {
			System.out.println("greatest number is"+c);
		}

	}

}
