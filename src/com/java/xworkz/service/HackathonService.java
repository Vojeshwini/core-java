package com.java.xworkz.service;

import com.java.xworkz.Dto.HackathonDto;
import com.java.xworkz.Servlet.HackathonServlet;

import java.util.Optional;

public interface HackathonService {
  boolean save(HackathonDto hackathonDto);
  default Optional<HackathonDto> findById(int id)
  {
    return  Optional.empty();
  }
}
