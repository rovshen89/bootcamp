package SwingJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private TextPanel textPanel;
    private JButton button;
    private Toolbar toolbar;
//    private FormPanel formPanel;

    public MainFrame(){
        super("Hello World");
        setLayout(new BorderLayout());

        //initiate methods
        textPanel = new TextPanel();
        button = new JButton("Click Me!");
        toolbar = new Toolbar();
//        formPanel = new FormPanel();


        toolbar.setTextPanel(textPanel);

        //add action listener
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textPanel.appendText("Test message\n");
            }
        });


        //add methods:
        add(textPanel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        add(toolbar, BorderLayout.NORTH);
//        add(formPanel, BorderLayout.WEST);

        //set frame size, default value
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
