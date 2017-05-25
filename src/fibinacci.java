import java.lang.StringBuffer;
import java.util.Scanner;
public class fibinacci {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String\n");
		String str = sc.next();
		System.out.println(new StringBuffer(str).reverse().toString());
		sc.close();
	}

}
