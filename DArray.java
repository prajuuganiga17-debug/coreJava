package Array2D;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array");
		System.out.println("enter the row number");
		int N=scan.nextInt();
		System.out.println("enter the column number");
		int M=scan.nextInt();
		int [][] arr= new int[N][M];
		
		//2D Array 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				System.out.print("enter the aray elements");
				arr[i][j]=scan.nextInt();
				
			}
		}
		//printing 2D array
		System.out.println("aray elements are");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		

	}

}
enter the size of the array
enter the row number
2
enter the column number
2
enter the aray elements1
enter the aray elements2
enter the aray elements3
enter the aray elements4
aray elements are
1 2 
3 4 
