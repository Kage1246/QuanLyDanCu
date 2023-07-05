package edu.hust.quanlydancu.dtos;

import lombok.Data;

@Data
public class HoKhauDTO {
    private Integer id;
    private String maHoKhau;
    private NhanKhauDTO chuHo;
    private String maKhuVuc;
    private String diaChi;
    private java.sql.Date ngayLap;
    private java.sql.Date ngayChuyenDi;
    private String lyDoChuyen;
    private Integer nguoiThucHien;
}
