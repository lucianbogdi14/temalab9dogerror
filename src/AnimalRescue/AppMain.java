package AnimalRescue;

import java.rmi.server.UnicastRemoteObject;

public class AppMain {

    public static void main(String[] args) {

        Horse myPet = new Horse();
        Adoption adopt = new Adoption();
        Vet veterniar = new Vet();
        Food mancare = new Food();
        Activity activitate = new Activity();

        System.out.println("Name: "+myPet.name);
        System.out.println("Age: " +myPet.age);
        System.out.println("Health: " +myPet.health);
        System.out.println("Hunger: " +myPet.hunger);
        System.out.println("Mood: "  +myPet.mood);
        System.out.println("Favourite food: " +myPet.favouritefood);
        System.out.println("Favourite activity: "+myPet.favouriteactivity);

        System.out.println("Adopt: "+adopt.name);
        System.out.println("Special: "+veterniar.special);
        System.out.println("Pret: "+mancare.price);
        System.out.println("Activitate: " +activitate.name);



    }
}
