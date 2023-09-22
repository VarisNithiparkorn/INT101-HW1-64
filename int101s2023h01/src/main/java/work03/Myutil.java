
package work03;

public final class Myutil {
    
    public Myutil(){
}
 
    public static double calculateBMI(double weight, double height){
        double bmi = (weight / ((height / 100) * (height / 100)));
        return bmi;    
    }
    public static double average(int v1, int v2, int v3){
        double average = (v1 + v2 + v3) / 3;
        return average;
    }
    
}
