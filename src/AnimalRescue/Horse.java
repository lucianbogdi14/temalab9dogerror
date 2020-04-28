package AnimalRescue;

public class Horse {


        private String name;
        private int age;
        private int health ;
        private int hunger ;
        private int mood ;
        private String favouritefood ;
        private String favouriteactivity ;


        public String getName(){

                return name;
        }
        public void setName(String name) {

                this.name = name;
        }


        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public int getHealth() {
                return health;
        }

        public void setHealth(int health) {
                this.health = health;
        }

        public int getHunger() {
                return hunger;
        }

        public void setHunger(int hunger) {
                this.hunger = hunger;
        }

        public int getMood() {
                return mood;
        }

        public void setMood(int mood) {
                this.mood = mood;
        }

        public String getFavouriteactivity() {
                return favouriteactivity;
        }
        public void setfavouriteactivity(String favouriteactivity){
                this.favouriteactivity = favouriteactivity;
        }

        public String getFavouritefood() {
                return favouritefood;
        }
        public void setFavouritefood(String favouritefood){
                this.favouritefood = favouritefood;
        }
}
