import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;

public class showbooks extends JFrame implements ActionListener{
    JButton submit,cancel;
    JTextField ad;
    JTextArea booklist;
    showbooks(){
        setSize(600,400);
        setLocation(400,200);

        JLabel nm=new JLabel("Welcome books are");
        nm.setBounds(100,10,400,30);
        nm.setFont(new Font("TAHOMA",Font.PLAIN,30));
        nm.setHorizontalAlignment(nm.CENTER);
        add(nm);
        setLayout(null);



        cancel=new JButton("Cancel");
        cancel.setBounds(150,150,150,25);
        cancel.addActionListener(this);
        add(cancel);

        booklist=new JTextArea();
        booklist.setEditable(false);
        JScrollPane sc=new JScrollPane(booklist);
        sc.setBounds(50,50,500,200);
        add(sc);


        try{
            jbdc_connect c=new jbdc_connect();
            String query="select * from copy";
            ResultSet rs=c.s.executeQuery(query);
            StringBuilder books=new StringBuilder();
            while(rs.next()){
                books.append(rs.getString("book_name")).append("\n");
            }
booklist.setText(books.toString());
        }
        catch(Exception e){
            e.printStackTrace();

        }

        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==cancel){
            setVisible(false);
            new guiLMS();
        }


                 }


    public static void main(String[] args) {
        new showbooks();
    }
}
