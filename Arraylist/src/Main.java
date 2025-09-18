import java.util.ArrayList;

class Bus {
    String numberPlate;
    String color;
    String route;
    String customerName;
    Boolean availableStatus;
    int rate;

    public Bus(String numberPlate, String color, String route, String customerName, Boolean availableStatus, int rate) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.route = route;
        this.customerName = customerName;
        this.availableStatus = availableStatus;
        this.rate = rate;
    }

    public String getDescription() {
        return "Bus{" +
                "numberPlate='" + numberPlate + '\'' +
                ", color='" + color + '\'' +
                ", route='" + route + '\'' +
                ", customerName='" + customerName + '\'' +
                ", availableStatus=" + availableStatus +
                ", rate=" + rate +
                '}';
    }
}

class BusCompany {
    private ArrayList<Bus> buses;

    public BusCompany() {
        this.buses = new ArrayList<>();
    }

    // Method to add a new Bus object
    public void addBus(Bus bus) {
        buses.add(bus);
    }

    // Method to remove a Bus object at given index
    public void removeBus(int index) {
        if (index >= 0 && index < buses.size()) {
            buses.remove(index);
        } else {
            System.out.println("Error: Invalid index. Please provide an index between 0 and " + (buses.size() - 1));
        }
    }

    // Method to display description of all buses
    public void displayAllBuses() {
        for (Bus bus : buses) {
            System.out.println(bus.getDescription());
        }
    }

    // Method to display buses with rate > 500
    public void displayHighRateBuses() {
        for (Bus bus : buses) {
            if (bus.rate > 500) {
                System.out.println(bus.getDescription());
            }
        }
    }

    // Method to display red or blue buses
    public void displayColoredBuses() {
        for (Bus bus : buses) {
            if (bus.color.equalsIgnoreCase("red") || bus.color.equalsIgnoreCase("blue")) {
                System.out.println(bus.getDescription());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage
        BusCompany company = new BusCompany();

        // Adding buses
        company.addBus(new Bus("ABC123", "Red", "Route 1", "John", true, 600));
        company.addBus(new Bus("XYZ789", "Blue", "Route 2", "Alice", false, 450));
        company.addBus(new Bus("DEF456", "Green", "Route 3", "Bob", true, 700));

        System.out.println("All buses:");
        company.displayAllBuses();

        System.out.println("\nBuses with rate > 500:");
        company.displayHighRateBuses();

        System.out.println("\nRed or Blue buses:");
        company.displayColoredBuses();

        System.out.println("\nRemove bus at index 1:");
        company.removeBus(1);

        System.out.println("\nAll buses after removal:");
        company.displayAllBuses();

        System.out.println("\nRemove bus at invalid index 5:");
        company.removeBus(5);
    }
}
