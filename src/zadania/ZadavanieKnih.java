package zadania;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;

public class ZadavanieKnih {

    public static void main(String[] args) {
        ArrayList<String> knihy = new ArrayList<>();
        ArrayList<String> autorovia = new ArrayList<>();
        ArrayList<Integer> roky = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Napis knihy, napis koniec na ukoncenie: ");

        while (true) {
            String input = sc.nextLine();

            String normalizedString = Normalizer.normalize(input, Normalizer.Form.NFKD)
                    .replaceAll("[^\\p{ASCII}]", "")
                    .toLowerCase()
                    .replaceAll("\\s{2,}", " ")
                    .trim();

            if (normalizedString.equals("koniec")) {
                // Display the extracted information
                for (int i = 0; i < knihy.size(); i++) {
                    System.out.println("Book: " + knihy.get(i));
                    System.out.println("Author: " + autorovia.get(i));
                    System.out.println("Year: " + roky.get(i));
                    System.out.println(); // Add an empty line for separation
                }

                System.out.println(knihy);
                System.out.println(autorovia);
                System.out.println(roky);
                System.out.println("Koniec programu.");
                sc.close();
                break;
            } else {
                // Split the input and extract book details
                String[] parts = input.split(" ");

                boolean bookFound = false;
                String bookName = "";
                String authorName = "";
                int year = 0;

                for (int i = 0; i < parts.length - 1; i++) {
                    if (parts[i].equals("book:") && i < parts.length - 2) {
                        bookName = input.substring(input.indexOf("book:") + 6, input.indexOf("author:")).trim();
                        bookFound = true;

                    } else if (parts[i].equals("author:") && i < parts.length - 2) {
                        authorName = input.substring(input.indexOf("author:") + 8, input.indexOf("year:")).trim();
                    } else if (parts[i].equals("year:") && i < parts.length - 1) {
                        try {
                            year = Integer.parseInt(parts[i + 1]);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid year format. Please enter a valid year.");
                        }
                    }
                }

                if (bookFound) {
                    knihy.add(bookName);
                    autorovia.add(authorName);
                    roky.add(year);
                } else {
                    System.out.println("Invalid input format. Please include 'book:', 'author:', and 'year:' in your input.");
                }
            }
        }
    }
}