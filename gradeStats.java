import java.util.Scanner;

public class gradeStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        double maxGrade = Double.MIN_VALUE;
        double minGrade = Double.MAX_VALUE;

        System.out.println("Please enter ten grades: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter grade " + (i + 1) + ": ");

            if (scanner.hasNextDouble()) {
                double grade = scanner.nextDouble();
                total += grade;
                if (grade > maxGrade) {
                    maxGrade = grade;
                }
                if (grade < minGrade) {
                    minGrade = grade;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid numeric grade.");
                scanner.next();
            }
        }
        double average = total / 10;

        System.out.printf("Average grade: %.2f%n", average);
        System.out.printf("Maximum grade: %.2f%n", maxGrade);
        System.out.printf("Minimum grade: %.2f%n", minGrade);

        scanner.close();
            } 
        }