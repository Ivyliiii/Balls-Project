package balls;
import java.awt.Color;

public class SineBall extends Ball{
	public double rad = 0;
	
	public SineBall(int startx, int starty, int startrad, int startxspeed, int startyspeed, Color startcolor) {
		super(startx, starty, startrad, startxspeed, startyspeed, startcolor);
		
	}
	
	public void move() {
		super.move();
		setY((int)(-1*(Math.sin(rad)*(super.getHeight()/6)) + (super.getHeight()/2)));
		rad += 0.08;
		if(getX() + getRad() >= WIDTH || getX() <= 0) {
			setXSpeed(-getXSpeed());
		}
		
	}
}