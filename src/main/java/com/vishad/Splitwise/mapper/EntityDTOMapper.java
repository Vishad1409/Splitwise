package com.vishad.Splitwise.mapper;

import com.vishad.Splitwise.dto.UserLoginResponseDTO;
import com.vishad.Splitwise.entity.User;

public class EntityDTOMapper {
    public static UserLoginResponseDTO toDto(User user){
        UserLoginResponseDTO responseDTO = new UserLoginResponseDTO();

        responseDTO.setId(user.getId());
        responseDTO.setName(user.getName());
        responseDTO.setEmail(user.getEmail());
        return responseDTO;
    }
}
