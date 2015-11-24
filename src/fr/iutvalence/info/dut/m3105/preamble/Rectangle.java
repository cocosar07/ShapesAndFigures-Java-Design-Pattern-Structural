package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle extends Shape
{
	private int width, height;
	
	public Rectangle(int width, int height)
	{
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	@Override
	public String toString()
	{
		return "[Rectangle (w=" + this.width + ", h=" + this.height + ")]";
	}
}
