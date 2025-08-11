import java.util.Scanner;

public class gradeStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        double maxGrade = Double.MIN_VALUE;
        double minGrade = Double.MAX_VALUE;

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
            }
        }
        double average = total / 10;

        System.out.printf("Average grade: %.2f%n", average);
        System.out.printf("Maximum grade: %.2f%n", maxGrade);
        System.out.printf("Minimum grade: %.2f%n", minGrade);

        scanner.close();
            } 
        }