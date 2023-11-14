public void actionPerformed(ActionEvent e) 
{            
    String bname,edition,price;
    bname = txtbname.getText();
    edition = txtedition.getText();
    price = txtprice.getText();
                
     try {
        pst = con.prepareStatement("insert into book(name,edition,price)values(?,?,?)");
        pst.setString(1, bname);
        pst.setString(2, edition);
        pst.setString(3, price);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Record Addedddd!!!!!");
        table_load();
                       
        txtbname.setText("");
        txtedition.setText("");
        txtprice.setText("");
        txtbname.requestFocus();
       }

    catch (SQLException e1) 
        {            
       e1.printStackTrace();
    }
}