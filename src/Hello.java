public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello James");

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("Is not an alien!");
        }
        int topScore = 100;
        if(topScore == 100){
            System.out.println("You got the high score!");
        }
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
