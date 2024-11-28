package ETL;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.PutObjectRequest;
import java.io.File;

public class MoveToS3 {

    private static final String BUCKET_NAME = "rohit-s3-bucket25-11-2024";
    private static final String REGION = "us-east-1"; // Specify your bucket's region here

    public static void uploadFile(String filePath) {
        // Set the region explicitly
        AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                .withRegion(REGION) // Set the region here
                .build();

        try {
            File file = new File(filePath);
            PutObjectRequest request = new PutObjectRequest(BUCKET_NAME, "data_sales.csv", file);
            s3Client.putObject(request);
            System.out.println("File uploaded successfully to S3.");

        } catch (AmazonServiceException e) {
            System.out.println("Amazon Service Exception: " + e.getMessage());
        } catch (SdkClientException e) {
            System.out.println("SDK Client Exception: " + e.getMessage());
        }
    }
}
