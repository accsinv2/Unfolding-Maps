package demos;

import processing.core.PApplet;

public class MyHappyFace extends PApplet {

	public void setup(){
		size(400,400);
		background(200,200,200);
	}
	public void draw(){
		fill(255,255,0);
		ellipse(200,200,390,390);
		fill(0,0,0);
		ellipse(120,130,50,70);
		ellipse(280,130,50,70);
		arc(200,280,85,85,0,PI);
		noFill();
		triangle(170, 225, 198, 170, 226, 225);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
