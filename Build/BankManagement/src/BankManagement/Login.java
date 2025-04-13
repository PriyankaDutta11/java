package BankManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField tf1;

    JPasswordField pf2;
    JButton b1,b2,b3;

    Login() {
          setTitle("AUTOMATED TELLER MACHINE");

          setLayout(null);
          ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
          Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
          ImageIcon i3=new ImageIcon(i2);
          JLabel label=new JLabel(i3);
          label.setBounds(70,10,100,100);
          add(label);
           l1 =new JLabel("Welcome to ATM");
           l1.setFont(new Font("Osward",Font.BOLD,38));
           l1.setBounds(200,40,400,40);
           add(l1);

          l2 =new JLabel("Card No.");
          l2.setFont(new Font("Osward",Font.BOLD,38));
          l2.setBounds(120,150,400,40);
          add(l2);

          tf1=new JTextField(15);
          tf1.setBounds(300,150,250,30);
          tf1.setFont(new Font("Arial", Font.BOLD, 14));
          add(tf1);

          l3=new JLabel("Pin:");
          l3.setFont(new Font("Osward",Font.BOLD,38));
          l3.setBounds(120,220,400,40);
          add(l3);


        pf2 = new JPasswordField(15);
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300,220,230,30);
        add(pf2);

          JTextField pinTextField=new JTextField();
          pinTextField.setBounds(300,220,250,30);
          add(pinTextField);


        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("CLEAR");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);

        setLayout(null);

        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(300,300,100,30);
        add(b1);

        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430,300,100,30);
        add(b2);

        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(300,350,230,30);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);








        getContentPane().setBackground(Color.WHITE);
           setSize(800, 480);
           setVisible(true);
           setLocation(350,200);

       }

         public static void main (String args[]){
             new Login();
         }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}

