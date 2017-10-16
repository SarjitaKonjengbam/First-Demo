package com.sarjita.Matrix;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		System.out.println("Enter the 1st Matrix: ");
		int[][] mat1=readMatrix();
		System.out.println("Enter the 2st Matrix: ");
		int[][] mat2=readMatrix();
		
		displayMatrix(mat1);
		displayMatrix(mat2);
		
		int[][]sum=addMatrix(mat1, mat2);
		displayMatrix(sum);

		
	}
	
	public static int[][] readMatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows & columns: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int [][]mat=new int[r][c];
		System.out.println("Enter "+(r*c)+" values");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	
	public static void displayMatrix(int[][]mat)
	{
		System.out.println("The matrix are ");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] addMatrix(int[][]mat1, int[][]mat2)
	{
		if(mat1.length!=mat2.length)
		{
			System.out.println("Addition not possible");
			return null;
		}
		
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{
				mat1[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		return mat1;
	}

}
