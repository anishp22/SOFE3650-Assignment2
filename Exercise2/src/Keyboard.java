import java.util.Scanner;

public class Keyboard {

    private Scanner registerKeyboard = new Scanner(System.in);
    public int setUPCCode(){
        return registerKeyboard.nextInt();                      //gets the entered int from user
    }
}
