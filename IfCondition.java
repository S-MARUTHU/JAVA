package Practice;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// To print the number from 10-1 using if condition

		int num =10;
		if(num>=10) {
			System.out.println(num);
		num--;
		}
		if(num>=9) {
			System.out.println(num);
		num--;
		}
		if(num>=8) {
			System.out.println(num);
			num--;
		}
		if(num>=7) {
			System.out.println(num);
			num--;
		}
		if(num>=6) {
			System.out.println(num);
			num--;
		}
		if(num>=5) {
			System.out.println(num);
			num--;
		}
		if(num>=4) {
			System.out.println(num);
			num--;
		}
		if(num>=3) {
			System.out.println(num);
			num--;
		}
		if(num>=2) {
			System.out.println(num);
			num--;
		}
		if(num>=1) {
			System.out.println(num);
			num--;
		}
		if(num>=0) {
			System.out.println(num);
		}
		
// To check if number is positive, negative and zero.
		
		int n=-1;
		if(n>0) {
			System.out.println("The Number is Positive");
		}
		else if(n<0){
			System.out.println("The Number is Negative");
		}
		else {
			System.out.println("The Number is zero");
		}
		
//To find the sum of the even number and odd number between 1-100
		
		int sumeven=0;
		int sumodd=0;
		 for(int i = 1; i <= 100; i++) {
			 if(i % 2 == 0) {
				 sumeven += i;
			 }
			 else {
				 sumodd +=i;
			 }
		 }
				
		 System.out.println("Sum of the Even Number between 1-100:-"+sumeven);
		 System.out.println("Sum of the Even Number between 1-100:-"+sumodd);
		}
}
