package fr.iutvalence.info.dut.m3105.preamble;

public class BorderedShapeDecorator extends Shape
{
	private Shape shape;
	private int thickness;
	
	public BorderedShapeDecorator(Shape shape, int thickness)
	{
		this.thickness = thickness;
		this.shape = shape;
	}

	public String toString()
	{
		return this.shape + " with border thickness=" + this.thickness;
	}
}
