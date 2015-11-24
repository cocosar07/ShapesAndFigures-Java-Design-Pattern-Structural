package fr.iutvalence.info.dut.m3105.preamble;

public class DecoratedShapeBuilder
{
	Shape shape;
	
	public DecoratedShapeBuilder(Shape shape)
	{
		this.shape = shape;
	}
	
	public DecoratedShapeBuilder addBorder(int thickness)
	{
		this.shape = new BorderedShapeDecorator(this.shape, thickness);
		return this;
	}
	
	public DecoratedShapeBuilder addShadow(int angle, int intensity)
	{
		this.shape = new ShadowedShapeDecorator(this.shape, angle, intensity);
		return this;
	}
	
	public DecoratedShapeBuilder fill(Color color)
	{
		this.shape = new ColoredShapeDecorator(this.shape, color);
		return this;
	}
	
	public Shape getShape()
	{
		return this.shape;
	}
}
