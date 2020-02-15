package ua.dp.ort.module6;

public class Test {

    static void methodA(int a) {

    }
    
    static void methodA(double a) {
        return;
    }
    
    public static void main(String[] args) {
        
        if(args.length == 0) {
            return;
        }
        
        
        
        methodA(6);
    }

}
