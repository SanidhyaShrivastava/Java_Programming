
public class Main {

	public static void main(String[] args) {
		
		Circle cirlce=new Circle(5.3);
		System.out.println("circle.radius= "+cirlce.getRadius());
		System.out.println("circle.area= "+cirlce.getArea());
		
		Cylinder cylinder=new Cylinder(5.4, 4.6);
		System.out.println("cylinder.radius= "+cylinder.getRadius());
		System.out.println("cylinder.height= "+cylinder.getHeight());
		System.out.println("cylinder.area= "+cylinder.getArea());
		System.out.println("cylinder.volume= "+cylinder.getVolume());

	}

}
