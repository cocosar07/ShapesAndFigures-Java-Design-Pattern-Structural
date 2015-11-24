package fr.iutvalence.info.dut.m3105.preamble;

public class Position
{
	public Position()
	{
		this(0, 0);
	}
	
	public Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	private int x, y;

	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}
	
	@Override
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
}
