import java.sql.ResultSet;

class liberay{
        String[] books=new String[100];;
        int noofbooks=0;

        void addbook(String book){
            this.books[noofbooks]=book;
            noofbooks++;
            try{
   jbdc_connect c=new jbdc_connect();
   String query="insert into copy(book_name) values('"+book+"')";
   c.s.executeUpdate(query);
            }
            catch(Exception e){
                e.printStackTrace();
            }

            System.out.println(book+" this book is added");


        }
        void showbooks(){


                    try{
                        jbdc_connect c=new jbdc_connect();
                        String query2="select * from copy";
                        ResultSet rs=c.s.executeQuery(query2);
                        while(rs.next()){
                            System.out.println(rs.getString("book_name"));
                        }

                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }


void removebook(String book){
            try{
    jbdc_connect c=new jbdc_connect();
    String query="delete from copy where book_name='"+book+"'";
c.s.executeUpdate(query);}
catch(Exception e){
        e.printStackTrace();
    }
}
}


    public class code_for_LMS {
        public static void main(String[] args) {
            liberay ofsamyak=new liberay();
            ofsamyak.addbook("maths");


//            ofsamyak.removebook("bhagvatgita");
//            ofsamyak.removebook("bhagvatgita");
//            ofsamyak.removebook("maths");
//            ofsamyak.removebook("maths");
//            ofsamyak.addbook("maths");
//            ofsamyak.addbook("maths");
//            ofsamyak.showbooks();
//            ofsamyak.removebook("maths");
            ofsamyak.showbooks();

        }
    }


