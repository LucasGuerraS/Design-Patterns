import javax.swing.*;

public class Main {
    static JFrame frame;
    public static void main(String[] args) {
        frame = new JFrame();

        JButton button = new JButton("Should I Do It?");
        button.addActionListener(event ->
                System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event ->
                System.out.println("Come on, do it!"));
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}