package animals;

public class Animal {
	private String breed;
	private int weight;
	private int legs;
	
	
	public Animal() {
	}
	
	public Animal(String breed, int weight) {
		this.breed = breed;
		this.weight = weight;
	}
	
	public Animal(String breed, int weight, int legs) {
		this.breed = breed;
		this.weight = weight;
		this.legs = legs;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	
}
