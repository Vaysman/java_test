package start;

import java.awt.Color;
import java.util.Random;

public class Circle implements Figure{
	
	float r = 1;
	Color color = Color.black;
	
	@Override
	public float getR() {
		return r;
	}
	
	@Override
	public void generate() {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		r = random.nextFloat() * 100;
		
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
