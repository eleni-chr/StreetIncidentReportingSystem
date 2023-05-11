public class Main {
    private static IncidentReporter reporter = new IncidentReporter();
    private static UserInput userInput = new UserInput();

    public static void main(String[] args) {
        // Handle user input to report incidents
        reportIncident();

        // Display reported incidents and heat maps for app administrators
        displayIncidentsAndHeatMaps();
    }

    // This function is responsible for handling user input to report incidents.
    // It prompts the user to enter a description and location for the incident, creates an Incident object using this
    // information, and adds the incident to the IncidentReporter using the addIncident() function.
    public static void reportIncident() {
        String continueReporting;

        do {
            System.out.println("Report a new incident:");
            String description = userInput.getDescription();
            String location = userInput.getLocation();
            reporter.addIncident(description, location);
            System.out.println("Incident reported successfully.");
            System.out.print("Do you want to report another incident? (yes/no): ");
            continueReporting = userInput.getScanner().nextLine();
        } while (continueReporting.equalsIgnoreCase("yes"));
    }

    // This function displays all reported incidents by calling the displayAllIncidents() function in the
    // IncidentReporter class. It then generates a heat map for the reported incidents by calling the generateHeatMap()
    // function and displays problem areas by calling the displayProblemAreas() function in the IncidentReporter class.
    public static void displayIncidentsAndHeatMaps() {
        System.out.println("------------");
        System.out.println("Displaying all reported incidents:");
        reporter.displayAllIncidents();

        // Generate heat map for the reported incidents
        System.out.println("\nGenerating heat map for the reported incidents:");
        reporter.generateHeatMap();

        // Display problem areas based on the incidents data
        System.out.println("\nDisplaying problem areas:");
        reporter.displayProblemAreas();
    }
}