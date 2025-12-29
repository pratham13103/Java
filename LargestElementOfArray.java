import java.util.Scanner; 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int max = a[0];
		System.out.println("Length :"+a.length);
		System.out.println("Enter "+a.length+" numbers");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>max){
			    max=a[i];
		    }
		}
		System.out.println("Largest Element in the array is :"+max);
	}
}
