package fr.iutvalence.info.dut.m3105.preamble;

public class Color
{
	private int red, green, blue;

	public Color()
	{
		this(0, 0, 0);
	}
	
	public Color(int red, int green, int blue)
	{
		this.blue = blue;
		this.red = red;
		this.green = green;
	}

	public int getBlue()
	{
		return blue;
	}

	public void setBlue(int blue)
	{
		this.blue = blue;
	}

	public int getRed()
	{
		return red;
	}

	public void setRed(int red)
	{
		this.red = red;
	}

	public int getGreen()
	{
		return green;
	}

	public void setGreen(int green)
	{
		this.green = green;
	}
	
	public String toString()
	{
		return "Color(" + this.red + ", " + this.green + ", " + this.blue + ")";
	}
}
