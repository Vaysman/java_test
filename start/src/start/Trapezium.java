package start;

import java.awt.Color;

public class Trapezium implements Figure{
	
	private float a = 1, b = 1, c = 1;
	private float angle = (float) (Math.PI/2);
	private Color color = Color.black;
	
	public Trapezium(float a, float b, float c, float angle, Color color) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.angle = angle;
		this.color = color;
	}
	
	@Override
	public float getA() {
		return a;
	}
	@Override
	public float getB() {
		return b;
	}
	@Override
	public float getC() {
		return c;
	}
	@Override
	public float getAngle() {
		return angle;
	}
	

	@Override
	public float getS() {
		// TODO Auto-generated method stub
		float s;
		s = (float) ((a + c) * b * Math.sin(angle)) / 2;
		return s;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		String hex = "#"+Integer.toHexString(color.getRGB()).substring(2);
		return hex;
	}

	@Override
	public String getFigure() {
		String text;
		text = "Фигура: трапеция, площадь: " + String.format("%.2f", getS()) + " кв. ед., длина нижней стороны "+ String.format("%.2f", getA()) +" кв. ед., длина левой стороны "+ String.format("%.2f", getB()) +" кв. ед., длина верхней стороны " + String.format("%.2f", getC()) + " кв. ед., левый нижний угол " + String.format("%.2f", Math.toDegrees(getAngle())) + " градусов, цвет: " + getColor();
		return text;
	}
	
	@Override
	public Color getColorRGB() {
		// TODO Auto-generated method stub
		return color;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "trapezium";
	}
	@Override
	public float getR() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float getSide() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float getSide1() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float getSide2() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float getHipoten() {
		// TODO Auto-generated method stub
		return 0;
	}

}
