package com.GitHub.Class;

public class Ant 
{
	public static String desc = "This is an ant class";
	private static String origin = "Ants originate from <still has to figire out>";
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		Ant.origin = origin;
	}

	private int legs;
	public int color;
	private int age;
	private double pheromoneLevel;
	
	//getters and setters for class fields
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPheromoneLevel() {
		return pheromoneLevel;
	}
	public void setPheromoneLevel(double pheromoneLevel) {
		this.pheromoneLevel = pheromoneLevel;
	}
	
	public void stop()
	{
		System.out.println("Ant is re-thinking it's choices");
	}
	
	public void decrementPheromone(int x)
	{
		if(this.pheromoneLevel > x)
			this.pheromoneLevel -= x;
		else if(this.pheromoneLevel == x)
		{
			this.pheromoneLevel = 0;
			System.out.println("Ant got lost forever");
		}
		else
		{
			System.out.println("Ant doesn't have enough scent left to leave");
			stop();
		}
			
	}
	
	public void leavePheromone()
	{
		System.out.println("Drop that scent of pheromone");
		decrementPheromone(1);		
	}
	
	public void moveForward()
	{
		System.out.println("Right front leg a step then Right back then front left "
				+ "and finally left back");
		leavePheromone();
	}
	
}
