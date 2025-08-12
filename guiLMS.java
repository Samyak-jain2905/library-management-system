import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiLMS extends JFrame implements ActionListener {
    JButton addbook,showbook,removebook;
    guiLMS(){
        setSize(600,400);
        setLocation(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel li=new JLabel("Welcome To Samyak Library");
        li.setHorizontalAlignment(JLabel.CENTER);
        li.setBounds(100,10,400,30);
        li.setFont(new Font("TAHOMA",Font.PLAIN,30));
        add(li);
        setLayout(null);


        addbook=new JButton("Return book");
        addbook.setBounds(100,80,150,25);
        addbook.addActionListener(this);
        add(addbook);

        removebook=new JButton("Take a book");
        removebook.setBounds(380,80,150,25);
        removebook.addActionListener(this);
        add(removebook);

        showbook=new JButton("Showbook");
        showbook.setBounds(240,150,150,25);
        showbook.addActionListener(this);

        add(showbook);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==addbook){
        setVisible(false);
       new addbook();
       }
        if(ae.getSource()==removebook){
            setVisible(false);
            new removebooks();
        }
        if(ae.getSource()==showbook){
            setVisible(false);
            new showbooks();
        }
    }

    public static void main(String[] args) {
new guiLMS();
    }
}
// JLabel heading=new JLabel("New Customer");
//        heading.setBounds(150,20,200,30);
//        heading.setFont(new Font("Tahoma",Font.PLAIN,30));