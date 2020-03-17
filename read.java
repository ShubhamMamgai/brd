package brd;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class read {
    private int customerid;
    private String customercode;
    private String customername;
    private String customeraddress1;
    private String customeraddress2;
    private int pincode;
    private String emailaddress;
    private int contactnumber;
    private String contactperson;
    private String recordstatus;
    private String activeinactiveflag;
    private String createdate;
    private String createdby;
    private String modifieddate;
    private String modifiedby;
    private String authorizedate;
    private String authorizeby;



    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        FileReader fw = new FileReader("C:\\brd\\test.txt");
        BufferedReader br = new BufferedReader(fw);



        String st;

        while ((st = br.readLine()) != null) {
            String[] arrOfstr = st.split("~");
            String[] arrOfstr1 = st.split("~~~~");


            for (String a : arrOfstr)
                System.out.println(a);

          /*  for (String a1 : arrOfstr1)
                System.out.print(a1);*/



            }
        }
    }

