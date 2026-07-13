package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;

    public class BrokenLinks {

        public static void main(String[] args) throws Exception {

            String link =
                    "https://the-internet.herokuapp.com/";

            URL url = new URL(link);

            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();

            connection.connect();

            int responseCode = connection.getResponseCode();

            if(responseCode >= 400) {

                System.out.println("Broken Link");

            } else {

                System.out.println("Valid Link");

            }

            connection.disconnect();
            Thread.sleep(3000);

        }
    }
