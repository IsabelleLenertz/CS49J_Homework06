/**
 * Class used to represent a verb and get its past tense
 * @author Isabelle Delmas
 *
 */
public class Verb {
	private String present;		// base form of the verb
	
	/**
	 * Constructor with one argument
	 * @param presentForm the base form of the verb
	 */
	public Verb(String presentForm) {
		this.present = presentForm;
	}
	
	/**
	 * Accessor for the base form
	 * @return the base form of the verb
	 */
	public String getVerb() {
		return this.present;
	}
	 /**
	  * Accessor for the past for of the verb
//	  * @return past form of the verb
	  */
	public String getPast() {
		String returnValue;
		int maxindex = this.present.length() -1;
		String lastChar = this.present.substring(maxindex);
		
		// Check whether it is an irregular verb
		if (this.present == "run") {
			returnValue = "ran";
		}
		else if (this.present == "ride") {
			returnValue = "rode";
		}
		else if (this.present == "see") {
			returnValue = "saw";
		}
		// Else check the ending
		else if (lastChar.equals("y")) {
			returnValue = this.present.substring(0, maxindex) + "ied";
		}
		else if (lastChar == "e") {
			returnValue = this.present + "d";
		}
		else if ( (maxindex + 1 == 3) && !((lastChar.equals("a") )|| (lastChar.equals("e")) || (lastChar.equals("i")) || (lastChar.equals("o")) || (lastChar.equals("u")) || (lastChar.equals("y") ))) {
			returnValue =  this.present + lastChar + "ed";
		}
		else {
			returnValue = this.present+ "ed";
		}
		
		return returnValue;
	}
}
