package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        long checkSolution = toMilesPerHour(-2.0);
        System.out.println(checkSolution);

        printConversion(-2.0);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long rounded;
        if(kilometersPerHour < 0) {
            return -1;
        } else {
            rounded = Math.round(kilometersPerHour/1.609);
            return rounded;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long solution = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + solution + " mi/h");
        }
    }
}
