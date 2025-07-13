/** Task -1 => */
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder paragraph = new StringBuilder();
        String line;

        System.out.println("Enter your paragraph (type 'END' to finish):");

        while (true) {
            line = scanner.nextLine();
            if (line.equals("END")) {
                break;
            }
            paragraph.append(line).append("\n");
        }
        String inputParagraph = paragraph.toString();
        System.out.println("Input paragraph:\n" + inputParagraph);
        scanner.close();
    }
}