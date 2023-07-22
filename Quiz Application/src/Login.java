
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfame;

    Login()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel Heading=new JLabel("Simple Minds");
        Heading.setBounds(750,60,300,45);
        Heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        Heading.setForeground(new Color(30,144,254));
        add(Heading);

        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);


        tfame=new JTextField();
        tfame.setBounds(735,200,300,25);
        tfame.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfame);

        rules=new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==rules)
        {
            setVisible(false);
            String name=tfame.getText();
            new Rules(name);

        }
        else if (ae.getSource()==back)
        {
            setVisible(false);
        }

    }
    public static void main(String[] args)
    {
        Login l= new Login();
    }
}
