package com.example.bvt.component.convertionToJson;

import com.example.bvt.component.ToningAndBooking;
import com.example.bvt.modelDTO.ToningAndBookingDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

public class ObjectToJson {

    public String toningToJson(Optional<ToningAndBooking> toningAndBookingDTO)  {
        ObjectMapper objectMapper=new ObjectMapper();

        String  string= null;
        try {
            string = objectMapper.writeValueAsString(toningAndBookingDTO);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return string;
    }
}
