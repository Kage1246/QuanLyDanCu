/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 21:14:36
 */
package edu.hust.quanlydancu.mapper;

import edu.hust.quanlydancu.dtos.ThamGiaDTO;
import edu.hust.quanlydancu.entities.ThamGia;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface ThamGiaMapper extends EntityMapper<ThamGiaDTO, ThamGia>{
    @Override
    @Mapping(source = "sinhHoat", target = "sinhHoatByIdSinhHoat.chuDe")
    @Mapping(source = "nhanKhau", target = "nhanKhauByIdNhanKhau")
    ThamGia toEntity(ThamGiaDTO dto);
    @Override
    @Mapping(source = "sinhHoatByIdSinhHoat.chuDe", target = "sinhHoat")
    @Mapping(source = "nhanKhauByIdNhanKhau", target = "nhanKhau")
    ThamGiaDTO toDto(ThamGia entity);
}
