import java.util.Scanner;

public class MediaCalculator {
    public static void menuView() {
        System.out.println("===== MENU =====");
    }

    public static double setNumGrades(Scanner scanner) {
        System.out.println("Do you want to take the average of how many grades? ");
        return scanner.nextDouble();
    }

    public static void setGrades(Scanner scanner) {
        double grades = 0.0;
        int i = 0;
        double numGrades = setNumGrades(scanner);

        System.out.println("\nInsert your grades: ");

        while (i < numGrades) {
            double gradesLoop = scanner.nextDouble();
            grades += gradesLoop;
            i++;
        }

        System.out.println("A média de suas notas são: " + grades / numGrades);
    }
}