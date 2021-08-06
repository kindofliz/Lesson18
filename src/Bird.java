public class Bird extends Animal {


    public String flyAway() {
        String flyAwayString = "I am flying to Bora Bora";

        return flyAwayString;
    }

    //overriding the parent method (animal) and giving i a different body
    public void sleep() {
        System.out.println("Tweet Tweet! I am sleeping.");
    }
}
