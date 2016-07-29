import com.google.gdata.client.GoogleService;
import com.google.gdata.client.Service;
import com.google.gdata.client.authn.oauth.GoogleOAuthParameters;
import com.google.gdata.client.authn.oauth.OAuthHmacSha1Signer;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by SHIKUN on 2016/7/26.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        String consumerKey = "OYAofja7M29YgvLt9xJMe5l2K";
        String consumerSecretKey = "RZSIdApGcpIrSKAo3lgpBBG32yZczrqzNkS53tHArPXlLEcuBF";
        String callbackURL = "www.baidu.com";
        Main main = new Main();
        main.getRequestToken(consumerKey, consumerSecretKey, callbackURL);
        String oauthtoken="";
        String tokenverify = "";
        String tokensecret = "";
        main.getAccessToken(consumerKey,consumerSecretKey,oauthtoken,tokensecret,tokenverify);
    }
    public void getRequestToken(String consumerKey,String consumerSecret,String callbackUrl) throws Exception{
        Service.GDataRequest request;
        GoogleOAuthParameters oAuthParameters=new GoogleOAuthParameters();
        oAuthParameters.setOAuthConsumerKey(consumerKey);
        oAuthParameters.setOAuthConsumerSecret(consumerSecret);
        OAuthHmacSha1Signer signer = new OAuthHmacSha1Signer();
        GoogleService service = new GoogleService("api_security_book_sample", "api_security_book_sample");
        service.setOAuthCredentials(oAuthParameters, signer);

        String baseString = "https://api.twitter.com/oauth/request_token";

        URL feedUrl = new URL(baseString);
        request = service.createFeedRequest(feedUrl);
        request.execute();
        System.out.println(convertStreamToString(request.getResponseStream()));
        //StringBuffer

    }

    private static String convertStreamToString(InputStream is) throws IOException {
        if (is != null) {
            StringBuilder sb = new StringBuilder();
            String line;
            BufferedReader reader;
            try {
                reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append("\n");
                }
            } finally {
                is.close();
            }
            return sb.toString();
        } else {
            return "";
        }
    }

    public void getAccessToken(String consumerKey, String consumerSecret, String
            oauthToken, String tokenSecret, String tokenVerifier) throws Exception {
        Service.GDataRequest request;
        GoogleOAuthParameters oauthParameters = new GoogleOAuthParameters();
        oauthParameters.setOAuthConsumerKey(consumerKey);
        oauthParameters.setOAuthConsumerSecret(consumerSecret);
        oauthParameters.setOAuthToken(oauthToken);
        oauthParameters.setOAuthTokenSecret(tokenSecret);
        oauthParameters.setOAuthVerifier(tokenVerifier);
        OAuthHmacSha1Signer signer = new OAuthHmacSha1Signer();
        GoogleService service = new GoogleService("api_security_book_sample",
                "api_security_book_sample");
        service.setOAuthCredentials(oauthParameters, signer);
        String baseString = "https://api.twitter.com/oauth/access_token";
        URL feedUrl = new URL(baseString);
        request = service.createFeedRequest(feedUrl);
        request.execute();
        System.out.println(convertStreamToString(request.getResponseStream()));
    }

}
