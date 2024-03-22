package classworkdayone.arraysexample;

public class TwoDArrayExample {

	public static void main(String[] args) {
		//int matrix[][] = new int[3][3];
		int matrix[][]={{10,20,30},{40,50,60},{70,80,90}};
		
		int mat[][]=new int[3][3];
		mat[0][0]=1;
		mat[0][1]=2;
		mat[0][2]=3;
		mat[1][0]=4;
		mat[1][1]=5;
		mat[1][2]=6;
		mat[2][0]=7;
		mat[2][1]=8;
		mat[2][2]=9;
		
		for(int rowIndex=0;rowIndex<3;rowIndex++) {
			for(int colIndex=0;colIndex<3;colIndex++) {
				System.out.println(mat[rowIndex][colIndex]);
			}
		}
		
		System.out.println("***************Addition of two matrix****************************");
		int newMat[][] = new int[3][3];
		for(int rowIndex=0;rowIndex<3;rowIndex++) {
			for(int colIndex=0;colIndex<3;colIndex++) {
					newMat[rowIndex][colIndex]=mat[rowIndex][colIndex]+matrix[rowIndex][colIndex];
			}
		}
	}

}
