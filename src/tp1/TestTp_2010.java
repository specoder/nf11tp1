package tp1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestTp_2010 {

	public static void A(){

		// Exercise 1:

		// String patternString = "(?=\\b[a-zA-Z]*a)([a-zA-Z])[a-zA-Z]{1,5}\\b";
		// String text = "Une gazelle a vu un rat, une girafe et un kangourou";


		// Exercise 2: 

		// Question 1:
		//		String patternString = "\\b[a-zA-Z]*?([a-zA-Z])[a-zA-Z]*?\\1[a-zA-Z]*?\\b"; //-> op¨¦rateurpassif -> obtenir 'c'
		//		String patternString = "\\b[a-zA-Z]*([a-zA-Z])[a-zA-Z]*\\1[a-zA-Z]*\\b"; //-> op¨¦rateur actif -> obtenir 'o'
		//		String text = "Un kiwi, une poire, une pomme et du chocolat";

		// Question 2: 
		// faire attention au group!!!

		//String patternString = "(?=\\b[a-zA-Z]*(k|c)[a-zA-Z]*)[a-zA-Z]*?([a-zA-Z])[a-zA-Z]*?\\2[a-zA-Z]*?\\b"; //-> op¨¦rateurpassif -> obtenir 'c'
		String patternString = "(?=\\b[a-zA-Z]*(k|c)[a-zA-Z]*)[a-zA-Z]*([a-zA-Z])[a-zA-Z]*\\2[a-zA-Z]*\\b"; //-> op¨¦rateur actif -> obtenir 'o'
		String text = "Un kiwi, une poire, une pomme et du chocolat";

		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(text);

		System.out.println("R.E.: " + patternString);
		System.out.println("Test: " + text+"\n");

		boolean f;
		while (f = m.find()) {
			System.out.println("==========================================");
			System.out.println("Succ¨¨s : " + f);

			//Question1
			//System.out.println("S¨¦lection : " + m.group()+"("+ m.group(1)+")");

			//Question2
			System.out.println("S¨¦lection : " + m.group()+"("+ m.group(2)+")");
		}
	}

	public static void B(){
		//1.1
		//String patternString = "(?=\\b\\d*[13579])\\b(\\d{2})\\d{2,}(\\1)\\b"; //{2,} est glouton, \\b est juste pour garantir
		//String text = "1458914 - 26428826 - 71171 - 1252121212";

		//1.2
		//String patternString = "(?=\\b\\d*[13579])\\b(\\d{2})(\\d)(\\2){1,7}(\\1)\\b";
		//String text = "1455514 - 26888826 - 19444419 - 231423423";

		//2
		String patternString = "(?i)\\b(\\p{Alpha})(\\p{Alpha})\\p{Alpha}\\2\\1\\b";
		String text = "Un h¨¦licopt¨¨re ¨¤ Laval avec radar et rotor ¨¦ere¨¦";

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
