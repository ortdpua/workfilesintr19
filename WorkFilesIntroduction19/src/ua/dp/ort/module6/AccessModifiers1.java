package ua.dp.ort.module6;

public class AccessModifiers1 {
    
    public static void myMethod() {
        System.out.println("HI PUBLIC");
        myMethodPrivate();
    }
    
    private static void myMethodPrivate() {
        System.out.println("HI PRIVATE");
    }
    
    static void myMethodPackagePrivate() {
        System.out.println("HI Package PRIVATE");
    }
    
}
