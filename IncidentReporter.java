import java.util.ArrayList;

public class IncidentReporter {
    private ArrayList<Incident> incidents;

    // Constructor method that initialises an empty list of incidents
    public IncidentReporter() {
        this.incidents = new ArrayList<>();
    }

    // Add a new incident to the list of incidents with the given description and location
    public void addIncident(String description, String location) {
        Incident incident = new Incident(description, location);
        incidents.add(incident);
    }

    // Display all incidents in the list of incidents
    public void displayAllIncidents() {
        for (int i = 0; i < incidents.size(); i++) {
            incidents.get(i).displayIncident();
            System.out.println("------------");
        }
    }

    // Generate a heat map based on the incident data
    public void generateHeatMap() {
        // Implement heat map generation logic here
    }

    // Identify and display problem areas based on the incident data
    public void displayProblemAreas() {
        // Implement problem area identification and display logic here
    }
}