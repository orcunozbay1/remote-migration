import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;

public class Utility {

    public static final String ES_IP_ADDR = "178.242.49.250";
    public static final Integer ES_PORT = 19200;
    public static final String ES_PROTOCOL = "http";

    private static RestHighLevelClient esClient=null;

    public static RestHighLevelClient getElasticSearchClient() {
        if (esClient == null) {

            esClient = new RestHighLevelClient(RestClient.builder(new HttpHost(ES_IP_ADDR, ES_PORT, ES_PROTOCOL)));

        }
        return esClient;
    }


}
