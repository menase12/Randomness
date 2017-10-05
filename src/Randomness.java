import java.util.Random;

public class Randomness {
    public static void main(String[]args){
        System.out.println("Generate 10  randoms intigers between 0 and 6");
        Random x = new Random();
        for(int j=1; j<=10;++j){
            int randomInt=0+x.nextInt(6);
            System.out.println("Generated number: " +randomInt);
    }
}}
