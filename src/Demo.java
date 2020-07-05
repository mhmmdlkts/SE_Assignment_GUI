import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {
        ArrayList<UIPlatforms> strategies = new ArrayList<>();
        strategies.add(new ASCII_Strategy());
        strategies.add(new SwingStrategy());

        int input = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Typ '0' for ASCII UI, '1' for Java Swing: ");
        input = scanner.nextInt();

        strategies.get(input).addInputField("Type your name:");
        strategies.get(input).addSurveyQuestion("Do you like programming?",true);
        strategies.get(input).addSurveyQuestion("Do you like debugging?",false);
        strategies.get(input).addProgressLabel(70);
        strategies.get(input).drawUI();
    }
}




