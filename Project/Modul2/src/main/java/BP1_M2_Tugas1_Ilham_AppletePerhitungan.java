import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class BP1_M2_Tugas1_Ilham_AppletePerhitungan extends Applet implements ActionListener {
    TextField textField = new TextField(20);
    Button button1 = new Button("1"), 
            button2= new Button("2"), 
            button3 = new Button("3"), 
            button4 = new Button("4"), 
            button5 = new Button("5"), 
            button6 = new Button("6"), 
            button7 = new Button("7"), 
            button8 = new Button("8"), 
            button9 = new Button("9"), 
            button0 = new Button("0"),
            buttonTambah = new Button("+"), 
            buttonKurang = new Button("-"),
            buttonKali = new Button("*"), 
            buttonBagi = new Button("/"), 
            buttonSamaDengan = new Button("=");
    Label labelJudul = new Label("Ilham Calculator");
    String hasil = "", operasi;
    int a, b;

    public void init() {
        setLayout(null);
        add(labelJudul);
        add(textField);
        add(button7);
        add(button8);
        add(button9);
        add(buttonBagi);

        add(button4);
        add(button5);
        add(button6);
        add(buttonKali);

        add(button1);
        add(button2);
        add(button3);
        add(buttonKurang);

        add(button0);
        add(buttonSamaDengan);
        add(buttonTambah);
        
        labelJudul.setFont(new Font("Arial", Font.PLAIN, 24));

        labelJudul.setBounds(45, 0, 200, 40);
        textField.setBounds(30, 40, 200, 30);
        button7.setBounds(30, 80, 44, 44);
        button8.setBounds(82, 80, 44, 44);
        button9.setBounds(134, 80, 44, 44);
        button4.setBounds(30, 132, 44, 44);
        button5.setBounds(82, 132, 44, 44);
        button6.setBounds(134, 132, 44, 44);
        button1.setBounds(30, 184, 44, 44);
        button2.setBounds(82, 184, 44, 44);
        button3.setBounds(134, 184, 44, 44);
        button0.setBounds(30, 236, 95, 44);
        buttonSamaDengan.setBounds(134, 236, 44, 44);
        buttonTambah.setBounds(186, 236, 44, 44);
        buttonKurang.setBounds(186, 184, 44, 44);
        buttonKali.setBounds(186, 132, 44, 44);
        buttonBagi.setBounds(186, 80, 44, 44);

        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonBagi.addActionListener(this);
        buttonKali.addActionListener(this);
        buttonTambah.addActionListener(this);
        buttonKurang.addActionListener(this);
        buttonSamaDengan.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
            String str1 = textField.getText();
            operasi = str;
            a = Integer.parseInt(str1);
            hasil = "";
        } else if (str.equals("=")) {
            String str2 = textField.getText();
            b = Integer.parseInt(str2);
            int sum = 0;
            if (operasi == "+")
                sum = a + b;
            else if (operasi == "-")
                sum = a - b;
            else if (operasi == "*")
                sum = a * b;
            else if (operasi == "/")
                sum = a / b;
            String str1 = String.valueOf(sum);
            textField.setText("" + str1);
            hasil = "";
        } else {
            hasil += str;
            textField.setText("" + hasil);
        }
    }

    public void paint(Graphics g)
    {
    }
}
