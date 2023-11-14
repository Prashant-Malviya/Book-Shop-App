import java.sql.ResultSet;
import java.sql.SQLException;

public class searchRecords {
    public void keyReleased(KeyEvent e) {
                
                 try {
                      
                        String id = txtbid.getText();

                            pst = con.prepareStatement("select name,edition,price from book where id = ?");
                            pst.setString(1, id);
                            ResultSet rs = pst.executeQuery();

                        if(rs.next()==true)
                        {
                          
                            String name = rs.getString(1);
                            String edition = rs.getString(2);
                            String price = rs.getString(3);
                            
                            txtbname.setText(name);
                            txtedition.setText(edition);
                            txtprice.setText(price);
    
                        }   
                        else
                        {
                            txtbname.setText("");
                            txtedition.setText("");
                            txtprice.setText("");
                             
                        }
                    } 
                
                 catch (SQLException ex) {
                       
                    }
            }
    
}
