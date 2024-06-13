package com.kenneth;

/**
* @author Kenneth Hudson
* 02/27/2024
* A program that makes a circle
**/

public class Circle1 {
	/**
	 * instance variables
	 */
	public int x, y, radius;
	
	/**
	 * Creates the circle
	 * @param x The x-coordinate of the center of the circle
	 * @param y The y-coordinate of the center of the circle.
	 * @param r The radius of the circle
	 */
	public Circle1 (int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.radius = r;
	}
	
	 /**
     * Returns a string representation of the circle's equation in the form
     * "(x - x_center)^2 + (y - y_center)^2 = radius^2".
     * 
     * @return The equation of the circle as a string.
     */
	public String toString() {
		return "(" + "x-" + this.x + ")^2 " + "+" + " (" + "y-" + this.y + ")^2 " + "= " + this.radius + "^2";
		}
	}
