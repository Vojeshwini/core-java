package com.java.xworkz.repository;

import com.java.xworkz.Dto.HackathonDto;

import java.util.Optional;

public interface HackathonRepo {
boolean persist(HackathonDto hackathonDto);
    default Optional<HackathonDto> findById(int id)
    {
        return  Optional.empty();
    }

}
