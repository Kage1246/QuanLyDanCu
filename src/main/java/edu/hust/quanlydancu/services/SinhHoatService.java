/**
 * This class was created by Kage
 * This class was created at 06-Jul-23 01:54:25
 */
package edu.hust.quanlydancu.services;

import edu.hust.quanlydancu.dtos.SinhHoatDTO;
import edu.hust.quanlydancu.dtos.ThamGiaDTO;
import edu.hust.quanlydancu.entities.SinhHoat;
import edu.hust.quanlydancu.entities.ThamGia;
import edu.hust.quanlydancu.mapper.SinhHoatMapper;
import edu.hust.quanlydancu.mapper.ThamGiaMapper;
import edu.hust.quanlydancu.repositories.SinhHoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhHoatService {
    @Autowired
    SinhHoatRepository sinhHoatRepository;
    @Autowired
    SinhHoatMapper sinhHoatMapper;
    @Autowired
    ThamGiaMapper thamGiaMapper;
    public SinhHoatDTO getById(Integer id) {
        SinhHoat sinhHoat = sinhHoatRepository.getReferenceById(id);
        SinhHoatDTO sinhHoatDTO = new SinhHoatDTO();
        sinhHoatDTO.setId(sinhHoat.getId());
        sinhHoatDTO.setChuDe(sinhHoat.getChuDe());
        sinhHoatDTO.setBatDau(sinhHoat.getBatDau());
        sinhHoatDTO.setKetThuc(sinhHoat.getKetThuc());
        sinhHoatDTO.setDiaDiem(sinhHoat.getDiaDiem());
        List<ThamGiaDTO> list = new ArrayList<>();
        for (ThamGia thamGia : sinhHoat.getThamGiasById()) {
            list.add(thamGiaMapper.toDto(thamGia));
        }
        sinhHoatDTO.setThamGiasById(list);
        return sinhHoatDTO;
    }
    public List<SinhHoatDTO> getAll() {
        List<SinhHoatDTO> listDto = new ArrayList<>();
        List<SinhHoat> listEntity = sinhHoatRepository.findAll();
        for (SinhHoat sinhHoat : listEntity) {
            listDto.add(getById(sinhHoat.getId()));
        }
        return listDto;
    }
    public void createNew(SinhHoatDTO dto) {
        SinhHoat entity = sinhHoatRepository.save(sinhHoatMapper.toEntity(dto));
        sinhHoatMapper.toDto(entity);
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