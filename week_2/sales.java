import java.util.Scanner;

public class sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sales person");
        int salesperson = sc.nextInt();
        int amount[] = new int[100];
        int i, avg, sum = 0, max = 0, maxid = 0, min = 0, minid = 0;
        for (i = 0; i < salesperson; i++) {
            System.out.println("Enter the Salesperson id " + i + "of sales:");
            amount[i] = sc.nextInt();
            sum = sum + amount[i];
            if (max < amount[i]) {
                maxid = i;
                max = amount[i];
            }
        }
        avg = sum / salesperson;
        System.out.println("Average of sales by salesperson is " + avg);
        System.out.println();
        System.out.println("Salesperson " + maxid + " had the highest sale with $" + max);
        System.out.println();
        for (i = 0; i < salesperson; i++) {
            if (avg > amount[i]) {
                avg = amount[i];
                minid = i;
                min = amount[i];

            }
        }
        System.out.println("Salesperson " + minid + " had the lowest sale with $" + min);
        System.out.println();
        int count = 0;
        System.out.println("Enter the amount:");
        int extend = sc.nextInt();
        for (i = 0; i < salesperson; i++) {
            if (extend < amount[i]) {
                System.out.println("salesperson of " + i + " extends the sale of $" + amount[i]);
                count++;
            }
        }
        System.out.println();
        System.out.println("Number of person extends the sale is " + count);
        System.out.println();
        int amount1[] = new int[100];
        for (i = 0; i < salesperson; i++) {

            amount1[i + 1] = amount[i];
        }
        for (i = 0; i < salesperson; i++) {
            amount[i + 1] = amount1[i + 1];
            System.out.println("Salesperson " + (i + 1) + " sales of " + amount[i + 1]);
        }
        sc.close();
    }
}
