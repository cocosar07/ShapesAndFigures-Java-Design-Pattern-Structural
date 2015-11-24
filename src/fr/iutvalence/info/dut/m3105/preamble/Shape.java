package fr.iutvalence.info.dut.m3105.preamble;

public abstract class Shape
{
	public void draw(Position position)
	{
		System.out.println("Drawing " + this + " at " + position);
	}
}
