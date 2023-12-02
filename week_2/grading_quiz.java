import java.util.Scanner;

public class grading_quiz {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String questions[] = { "5+10", "30/2", "20-8", "5*4", "8-6", "20-16+4", "4*8", "6/1", "(4*2)/2", "9/3*4" };
        String choice;
        do {
            System.out.println("Enter the number of Question in quiz:");
            int number = sc.nextInt();
            System.out.println("Quiz questions are follow:");
            int i = 0;
            for (i = 0; i < number; i++) {
                System.out.println((i + 1) + "." + questions[i]);
            }
            int keys[] = { 15, 15, 12, 20, 2, 8, 32, 6, 4, 12 };
            int answer[] = new int[number];
            System.out.println("Please enter only integer answer.");
            for (i = 0; i < number; i++) {
                System.out.print((i + 1) + ".");
                answer[i] = sc.nextInt();
            }
            int count = 0;
            for (i = 0; i < number; i++) {
                if (answer[i] == keys[i]) {
                    System.out.println((i + 1) + ".Enter answer is right. Answer=" + keys[i]);
                    count++;

                } else {
                    System.out.println((i + 1) + ".Enter answer is wrong. Right answer=" + keys[i]);
                }
                System.out.println();
            }
            System.out.println("Number of right answer is "+count);
            double percentage = count * 100 / number;
            System.out.println("You got " + percentage + "% in quiz");
            System.out.println("to continue the quiz enter 'y' and to quit 'n' ");
            choice = sc.next();
        } while (!choice.equalsIgnoreCase("n"));
        sc.close();
    }
}
