package org.arrays;

public class ArrayPapom {
		//dataType variableName []= new data type[length];
	
	public static void main(String[] args) {
		

	int j [] [] = new int[4][3];        // 	0	1	2	3	
		j [0][0] = 52;					//	0
		j [0][1] = 53;					//	1
		j [0][2] = 54;					//	2
		j [1][0] = 55;
		j [1][1] = 56;
		j [1][2] = 57;
		j [2][0] = 58;
		j [2][1] = 59;
		j [2][2] = 60;
		j [3][0] = 61;
		j [3][1] = 62;
		j [3][2] = 63;
		
		System.out.println(j[0][0]);
	
	//		1			2	7
	for (int i = 0; i < 4; i++)
	{
	//		3			4	  6
	for (int i1 = 0; i1 < 3; i1++) {
	//							5
		System.out.println(j[i][i1]);
	}
	}
	} 
 	}