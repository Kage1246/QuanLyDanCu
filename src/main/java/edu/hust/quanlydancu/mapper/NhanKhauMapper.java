/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 21:11:11
 */
package edu.hust.quanlydancu.mapper;

import edu.hust.quanlydancu.dtos.NhanKhauDTO;
import edu.hust.quanlydancu.entities.NhanKhau;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface NhanKhauMapper extends EntityMapper<NhanKhauDTO, NhanKhau>{
}
