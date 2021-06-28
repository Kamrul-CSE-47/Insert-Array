package insert;

import java.util.Scanner;

public class insert {

	public static void main(String args[]) {
		   
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
					
		}
		int p = sc.nextInt();
		int e = sc.nextInt();
		if (p>n) {
			System.out.print("Invalid Input");
		}else {
			for(int i=n-1; i>=p-1;i--) {
				arr[i+1]=arr[i];
				arr[p-1]=e;
				System.out.print("After Insertion: \n");
					for (i=0;i<=n;i++) {
						System.out.printf("",arr[i]);
					}
			}
		}
		
		
		
		
	}
}
