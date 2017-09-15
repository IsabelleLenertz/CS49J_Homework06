/**
 * Class representing a semi-circle.
 * Able to check if a point or another semi-circle in inside
 * @author Isabelle Delmas
 *
 */
public class SemiCircle {
	private int x;
	private int y;
	private int radius;
	
	/**
	 * Constructor
	 * @param centerX : x coordinate of the center of the semi-circle
	 * @param centerY : y coordinate of the center of the semi-circle
	 * @param theRadius : radius of the semi-circle
	 */
	public SemiCircle(int centerX, int centerY, int theRadius) {
		this.x = centerX;
		this.y = centerY;
		this.radius = theRadius;
	}
	
	/**
	 * returns true if the point given by the coordinates is inside the SemiCircle.
	 * Otherwise it returns false. Note: the point will be contained in the SemiCircle if the distance
	 * from the center to the print is less than the radius and the point is above the diameter.
	 * A point on the circumference or diameter is not contained in the SemiCircle.
	 * @param otherX : x coordinate of a point
	 * @param otherY : y coordinate of a point
	 * @return : true if the point is inside the semi-circle, false otherwise
	 */
	public boolean contains(int otherX, int otherY) {
		boolean returnValue = false;
		double distance = Math.sqrt( Math.pow(this.x - otherX,  2) + Math.pow(this.y - otherY, 2));
		if(distance < this.radius && this.y > otherY) {
			returnValue = true;
		}
		return returnValue;
	}
	/**
	 * 	returns true if the two SemiCircles intersect;
	 * otherwise it returns false. Two semicircles "intersect" if at least one, 
	 * but not all three of the western, northern, and eastern extreme points of one
	 * semicircle are contained in the other. This means they do not intersect if one is completely
	 * contained in the other or if the extreme point only touches the other semicircle.
	 * @param other : semi-circle to check is if included
	 * @return : true if the two SemiCircles intersect
	 */
	public boolean intersects( SemiCircle other) {
		boolean returnValue = false;
		if ( this.contains(other.x - other.radius, other.y) || this.contains(other.x, other.y - other.radius) || this.contains(other.x + other.radius, other.y)) {
			if (!(this.contains(other.x - other.radius, other.y) && this.contains(other.x, other.y - other.radius) && this.contains(other.x + other.radius, other.y))) {
				returnValue = true;
			}
		}
		if (other.contains(this.x - this.radius, this.y) || other.contains(this.x, this.y - this.radius) || other.contains(this.x + this.radius, this.y)){
			if (!(other.contains(this.x - this.radius, this.y) && other.contains(this.x, this.y - this.radius) && other.contains(this.x + this.radius, this.y))){
				returnValue = true;
			}
		}
				return returnValue;
	}


}
