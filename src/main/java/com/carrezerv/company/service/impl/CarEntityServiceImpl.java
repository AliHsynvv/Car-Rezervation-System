package com.carrezerv.company.service.impl;

import com.carrezerv.company.dto.CarEntityDto;
import com.carrezerv.company.service.CarEntityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarEntityServiceImpl implements CarEntityService {

    @Override
    public void create(CarEntityDto T) {

    }

    @Override
    public List<CarEntityDto> getAll() {
        return null;
    }

    @Override
    public void update(Integer id,CarEntityDto carEntityDto) {

    }

    @Override
    public void deleteById(Integer idd) {

    }

    @Override
    public CarEntityDto findById(Integer idd) {
        return null;
    }
}
