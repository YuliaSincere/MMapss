import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateForm {
    private JComboBox Point1;
    private JComboBox Point2;
    private JRadioButton euclideanRadioButton;
    private JRadioButton manhattanRadioButton;
    private JButton resetButton;
    private JButton addButton;
    public JPanel Calculate;
    public MainForm main;



    public CalculateForm() {
        String[] items;
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //some calculate logic
                JOptionPane.showMessageDialog(null,"Ok");
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
