package arrays;
import java.util.*;
public class print_all_sub_arrays {
	public static void subarray(int[] a) {
		for(int size=1;size<=a.length;size++) {
		 for(int i=0;i<=a.length-size;i++) {
			for(int j=i;j<i+size;j++) {
				System.out.print(a[j]+" ");
			}
            System.out.println();
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
	System.out.println("enter array size");
	int n = scan.nextInt();
	System.out.println("enter array elements");
	int[] a = new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i] = scan.nextInt();
	}
	subarray(a);
	
	}

}
