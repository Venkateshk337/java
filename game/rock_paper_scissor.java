import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int a;
        
        System.out.println();
        System.out.println("1->Rock \n2->paper \n3->Scissor");
        int choice;
        String game;
        int number = 0;
        do {
            a = rand.nextInt(3);
            a = a + 1;
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            if (a  == choice)
                System.out.println("Same choice and match draw \n Two also choice Rock");
            else if (a == 1 && choice == 2)
                System.out.println("You won ");
            else if (a == 1 && choice == 3)
                System.out.println("you lose");
            else if (a == 2 && choice == 3)
                System.out.println("you won");
            else if (a == 2 && choice == 1)
                System.out.println("you lose");
            else if (a == 3 && choice == 1)
                System.out.println("you won");
            else if (a == 3 && choice == 2)
                System.out.println("you lose");
            else{
                System.out.println("you enter wrong input");
                number--;
            }
            number++;
            System.out.println("Enter 'Y' to continue the game and 'N' to quit");

            game = sc.next();
            
        } while (!game.equalsIgnoreCase("N"));
        System.out.println("Number of game played:" + number);
        sc.close();
    }
}