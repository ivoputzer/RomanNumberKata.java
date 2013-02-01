package app.roman;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber
{
	private static HashMap<String, Integer> literals = staticLiterals();

	private static HashMap<String, Integer> staticLiterals()
	{
		HashMap<String, Integer> initialize = new HashMap<String,Integer>();
		
		initialize.put("n",0); initialize.put("i",1); initialize.put("v",5); initialize.put("x",10); initialize.put("l",50); initialize.put("c",100); initialize.put("d",500); initialize.put("m",1000);
		
		return initialize;
	}
	
	public static boolean validate( String literal ) // http://docs.oracle.com/javase/1.4.2/docs/api/java/util/regex/Pattern.html
	{		
		Pattern p = Pattern.compile("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
		
		Matcher m = p.matcher(literal);
				
		return m.find(); 
	}
	
	public static int convert ( String literal )
	{
		if ( literal.equalsIgnoreCase("n") ) return 0; // lets save some memory here
				
		if ( !RomanNumber.validate( literal ) ) throw new RuntimeException("The string is not a valid roman number!");

		int number = 0;

		int length = literal.length();
		
		for ( int i = 0; i < length; ++i )
		{	
			int val1 = RomanNumber.literals.get( literal.substring(i, i + 1).toLowerCase() );
			
			int val2 = (i + 1) >= length ? 0 : RomanNumber.literals.get( literal.substring(i + 1, i + 2).toLowerCase() );
			
			number = number + (val2 > val1 ? -val1 : val1);
		}

		return number;
	}
}
