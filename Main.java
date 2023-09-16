
import java.util.Random;
import java.util.*;
class Game
{
    public int number;
    public int guesses=0;
    public int inputno;
    public int getGuesses()
    {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }
   Game()
    {
        Random rand=new Random();
        this.number=rand.nextInt(100);
    }
    void takeuserInput()
    {
        System.out.println("Guess the number");
        Scanner sc=new Scanner(System.in);
        inputno=sc.nextInt();

    }
    boolean isCorrect() {
        guesses++;
        if (inputno == number) {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, guesses);
            return true;
        } else if (inputno < number) {
            System.out.println("Too less");
        } else if (inputno > number) {
            System.out.println("Too high");
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {

        Game g=new Game();
        boolean b=false;
        while(!b){
        g.takeuserInput();
        b=g.isCorrect();

        }
    }
}