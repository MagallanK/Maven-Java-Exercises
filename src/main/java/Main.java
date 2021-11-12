import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter something: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        System.out.println("You entered:  " + "\"" + userInput + "\"");
        System.out.println("StringUtils.isNumeric(userInput) = " + StringUtils.isNumeric(userInput));
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }

}
