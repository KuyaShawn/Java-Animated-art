import acm.program.GraphicsProgram;
import acm.graphics.*;

import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.Timer;

// MADE BY Eashune Abenojar

// Sunset / Moon rise Animation
public class Screen_Saver_Project extends GraphicsProgram implements ActionListener {

	// Constants
	public static final int height = 550;
	public static final int width = 750;
	
	final int box= 200;
	final int Knob = 10;
	final int leaf = 75;
	final int WINDOW = 50;

	public void init() {
		setSize(width, height);
	}

	public void run() {
		// Backgroud Color
		Color backGround = new Color(34, 70, 169);
		setBackground(backGround);

		// Barn
		GRect barn = new GRect(500, 100, box, box);
		add(barn);
		barn.setFilled(true);
		barn.setColor(Color.RED);

		// Roof
		Color roofColor = new Color(102, 51, 0);
		GPolygon roof = new GPolygon();
		roof.addVertex(500, 100);// draws this first
		roof.addVertex(300, 100);// then this second
		roof.addVertex(400, 0);// then lastly this
		roof.setColor(roofColor);
		roof.setFilled(true);
		add(roof, 200, 0);

		// Roof Label
		GLabel rl = new GLabel("BARN", 585, 70);
		rl.setColor(Color.RED);
		add(rl);

		// Door
		GRect door = new GRect(60, 100);
		Color doorColor = new Color(102, 51, 0);
		add(door, 570, 200);
		door.setColor(doorColor);
		door.setFilled(true);

		// Door knob
		GOval doorknob = new GOval(615, 250, Knob, Knob);
		add(doorknob);
		doorknob.setFilled(true);
		doorknob.setColor(Color.BLACK);

		// Windows
		Color lightBlue = new Color(181, 242, 255);
		GRect window = new GRect(WINDOW, WINDOW);
		window.setColor(lightBlue);
		window.setFilled(true);
		add(window, 630, 130);

		GLine horz1 = new GLine(630, 155, 680, 155);
		add(horz1);
		GLine Vert1 = new GLine(655, 130, 655, 180);
		add(Vert1);

		// Second Windows
		GRect window2 = new GRect(WINDOW, WINDOW);
		window2.setColor(lightBlue);
		window2.setFilled(true);
		add(window2, 530, 130);

		GLine horz2 = new GLine(530, 155, 580, 155);
		add(horz2);
		GLine Vert2 = new GLine(555, 130, 555, 180);
		add(Vert2);

		// Draw Tree Trunk
		Color brown = new Color(105, 74, 78);
		Color darkGreen = new Color(36, 138, 60);

		GRect trunk1 = new GRect(10, 150);
		trunk1.setColor(brown);
		trunk1.setFilled(true);
		add(trunk1, 300, 150);

		GRect trunk2 = new GRect(10, 150);
		trunk2.setColor(brown);
		trunk2.setFilled(true);
		add(trunk2, 45, 150);

		// Draw Tree leaves
		GOval leaves1 = new GOval(100, leaf);
		leaves1.setColor(darkGreen);
		leaves1.setFilled(true);
		add(leaves1, 255, 100);

		GOval leaves2 = new GOval(100, leaf);
		leaves2.setColor(darkGreen);
		leaves2.setFilled(true);
		add(leaves2, 0, 100);

		// Draw Moon
		Color Grey = new Color(153, 153, 153);
		GOval moon = new GOval(100, 100);
		moon.setColor(Grey);
		moon.setFilled(true);
		add(moon, 100, 700);

		// Draw sun
		Color sunny = new Color(253, 193, 17);
		GOval sun = new GOval(100, 100);
		sun.setColor(sunny);
		sun.setFilled(true);
		add(sun, 100, 0);

		// Stars # 1
		GPolygon diamond1 = new GPolygon();
		diamond1.setColor(Color.YELLOW);
		diamond1.setFilled(true);
		diamond1.addVertex(-15, 0);
		diamond1.addVertex(0, 20);
		diamond1.addVertex(15, 0);
		diamond1.addVertex(0, -20);
		add(diamond1, 20, 725);

		// Stars # 2
		GPolygon diamond2 = new GPolygon();
		diamond2.setColor(Color.YELLOW);
		diamond2.setFilled(true);
		diamond2.addVertex(-15, 0);
		diamond2.addVertex(0, 20);
		diamond2.addVertex(15, 0);
		diamond2.addVertex(0, -20);
		add(diamond2, 470, 750);

		// Stars # 3
		GPolygon diamond3 = new GPolygon();
		diamond3.setColor(Color.YELLOW);
		diamond3.setFilled(true);
		diamond3.addVertex(-15, 0);
		diamond3.addVertex(0, 20);
		diamond3.addVertex(15, 0);
		diamond3.addVertex(0, -20);
		add(diamond3, 370, 800);

		// Stars # 4
		GPolygon diamond4 = new GPolygon();
		diamond4.setColor(Color.YELLOW);
		diamond4.setFilled(true);
		diamond4.addVertex(-15, 0);
		diamond4.addVertex(0, 20);
		diamond4.addVertex(15, 0);
		diamond4.addVertex(0, -20);
		add(diamond4, 730, 750);

		// Grass
		Color Green = new Color(0, 102, 0);
		GRect grass = new GRect(1000, 500);
		add(grass, 0, 300);
		grass.setColor(Green);
		grass.setFilled(true);

		// Lake
		Color water = new Color(21, 146, 255);
		GOval Lake = new GOval(200, 150);
		Lake.setColor(water);
		Lake.setFilled(true);
		add(Lake, 0, 325);

		// Lake Label
		GLabel lake = new GLabel("Pond", 100, 400);
		add(lake);

		// Birds
		GPolygon bird1 = new GPolygon();
		bird1.setColor(Color.WHITE);
		bird1.setFilled(true);
		bird1.addVertex(15, 0);
		bird1.addVertex(0, 20);
		bird1.addVertex(35, 0);
		bird1.addVertex(0, -20);
		add(bird1, 100, 50);

		GPolygon bird2 = new GPolygon();
		bird2.setColor(Color.WHITE);
		bird2.setFilled(true);
		bird2.addVertex(15, 0);
		bird2.addVertex(0, 20);
		bird2.addVertex(35, 0);
		bird2.addVertex(0, -20);
		add(bird2, 50, 100);

		// Adding Dog .gif
		GImage doggo = new GImage("dogge.gif");
		doggo.scale(.6, .6);
		add(doggo, 300, 300);

		// Moving objects
		while (true) {
			// Moving moon
			moon.move(0, -1);
			pause(3);

			if (moon.getY() <= 20) {
				moon.setLocation(moon.getX(), 20);
			}
			// Moving sun
			sun.move(0, 1);
			pause(3);

			if (sun.getY() >= 700) {
				sun.setLocation(sun.getX(), 700);
			}
			// Moving star 1
			diamond1.move(0, -1);
			pause(3);

			if (diamond1.getY() <= 25) {
				diamond1.setLocation(diamond1.getX(), 25);
			}
			// Moving star 2
			diamond2.move(0, -1);
			pause(3);

			if (diamond2.getY() <= 50) {
				diamond2.setLocation(diamond2.getX(), 35);
			}
			// Moving star 3
			diamond3.move(0, -1);
			pause(3);

			if (diamond3.getY() <= 100) {
				diamond3.setLocation(diamond3.getX(), 100);
			}
			// Moving star 4
			diamond4.move(0, -1);
			pause(3);

			if (diamond4.getY() <= 55) {
				diamond4.setLocation(diamond4.getX(), 55);
			}
			// Moving bird 1
			bird1.move(3, 0);
			pause(3);

			if (bird1.getX() >= width) {
				bird1.setLocation(0, bird1.getY());
			}
			// Moving bird 2
			bird2.move(3, 0);
			pause(3);

			if (bird2.getX() >= width) {
				bird2.setLocation(0, bird2.getY());
			}

		}
	}

}

// Made by Eashune Abenojar
