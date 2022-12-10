public class Test {

    public static void main(String[] args) {
         MMM test = new MMM();
        
        double[] list = {26, 42, 18, 18, 69, 96, 88};
        
        System.out.println("Mean: " + test.computeMean(list));
        System.out.println("Median: " + test.computeMedian(list, list.length));
        System.out.println("Mode: " + test.computeMode(list, list.length));
    }

}