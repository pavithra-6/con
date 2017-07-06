package guvi;
import java.util.Scanner;
class Greatestten {

	public static void main(String args[]) {
		int large=0;
System.out.println("enter the 10 numbers");
Scanner s=new Scanner(System.in);
int a[]=new int[10];
for(int i=0;i<10;i++) {
	a[i]=s.nextInt();
}
for(int i=0;i<10;i++) {
	if(a[i]>large) {
		large=a[i];
	}
}
System.out.println(large);
	
	
	}

}
