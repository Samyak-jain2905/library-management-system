import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addbook extends JFrame implements ActionListener{
    JButton submit,cancel;
    JTextField ad;
    addbook(){
        setSize(600,400);
        setLocation(400,200);

        JLabel nm=new JLabel("Welcome Name of book");
        nm.setBounds(100,10,400,30);
        nm.setFont(new Font("TAHOMA",Font.PLAIN,30));
        nm.setHorizontalAlignment(nm.CENTER);
        add(nm);
        setLayout(null);

        ad=new JTextField();
        ad.setBounds(220,90,200,30);
        add(ad);

        cancel=new JButton("Cancel");
        cancel.setBounds(150,150,150,25);
        cancel.addActionListener(this);
        add(cancel);

        submit=new JButton("Submit");
        submit.setBounds(350,150,150,25);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
if(ae.getSource()==cancel){
    setVisible(false);
    new guiLMS();
}
        if(ae.getSource()==submit){
            String aa=ad.getText();

            try{
                jbdc_connect c=new jbdc_connect();
String query="insert into copy values('"+aa+"')";
c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Book return successfully");
            }
            catch(Exception e){
                e.printStackTrace();

            }        }
    }
public static void main(String[] args) {
        new addbook();
    }
}
