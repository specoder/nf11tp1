package tp1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestTp_2011 {

	public static void A(){

		// question 1:
		//String patternString = "(?=\\b[a-z]*a[a-z]*)\\b([aeiou])[a-z]*\\1 | a \\b"; 
		//String text = "Il attira l'ara et il aima l'immeuble a un etaeg";

		// question 2:
		String patternString = "(?i)\\b\\w*([aeiou]{2})[a-z](?!\\1)[aeiou]{2}\\w*\\b"; 
		String text = "toulouse, caen, beauvais, couloir, faisait, soudeur";


		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(text);

		System.out.println("R.E.: " + patternString);
		System.out.println("Test: " + text+"\n");

		boolean f;
		while (f = m.find()) {
			System.out.println("==========================================");
			System.out.println("Succ¨¨s : " + f);

			System.out.println("S¨¦lection : " + m.group());

		}
	}

	public static void B(){
		// question 1
		//String patternString = "\\b(\\d{3})\\d*(?!\\1)\\d{3}\\b";
		//String text = "Non : 1256125 Ok : 1233124 non : 121451 ok : 7894785 ok : 9874789";

		String patternString = "(?=\\b\\d*2\\d*\\b)(?=\\b\\d{10})\\d*1(?=\\d*1)\\d*\\b";
		String text = "Non : 0123456790 Ok1 : 0234167891 Non : 135792814 Ok2 : 0315128201";

		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(text);

		System.out.println("R.E.: " + patternString);
		System.out.println("Test: " + text+"\n");

		boolean f;
		while (f = m.find()) {
			System.out.println("==========================================");
			System.out.println("Succ¨¨s : " + f);

			//Question1
			System.out.println("S¨¦lection : " + m.group());

		}
	}

	public static void main(String[] args) {
		//A();
		B();
	}
}
