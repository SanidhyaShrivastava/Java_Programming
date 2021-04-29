/**
 * Class Untitled
 */
public class AreaCalculator {
	public static void main(String[] args) {
    	double areaOfCircle=area(4);
    	System.out.println("Area of Circle= "+areaOfCircle);
    	
    	double areaOfRectangle=area(4,5);
    	System.out.println("Area of Rectangle= "+areaOfRectangle);
	}
	 public static double area(double radius){
        if(radius>=0){
            double areaOfCircle=radius*radius*Math.PI;
            return areaOfCircle;
        }
        else{
            return -1.0;
        }
    }
    
    public static double area(double x, double y){
        if(x>=0 && y>=0){
            double areaOfRectangle=x*y;
            return areaOfRectangle;
        }
        else{
            return -1.0;
        }
    }
}