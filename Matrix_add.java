import java.util.Scanner;
class Matrix_add
 {
	public static void main(String args[] )
	{
		int row,col,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows and cloums of the matrix:");
		row=sc.nextInt();
		col=sc.nextInt();
		int mat1[][]=new int[row][col];
		int mat2[][]=new int[row][col];
		int sum[][]=new int[row][col];
		System.out.println("enter the elements of the first matrix:");
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
			mat1[i][j]=sc.nextInt();
		 for (i = 0; i< row; i++)
		    {
		      for (j = 0; j < col; j++)
		        System.out.print(mat1[i][j] + "\t");

		      System.out.println();
		    }
		System.out.println("enter the elements of the second matrix:");
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
			mat2[i][j]=sc.nextInt();
		 for (i = 0; i< row; i++)
		    {
		      for (j = 0; j < col; j++)
		        System.out.print(mat2[i][j] + "\t");

		      System.out.println();
		    }
		
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
			sum[i][j] = mat1[i][j]+mat2[i][j];
		System.out.println("Sum of the matrices:");

	    for (i = 0; i< row; i++)
	    {
	      for (j = 0; j < col; j++)
	        System.out.print(sum[i][j] + "\t");

	      System.out.println();
	    }
	}
}
