package pl.pjatk.jaz_s31324_nbp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CurrencyApiService {

    private final String RATE_API_URL = "https://api.nbp.pl/api/exchangerates/rates/a";
    private final CurrencyRateRepository repository;
    private final RestTemplate restTemplate;

    public CurrencyApiService(CurrencyRateRepository repository, RestTemplate restTemplate) {
        this.repository = repository;
        this.restTemplate = restTemplate;
    }


    public ResponseEntity<String> getRate(String currencyCode, String from, String to) {
        String url = RATE_API_URL + currencyCode + "/" + from + "/" + to;
        return restTemplate.exchange(url, HttpMethod.GET, null, String.class);
    }

}


