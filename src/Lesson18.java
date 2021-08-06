public class Lesson18 {
    public static void main(String[] args) {

        System.out.println("Hi animals!");

        Animal myAnimal = new Animal();
        myAnimal.sleep();

        Cat myCat = new Cat();
        myCat.setName("Poga! :)");
        myCat.sayMeow();
        myCat.sleep();


        Bird myBird = new Bird();
        String flyAwayMessage = myBird.flyAway();
        System.out.println(flyAwayMessage);
        //this is identical to the previous command
        System.out.println(myBird.flyAway());

        myBird.sleep();



    }
}
