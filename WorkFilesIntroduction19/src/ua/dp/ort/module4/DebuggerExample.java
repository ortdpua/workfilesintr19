package ua.dp.ort.module4;

public class DebuggerExample {

    public static void main(String[] args) {

        int n = 0;
        String jj = "leflaldjfase";
        
        for(int counter = 0; counter < 10; counter++) {
            
            if (counter % 2 == 0) {
                n++;
            }
            
            System.out.println(n);
        }
        
        System.out.println(jj.hashCode());
    }
}
