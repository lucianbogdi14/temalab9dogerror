package AnimalRescue;

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


        Horse vasile = new Horse ();
        vasile.setName("Vasile");
        vasile.setAge(14);
        vasile.setHealth(4);
        vasile.setHunger(7);
        vasile.setMood(5);
        vasile.setFavouritefood("Cartof");
        vasile.setfavouriteactivity("Running");


        System.out.println(vasile.getName());
        System.out.println(vasile.getAge());
        System.out.println(vasile.getHealth());
        System.out.println(vasile.getHunger());
        System.out.println(vasile.getMood());
        System.out.println(vasile.getFavouritefood());
        System.out.println(vasile.getFavouriteactivity());


        Adoption  = new Adoption();
        Adoption.setName("Gogu");
        Adoption.setMoney(10);
        System.out.println(Adoption.getName());
        System.out.println(Adoption.getMoney());

        Vet  = new Vet ();
        Vet.setName("Adina");
        Vet.setspecial();
        System.out.println(Vet.getName());
        System.out.println(Vet.getspecial());

        Food = new Food();
        Food.setName("Cartof");
        Food.setPrice(20);
        Food.setQuantity(10);
        Food.setstock(30);
        System.out.println(Food.getName());
        System.out.println(Food.getprice());
        System.out.println(Food.getQuantity());
        System.out.println(Food.getstock());

        Activity = new Activity();
        Activity.setName("Running");
        System.out.println(Activity.getName());

    }

}
