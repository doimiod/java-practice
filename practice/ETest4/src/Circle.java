public class Circle implements GeometricObject{
	
	protected double radius = 1.0;
	
	public Circle (double radius)
	{
		this.radius = radius;
	}
	
	public double getPerimeter() 
	{
		return (2*radius)*Math.PI;
	}
	
	public double getArea()
	{
		return radius*radius*Math.PI;
	}

}
