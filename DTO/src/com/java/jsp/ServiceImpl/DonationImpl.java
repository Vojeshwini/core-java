package com.java.jsp.ServiceImpl;


import com.java.jsp.dto.DonationDto;
import com.java.jsp.service.DonationService;

public class DonationImpl implements DonationService {
    @Override
    public boolean save(DonationDto donationDto) {


        if(donationDto!=null) {
            System.out.println("DonationDto not null");
            String name = donationDto.getName();
            if (name != null && name.length() >= 3 && name.length() < 21) {

                System.out.println("valid name");
            }else{
                System.err.println("invalid name");
                return false;
            }
            String contact = String.valueOf(donationDto.getL_contact());
            if (l_contact !=null && l_contact.length() = 10) {
                System.out.println("valid number");

            }else{

            }

            return true;
        }


            }

        }




