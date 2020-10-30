import java.util.Scanner;
import java.util.Spliterator;

public class Game {

    public static void main(String[] args) {

        boolean readyLoopTrig = true;
        String y = "Y";
        String n = "N";

        Scanner sc = new Scanner(System.in);

        while (readyLoopTrig){

            System.out.println("Welcome to Quizzyman! Are you ready to play?");
            System.out.println("Y] Yes  " + "  N] No");

            String input = sc.next();

            if(input.equals(y.toLowerCase())){
                readyLoopTrig = false;
                System.out.println("Great! Here is your first question:");
                System.out.println(sport.question1.getQuestion());
                System.out.println(sport.question1.getChoice1());
                System.out.println(sport.question1.getChoice2());
                System.out.println(sport.question1.getChoice3());
                System.out.println(sport.question1.getChoice4());

                input = sc.next();

                if(input.equals(sport.question1.getAnswer().toLowerCase())){
                    System.out.println("Nice! You received 100 points!");
                } else {
                    System.out.println("Nice try! The correct answer is: " + sport.question1.getChoice3());
                }

            }

        }




    }

}
