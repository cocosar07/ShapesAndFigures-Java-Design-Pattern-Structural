package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		new DecoratedShapeBuilder(new Circle(10))
		.addBorder(10)
		.fill(new Color(0, 255, 126))
		.getShape()
		.draw(new Position(0, 7));
	}
}
