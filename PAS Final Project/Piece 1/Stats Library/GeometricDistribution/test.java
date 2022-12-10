import java.util.Scanner;

public class test {

    
    public static void main(String[] args) {
        Main test = new Main();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many trials would you like to run?");
        double trials = scanner.nextDouble();
        

        System.out.println("What is the value of p?");
        double p = scanner.nextDouble();
        
        System.out.println("Success occuring on specific trial " + test.geometricDistribution( p,  trials));
        System.out.println("Success occuring on or before specific trial: " + test.oobGeometricDistribution( p,  trials));
        System.out.println("Success occuring before specific trial: " + test.bGeometricDistribution( p,  trials));
        System.out.println("Success occuring on or after specific trial: " + test.ooaGeometricDistribution( p,  trials));
        System.out.println("Success occuring after specific trial: " + test.aGeometricDistribution( p,  trials));
    }
}

