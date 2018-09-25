public class Player {

	private Keyblade[] keyblades = new Keyblade[15];
	private Medal[] medals = new Medal[1000];
	
	
	public Player(Medal[] medals, Keyblade[] keyblades) {
		this.medals = medals;
		this.keyblades = keyblades;
		
		
	}
	
	
	public void printMedals(){
		for(int i=0;i<200;i++){
			System.out.println(medals[i].getAlignment().substring(0,1)+medals[i].getElement().substring(0,1)+medals[i].getTier());
			
			//System.out.println();
		}

	}

}
