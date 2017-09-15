/**
 * Class calculating the cost of a room
 * @author Isabelle Delmas
 *
 */
public class Suite {
	private String roomView;
	private String roomSeason;
	private int numberOfOccupants;
	
	/**
	 * Constructor
	 * @param view : Street of Ocean
	 * @param season : Summer or Winter
	 * @param occupants : number of occupants in the room
	 */
	public Suite(String view, String season, int occupants) {
		this.roomView = view;
		this.roomSeason = season;
		this.numberOfOccupants = occupants;
	}
	
	/**
	 * Calculate the cost of a room depending on the view, the number of occupants and the season
	 * @return : the cost
	 */
	public double getCost() {
		double cost = 0.0;
		if (this.roomSeason.toUpperCase().equals("WINTER")) {
			if (this.numberOfOccupants < 3) {
				if (this.roomView.toUpperCase().equals("STREET")) {
					cost = 150;
				}
				else {
					cost = 175;
				}
			}
			else if (this.numberOfOccupants < 5){
				if (this.roomView.toUpperCase().equals("STREET")) {
					cost = 210;
				}
				else {
					cost = 315;
				}
			}
			else {
				cost = this.numberOfOccupants*200;
				
			}
		}
		else {
			if (this.numberOfOccupants < 3) {
				if (this.roomView.toUpperCase().equals("STREET")) {
					cost = 200;
				}
				else {
					cost = 250;
				}
			}
			else if (this.numberOfOccupants < 5){
				if (this.roomView.toUpperCase().equals("STREET")) {
					cost = 325;
				}
				else {
					cost = 370;
				}
			}
			else {
				cost = this.numberOfOccupants*200;
			}
		}
		
		return cost;
	}
}
