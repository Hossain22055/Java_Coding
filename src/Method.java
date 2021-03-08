import java.awt.geom.Area;

public class Method {

	public static void main(String[] args) {
		System.out.println("********First Call**************");
		loopOne(1,5);
		
		System.out.println("********Second Call*************");
		loopOne(7,15);
		
		System.out.println("Area of a Rectangle");
		areaOfRectangle(5, 10);
	}
	public static void loopOne(int value, int finalValue ) {
	
		while(value<finalValue) {
			System.out.println(value);
			value++;
			
			
		}
	}
	
	public static void areaOfRectangle(double length, double width) {
		System.out.println(length *width);
		
	}

}
