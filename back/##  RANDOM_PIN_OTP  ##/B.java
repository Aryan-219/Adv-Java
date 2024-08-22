import java.util.Random;

class B {
    public static void main(String[] args) {
        Random r = new Random();
        
        for(int i = 0; i < 5; i++) {
            System.out.println(Math.abs(r.nextLong()));
        }
    }    
}