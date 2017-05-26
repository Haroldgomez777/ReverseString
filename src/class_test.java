import java.util.*;
public class class_test {
	int d;
	int k;
	
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[10];
    int sum = 0;

		
	public class_test(){
		int d=10;
		int k=23;
		System.out.println("This is a Constructor");
	}
	
	public int array() {
	    System.out.println("Enter the elements:");
	    for (int i=0; i<10; i++)
	    {
	  	  array[i] = scanner.nextInt();
	    }
	    for( int num : array) {
	        sum = sum+num;
	    }
	    return sum;
	}
}
