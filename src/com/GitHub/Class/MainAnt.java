package com.GitHub.Class;

public class MainAnt {

	public static void main(String[] args) 
	{
		System.out.println(Ant.desc);
		
		Ant ant1 = new Ant();
		
		ant1.getOrigin();
		
		ant1.desc = "description changed";
		
		ant1.setOrigin("India");
		
		Ant ant2 = new Ant();
		
		System.out.println(ant2.desc);
		
		//ant2 = null;
		
		System.out.println(ant2.getOrigin());
		
		System.out.println(ant2.getAge());
	}

}
