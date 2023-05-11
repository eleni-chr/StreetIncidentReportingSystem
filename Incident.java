public class Incident {
    private String description;
    private String location;

    public Incident(String description, String location) {
        this.description = description;
        this.location = location;
    }

    // This function displays the incident's description and location
    public void displayIncident() {
        System.out.println("Description: " + description);
        System.out.println("Location: " + location);
    }
}