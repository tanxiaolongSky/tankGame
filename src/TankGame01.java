import javax.swing.*;

public class TankGame01 extends JFrame {
    MyPanel myPanel = null;

    public TankGame01()  {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1000,750);
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {

        TankGame01 tankGame01 = new TankGame01();
    }
}
