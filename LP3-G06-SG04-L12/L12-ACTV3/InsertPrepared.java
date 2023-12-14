package Actividad_3;

import java.sql.*;

class InsertPrepared{
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lab12G2", "root", "ItaloG14@");
            PreparedStatement stmt = con.prepareStatement("insert into clientes values(?,?,?,?,?,?,?,?)");
            stmt.setString(1, "4");
            stmt.setString(2, "José");
            stmt.setInt(3, 36);// 1 specifies the first parameter in the query
            stmt.setString(4, "C/ D");
            stmt.setString(5, "Madrid");
            stmt.setString(6, "España");
            stmt.setString(7, null);
            stmt.setString(8, null);
            int I = stmt.executeUpdate();
            System.out.println(I + " records inserted");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}