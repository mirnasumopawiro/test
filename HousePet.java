package animals;

public class HousePet extends Animal {
	private int v;
	
	
	public HousePet(){
		
	}
	
	public HousePet (int v){
		this.v = v;
	}
	
	public HousePet (String breed, int weight){
		super (breed, weight);
	}

	public HousePet (String breed, int weight, int v){
		super(breed,weight);
		this.v = v;
	}
	
	public int getValue(){
		return v;
	}
	

}
