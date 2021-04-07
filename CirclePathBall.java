package balls;
import java.awt.Color;

public class CirclePathBall extends Ball{
	public double rad = 0;

	public CirclePathBall(int startx, int starty, int startrad, int startxspeed, int startyspeed, Color startcolor) {
		super(startx, starty, startrad, startxspeed, startyspeed, startcolor);
		
	}
	
	public void move() {
		super.move();
		setX((int)(Math.cos(rad) * super.getHeight()/3) + super.getHeight()/2);
		setY((int)(Math.sin(rad) * super.getHeight()/3) + super.getHeight()/2);
		
		rad += 0.08;
	}
}
