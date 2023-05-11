import java.util.Scanner;

public class UserInput {

    private Scanner scanner;

    // Constructor method that initialises a new Scanner object for user input
    public UserInput() {
        scanner = new Scanner(System.in);
    }

    // Prompt the user to select the description of the incident from a list of options and return the selected option
    public String getDescription() {
        String[] descriptions = {
                "Broken pavement",
                "Poorly lit street",
                "Blocked sidewalk",
                "Unsafe crossing",
                "Other"
        };

        System.out.println("Select the description of the incident:");
        for (int i = 0; i < descriptions.length; i++) {
            System.out.println((i + 1) + ". " + descriptions[i]);
        }

        int selection;
        do {
            System.out.print("Enter the number of your choice: ");
            selection = scanner.nextInt();
        } while (selection < 1 || selection > descriptions.length);

        scanner.nextLine();
        return descriptions[selection - 1];
    }

    // Prompt the user to enter the location of the incident and return the user input
    public String getLocation() {
        System.out.print("Enter the location of the incident: ");
        return scanner.nextLine();
    }

    //  Return the Scanner object used for user input
    public Scanner getScanner() {
        return scanner;
    }
}