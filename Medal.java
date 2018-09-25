public class Medal {

	/*
	 * Should we make these variables final?
	 * Decide later.
	 */
	
	private String element; //element of medal (Power, Speed, or Magic)
	private String alignment; //alignment of medal (Upright or Reverse)
	private int tier; // tier of medal (1 through 8. Higher the better)
	private double subslotBoost; // subslotBoost is determined by tier
	
	public Medal(String element, String alignment, int tier) {
		this.element = element;
		this.alignment = alignment;
		this.tier = tier;
		
		switch(this.tier){
			case 1: this.subslotBoost = 0.001;
					break;
			case 2: this.subslotBoost = 0.002;
					break;
			case 3: this.subslotBoost = 0.005;
					break;
			case 4: this.subslotBoost = 0.008;
					break;
			case 5: this.subslotBoost = 0.012;
					break;
			case 6: this.subslotBoost = 0.016;
					break;
			case 7: this.subslotBoost = 0.020;
					break;
			case 8: this.subslotBoost = 0.025;
					break;
			default: this.subslotBoost = 0.00;
					break;
		}
		
	}
	
	/* 
	 * The next 2 constructors are to only be used for the first
	 * column of the subslots array for Keyblades. This is only
	 * to check if a Player's medal matches with what is required
	 * for that subslot.
	 */
	
	public Medal(String element, String alignment) {
		this.element = element;
		this.alignment = alignment;
	}
	
	public Medal(String element) {
		this.element = element;
		this.alignment = null;
		
	}
	
	/*
	 * getter methods. No setters needed as a medal's stats
	 * cannot be changed in the game, at least when it comes
	 * to subslots. 
	 */
	public String getElement() {
		return element;
	}

	public String getAlignment() {
		return alignment;
	}

	public int getTier() {
		return tier;
	}

	public double getSubslotBoost() {
		return subslotBoost;
	}

}
