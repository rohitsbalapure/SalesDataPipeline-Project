package ETL;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ConvertDataToCsv {


    public static void convertDataToCsv(List<String> data, String filePath){

        try(FileWriter writer = new FileWriter(filePath)){

            writer.append("YEAR,MONTH,ITEM CODE,ITEM DESCRIPTION,ITEM TYPE,RETAIL SALES,RETAIL TRANSFERS,WAREHOUSE SALES\n");
            for (String record : data) {
                writer.append(record.replace(" | ", ",")).append("\n");
            }
            System.out.println("CSV file created successfully : " + filePath);

        } catch (IOException e) {
            System.out.println("Error writing CSV file: " + e.getMessage());
        }

    }

}
