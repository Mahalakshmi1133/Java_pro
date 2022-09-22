package my_pack.operation.main;
import java.util.Scanner;
public class op {

	public static void main(String[] args) {
		try(Scanner inpt=new Scanner(System.in)){
					System.out.println("enter  value" );
						int a=inpt.nextInt();
						System.out.println("enter  value");
						int b=inpt.nextInt();
						System.out.println("enter the operation");
						char c=inpt.next().charAt(0);
						if(c=='+' ){
						System.out.println(a+b);
						}
						else if(c=='-') {
						System.out.println(a-b);
						}
						else if(c=='|') {
							System.out.println(a|b);
							}
						else if(c=='*') {
							System.out.println(a*b);
							}
						else {
							System.out.println("enter valid ");
							
						}
						
							
							
						}
							
						}
						

	}

	

