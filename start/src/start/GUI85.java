package start;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

public class GUI85 extends JPanel{
	
	public List<Figure> figures;
	
	int x, y;
	
	public void paintComponent(Graphics g) {
		this.setBackground(Color.WHITE);
		
		x =10; 
		y = 10;
		
		for(int i = 0; i < figures.size(); i++) {
			if((figures.get(i)).getType() == "square") {
				g.setColor(figures.get(i).getColorRGB());
				g.fillRect(x, y, (int)figures.get(i).getSide(), (int)figures.get(i).getSide());
			}
			if((figures.get(i)).getType() == "triangle") {
				g.setColor(figures.get(i).getColorRGB());
				g.fillPolygon(new int[] {x, x, (int) (x + figures.get(i).getSide2())}, new int[] {y, (int) (y + figures.get(i).getSide1()), y}, 3);
			}
			if((figures.get(i)).getType() == "circle") {
				g.setColor(figures.get(i).getColorRGB());
				g.fillOval(x, y, (int)figures.get(i).getR(), (int)figures.get(i).getR());
			}
			if((figures.get(i)).getType() == "trapezium") {
				g.setColor(figures.get(i).getColorRGB());
				g.fillPolygon(new int[] {x, (int) (x + figures.get(i).getB()*Math.sin(figures.get(i).getAngle())) , (int) (x + figures.get(i).getB()*Math.sin(figures.get(i).getAngle()) + figures.get(i).getC()), x + (int) figures.get(i).getA() }, new int[] {y + (int) (figures.get(i).getB()*Math.sin(figures.get(i).getAngle())), y, y, y + (int) (figures.get(i).getB()*Math.sin(figures.get(i).getAngle()))}, 4);
				
			}
			x += 100;
			if(i == 9 || i == 18 || i == 27 || i == 36 || i == 45 || i == 54 || i == 63 || i == 72 || i == 81) {
				y += 100;
				x = 10;
			}
			
		}
		
	}

}
