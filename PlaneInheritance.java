package com.tap.Inheritance;

class Plane{
	void takeOff() {
		System.out.println("The plane has taken off.");
	}
	void fly() {
		System.out.println("The plane is flying.");
	}
	void land() {
		System.out.println("The plane has landed.");
	}
	
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("The plane is flying at a low altitude.");
	}
	void carryCargo() {
		System.out.println("The plane is carrying cargo.");	
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("The plane is flying at a medium altitude.");
	}
	void carryPassenger() {
		System.out.println("The plane is carrying passenger.");	
	}
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("The plane is flying at a high altitude.");
	}
	void carryWeapon() {
		System.out.println("The plane is carrying weapons.");	
	}
}
public class PlaneInheritance {

	public static void main(String[] args) {
		CargoPlane c = new CargoPlane();
		c.takeOff();
		c.fly();
		c.land();
		c.carryCargo();
		
		PassengerPlane p = new PassengerPlane();
		p.fly();
		p.takeOff();
		p.land();
		p.carryPassenger();
		
		FighterPlane f = new FighterPlane();
		f.takeOff();
		f.fly();
		f.land();
		f.carryWeapon();
	}

}

//OUTPUT
//The plane has taken off.
//The plane is flying at a low altitude.
//The plane has landed.
//The plane is carrying cargo.
//The plane is flying at a medium altitude.
//The plane has taken off.
//The plane has landed.
//The plane is carrying passenger.
//The plane has taken off.
//The plane is flying at a high altitude.
//The plane has landed.
//The plane is carrying weapons.

