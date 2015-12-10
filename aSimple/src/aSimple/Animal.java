package aSimple;

public class Animal {
	
	public static final int MaxAnimals = 5;
	
	protected static int NumOfAnimals;
	
	private String name = "name";
	private String type;
	private String sound = "rooor";
	private double weight = 0;
	private String color = "gray";
	
		
	
	public Animal(String name) {
		this.name = name;
		NumOfAnimals++;
	}
	
	public void getName(){
		System.out.println(this.name);
	}
	
	public void getSound(){
		System.out.println(this.sound); 
	}
	
	
	

}
