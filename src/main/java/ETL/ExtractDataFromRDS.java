package ETL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;


public class ExtractDataFromRDS {

    public static List<String> loadData(){
        List <String> data = new ArrayList<>();
        String query = "SELECT * from data_sales";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {


            // Process the result set
            while (rs.next()) {
                // Fetch data from each column and store in a string (you can choose the format you want)
                String year = rs.getString("YEAR");
                String month = rs.getString("MONTH");
                String itemCode = rs.getString("ITEM CODE");
                String itemDescription = rs.getString("ITEM DESCRIPTION");
                String itemType = rs.getString("ITEM TYPE");
                String retailSales = rs.getString("RETAIL SALES");
                String retailTransfers = rs.getString("RETAIL TRANSFERS");
                String warehouseSales = rs.getString("WAREHOUSE SALES");

                // Store the concatenated data into the list (you can modify this as per your requirement)
                data.add(year + " | " + month + " | " + itemCode + " | " + itemDescription + " | " + itemType +
                        " | " + retailSales + " | " + retailTransfers + " | " + warehouseSales);
            }

        } catch (SQLException e) {
            System.out.println("Error while fetching data: " + e.getMessage());
        }
        return data;

    }


}