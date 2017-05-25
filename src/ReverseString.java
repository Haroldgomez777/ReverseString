//import java.lang.StringBuffer;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String input="Harold is a good programmer";
				//System.in
//		Scanner sc = new Scanner(in).useDelimiter("\\s");
		//System.out.println("Enter String");
//		String str = sc.next();
//		System.out.println(new StringBuffer(str).reverse().toString());
		
//	     Scanner s = new Scanner(input).useDelimiter("\\s");  
//	     System.out.println(s.next());  
//	     System.out.println(s.next());  
//	     System.out.println(s.next());
//	     System.out.println(s.next());
//	     System.out.println(s.next());
//		
//	     s.close();
		Scanner s = new Scanner(System.in);
		System.out.println("Hello!!! Welcome to HG code select an option");
		System.out.println("Enter 1 to find if your number is prime");
		System.out.println("Enter 2 to find if your number is a Palindrome");
		System.out.println("Enter 3 to find your number's Factorial ");
		System.out.println("Enter 4 to find if your number is an Amstrong Number ");
		System.out.println("Enter 5 to find your array's minimum  ");
		int ch =s.nextInt();
		
		switch (ch) {
		
			case 1: {
					System.out.println("Enter Number to find if it is a Prime");
					int num = s.nextInt();
					
					 int j=Prime(num);
				     
					     if(j==1){
					    	 System.out.println("Yeah!!! I'am Prime");
					    	 
					     }
					     else {
					    	 System.out.println("No!!!, I'am not Prime");
					     }
	     
					}
			case 2: {
				     System.out.println("Enter Number to Find if it is a Pallindrome");
				     int num = s.nextInt();
				     int j = IsPalindrome(num);
					     if(j==1){
					    	 System.out.println("Yes!!!,I'am Palindrome");
					     }
					     else {
					    	 System.out.println("No!!!,I'am not a Palindrome");
					     }
	     
					}
			
			case 3: {
				     System.out.println("Enter Number to Find if it is an Amstrong Number");
				     int num = s.nextInt();
				     int j = Amstrong(num);
					     if(j==1){
					    	 System.out.println("Yes!!!,I'am an Amstrong Number");
					     }
					     else {
					    	 System.out.println("No!!!,I'am not an Amstrong Number");
					     }
					}
							//	     System.out.println(s.next());
			case 4: {
				     System.out.println("Enter the Range of Random Numbers ");
				     int num = s.nextInt();
				     int j=RandomNum(num);
				     System.out.println(j);
					}
			case 5: {
					//	     int arr[];
				     System.out.println("Enter array array size");
				     int size= s.nextInt();
				     int arr[]=new int[size];
				     System.out.println("Enter array array Elements");
						     for(int i=0;i<size;i++) {
						    	 arr[i]=s.nextInt();
						     }
				     int find_min=Min_of_array(arr);
				     System.out.println(find_min);
					}
			
			 s.close();
		}
	}
	
	
	public static int Prime(int num) {
		int flag = 0;

//		s.close();
		float m=num/2;
		for(int i=2;i<=m;i++) {
			if(num%i==0) {
				flag=1;
				return 0;
			}
		}
		
			if(flag==0) {
				return 1;
			}
		return 0;
	}
	
	public static int IsPalindrome(int num) {
		
//	     Scanner stds = new Scanner(System.in);
//	     System.out.println("Enter Number");
//	     int num = stds.nextInt();
//	     stds.close();
		int n = num;
		int sum=0,r=0;
		int temp = n;
		while(n>0) {
			r=n%10;
			sum = (sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum) {
			return 1;
		}
		
		return 0;
	}
	
	public static int factorial(int num) {
		int fact=1;
		if(num==1||num==0) {
			fact = 1;
		}
		if(num>1) {
			fact=num*factorial(num-1);
		}
		return fact;
	}
	
	public static int Amstrong(int num) {
		int temp=num;
		int amstrong=0;
		int y;
		while(num>0) {
			y=num%10;
			num=num/10;
			amstrong=amstrong+(y*y*y);
			
		}
		
		if(temp==amstrong) {
			return 1;
		}
		
		return 0;
	}
	public static int RandomNum(int num){
		Random rand = new Random();
		int ret = rand.nextInt(num);
		return ret;
	}
	
	public static int Min_of_array(int arr[]){
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
}