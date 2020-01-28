import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Utility {

    public static final String ES_IP_ADDR = "178.242.49.250";
    public static final Integer ES_PORT = 19200;
    public static final String ES_PROTOCOL = "http";

    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";


    private static RestHighLevelClient esClient=null;

    public static RestHighLevelClient getElasticSearchClient() {
        if (esClient == null) {

            esClient = new RestHighLevelClient(RestClient.builder(new HttpHost(ES_IP_ADDR, ES_PORT, ES_PROTOCOL)));

        }
        return esClient;
    }

    public static String getFormattedDate(String dateString)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = null;
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Error occured while parsing datetime. Please check format or date string");
        }
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }


}
