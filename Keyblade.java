public class Keyblade {

	private String name;
	private Medal[][] subslots = new Medal[120][2];
	private double subslotTotal;
	
	public Keyblade(String name, Medal[][] subslots) {
		this.name = name;
		this.subslots = subslots;
		this.subslotTotal = 0.000;
		
		
		
	}

	public String getName() {	
		return name;
	}
	
	public double getSubslotTotal() {
		
		
		return subslotTotal;
		
	}

	private void setSubslotTotal(double subslotTotal) {
		
		
		//this.subslotTotal = 0.000;
	}
	
	
	//Fix later
	public void printSubslots(){
		
		for(int i=2;i<subslots.length;i+=3)
		{
			if(!((i+1)%3==0))
				System.out.println(subslots[i-2][1] + " " + subslots[i-1][1] + " " + subslots[i][1]);
			else
			{
				System.out.println(subslots[i][1] + " " + subslots[i-1][1] + " " + subslots[i-2][1]);
			}
			
		}
	}
}
