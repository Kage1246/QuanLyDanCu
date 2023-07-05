/**
 * This class was created by Kage
 * This class was created at 04-Jul-23 23:54:32
 */
package edu.hust.quanlydancu.mapper;

import edu.hust.quanlydancu.dtos.KhoanPhiDTO;
import edu.hust.quanlydancu.entities.KhoanPhi;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface KhoanPhiMapper extends EntityMapper<KhoanPhiDTO, KhoanPhi> {
    @Override
    @Mapping(source = "dongGopsById", target = "dongGopsById")
    KhoanPhiDTO toDto(KhoanPhi entity);
    @Override
    @Mapping(source = "dongGopsById", target = "dongGopsById")
    KhoanPhi toEntity(KhoanPhiDTO dto);
}
