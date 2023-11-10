import java.util.Random;

public class randomNumber {
    public static void main(String[] args){
        Random random = new Random();
        int randomNumber = random.nextInt(256);
        System.out.println(randomNumber);
    }
}
