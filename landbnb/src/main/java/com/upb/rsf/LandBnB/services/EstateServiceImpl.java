package com.upb.rsf.LandBnB.services;

import com.upb.rsf.LandBnB.domain.Estate;
import com.upb.rsf.LandBnB.repositories.EstateRepository;

import java.util.List;

public class EstateServiceImpl implements EstateService{
    private final EstateRepository estateRepository;

    /*
    List<Estate> estateList = new ArrayList<>(List.of(
            new Estate("Penthouse",10000,"0777777777","Some nice penthouse"),
            new Estate("House", 7500, "0777777777","Some nice house"),
            new Estate("Villa", 1000000,"0777777777","Some nice villa"),
            new Estate("Beach house", 90000,"0777777777","Some nice beach house"),
            new Estate("Apartment", 2000,"0777777777","Some nice apartment"),
            new Estate("Small house", 1000,"0777777777","Some nice small house"),
            new Estate("Penthouse", 10000,"0777777777","Some nice penthouse"),
            new Estate("Big apartment", 8500,"0777777777","Some nice big apartment")

    ));
     */

    public EstateServiceImpl(EstateRepository estateRepository) {
        this.estateRepository = estateRepository;
        /*
        for (int i = 0; i < estateList.size(); i++) {
            estateList.get(i).addImg("../img/listings/a" + (i + 1) + ".jpg");
        }

         */
    }

    @Override
    public List<Estate> findAll() {
        return (List)estateRepository.findAll();
        //return estateList;
    }

    @Override
    public Estate save(Estate e) {
        return estateRepository.save(e);
        //return estateList.add(e);
    }
}
