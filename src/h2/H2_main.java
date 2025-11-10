package h2;

public class H2_main {
	public static void main(String[] args) 
	{
		int input = 0; 
		
		boolean x = true; 
		boolean y = true;
		boolean a= true; 
		boolean b= true; 
		boolean c = true;
		
		x= false; 
		y= false;
		a =false;
		b = false;
		c = false; 
		switch (input)
		{
		case 1:
			y = true;
			break;
		case 10: 
			x = true;
			break;
		case 11: 
			x= true; 
			y = true;
			break;
		}
		System.out.println("x " + x);
		System.out.println("y " + y);
		if (x == true && y == true)
		{
			a = true;
			
		}
		if (x == true || x != y )
		{
			b = true;
		}
		if (x == true && y == false ||  x== false && y == false)
		{
			c = true; 
		}
		System.out.println("a " + a);
		System.out.println("b " + b);
		System.out.println("c " + c);
	}
	
}
