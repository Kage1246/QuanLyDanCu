/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 00:11:47
 */
package edu.hust.quanlydancu.mapper;

import edu.hust.quanlydancu.dtos.DongGopDTO;
import edu.hust.quanlydancu.entities.DongGop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface DongGopMapper extends EntityMapper<DongGopDTO, DongGop>{
    @Override
    @Mapping(source = "idKhoanPhi", target = "khoanPhiByIdKhoanPhi.id")
    @Mapping(source = "hoKhau", target = "hoKhauByIdHoKhau")
    DongGop toEntity(DongGopDTO dto);
    @Override
    @Mapping(source = "khoanPhiByIdKhoanPhi.id", target = "idKhoanPhi")
    @Mapping(source = "khoanPhiByIdKhoanPhi.ten", target = "tenKhoanPhi")
    @Mapping(source = "hoKhauByIdHoKhau", target = "hoKhau")
    DongGopDTO toDto(DongGop entity);
}
