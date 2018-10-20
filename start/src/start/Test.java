package start;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		
		float side, l1, l2, aS, bS, cS, rad, angle, r, g, b;
		Color color;
		
		
		List<Figure> figures = new ArrayList<Figure>();
		
		Random random = new Random();
		int to = random.nextInt(100);
		
		for(int i = 1; i < to; i++  ) {
			Figure fig;
			switch(random.nextInt(4)) {
				case 0:
					side = random.nextFloat() * 100;
					
					r = random.nextFloat();
					g = random.nextFloat();
					b = random.nextFloat();
					color = new Color(r, g, b);
					
					fig = new Square(side, color);
					figures.add(fig);
					System.out.println(fig.getFigure());
				break;
				case 1:
					l1 = random.nextFloat() * 100;
					l2 = random.nextFloat() * 100;
					
					r = random.nextFloat();
					g = random.nextFloat();
					b = random.nextFloat();
					color = new Color(r, g, b);
					
					fig = new Triangle(l1, l2, color);
					figures.add(fig);
					System.out.println(fig.getFigure());
				break;
				case 2:
					rad = random.nextFloat() * 100;
					
					r = random.nextFloat();
					g = random.nextFloat();
					b = random.nextFloat();
					color = new Color(r, g, b);
					
					fig = new Circle(rad, color);
					figures.add(fig);
					System.out.println(fig.getFigure());
				break;
				case 3:
					aS = random.nextFloat() * 100;
					bS = random.nextFloat() * 100;
					cS = random.nextFloat() * 100;
					
					angle = (float) Math.toRadians(random.nextInt(180));
					
					r = random.nextFloat();
					g = random.nextFloat();
					b = random.nextFloat();
					color = new Color(r, g, b);
					
					fig = new Trapezium(aS, bS, cS, angle, color);
					figures.add(fig);
					System.out.println(fig.getFigure());
				break;
			}
		}
		
		JFrame frame = new JFrame("Draw");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GUI85 gui = new GUI85();
		gui.setFigures(figures);
		
		gui.setBackground(Color.WHITE);
		frame.add(gui);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}

}

