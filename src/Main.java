import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter flat's square feet :");
        int squareFeet = in.nextInt();
        System.out.println("Enter flat's price per square feet :");
        int pricePerSquareFeet = in.nextInt();
        System.out.println("Enter flat's floor number :");
        int floorNumber = in.nextInt();
        System.out.println("Enter flat's number of rooms :");
        int numberOfRooms = in.nextInt();
        Flat myFlat = new Flat(squareFeet , pricePerSquareFeet , floorNumber , numberOfRooms );
        System.out.println("--------------------------------------");
        System.out.println("Price of flat is " + myFlat.getFlatPrice());
        System.out.println("--------------------------------------");
        System.out.println("Other details of your flat :");
        System.out.println("--------------------------------------");
        myFlat.printAllValues();
    }
}