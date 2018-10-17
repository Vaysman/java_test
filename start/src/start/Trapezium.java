package start;

import java.awt.Color;
import java.util.Random;

public class Trapezium implements Figure{
	
	float a = 1, b = 1, c = 1;
	float angle = (float) (Math.PI/2);
	Color color = Color.black;
	
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
	public void generate() {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		a = random.nextFloat() * 100;
		b = random.nextFloat() * 100;
		c = random.nextFloat() * 100;
		
		angle = (float) Math.toRadians(random.nextInt(180));
		
		float r = random.nextFloat();
		float g = random.nextFloat();
		float b = random.nextFloat();
		color = new Color(r, g, b);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
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
