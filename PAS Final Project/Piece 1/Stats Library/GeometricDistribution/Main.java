
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public double p;
    //Chance of success on specific try
    public double geometricDistribution(double p, double y) {
        
        double trials = y;
        double q = p - 1; 
        double function = 0;
        function = (double)(Math.pow(q, (trials - 1))*(p));
        
        
        return function;
        
        
        
    }
    //Chance of success on or before specific try
    public double oobGeometricDistribution(double p, double y){
        double trials = y;
        double q = p - 1; 
        double function = 0;
        function = (double)(1-Math.pow(1-p,trials));
        
        
        return function;
        
    
    }
    //Chance of success before specific try
    public double bGeometricDistribution(double p, double y){
        double trials = y;
        double q = p - 1; 
        double function = 0;
        function = (double)(1-Math.pow(1-p,trials-1));
        
        
        return function;
        
    
    }
    //Chance of success on or after specific try
    public double ooaGeometricDistribution(double p, double y){
        double trials = y;
        double q = p - 1; 
        double function = 0;
        function = (double)(Math.pow(1-p,trials-1));
        
        
        return function;
        
    
    }
    //Chance of success after specific try
    public double aGeometricDistribution(double p, double y){
        double trials = y;
        double q = p - 1; 
        double function = 0;
        function = (double)(Math.pow(1-p,trials));
        
        
        return function;
        
    
    }
}