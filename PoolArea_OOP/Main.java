
public class Main {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(12, 16);
		System.out.println("rectangle.width= "+rectangle.getWidth());
		System.out.println("rectangle.length= "+rectangle.getLength());
		System.out.println("rectangle.area= "+rectangle.getArea());
		
		Cuboid cuboid=new Cuboid(15, 16, 14);
		System.out.println("cuboid.height= "+cuboid.getHeight());
		System.out.println("cuboid.volume= "+cuboid.getVolume());
		

	}

}
