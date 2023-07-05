/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 21:15:09
 */
package edu.hust.quanlydancu.mapper;

import edu.hust.quanlydancu.dtos.UsersDTO;
import edu.hust.quanlydancu.entities.Users;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UsersMapper extends EntityMapper<UsersDTO, Users>{
}
