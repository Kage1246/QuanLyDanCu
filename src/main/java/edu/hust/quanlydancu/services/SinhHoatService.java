/**
 * This class was created by Kage
 * This class was created at 06-Jul-23 01:54:25
 */
package edu.hust.quanlydancu.services;

import edu.hust.quanlydancu.dtos.SinhHoatDTO;
import edu.hust.quanlydancu.entities.SinhHoat;
import edu.hust.quanlydancu.mapper.SinhHoatMapper;
import edu.hust.quanlydancu.repositories.SinhHoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhHoatService {
    @Autowired
    SinhHoatRepository sinhHoatRepository;
    @Autowired
    SinhHoatMapper sinhHoatMapper;
    public SinhHoatDTO getById(Integer id) {
        return sinhHoatMapper.toDto(sinhHoatRepository.getReferenceById(id));
    }
    public List<SinhHoatDTO> getAll() {
        return sinhHoatMapper.toDto(sinhHoatRepository.findAll());
    }
    public SinhHoatDTO createNew(SinhHoatDTO dto) {
        SinhHoat entity = sinhHoatRepository.save(sinhHoatMapper.toEntity(dto));
        return sinhHoatMapper.toDto(entity);
    }
    public void updateById(SinhHoatDTO dto, Integer id) {
        SinhHoat entity = sinhHoatMapper.toEntity(dto);
        sinhHoatRepository.setSinhHoatById(entity.getChuDe(),
                entity.getBatDau(), entity.getKetThuc(), entity.getDiaDiem(), id);
    }
    public void deleteById(Integer id) {
        sinhHoatRepository.deleteById(id);
    }
}
