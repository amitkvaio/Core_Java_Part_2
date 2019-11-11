package com.harman;

public class Point {
	protected int x,y;
	
	public Point(int _x , int _y) {
		x=_x;
		y=_y;
	}
	public static void main(String[] args) {
		Point p = new Point(10, 20);
		System.out.println(p.x + " "+p.y);
	}
}
