public class TestResizeableCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius = 100;
		int reductionPercentage = 10;
		ResizableCircle resizableCircle = new ResizableCircle(radius);
		radius = resizableCircle.resize(reductionPercentage);
		Circle circle = new Circle(radius);
		double perimeter = Math.round(circle.getPerimeter()*100);
		perimeter = perimeter/100;
		double area = Math.round(circle.getArea()*100);
		area = area/100;
		System.out.println("Perimeter of the resized circle is "+perimeter+"\nArea of the resized circle is "+area);
		
	}

}
