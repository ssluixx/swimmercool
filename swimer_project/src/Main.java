import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your gender (M/F): ");
        String gender = scanner.nextLine();

        System.out.print("Enter your level (beginner/amateur/professional): ");
        String level = scanner.nextLine();

        System.out.print("Enter your training goal (speed/endurance/technique): ");
        String goal = scanner.nextLine();

        Swimmer[] styles = {
                new Freestyle(),
                new Backstroke(),
                new Breaststroke(),
                new Butterfly()
        };

        for (Swimmer style : styles) {
            String name = style.getClass().getSimpleName();
            System.out.println("\n=== " + name + " ===");

            style.setData(age, gender, level, goal);


            System.out.print("Enter your 50m time for " + name + " (in seconds): ");
            double time = scanner.nextDouble();
            scanner.nextLine();

            style.setTime(time);
            style.giveRecommendation();
            System.out.println("------");
        }

        scanner.close();
    }
}
