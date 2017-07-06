package guvi;

public class Logic1 {
public static int output;
public static void main(String[] args) {
userMethod(1234);
System.out.println(output);
	}
public static void userMethod(int input) {
	int i=0,rem=0,sum=0,count=1;
	while(input!=0) {
		rem=input%10;
		input=input/10;
		i=count;
while(i!=0) {
	sum=sum+rem;
i--;
}
	count++;
}
	output=sum;
	
	
}

}
