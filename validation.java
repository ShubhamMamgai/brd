package nucleus;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.regex.Pattern;

public class validation
{ customer cr=new customer();
    database db=new database();
    public void eligibilty(String[] h) throws SQLException, ParseException {
        if (Pattern.matches("[a-zA-Z0-9]{1,10}", h[0]))
        {
            cr.setCustomercode(h[0]);
        }
        if (Pattern.matches("[a-zA-Z0-9- ]{1,30}", h[1]))
        {
            cr.setCustomerName(h[1]);
        }
        if (Pattern.matches("[#.0-9a-zA-Z\\s,-]{1,100}", h[2]))
        {
            cr.setAddress1(h[2]);
        }
        try {
            if (Pattern.matches("[#.0-9a-zA-Z\\s,-]{1,100}", h[3]))
            {
                cr.setAddress2(h[3]);
            }
        }
        catch (Exception e)
        {
            cr.setAddress2(null);
        }
        if (Pattern.matches("[1-9\\d]{1}[0-9\\d]{5}", h[4])) {
            cr.setPincode(h[4]);
        }
        if (Pattern.matches("[a-zA-Z0-9]{1,20}[@]{1}[a-z]{1,20}[.]{1}[a-z]{1,10}",h[5])) {
            cr.setE_mail(h[5]);
        }
        try
        {
            if (Pattern.matches("[1-9\\d]{1}[0-9\\d]{1,10}",h[6])) {
                cr.setContactNo(h[6]);
            }
        }
        catch (Exception e)
        {
            cr.setContactNo(null);
        }
        if (Pattern.matches("[a-zA-Z0-9]{1,100}", h[7]))
        {
            cr.setPrimarycontactperson(h[7]);
        }
        if (Pattern.matches("[N,M,D,A,R]{1}", h[8]))
        {
            cr.setRecordStatus(h[8]);
        }
        if (Pattern.matches("[A,I]{1}", h[9]))
        {
            cr.setActive_inactive(h[9]);
        }
       cr.setCreateddate(h[10]);
        if (Pattern.matches("[a-zA-Z0-9]{1,30}", h[11]))
        {
            cr.setCreatedby(h[11]);
        }
        try {
            cr.setModifiedDate(h[12]);
        }
        catch (Exception e)
        {
            cr.setModifiedDate(null);
        }
        try {
            if (Pattern.matches("[a-zA-Z0-9]{1,30}", h[13]))
            {
                cr.setModifiedby(h[13]);
            }
        }
        catch (Exception e)
        {
            cr.setModifiedDate(null);
        }
        try {
            cr.setAutherizeddate(h[14]);
        }
        catch (Exception e)
        {
            cr.setAutherizeddate(null);
        }
        try {
            if (Pattern.matches("[a-zA-Z0-9]{1,30}", h[15]))
            {
                cr.setAuthorizedby(h[15]);
            }
        }
        catch (Exception e)
        {
            cr.setAuthorizedby(null);
        }
        System.out.println(cr);
        db.connecting_Database(cr);
    }

}
