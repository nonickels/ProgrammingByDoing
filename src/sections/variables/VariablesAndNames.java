package sections.variables; // Imports variables

/**
 * Created by Nick on 4/21/16.
 */
public class VariablesAndNames {
    public static void main( String[] args ) // Defines main method
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven; // Creates instance variables
        double space_in_a_car, carpool_capacity, average_passengers_per_car; // Creates instance variables

        cars = 100; // Value of car variable is 100
        space_in_a_car = 4.0; // Value of space in car is 4.0
        drivers = 30; // Number of drivers is 30
        passengers = 90; // Number of passengers is 90
        cars_not_driven = cars - drivers; // Cars not driven is the difference of total cars over total drivers
        cars_driven = drivers; // Amount of cars driven is equal to the number of drivers
        carpool_capacity = cars_driven * space_in_a_car; // The carpool capacity is the product of cars driven and space per car
        average_passengers_per_car = passengers / cars_driven; // Average passengers per car is the marginal change in passengers for a 1 unit increase in cars_driven
        // Command + K will commit changes

        //Wow nick, that's so cool
        // All below print statements that include strings and an instance variable
        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}

