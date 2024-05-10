public class distanceconverter {

    public static void main(String[] args) {
        float kilometers, meters, centimeters, feet, inches;

        System.out.print("Enter the distance in kilometers: ");
        kilometers = Float.parseFloat(System.console().readLine());

        meters = kilometers * 1000;
        centimeters = meters * 100;
        inches = centimeters / 2.54f;
        feet = inches / 12f;

        System.out.println("Distance in meters: " + meters);
        System.out.println("Distance in centimeters: " + centimeters);
        System.out.println("Distance in feet: " + feet);
        System.out.println("Distance in inches: " + inches);
    }
}
