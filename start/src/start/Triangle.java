package start;

import java.awt.Color;

public class Triangle implements Figure{

	private float l1 = 1, l2 = 1;
	private Color color = Color.black;
	
	public Triangle(float l1, float l2, Color color) {
		this.l1 = l1;
		this.l2 = l2;
		this.color = color;
	}
	
	@Override
	public float getSide1() {
		return l1;
	}
	@Override
	public float getSide2() {
		return l2;
	}
	@Override
	public float getHipoten() {
		return (float) Math.sqrt(l1*l1+l2*l2);
	}
	

	@Override
	public float getS() {
		// TODO Auto-generated method stub
		return l1*l2/2;
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
		text = "Фигура: треугольник, площадь: " + String.format("%.2f", getS()) + " кв. ед., гипотенуза: "+ String.format("%.2f", getHipoten()) +" ед., цвет: " + getColor();
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
		return "triangle";
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
	public float getA() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float getB() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float getC() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float getAngle() {
		// TODO Auto-generated method stub
		return 0;
	}

}
