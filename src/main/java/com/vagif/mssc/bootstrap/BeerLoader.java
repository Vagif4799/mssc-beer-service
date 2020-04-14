package com.vagif.mssc.bootstrap;

import com.vagif.mssc.domain.Beer;
import com.vagif.mssc.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }

    private void loadBeerObjects() {

        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Efes")
                    .beerStyle("Baku")
                    .minOnHand(12)
                    .upc(123441235213L)
                    .price(new BigDecimal("12.05"))
                    .build());

                beerRepository.save(Beer.builder()
                        .beerName("Xirdalan")
                        .beerStyle("Xirdalan")
                        .minOnHand(12)
                        .upc(123441235213L)
                        .price(new BigDecimal("12.05"))
                        .build());

                    beerRepository.save(Beer.builder()
                            .beerName("Miller")
                            .beerStyle("Denmark")
                            .minOnHand(12)
                            .upc(123441235213L)
                            .price(new BigDecimal("12.05"))
                            .build());


            }

        }

    }
