package SwingJava;

import javax.swing.*;

public class JavaClass {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
        });


    }
}
