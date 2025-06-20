package com.java.xworkz.repository;

import com.java.xworkz.Dto.HackathonDto;
import com.java.xworkz.constant.DbProperties;
import lombok.SneakyThrows;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

public class HackathonRepoImpl implements HackathonRepo {
    public boolean persist(HackathonDto hackathonDto) {

        System.out.println("runing the persist in the HackathonImpl");
        if (hackathonDto != null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(DbProperties.URL.getProp(), DbProperties.USER_NAME.getProp(), DbProperties.SECRET.getProp());
                String presql = "insert into hackathon values(?,?,?,?,?,?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(presql);
                preparedStatement.setInt(1, 0);
                preparedStatement.setString(2, hackathonDto.getCollegeName());
                preparedStatement.setString(3, hackathonDto.getTeamName());
                preparedStatement.setInt(4, hackathonDto.getNtotalMembers());
                preparedStatement.setString(5, hackathonDto.getTeamLeader());
                preparedStatement.setLong(6, hackathonDto.getNcontact());
                preparedStatement.setString(7, hackathonDto.getEmail());

                preparedStatement.setString(8, hackathonDto.getCreatedBy());
                preparedStatement.setTimestamp(9, hackathonDto.getCreatedTime());
                preparedStatement.executeUpdate();


            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            }
            return true;


        }

        return false;
    }


    @SneakyThrows

    @Override
    public Optional<HackathonDto> findById(int id){
    System.out.println("running findbyid in hackathonRepoImpl");
    Class.forName("com.mysql.cj.jdbc.Driver");

       String findByIdSQL="select * from hackathon  where id=?";
       try(Connection connection = DriverManager.getConnection(DbProperties.URL.getProp(), DbProperties.USER_NAME.getProp(), DbProperties.SECRET.getProp());
       PreparedStatement preparedStatement=connection.prepareStatement(findByIdSQL);
       ){
           System.out.println("findById"+findByIdSQL);
           preparedStatement.setInt(1,id);
           ResultSet resultSet=preparedStatement.executeQuery();
           System.out.println("resultSet:"+resultSet);
           while (resultSet.next())
           {
               int pk=resultSet.getInt("id");
               String rcollegeName=resultSet.getString("college_name");
               String rteamName=resultSet.getString("team_name");
               int rtotalMembers=resultSet.getInt("total_members");
               String rteamLeader=resultSet.getString("team_leader");
               long rphoneNumber=resultSet.getLong("phone_number");
               String remail=resultSet.getString("email");
               String createdBy = DbProperties.VOJESHWINI.toString();
               Timestamp createdTime = Timestamp.valueOf(LocalDateTime.now());
               HackathonDto hackathonDto=new HackathonDto(rcollegeName, rteamName, rtotalMembers, rteamLeader, rphoneNumber,remail,createdBy,createdTime);
               return  Optional.of(hackathonDto);
           }
       }catch (SQLException e){
           System.err.println("SQLException in findById "+e.getMessage());

       }

        return Optional.empty();

}

}
