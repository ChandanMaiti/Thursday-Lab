import java.util.Scanner;

public class DivisibleBy5and11 {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to check whether number");
		num=sc.nextInt();
		if ((num%5==0)&&(num%11==0))
			System.out.println("Given number"+num+"is Divisible by 5 and 11");
		else 
		System.out.println("Given number"+num+"is not Divisible by 5 and 11");

	}

}