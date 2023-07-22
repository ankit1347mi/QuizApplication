import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {

    Score(String username,int score)
    {
        setBounds(400,150,750,850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.jpeg"));
        Image i2= i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);

        JLabel Heading=new JLabel("Thank you "+ username+" for Playing Simple Minds");
        Heading.setBounds(45,30,700,30);
        Heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(Heading);

        JLabel lscore=new JLabel("Your Score is "+score);
        lscore.setBounds(350,200,300,30);
        lscore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(lscore);

         JButton Submit =new JButton("Play Again");
        Submit.setBounds(380,270,120,30);
        Submit.setBackground(new Color(30,144,255));
        Submit.setForeground(Color.WHITE);
        Submit.addActionListener(this);
        add(Submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new Score("user",0);
    }
}
