package fr.iutvalence.info.dut.m3105.preamble;

public class ShadowedShapeDecorator extends Shape
{
	private Shape shape;
	private int angle, intensity;
	
	public ShadowedShapeDecorator(Shape shape, int angle, int intensity)
	{
		this.shape = shape;
		this.angle = angle;
		this.intensity = intensity;
	}

	public String toString()
	{
		return this.shape + " with shadow of angle=" + this.angle + " and intensity=" + this.intensity;
	}
}
