public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius = 100;
		Circle circle = new Circle(radius);
		double perimeter = Math.round(circle.getPerimeter()*100);
		perimeter = perimeter/100;
		double area = Math.round(circle.getArea()*100);
		area = area/100;
		System.out.println("Perimeter of the circle is "+perimeter+"\nArea of the circle is "+area);
	    
		int i=0; int k=0;
		for(i=0; i<3; i++) {
			System.out.println(i);
		}
         //System.out.println(i);
	}

}
