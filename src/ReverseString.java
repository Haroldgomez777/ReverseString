import java.lang.StringBuffer;
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
		Scanner in = new Scanner(System.in);
		System.out.println("Hello!!! Welcome to HG code select an option");
		System.out.println("Enter 1 to find if your number is prime");
		System.out.println("Enter 2 to find if your number is a Palindrome");
		System.out.println("Enter 3 to find your number's Factorial ");
		System.out.println("Enter 4 to find if your number is an Amstrong Number ");
		System.out.println("Enter 5 to find your array's minimum  ");
		System.out.println("Enter 6 to find your string's reverse ");
		System.out.println("Enter 7 to find a character at a position in String ");
		System.out.println("Enter 8 to find a string in a string and replace it in another string ");
		int ch =s.nextInt();
		
		
		switch (ch) {
		
			case 1: {
					System.out.println("Enter Number to find if it is a Prime");
					int num = s.nextInt();
					
					
					 int j=Prime(num);
				     
					     if(j==1){
					    	 System.out.println("Yeah!!! I'am Prime");
					    	
					    	 break;
					    	 
					     }
					     else {
					    	 System.out.println("No!!!, I'am not Prime");
					    	 break;
					     }
	     
					}
			case 2: {
				     System.out.println("Enter Number to Find if it is a Pallindrome");
				     int num = s.nextInt();

				     int j = IsPalindrome(num);
					     if(j==1){
					    	 System.out.println("Yes!!!,I'am Palindrome");
					    	 break;
					     }
					     else {
					    	 System.out.println("No!!!,I'am not a Palindrome");
					    	 break;
					     }
	     
					}
			
			case 3: {
				     System.out.println("Enter Number to Find if it is an Amstrong Number");
				     int num = s.nextInt();
				     
				     int j = Amstrong(num);
					     if(j==1){
					    	 System.out.println("Yes!!!,I'am an Amstrong Number");
					    	 break;
					     }
					     else {
					    	 System.out.println("No!!!,I'am not an Amstrong Number");
					    	 break;
					     }
					}
							//	     System.out.println(s.next());
			case 4: {
				     System.out.println("Enter the Range of Random Numbers ");
				     int num = s.nextInt();
				    
				     int j=RandomNum(num);
				     System.out.println(j);
				     break;
					}
			case 5: {
					//	     int arr[];
				     System.out.println("Enter array array size");
				     int size= s.nextInt();
				     
				     int arr[]=new int[size];
				     System.out.println("Enter array array Elements");
						     for(int i=0;i<size;i++) {
						    	 arr[i]=s.nextInt();
						    	 s.close();
						     }
				     int find_min=Min_of_array(arr);
				     System.out.println(find_min);
				     break;
					}
			case 6: {
				System.out.println("Enter your string you want to reverse");
				String str=s.next();
				String rack=reverseStr(str);
				System.out.println(rack);
				break;
			}
			case 7: {
				
				System.out.println("Enter your position and the string");
//				String str=s.next();
				
				try {
				String str ="";
				
					  s.nextLine();
					  str = s.nextLine();
					 
					
				int pos=in.nextInt();
				
				char in_pos = CharInPosition(str,pos-1);
				
				
				System.out.println("Your character in the position "+(pos) +" is " +in_pos );
				break;
				} catch(StringIndexOutOfBoundsException e) {
					System.err.println(e);
				} finally {
					System.out.println("Done!!!");
				}
				
			}
			case 8:{
				System.out.println("OK Now you want to replace a string in your Sentance\n"
						+ "Enter Sentence first then the word to find and then the word to replace\n");
				try {
				String str ="";
				
					  s.nextLine();
					  str = s.nextLine();
					 
					
				String tofind=in.next();
				String toReplace=in.next();
				String re_String = ReplaceChar(str,tofind,toReplace);
				
				
				System.out.println("Your Replace String" +re_String);
				break;
				} catch(NullPointerException e) {
					System.err.println(e);
				} finally {
					System.out.println("Done!!!");
				}
			}
			default: {
				System.out.println("Okay!!!Bye");

				break;
			}
			 	 
			
		}
		 class_test e = new class_test();
		 e.d=1;
		 System.out.println(e.d);
			s.close();
			in.close();
	}
	
	
	public static int Prime(int num) {
		int flag = 0;


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
//		s.close();
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

	public static String reverseStr(String str) {
		
		String mic = new StringBuffer(str).reverse().toString();
		return mic;
	}
	
	public static char CharInPosition(String str,int pos_ch) {
		char ch = str.charAt(pos_ch);
		
		return ch;
	}
	public static String ReplaceChar(String str,String tofind,String toReplace) {
		
		String Replacedstr = str.replaceAll(tofind,toReplace);
		return Replacedstr;
	}
	
}