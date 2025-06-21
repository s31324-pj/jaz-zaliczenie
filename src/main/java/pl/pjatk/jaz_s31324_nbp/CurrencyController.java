package pl.pjatk.jaz_s31324_nbp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/")
public class CurrencyController {

    private CurrencyApiService apiService;
    private final RestTemplate restTemplate;

    public CurrencyController(CurrencyApiService apiService, RestTemplate restTemplate) {
        this.apiService = apiService;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{code}/{startDate}/{endDate}/")
    public ResponseEntity<String> getRate(@PathVariable String code, @PathVariable String startDate, @PathVariable String endDate) {
        return apiService.getRate(code, startDate, endDate);
    }


}
