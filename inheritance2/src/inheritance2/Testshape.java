package inheritance2;

public class Testshape 
{
	public static void main(String[] args) 
	{
	Shape sh = new Shape( );
	Circle ci = new Circle();
	Rectangle rg = new Rectangle();
	Square sqr = new Square();
	
	sh.setfilled(true);
	sh.setcolour(" orange ");
	System.out.println(sh.toString());
	
	
	ci.setradius(11.98);
	ci.setfilled(true);
	ci.setcolour(" orange ");
	
	System.out.println(ci.toString());
	System.out.println("Area of circle is" +ci.getarea());
	System.out.println("perimeter of circle is" +ci.getperimter());
	
	rg.setwidth(12.22);
	rg.setlength(29.09);
	rg.setfilled(true);
	rg.setcolour("orange ");
	
	System.out.println(rg.toString());
	System.out.println("Area of rectangle is" +rg.getarea());
	System.out.println("Perimeter of rectangle is" +rg.getperimter());
	
	sqr.setfilled(true);
	sqr.setcolour(" purple ");
	sqr.setside(10.0);
	
	System.out.println(sqr.toString());
	System.out.println("Area of square is" +sqr.getarea());
	System.out.println("Perimeter of rectangle is" +sqr.getperimter());
	}
}



