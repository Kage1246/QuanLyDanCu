/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 23:10:10
 */
package edu.hust.quanlydancu.services;

import edu.hust.quanlydancu.dtos.HoKhauDTO;
import edu.hust.quanlydancu.dtos.SinhHoatDTO;
import edu.hust.quanlydancu.dtos.ThamGiaDTO;
import edu.hust.quanlydancu.entities.ThamGia;
import edu.hust.quanlydancu.mapper.HoKhauMapper;
import edu.hust.quanlydancu.mapper.SinhHoatMapper;
import edu.hust.quanlydancu.mapper.ThamGiaMapper;
import edu.hust.quanlydancu.repositories.HoKhauRepository;
import edu.hust.quanlydancu.repositories.SinhHoatRepository;
import edu.hust.quanlydancu.repositories.ThamGiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class ThamGiaService {
    @Autowired
    ThamGiaRepository thamGiaRepository;
    @Autowired
    HoKhauRepository hoKhauRepository;
    @Autowired
    SinhHoatRepository sinhHoatRepository;
    @Autowired
    ThamGiaMapper thamGiaMapper;
    @Autowired
    HoKhauMapper hoKhauMapper;
    @Autowired
    SinhHoatMapper sinhHoatMapper;
    public ThamGiaDTO getById(Integer id) {
        return thamGiaMapper.toDto(thamGiaRepository.getReferenceById(id));
    }
    public List<ThamGiaDTO> getAll() {
        return thamGiaMapper.toDto(thamGiaRepository.findAll());
    }
    public ThamGiaDTO createNew(ThamGiaDTO dto) {
        ThamGia entity = thamGiaRepository.save(thamGiaMapper.toEntity(dto));
        return thamGiaMapper.toDto(entity);
    }
    public void updateById(ThamGiaDTO dto, Integer id) {
        ThamGia entity = thamGiaMapper.toEntity(dto);
        thamGiaRepository.setDongGopById(entity.getNhanKhauByIdNhanKhau(),
                entity.getSinhHoatByIdSinhHoat(), id);
    }
    public void deleteById(Integer id) {
        thamGiaRepository.deleteById(id);
    }
    public List<HoKhauDTO> getAllBySinhHoat(String chuDe, Date from, Date to) {
        return hoKhauMapper.toDto(hoKhauRepository.findBySinhHoat(
                chuDe, from, to
        ));
    }
    public List<SinhHoatDTO> getAllByChuHo(String chuHo, Date from, Date to) {
        return sinhHoatMapper.toDto(sinhHoatRepository.findByChuHo(
                chuHo, from, to
        ));
    }
}
