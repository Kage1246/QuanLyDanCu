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
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

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
        DongGop entity = dongGopMapper.toEntity(dto);
        dongGopRepository.setDongGopById(entity.getSoTien(), entity.getDaDong(), entity.getNgayDong(),
                entity.getKhoanPhiByIdKhoanPhi(), entity.getHoKhauByIdHoKhau(), id);
    }
    public void deleteById(Integer id) {
        dongGopRepository.deleteById(id);
    }
    public List<DongGopDTO> getByKhoanPhi(String khoanPhi, Date from, Date to) {
        return dongGopMapper.toDto(dongGopRepository.
                findByKhoanPhiByIdKhoanPhiContainsAndNgayDongBetween
                        (khoanPhi, from, to));
    }
}
