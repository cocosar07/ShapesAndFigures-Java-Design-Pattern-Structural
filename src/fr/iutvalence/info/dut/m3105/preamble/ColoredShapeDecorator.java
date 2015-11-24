package fr.iutvalence.info.dut.m3105.preamble;

public class ColoredShapeDecorator extends Shape
{
	private Shape shape;
	private Color color;
	
	public ColoredShapeDecorator(Shape shape, Color color)
	{
		this.shape = shape;
		this.color = color;
	}

	public ColoredShapeDecorator()
	{
		this.shape = new Circle(6);
		this.color = new Color(0, 0, 255);
	}
	
	public String toString()
	{
		return this.shape + " with " + this.color;
	}
}