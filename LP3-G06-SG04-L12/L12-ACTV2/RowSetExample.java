package Actividad_2;

import javax.sql.rowset.*;

public class RowSetExample {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        // Creating and Executing RowSet
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3306/Lab12G2");
        rowSet.setUsername("root");
        rowSet.setPassword("ItaloG14@");
        rowSet.setCommand("select * from clientes");
        rowSet.execute();
        System.out.println("\n");
        while (rowSet.next()) {
            // Generating cursor Moved event
            System.out.println("\nID: " + rowSet.getString(1)); 
            System.out.println("Nombre: " + rowSet.getString(2));
            System.out.println("Edad: " + rowSet.getInt(3));
            System.out.println("Dirección: " + rowSet.getString(4));
            System.out.println("Ciudad: " + rowSet.getString(5));
            System.out.println("País: " + rowSet.getString(6));
            System.out.println("Email: " + rowSet.getString(7));
            System.out.println("Teléfono: " + rowSet.getString(8) + "\n\n");

        }
    }
}