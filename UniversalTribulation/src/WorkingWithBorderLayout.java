import javax.swing.*;
import java.awt.*;

public class WorkingWithBorderLayout {
   public WorkingWithBorderLayout() {

    this.CreateBorderFrame();





   }
   public JButton CreateJButtonOne() {
       JButton ButtonOne = new JButton("Button One");
       return ButtonOne;
   }

    public JButton CreateJButtonTwo() {
        JButton ButtonTwo = new JButton("Button One");
        return ButtonTwo;
    }

    public JButton CreateJButtonThree() {
        JButton ButtonThree = new JButton("Button One");
        return ButtonThree;
    }
    public JButton CreateJButtonFour(){
       JButton ButtonFour = new JButton("Button Four");
       return ButtonFour;
    }

    public JFrame CreateBorderFrame(){
        JFrame BorderFrame = new JFrame("BorderLayout frame");
        BorderFrame.setSize(1000, 500);
        BorderFrame.setLayout(new BorderLayout());
        BorderFrame.add(this.CreateJButtonOne(),BorderLayout.NORTH);
        BorderFrame.add(this.CreateJButtonTwo(),BorderLayout.SOUTH);
        BorderFrame.add(this.CreateJButtonThree(),BorderLayout.EAST);
        BorderFrame.add(this.CreateJButtonFour(),BorderLayout.WEST);
        BorderFrame.setVisible(true);
        return BorderFrame;
    }
}
