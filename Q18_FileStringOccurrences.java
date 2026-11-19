import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q18_FileStringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to search for: ");
        String target = sc.nextLine();

        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("Myfile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                int fromIndex = 0;
                while (!target.isEmpty() && (fromIndex = line.indexOf(target, fromIndex)) != -1) {
                    count++;
                    fromIndex += target.length();
                }
            }
            System.out.println("Occurrences of \"" + target + "\" = " + count);
        } catch (IOException e) {
            System.out.println("Could not read Myfile.txt: " + e.getMessage());
        }
        sc.close();
    }
}
