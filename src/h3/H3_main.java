package h3;

public class H3_main {
	public static void main(String[] args)
	{
		float celsiusFloat = 18.783948374f; 
		float fahrenheitFloat = 6.7f; 
		double celsiusDouble = 18.783948374;
		double fahrenheitDouble = 69; 
		
		fahrenheitFloat = celsiusFloat*9/5+32;
		
		fahrenheitDouble = celsiusDouble* 9/5 +32;
		System.out.println( celsiusFloat +" sind " + fahrenheitFloat +" fahrenheit");
		System.out.println( celsiusDouble +" sind " + fahrenheitDouble +" fahrenheit");
	}

}
