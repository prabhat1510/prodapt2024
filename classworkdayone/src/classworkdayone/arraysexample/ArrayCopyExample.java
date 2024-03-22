package classworkdayone.arraysexample;

public class ArrayCopyExample {

	public static void main(String[] args) {
		int source[] = {1,2,3,4,5,6};//Source array of size of 6 
		int destination[] = new int[10]; //destination array of size of 10
		//static method of System class is used to create a copy of an array
		System.arraycopy(source, 0, destination, 0, source.length);
		//Classic for loop
		for(int index=0;index<destination.length;index++) {
			System.out.println(destination[index]);
		}
		//Without any built in method copy one array to another array 
		int src[]= {7,8,9};
		int dest[]=new int[5];
		System.out.println("*************************************");
		for(int index=0;index<src.length;index++) {
			dest[index]=src[index];
		}
		
		for(int num : dest) {
			System.out.println(num);
		}
	}

}
