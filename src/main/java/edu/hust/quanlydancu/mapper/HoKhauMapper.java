/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 00:13:08
 */
package edu.hust.quanlydancu.mapper;

import edu.hust.quanlydancu.dtos.DongGopDTO;
import edu.hust.quanlydancu.dtos.HoKhauDTO;
import edu.hust.quanlydancu.entities.DongGop;
import edu.hust.quanlydancu.entities.HoKhau;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface HoKhauMapper extends EntityMapper<HoKhauDTO, HoKhau>{
    @Override
    @Mapping(source = "chuHo", target = "chuHo")
    HoKhau toEntity(HoKhauDTO dto);
    @Override
    @Mapping(source = "chuHo", target = "chuHo")
    HoKhauDTO toDto(HoKhau entity);
}
