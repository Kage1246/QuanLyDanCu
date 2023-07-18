package edu.hust.quanlydancu.dtos;

import edu.hust.quanlydancu.entities.NhanKhau;
import lombok.Data;

@Data
public class ThamGiaDTO {
    private Integer id;
    private Integer idSinhHoat;
    private String tenSinhHoat;
    private NhanKhau nhanKhau;
    private Byte coMat;
}
