package ETL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://salesdata.c702mkqeyu9f.ap-south-1.rds.amazonaws.com:3306/salesdata";
    private static final String USERNAME="admin";
    private static final String PASSWORD = "Rohit2024";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

}


