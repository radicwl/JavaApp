import java.util.*;

public class App {

    public static void main(String[] args) {
        System.out.println("The point of this game is to guess the number that I'm thinking of.");
        System.out.println("You have 5 guesses to get my number, which is in between 0 and 9.");
        Random a = new Random();
        Scanner b = new Scanner(System.in);
        Set<Integer> d = new HashSet<>();
        int x = a.nextInt(9);
        for(int i=4; i>=0; i--) {
            int c = b.nextInt();
            if(c==x) {
                System.out.println("Congratulations, you got it!");
                break;
            }
            else if(c>9 || c<0) {
            System.out.println("Invalid number. Please guess between 0 and 9.");  
            i++;
            }
            else {
                if(i>1) {
                    if(d.contains(c)) {
                        System.out.println("You have already guessed that number. Try again.");
                        i++;
                    }
                    else {
                    System.out.println("That was incorrect.");
                    System.out.println("You have "+i+ " guesses remaining.");
                    d.add(c);
                    }
                }
                else if(i==1) {
                    if(d.contains(c)) {
                        System.out.println("You have already guessed that number. Try again.");
                        i++;
                    }
                    else {
                    System.out.println("That was incorrect.");
                    System.out.println("You have "+i+ " guess remaining.");
                    d.add(c);
                    }
                }
                else {
                System.out.println("You did not get the number, better luck next time!");
                break;
                }
            }
        
        }
        b.close();
    }   

}
