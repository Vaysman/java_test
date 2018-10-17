package start;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		
		List<Figure> figures = new ArrayList<Figure>();
		
		Random random = new Random();
		int to = random.nextInt(100);
		
		for(int i = 1; i < to; i++  ) {
			Figure fig;
			switch(random.nextInt(4)) {
				case 0:
					fig = new Square();
					fig.generate();
					figures.add(fig);
					System.out.println(fig.getFigure());
				break;
				case 1:
					fig = new Triangle();
					fig.generate();
					figures.add(fig);
					System.out.println(fig.getFigure());
				break;
				case 2:
					fig = new Circle();
					fig.generate();
					figures.add(fig);
					System.out.println(fig.getFigure());
				break;
				case 3:
					fig = new Trapezium();
					fig.generate();
					figures.add(fig);
					System.out.println(fig.getFigure());
				break;
			}
		}
		
		JFrame frame = new JFrame("Draw");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GUI85 gui = new GUI85();
		gui.figures = figures;
		
		gui.setBackground(Color.WHITE);
		frame.add(gui);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}

}

