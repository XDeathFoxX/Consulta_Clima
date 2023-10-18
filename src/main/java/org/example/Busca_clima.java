package org.example;


import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class Busca_clima {
        public Consulta getClima(String lat) throws IOException {
            Consulta resultado = null;
            String lon = "-53.1940876";
            HttpGet request = new HttpGet("https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid=f24be9766068168b900f6f492f525a53&units=metric");

            try (CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
                 CloseableHttpResponse response = httpClient.execute(request)) {
                HttpEntity entity = response.getEntity();

                if (entity != null) {
                    String result = EntityUtils.toString(entity);

                    Gson gson = new Gson();

                    resultado = gson.fromJson(result, Consulta.class);
               }
            }
            return resultado;
        }
    }

