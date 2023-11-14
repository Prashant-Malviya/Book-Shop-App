import java.sql.SQLException;

import javax.swing.JOptionPane;

public class editRecords {
                    String bname,edition,price,bid;
                
                
                bname = txtbname.getText();
                edition = txtedition.getText();
                price = txtprice.getText();
                bid  = txtbid.getText();
                
                 try {
                        pst = con.prepareStatement("update book set name= ?,edition=?,price=? where id =?");
                        pst.setString(1, bname);
                        pst.setString(2, edition);
                        pst.setString(3, price);
                        pst.setString(4, bid);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Update!!!!!");
                        table_load();
                       
                        txtbname.setText("");
                        txtedition.setText("");
                        txtprice.setText("");
                        txtbname.requestFocus();
                    }

                    catch (SQLException e1) {
                        
                        e1.printStackTrace();
                    }
}
