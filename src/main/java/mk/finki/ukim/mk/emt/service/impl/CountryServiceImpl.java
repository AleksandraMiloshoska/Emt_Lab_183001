package mk.finki.ukim.mk.emt.service.impl;

import mk.finki.ukim.mk.emt.model.Country;
import mk.finki.ukim.mk.emt.repository.CountryRepository;
import mk.finki.ukim.mk.emt.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> findAll() {
        return this.countryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        return this.countryRepository.findById(id);
    }

    @Override
    public Optional<Country> findByName(String name) {
        return this.countryRepository.findByName(name);
    }

    @Override
    public Optional<Country> save(String name, Double price, Integer quantity, Long category, Long manufacturer) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {
        this.countryRepository.deleteById(id);
    }
}
