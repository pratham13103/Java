import java.util.Scanner; 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		System.out.println("Length :"+a.length);
		System.out.println("Enter "+a.length+" numbers");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum +a[i];
		}
	
		System.out.println("Sum of Elements is : " +sum);
	}
}
