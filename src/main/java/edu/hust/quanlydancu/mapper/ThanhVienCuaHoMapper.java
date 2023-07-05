/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 00:13:48
 */
package edu.hust.quanlydancu.mapper;

import edu.hust.quanlydancu.dtos.ThanhVienCuaHoDTO;
import edu.hust.quanlydancu.entities.ThanhVienCuaHo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface ThanhVienCuaHoMapper extends EntityMapper<ThanhVienCuaHoDTO, ThanhVienCuaHo>{
    @Override
    @Mapping(source = "idNhanKhau", target = "nhanKhauByIdNhanKhau.id")
    @Mapping(source = "idHoKhau", target = "hoKhauByIdHoKhau.id")
    ThanhVienCuaHo toEntity(ThanhVienCuaHoDTO dto);
    @Override
    @Mapping(source = "nhanKhauByIdNhanKhau.id", target = "idNhanKhau")
    @Mapping(source = "hoKhauByIdHoKhau.id", target = "idHoKhau")
    ThanhVienCuaHoDTO toDto(ThanhVienCuaHo entity);
}
