package ETL;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Step 1: Extract Data from RDS MySQL
        List<String> dataSales = ExtractDataFromRDS.loadData();

        // Step 2: Convert the extracted data to CSV
        String filePath = "C:\\Users\\rohit\\Downloads\\data_sales.csv";  // Path where CSV file will be saved
        ConvertDataToCsv.convertDataToCsv(dataSales, filePath);

        // Step 3: Upload the CSV file to S3
        MoveToS3.uploadFile(filePath);
    }
}
