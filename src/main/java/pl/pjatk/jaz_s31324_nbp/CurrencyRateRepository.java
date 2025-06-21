package pl.pjatk.jaz_s31324_nbp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface CurrencyRateRepository extends ListCrudRepository<CurrencyLog, Integer> {






}
