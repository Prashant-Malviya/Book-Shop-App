import java.sql.SQLException;

import javax.swing.JOptionPane;

public class deleteRecords {
               String bid;
           bid  = txtbid.getText();
           
            try {
                   pst = con.prepareStatement("delete from book where id =?");
           
                   pst.setString(1, bid);
                   pst.executeUpdate();
                   JOptionPane.showMessageDialog(null, "Record Delete!!!!!");
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
