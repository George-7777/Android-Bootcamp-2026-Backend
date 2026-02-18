package ru.sicampus.bootcamp2026.util;

import lombok.experimental.UtilityClass;
import ru.sicampus.bootcamp2026.dto.UserDTO;
import ru.sicampus.bootcamp2026.entity.Booking;
import ru.sicampus.bootcamp2026.entity.User;

import java.util.List;
import java.util.stream.Collectors;


@UtilityClass
public class UserMapper {
    public UserDTO convertToDTO (User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setPasswd_hash(user.getPasswd_hash());
        System.out.println("ok");
        List<Long> l = user.getBookingList().stream().map(Booking::getId).collect(Collectors.toList());
        userDTO.setBookingNames(l);

        return userDTO;
    }
}
