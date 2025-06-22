package projava.child;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ChildFrame extends JFrame {
    public ChildFrame(){
         super("お絵描き");
         var label = new JLabel("test");
         add(label);
         var image = new BufferedImage(600,400,BufferedImage.TYPE_INT_RGB);
         label.setIcon(new ImageIcon(image));

         var g = image.createGraphics();

        // 背景を白で塗る
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, image.getWidth(), image.getHeight());

        // 黒線（左上 → 右下）
        g.setColor(Color.BLACK);
        g.drawLine(0, 0, image.getWidth() - 1, image.getHeight() - 1);

        // 赤い四角
        g.setColor(Color.RED);
        g.fillRect(300, 200, 150,150);

        g.setColor(Color.BLUE);
        g.fillRoundRect(400,150,150,100,100,100);

        // 青線（左下 → 右上）
        g.setColor(Color.BLUE);
        g.drawLine(image.getWidth() - 1, image.getHeight() - 1, 0, 0);

         pack();
         setVisible(true);
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }
}
