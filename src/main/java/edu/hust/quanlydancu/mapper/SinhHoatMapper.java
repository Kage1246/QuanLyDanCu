/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 21:11:41
 */
package edu.hust.quanlydancu.mapper;

import edu.hust.quanlydancu.dtos.SinhHoatDTO;
import edu.hust.quanlydancu.entities.SinhHoat;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface SinhHoatMapper extends EntityMapper<SinhHoatDTO, SinhHoat>{
    @Override
    @Mapping(source = "thamGiasById", target = "thamGiasById")
    SinhHoatDTO toDto(SinhHoat entity);
    @Override
    @Mapping(source = "thamGiasById", target = "thamGiasById")
    SinhHoat toEntity(SinhHoatDTO dto);
}
