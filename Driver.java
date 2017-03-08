package animals;

public class Driver {
	public static void main(String[] args){
		HousePet p = new HousePet();
		HousePet p0 = new HousePet ("fish", 6);
		HousePet p1 = new HousePet("canine", 5, 300);
		
		FarmPet f = new FarmPet();
		FarmPet f0 = new FarmPet ("cow", 100, 4);
		
		p.setBreed("feline");
		p.setLegs(4);
		p.setWeight(30);
		
		f.setBreed("horse");
		f.setLegs(4);
		f.setWeight(150);
		
		System.out.println(p0.getBreed());
	}

}
