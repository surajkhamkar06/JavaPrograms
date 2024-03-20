import java.util.Scanner;

class CostOfDriving{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance to drive:");
        double distance = scanner.nextDouble();

        System.out.println("Enter the fuel efficiency of the car in miles per gallon:");
        double fuelEfficiency = scanner.nextDouble();

        System.out.println("Enter the price per gallon of fuel: ");
        double pricePerGallon = scanner.nextDouble();

        
        double totalCost = (distance / fuelEfficiency) * pricePerGallon;
        System.out.println("The cost of the trip is : " + totalCost);       
    }
}
