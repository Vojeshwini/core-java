package com.java.xworkz.Dto;

import com.java.xworkz.constant.DbProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class HackathonDto {

    String collegeName;
    String teamName;
    int ntotalMembers;
    String teamLeader;
    long ncontact;
    String email;
    private String createdBy = DbProperties.VOJESHWINI.toString();
    private Timestamp createdTime = Timestamp.valueOf(LocalDateTime.now());

}
