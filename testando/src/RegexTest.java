import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexTest {
	
	final static String REGEX_1 = "^create\\s+table\\s+([a-z][a-zA-Z0-9]*);$";
	//match = true
	final static String TEST_1 = "create table dino;";
	
	//match = false
	final static String TEST_2 = "hello create table coisa;";
	
	//match = true
	final static String TEST_3 = "create   table	gustavo;";
	
	//match = false
	final static String TEST_4 = "create table COISA;";
	
	//compilando o pattern
	static Pattern p = Pattern.compile(REGEX_1);
	
	//usando o metodo match
	static Matcher m = p.matcher(TEST_1);
	
	//extraindo informacoes
	static boolean b = m.matches();
	static String s = m.toMatchResult().group(1);

	
	
	public static void main(String[] args){
		System.out.println("Welcome to regex test!");
		System.out.println("First test: " + TEST_1.matches(REGEX_1));
		System.out.println("Second test: " + TEST_2.matches(REGEX_1));
		System.out.println("Third test: " + TEST_3.matches(REGEX_1));
		System.out.println("Fourth test: " + TEST_4.matches(REGEX_1));
		
		System.out.println("Now we are going to extract values from string!");
		System.out.println("First test with Pattern and Match: ");
		System.out.println("B = " + b +" s= " + s);
		
	}

}
