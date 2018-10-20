package start;

import java.awt.Color;

public class Circle implements Figure{
	
	private float r = 1;
	private Color color = Color.black;
	
	public Circle(float r, Color color) {
		this.r = r;
		this.color = color;
	}
	
	@Override
	public float getR() {
		return r;
	}

	@Override
	public float getS() {
		// TODO Auto-generated method stub
		return (float) (Math.PI*r*r);
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
		text = "Фигура: круг, площадь: " + String.format("%.2f", getS()) + " кв. ед., радиус: "+ String.format("%.2f", getR()) +" ед., цвет: " + getColor();
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
		return "circle";
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
