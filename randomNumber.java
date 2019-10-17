import javax.swing.*;

public class randomNumber {
    public static void main (String [] args){
        //variabler
        int Number = 46;
        int guess1;
        int amount = 1;

        //kod

        String guess = JOptionPane.showInputDialog(null, "Please enter a number between 1 and 100");
        guess1 = Integer.parseInt(guess);

        while ( Number != guess1) {
            if (guess1 < 46)
                JOptionPane.showMessageDialog(null, "your guess is too low!");
            if (guess1 > 46)
                JOptionPane.showMessageDialog(null, "your guess is too high!");
            guess = JOptionPane.showInputDialog(null, "Please enter a number between 1 and 100");
            guess1 = Integer.parseInt(guess);
            amount = amount + 1;
        }
        JOptionPane.showMessageDialog(null, "your guess was correct, it took you " +  amount + " guesses!");
    }
}
