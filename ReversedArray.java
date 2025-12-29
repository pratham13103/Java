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
		System.out.println("Reversed Array is :");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}
