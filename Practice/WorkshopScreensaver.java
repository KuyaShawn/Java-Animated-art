import acm.program.GraphicsProgram;
import acm.graphics.*;
import java.awt.Color;

public class WorkshopScreensaver extends GraphicsProgram {
	
//Creating a constants for the window
	
	public static final int APPLICATION_WIDTH = 1920;
	public static final int APPLICATION_HEIGHT = 1080;
	
	final int BUBBLE=80;
	final int FISH_WIDTH=350;
	final int FISH_HEIGHT=150;
	
//Setting window size
	public void init() {
		setSize(APPLICATION_WIDTH,APPLICATION_HEIGHT);
	}
	
//Importing a background image in
	public void run() {
		GImage img1=new GImage("Underwater.png");
			add(img1,0,0);

//Drawing the shapes (x,y,length,width)
			
			//Green Fish's Tail	
			GPolygon fishTail2=new GPolygon();
			add(fishTail2);
			//top point
				fishTail2.addVertex(100, 180);
			//inside point of the tail
				fishTail2.addVertex(150, 240);
			//bottom point
				fishTail2.addVertex(100, 300);
			//connects to oval
				fishTail2.addVertex(260, 240);
			
			fishTail2.setFilled(true);
			fishTail2.setColor(Color.YELLOW);
			
		//Green Fish
			GRect fish2=new GRect(225,170,FISH_WIDTH,FISH_HEIGHT);
			add(fish2);
			fish2.setFilled(true);
			fish2.setColor(Color.GREEN);
			
		//Green Fish's Eyes
			GOval fishEye2=new GOval(510,185,40,40);
			add(fishEye2);
			fishEye2.setFilled(true);
			fishEye2.setColor(Color.WHITE);
			
			GOval fishPupil2=new GOval(525,195,20,20);
			add(fishPupil2);
			fishPupil2.setFilled(true);
			fishPupil2.setColor(Color.BLACK);
			
		//Bubble 1
		
			GOval bubble=new GOval(1500,800,BUBBLE, BUBBLE);
			add(bubble);
			bubble.setFilled(true);
			bubble.setColor(Color.CYAN);
			
		//Bubble 2
			GOval bubble2=new GOval(1300,800,BUBBLE, BUBBLE);
			add(bubble2);
			bubble2.setFilled(true);
			bubble2.setColor(Color.CYAN);
	

	
//Animations
while(true) {
	//Green Fish's Animations	
			fish2.move(4, 0);
			fishTail2.move(4, 0);
			fishEye2.move(4, 0);
			fishPupil2.move(4, 0);
			pause(10); 
			
			if(fish2.getX() > APPLICATION_WIDTH) {
				fish2.setLocation(0, fish2.getY());
				fishTail2.setLocation(-225, fishTail2.getY());
				fishEye2.setLocation(291, 185);
				fishPupil2.setLocation(307, 195);
				
			}
			
			//Bubble Animations
			bubble.move(0, -5);
			pause(10);
			if(bubble.getY() < 100) {
				bubble.setLocation(1500, 800);
			}
			
			bubble2.move(0, -3);
			pause(10);
			if(bubble2.getY() < 400) {
				bubble2.setLocation(1300, 800);
			}
		}
	}
} 
	
		

