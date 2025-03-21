package com.vishad.Splitwise.mapper;

import com.vishad.Splitwise.dto.GroupResponseDTO;
import com.vishad.Splitwise.dto.UserFriendResponseDTO;
import com.vishad.Splitwise.dto.UserLoginResponseDTO;
import com.vishad.Splitwise.entity.Group;
import com.vishad.Splitwise.entity.User;

import java.util.ArrayList;
import java.util.List;

public class EntityDTOMapper {
    public static UserLoginResponseDTO toDto(User user){
        UserLoginResponseDTO responseDTO = new UserLoginResponseDTO();

        responseDTO.setId(user.getId());
        responseDTO.setName(user.getName());
        responseDTO.setEmail(user.getEmail());

        // Conversion of user friends to friendList
        List<UserFriendResponseDTO> friendList = new ArrayList<>();
        for (User friend:user.getFriends()){
            friendList.add(toFriendDTO(friend));
        }
        responseDTO.setFriendList(friendList);

        // Conversion of group to groupResponseDTO
        List<GroupResponseDTO> groups = new ArrayList<>();
        for (Group group:user.getGroups()){
            groups.add(toDTO(group));
        }
        responseDTO.setGroups(groups);

        return responseDTO;
    }

    public static UserFriendResponseDTO toFriendDTO(User user){
        UserFriendResponseDTO userFriendResponseDTO = new UserFriendResponseDTO();
        userFriendResponseDTO.setId(user.getId());
        userFriendResponseDTO.setName(user.getName());
        return userFriendResponseDTO;
    }

    public static GroupResponseDTO toDTO(Group group){
        GroupResponseDTO groupResponseDTO = new GroupResponseDTO();

        return null;
    }
}
