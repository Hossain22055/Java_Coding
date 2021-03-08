
public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(area(10, 10));
		System.out.println(sum(10, 10));
		System.out.println(sum(1, 5.5f));
		System.out.println(sum(1.2, 3.8));

	}
	public static double area(double length, double width) {
		return length*width;
	}
	
	public static int sum(int x, int y) {
		System.out.println("Adding two number");
		return x+y;
	}
	public static float sum(int x, float y) {
		System.out.println("Adding float and integer");
		return x+y;
	}
	public static double sum(double x, double y) {
		System.out.println("Adding two double number");
		return x+y;
	}
	
	

}
