package Chapter8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel MainPanel;
    private JLabel Price;
    private JLabel IVA;
    private JPanel PricePanel;
    private JPanel TotalPanel;
    private JPanel IVAPanel;
    private JLabel Total;
    private JButton Calcular;
    private JTextField textPrice;
    private JTextField textIVA;
    private JTextField textRestult;

    public MainForm() {
        Calcular.addActionListener(e -> {
            try {
                double price = Double.parseDouble(textIVA.getText());
                double tax = Double.parseDouble(textPrice.getText());
                double result = price * (tax/100);
                textRestult.setText(Double.toString(result));
            }catch(Exception NumberFormatException){
                System.out.println("Valores incorrectos");
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("MainPanel");
        frame.setContentPane(new MainForm().MainPanel);
        frame.setVisible(true);
    }
}
