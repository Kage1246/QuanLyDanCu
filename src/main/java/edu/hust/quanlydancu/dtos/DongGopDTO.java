package edu.hust.quanlydancu.dtos;

import edu.hust.quanlydancu.entities.HoKhau;
import lombok.Data;

@Data
public class DongGopDTO {
    private Integer id;
    private HoKhau hoKhau;
    private Integer idKhoanPhi;
    private String tenKhoanPhi;
    private Long soTien;
    private java.sql.Date ngayDong;
    private Byte daDong;
}
