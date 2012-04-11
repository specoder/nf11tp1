package tp1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regExp {

	public static void Q1() {

		// Question 1
		//		String patternString = "0|(-?[1-9]\\d*)";
		//		String text = "-12381AAAAe283-23";

		// Question 2
		//		String patternString = "(-?0|(-?[1-9]\\d*))\\.\\d*[1-9]+\\d*";
		//		String text = "-0.000345zze0.00qdfq0.345";

		// Question 3
		//		String patternString = "(00|\\+)33-\\d{5}-\\d{4}";
		//		String text = "00-33344234485";

		// Question 4
		//		String patternString = "(-?0|(-?[1-9]\\d*))\\.?\\d*[1-9]+\\d*e-?\\d*[1-9]+\\d*";
		//		String text = "-2.6e-300aa-2603e-30azc-2.6e-00";

		// Question 5
		// debut de chaine et d¨¦but de mot
		//		String patternString = "\\w+le\\w+";
		//		String text = "parlement epaule paralelle lente lelele";

		// Question 6
//				String patternString = "\\B(\\d+)\\w+";
//				String text = "Ax25By qsdone767dioq qsZION3749qdz 12345 ";

		// Question 7
//				String patternString = "\\{\\s*\\\"\\w+\\\"\\s*:\\s*\\[(\\d+),(\\d+)\\]\\s*\\}";
//				String text = "{          \"args\"      : [10,20]       }";

		// Question 8
//				String patternString = "<.+xml:lang\\s?=\\s?((\"|')(\\w+)\\2).*>";
//				String text = "<contact xml:lang = 'fr' id = \"c1\">";

		// Question 9
//				String patternString = "utc(?=[a-z]\\d{3}\\b)[a-z]";
//				String text = "utcd123 utca10411";

		// Question 10-1
//				String patternString = "(?<=\\D\\d)(.+)(?=\\d{2})";
//				String text = "25.3a512b.3.5135";

		// Question 10-2
		String patternString = "(?<=\\D\\d)(.+?)(?=\\d{2})";
		String text = "25.3a512b.3.5135";

		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(text);
		System.out.println("R.E.: " + patternString);
		System.out.println("Test: " + text);
		//boolean found = m.find();
		boolean f;
		while (f = m.find()) {
			System.out.println("==========================================");
			System.out.println("Succ¨¨s : " + f);
			//System.out.println("Position d¨¦but : " + m.start());
			//System.out.println("Avant : " + text.substring(0,m.start()));
			System.out.println("S¨¦lection : " + m.group());
			//System.out.println("Groupe : " + m.group(1));
			//System.out.println("Position fin : " + m.end());
			//System.out.println("Apr¨¨s : " + text.substring(m.end()));
		}
	}

	public static void Q2_1() {
		// Question 1
		String patternString = "\\p{Punct}|\\s";
		String text = "^Ren_hao \tsucks !!!";

		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(text);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, "");
		}
		m.appendTail(sb);
		System.out.println(sb.toString());
	}

	public static void Q2_2() {
		int comp = 0;
		
		// Question 2.2
		String patternString = "\\w*?[aeiou]\\w*?[aeiou]\\w*?"; //"[^\\s]*?[aeiou][^\\s]*?[aeiou][^\\s]*?";
		String text = "rkdoni reo hao jh xxx";

		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(text);
		System.out.println("R.E.: " + patternString);
		System.out.println("Test: " + text);
		boolean f;
		while (f = m.find()) {
			System.out.println("==========================================");
			System.out.println("Succ¨¨s : " + f);
			comp++;
		}
		System.out.println("Il y en a: " + comp);

	}
	
	public static void Q2_3() {
		int comp = 0;
		
		// Question 2.3
		String patternString = "\\b(?=\\w*[Aa])(?=\\w*[Ii])";
		String text = "rkdonai reo hai jh xxx";
		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(text);
		System.out.println("R.E.: " + patternString);
		System.out.println("Test: " + text);
		boolean f;
		while (f = m.find()) {
			System.out.println("==========================================");
			System.out.println("Succ¨¨s : " + f);
			comp++;
		}
		System.out.println("Il y en a: " + comp);
	}
	
	public static void Q2_4() {
		String patternString = "(\\w{2,5})\\1";
		String text = "Le ouioui, le chouchou et traintrain a borabora";

		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(text);
		System.out.println("R.E.: " + patternString);
		System.out.println("Test: " + text);
		//boolean found = m.find();
		boolean f;
		while (f = m.find()) {
			System.out.println("==========================================");
			System.out.println("Succ¨¨s : " + f);
			System.out.println("S¨¦lection : " + m.group());
			System.out.println("Position entre: " + m.start() + " et " + m.end());
		}
	}
	
	public static void Q2_5() {
		String patternString = "(\\w{2,5})(\\1)";
		String text = "Le ouioui, le chouchou et traintrain a borabora";
		StringBuffer sb = new StringBuffer();
		
		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(text);
		System.out.println("R.E.: " + patternString);
		System.out.println("Test: " + text);
		
		boolean f;
		while (f = m.find()) {
			System.out.println("==========================================");
			System.out.println("Succ¨¨s : " + f);
			System.out.println("S¨¦lection : " + m.group());
			System.out.println("Position entre: " + m.start() + " et " + m.end());
			m.appendReplacement(sb, m.group(1) + "-" + m.group(2));
		}
		
		m.appendTail(sb);
		System.out.println("Prase recontruite: " + sb.toString());
	}
	
	public static void main(String[] args) {
		Q1();
	}
}

