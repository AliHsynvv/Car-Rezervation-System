package com.carrezerv.company.service.impl;

import com.carrezerv.company.dto.UserCarsEntityDto;
import com.carrezerv.company.service.UserCarsEntityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCarsEntityServiceImpl implements UserCarsEntityService {
    @Override
    public void create(UserCarsEntityDto T) {

    }

    @Override
    public List<UserCarsEntityDto > getAll() {
        return null;
    }

    @Override
    public void update(Integer id,UserCarsEntityDto userCarsEntityDto) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public UserCarsEntityDto findById(Integer idd) {
        return null;
    }
}
