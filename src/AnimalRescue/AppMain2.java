package AnimalRescue;

public class AppMain2 {
    private static  Adoption;
    private static  Activity
    private static Food
    private static  Adoption
    private static  Food

    public static void main(String[] args) {


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
