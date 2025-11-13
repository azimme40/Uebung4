package p1;

public class P1_main {
	public static void main(String[] args)
	{
		int stockwerk= 3; 
		int stockwerk2= 2; 
		
		switch(stockwerk)
		{
		case 1: 
			System.out.println("Damenbekleidung");
			break;
		case 0: 
			System.out.println("Angebote");
			break;
		case 2: 
			System.out.println("Herrenbekleidung");
			break;
		case 3: 
			System.out.println("Kinderbekleidung");
			break;
		case -1: 
			System.out.println("Parkhaus");
			break;
		}
		switch(stockwerk2)
		{
		case 3: 
			System.out.println("Kinderbekleidung");
			
		case 2: 
			System.out.println("Herrenbekleidung");
			
		case 1: 
			System.out.println("Damenbekleidung");
			
		case 0: 
			System.out.println("Angebote");
			break;
			
		case -1: 
			System.out.println("Parkhaus");
			
		}
	}

}
