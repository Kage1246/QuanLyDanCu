/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 21:19:38
 */
package edu.hust.quanlydancu.services;

import edu.hust.quanlydancu.dtos.DongGopDTO;
import edu.hust.quanlydancu.entities.DongGop;
import edu.hust.quanlydancu.mapper.DongGopMapper;
import edu.hust.quanlydancu.repositories.DongGopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DongGopService {
    @Autowired
    DongGopRepository dongGopRepository;
    @Autowired
    DongGopMapper dongGopMapper;
    public DongGopDTO getById(Integer id) {
        return dongGopMapper.toDto(dongGopRepository.getReferenceById(id));
    }
    public List<DongGopDTO> getAll() {
        return dongGopMapper.toDto(dongGopRepository.findAll());
    }
    public DongGopDTO createNew(DongGopDTO dto) {
        DongGop entity = dongGopRepository.save(dongGopMapper.toEntity(dto));
        return dongGopMapper.toDto(entity);
    }
    public void updateById(DongGopDTO dto, Integer id) {
        Optional<DongGop> optional = dongGopRepository.findById(id);
        DongGop newEntity = dongGopMapper.toEntity(dto);
        if (optional.isPresent()) {
            DongGop entity = optional.get();
            if (newEntity.getDaDong() != null) {
                entity.setDaDong(newEntity.getDaDong());
            }
            if (newEntity.getNgayDong() != null) {
                entity.setNgayDong(newEntity.getNgayDong());
            }
            if (newEntity.getSoTien() != null) {
                entity.setSoTien(newEntity.getSoTien());
            }
            dongGopRepository.save(entity);
        }
    }
    public void deleteById(Integer id) {
        dongGopRepository.deleteById(id);
    }
    public List<DongGopDTO> getByKhoanPhi(String khoanPhi, Date from, Date to) {
        return dongGopMapper.toDto(dongGopRepository.
                findByKhoanPhiByIdKhoanPhiContains
                        (khoanPhi, from, to));
    }
    public List<DongGopDTO> getByChuHo(String chuHo, Date from, Date to) {
        return dongGopMapper.toDto(dongGopRepository.
                findByChuHoContains(chuHo, from, to));
    }
    public void updateList(List<DongGopDTO> dtoList) {
        for (DongGopDTO dto : dtoList) {
            updateById(dto, dto.getId());
        }
    }
    public List<DongGopDTO> getListByIdHoKhau(Integer id) {
        List<DongGopDTO> list = new ArrayList<>();
        for (DongGop dongGop : dongGopRepository.findAllByHoKhauByIdHoKhau(id)) {
            list.add(dongGopMapper.toDto(dongGop));
        }
        return list;
    }
}
