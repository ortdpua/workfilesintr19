package ua.dp.ort.module6;

public class FirstMethod {

    public static void sayHello(String name, int age) {
        System.out.println("HELLO " + name + " Age " + age);
    }
    
    public static double calculateSum(double firstNumber, double secondNumber) {
        double sum = firstNumber + secondNumber;     
        return sum;
    }
    
    public static double calculateMultiply(double a, double b) {
        return a * b;
    }
    
    public static void main(String[] args) {    
        
        double result = calculateMultiply(2, 5);
        System.out.println(result);
//        sayHello("Kat", 5);   
//        sayHello("Sam", 10);   
//        sayHello("Tom", 55);           
//         sayHello("d", 5);
        
//        double result = calculateSum(1, 2);
//        System.out.println(result);
        
        
    }
}