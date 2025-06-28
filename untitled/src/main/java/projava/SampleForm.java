package projava;

import projava.child.ChildFrame;

import javax.swing.*;
import java.awt.*;
//これはテストコミット
public class SampleForm {
    public static void main(String[] args) {
        var frame = new JFrame("test");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var text1 = new JTextField();
        frame.add("North",text1);

        var text2 = new JTextField();
        frame.add("South",text2);


        var centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());
        frame.add(centerPanel,"Center");

        var childButton = new JButton("子画面を開く");
        centerPanel.add(childButton);

        var button = new JButton("大文字");

        centerPanel.add(button);

        button.addActionListener(ae->
                text2.setText(text1.getText().toUpperCase()));

        childButton.addActionListener(ae->{
            var child = new ChildFrame();
            child.setVisible(true);
        });

        frame.setVisible(true);

    }

}
