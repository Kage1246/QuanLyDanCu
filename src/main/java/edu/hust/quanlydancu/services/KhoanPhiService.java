/**
 * This class was created by Kage
 * This class was created at 04-Jul-23 23:13:47
 */
package edu.hust.quanlydancu.services;

import edu.hust.quanlydancu.dtos.DongGopDTO;
import edu.hust.quanlydancu.dtos.KhoanPhiDTO;
import edu.hust.quanlydancu.entities.DongGop;
import edu.hust.quanlydancu.entities.HoKhau;
import edu.hust.quanlydancu.entities.KhoanPhi;
import edu.hust.quanlydancu.mapper.DongGopMapper;
import edu.hust.quanlydancu.mapper.KhoanPhiMapper;
import edu.hust.quanlydancu.repositories.DongGopRepository;
import edu.hust.quanlydancu.repositories.HoKhauRepository;
import edu.hust.quanlydancu.repositories.KhoanPhiRepository;
import edu.hust.quanlydancu.repositories.ThanhVienCuaHoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class KhoanPhiService {
    @Autowired
    KhoanPhiRepository khoanPhiRepository;
    @Autowired
    HoKhauRepository hoKhauRepository;
    @Autowired
    DongGopRepository dongGopRepository;
    @Autowired
    ThanhVienCuaHoRepository thanhVienCuaHoRepository;
    @Autowired
    KhoanPhiMapper khoanPhiMapper;
    @Autowired
    DongGopMapper dongGopMapper;
    public void updateById(KhoanPhiDTO dto, Integer id) {
        Optional<KhoanPhi> optional = khoanPhiRepository.findById(id);
        KhoanPhi newEntity = khoanPhiMapper.toEntity(dto);
        if (optional.isPresent()) {
            KhoanPhi entity = optional.get();
            if (newEntity.getTen() != null) {
                entity.setTen(newEntity.getTen());
            }
            if (newEntity.getBatDau() != null) {
                entity.setBatDau(newEntity.getBatDau());
            }
            if (newEntity.getKetThuc() != null) {
                entity.setKetThuc(newEntity.getKetThuc());
            }
            if (newEntity.getBatBuoc() != null) {
                entity.setBatBuoc(newEntity.getBatBuoc());
            }
            if (newEntity.getDinhMuc() != null) {
                entity.setDinhMuc(newEntity.getDinhMuc());
            }
            khoanPhiRepository.save(entity);
        }
    }
    public void deleteById(Integer id) {
        List<DongGop> dongGops = dongGopRepository.findAllByIdKhoanPhi(id);
        for (DongGop dongGop : dongGops) {
            dongGopRepository.deleteById(dongGop.getId());
        }
        khoanPhiRepository.deleteById(id);
    }
    public void createKhoanPhi(KhoanPhiDTO khoanPhiDTO) {
        KhoanPhi khoanPhi = khoanPhiRepository.save(khoanPhiMapper.toEntity(khoanPhiDTO));
        List<HoKhau> hoKhauList = hoKhauRepository.findAll();
        if (khoanPhi.getBatBuoc() == 1) {
            for (HoKhau hoKhau : hoKhauList) {
                DongGop dongGop = new DongGop();
                dongGop.setKhoanPhiByIdKhoanPhi(khoanPhi);
                dongGop.setHoKhauByIdHoKhau(hoKhau);
                dongGop.setDaDong((byte) 0);
                dongGop.setSoTien(thanhVienCuaHoRepository.
                        getNumberByHoKhau(hoKhau) * khoanPhi.getDinhMuc());
                dongGopRepository.save(dongGop);
            }
        } else {
            for (HoKhau hoKhau : hoKhauList) {
                DongGop dongGop = new DongGop();
                dongGop.setKhoanPhiByIdKhoanPhi(khoanPhi);
                dongGop.setHoKhauByIdHoKhau(hoKhau);
                dongGop.setDaDong((byte) 0);
                dongGopRepository.save(dongGop);
            }
        }
    }
    public KhoanPhiDTO getListDongGopByKhoanPhi(Integer id) {
        KhoanPhi khoanPhi = khoanPhiRepository.getReferenceById(id);
        KhoanPhiDTO khoanPhiDTO = new KhoanPhiDTO();
        khoanPhiDTO.setId(khoanPhi.getId());
        khoanPhiDTO.setTen(khoanPhi.getTen());
        khoanPhiDTO.setBatDau(khoanPhi.getBatDau());
        khoanPhiDTO.setKetThuc(khoanPhi.getKetThuc());
        khoanPhiDTO.setBatBuoc(khoanPhi.getBatBuoc());
        khoanPhiDTO.setDinhMuc(khoanPhi.getDinhMuc());
        List<DongGopDTO> list = new ArrayList<>();
        for (DongGop dongGop : khoanPhi.getDongGopsById()) {
            list.add(dongGopMapper.toDto(dongGop));
        }
        khoanPhiDTO.setDongGopsById(list);
        return khoanPhiDTO;
    }
    public List<KhoanPhiDTO> getAll() {
        List<KhoanPhiDTO> listDto = new ArrayList<>();
        List<KhoanPhi> listEntity = khoanPhiRepository.findAll();
        for (KhoanPhi entity : listEntity) {
            listDto.add(getListDongGopByKhoanPhi(entity.getId()));
        }
        return listDto;
    }
}