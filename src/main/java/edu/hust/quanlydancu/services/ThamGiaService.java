/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 23:10:10
 */
package edu.hust.quanlydancu.services;

import edu.hust.quanlydancu.dtos.ThamGiaDTO;
import edu.hust.quanlydancu.entities.ThongKe;
import edu.hust.quanlydancu.entities.ThamGia;
import edu.hust.quanlydancu.mapper.ThamGiaMapper;
import edu.hust.quanlydancu.repositories.ThamGiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ThamGiaService {
    @Autowired
    ThamGiaRepository thamGiaRepository;
    @Autowired
    ThamGiaMapper thamGiaMapper;
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
    public void deleteById(Integer id) {
        thamGiaRepository.deleteById(id);
    }
    public List<ThongKe> getAllBySinhHoat(String chuDe, Date from, Date to) {
        return thamGiaRepository.findBySinhHoat(chuDe, from, to);
    }
    public List<ThongKe> getAllByChuHo(String chuHo, Date from, Date to) {
        return thamGiaRepository.findByChuHo(chuHo, from, to);
    }
    public void updateById(ThamGiaDTO dto, Integer id) {
        Optional<ThamGia> optional = thamGiaRepository.findById(id);
        ThamGia newEntity = thamGiaMapper.toEntity(dto);
        if (optional.isPresent()) {
            ThamGia entity = optional.get();
            if (newEntity.getCoMat() != null) {
                entity.setCoMat(newEntity.getCoMat());
            }
            thamGiaRepository.save(entity);
        }
    }
}
