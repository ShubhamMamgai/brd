package nucleus;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class database
{static int i=1;

    public void connecting_Database(customer c) throws SQLException, ParseException {
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MMM/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date;
        LocalDate ld;
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1521:Orcl", "sh", "sh");

        PreparedStatement ps = con.prepareStatement("insert into customer9956 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setInt(1,i);
        ps.setString(2,c.getCustomercode());
        ps.setString(3,c.getCustomerName());
        ps.setString(4,c.getAddress1());
        ps.setString(5,c.getAddress2());
        ps.setInt(6, Integer.parseInt(c.getPincode()));
        ps.setString(7,c.getE_mail());
        try {
            ps.setDouble(8, Double.parseDouble((c.getContactNo())));
        }
        catch(Exception e)
        {
            ps.setInt(8,0);
        }
        ps.setString(9,c.getPrimarycontactperson());
        ps.setString(10,c.getRecordStatus());
        ps.setString(11,c.getActive_inactive());
         date = format1.parse(c.getCreateddate());
         ld=LocalDate.parse(format2.format(date));
        ps.setDate(12, Date.valueOf(ld));
        ps.setString(13,c.getCreatedby());
        try{  date = format1.parse(c.getModifiedDate());
             ld=LocalDate.parse(format2.format(date));
            ps.setDate(14, Date.valueOf(ld));}
        catch (Exception e)
        {
            ps.setDate(14, null);
        }
        try
        { ps.setString(15,c.getModifiedby());}
        catch (Exception e)
        {
            ps.setString(15,null);
        }
        try
        { date = format1.parse(c.getAutherizeddate());
            ld=LocalDate.parse(format2.format(date));
            ps.setDate(16, Date.valueOf(ld));
        }
        catch (Exception e)
        {
            ps.setDate(16, null);
        }
       try
       {
           ps.setString(17,c.getAuthorizedby());
       }
       catch (Exception e)
       {
           ps.setString(17,null);
       }

        ps.execute();
       con.commit();
        i++;
    }
}
