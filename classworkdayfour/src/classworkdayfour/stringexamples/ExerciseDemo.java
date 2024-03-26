package classworkdayfour.stringexamples;

public class ExerciseDemo {
	
	public static void main(String[] args) {
		String name = "AZHAR HUSSAIN";
		char[] vowels = {'A','E','I','O','U'};
		
		int vowelCounter=0;
		int consonantCounter=0;
		
		for(int index=0; index<name.length();index++) {
			int k=0;
			for(int ind=0;ind<vowels.length;ind++) {
				if(vowels[ind] == name.charAt(index)) {
					vowelCounter++;
					k=1;
				}
			}
			if(k==0) {
				consonantCounter++;
			}
		}
		
		System.out.println(vowelCounter);
		System.out.println(consonantCounter);
	}
}
