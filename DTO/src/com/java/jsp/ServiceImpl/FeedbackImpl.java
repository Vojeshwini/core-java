package com.java.jsp.ServiceImpl;

import com.java.jsp.dto.DonationDto;
import com.java.jsp.dto.FeebackDto;
import com.java.jsp.service.FeedbackService;

public class FeedbackImpl implements FeedbackService {
    @Override
    public boolean save(FeebackDto feebackDto) {
        return true;
    }
}
