package com.java.xworkz.service;

import com.java.xworkz.Dto.HackathonDto;
import com.java.xworkz.repository.HackathonRepo;
import com.java.xworkz.repository.HackathonRepoImpl;

import java.util.Optional;

public class HackathonServiceImpl implements  HackathonService{
    @Override
    public boolean save(HackathonDto hackathonDto) {
        boolean valid=true;
      if(hackathonDto !=null){

          String collegeName=hackathonDto.getCollegeName();
          String teamName=hackathonDto.getTeamName();
          int ntotalMembers=hackathonDto.getNtotalMembers();
          String teamLeader=hackathonDto.getTeamLeader();
          long ncontact=hackathonDto.getNcontact();
          String email=hackathonDto.getEmail();

//          OR we can give directly
//          if(hackathonDto.getCollegeName()!=null){
//
//          }

          if(collegeName==null){
              valid=false;
          }

          if(teamName==null){
              valid=false;
          }

          if(ntotalMembers==0||ntotalMembers > 5){
              valid=false;
          }
          if(teamLeader==null){
              valid=false;
          }
          if(ncontact==0||ncontact >10){
              valid=false;
          }
          if(email!=null||email.contains("@")){
             valid=true;
          }
          System.out.println("data is valid, will save into DB using repo...");

          HackathonRepo hackathonRepo= new HackathonRepoImpl();
          boolean repo = hackathonRepo.persist(hackathonDto);

          return valid;
      }
        return valid;
    }

    @Override
    public Optional<HackathonDto> findById(int id) {//>0
        System.out.println("running findById in hackathon Service...");
        if(id>0)
        {
            System.out.println("id is valid :"+id);// call the repo
            HackathonRepo hackathonRepo=new HackathonRepoImpl();
            return hackathonRepo.findById(id);
        }

        return HackathonService.super.findById(id);
    }


}
