package activities;

public class Car {
String color;
String transmission;
int make;
int tyres;
int  doors;

//constructor for Car
Car(){
	tyres = 4;
	doors = 4;
	
}

public void displayCharacteristics() {
	System.out.println("Car Details are :");
	System.out.println("Color is :"+ color);
	System.out.println("Transmission is :"+ transmission);
	System.out.println("Make is :"+ make);
	System.out.println("Tyres are :"+ tyres);
	System.out.println("Doors are :"+ doors);
	
}

public void accelarate() {
	System.out.println("Car is moving forward.");
}

public void brake() {
	System.out.println("Car has stopped.");
}

}
