public void table_load()
{
    try 
    {
    pst = con.prepareStatement("select * from book");
    rs = pst.executeQuery();
    table.setModel(DbUtils.resultSetToTableModel(rs));
} 
    catch (SQLException e) 
     {
        e.printStackTrace();
  } 
}