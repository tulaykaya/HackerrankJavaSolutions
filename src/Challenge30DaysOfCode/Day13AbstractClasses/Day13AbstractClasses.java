package Challenge30DaysOfCode.Day13AbstractClasses;

import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class Day13AbstractClasses {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String title = scanner.nextLine();
	String author = scanner.nextLine();
	int price = scanner.nextInt();
	scanner.close();

	Book book = new MyBook(title, author, price);
	book.display();
    }
}
