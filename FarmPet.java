package animals;

public class FarmPet extends Animal{
	int vpk;

	public FarmPet() {
		super();
	}

	public FarmPet(String breed, int weight, int legs) {
		super(breed, weight, legs);
	}

	public FarmPet(String breed, int weight) {
		super(breed, weight);
	}
	
	public FarmPet (String breed, int weight, int vpk, int legs){
		super (breed, weight, legs);
		this.vpk = vpk;
	}
	
	public int getValue(){
		return vpk;
	}

}
