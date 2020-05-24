import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		System.out.println('-' + original.toLowerCase() + '-');
		System.out.println('-' + original.toUpperCase() + '-');
		System.out.println('-' + original.trim() + '-');
		System.out.println('-' + original.substring(2) + '-');
		System.out.println('-' + original.substring(2, 9) + '-');
		System.out.println('-' + original.replace('a', 'x') + '-');
		System.out.println('-' + original.replace("abc", "xyz") + '-');
		System.out.println('-' + original.indexOf("bc") + '-');
		
		String s = "potato apple lemon orange"
				+ "";
		
		String [] vect = s.split(" ");
		
		for (int i = 0; i <= vect.length -1; i++) {
			System.out.println(vect[i]);
		}
		
	}

}
