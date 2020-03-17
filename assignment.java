package org.example;

import java.io.*;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assignment {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            //Getting A Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "grapes21");


            File fl = new File("C:\\brd\\test.txt");
            FileReader fr = new FileReader(fl);
            BufferedReader br = new BufferedReader(fr);

            String[] words;
            String s;
            int count = 0;
            while ((s = br.readLine()) != null) {
                words = s.split("~");

                String customer_id = words[0];
                String customer_code = words[1];
                String customer_name = words[2];
                String customer_address1 = words[3];
                String customer_address2 = words[4];
                String customer_pincode = words[5];
                String customer_email_Address = words[6];
                String customer_contact_number = words[7];
                String customer_primary_contact_person = words[8];
                String customer_record_Status = words[9];
                String activeinactiveflag = words[10];
                String created_date = words[11];
                String created_by = "";
                String Modified_date = "";
                String Modified_by = "";
                String Auhtorized_date = "";
                String Authorized_by = "";

                PreparedStatement st = myConn.prepareStatement("insert into customer(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");


                st.setString(1,customer_id);

                st.setString(2, customer_code);
                st.setString(3,customer_name);
                st.setString(4, customer_address1);
                st.setString(5, customer_address2);

                st.setString(6,customer_pincode);
                st.setString(7, customer_email_Address);
                st.setString(8, customer_contact_number);
                st.setString(9, customer_primary_contact_person);
                st.setString(10, customer_record_Status);
                st.setString(11, activeinactiveflag);

               st.setString(12,created_date);

                st.setString(13, created_by);
               st.setString(14,Modified_date);
                st.setString(15, Modified_by);
                st.setString(16,Modified_date);
                st.setString(17, Authorized_by);
                count = st.executeUpdate();

                PreparedStatement stmt = myConn.prepareStatement("select * from customer");

                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    System.out.println("hello");
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

