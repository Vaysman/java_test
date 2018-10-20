
package start;

import java.awt.Color;

public class Square implements Figure{
	
	private float side = 1;
	private Color color = Color.black;
	
	public Square(float side, Color color) {
		this.side = side;
		this.color = color;
	}
	
	@Override
	public float getSide() {
		return side;
	}

	@Override
	public float getS() {
		// TODO Auto-generated method stub
		return side*side;
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
		text = "Фигура: квадрат, площадь: " + String.format("%.2f", getS()) + " кв. ед., длина стороны: " + String.format("%.2f", getSide()) + " ед., цвет: " + getColor();
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
		return "square";
	}

	@Override
	public float getR() {
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
