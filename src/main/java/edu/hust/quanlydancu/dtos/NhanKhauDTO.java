package edu.hust.quanlydancu.dtos;

import lombok.Data;

@Data
public class NhanKhauDTO {
    private Integer id;
    private String maNhanKhau;
    private String hoTen;
    private String bietDanh;
    private java.sql.Date namSinh;
    private String gioiTinh;
    private String noiSinh;
    private String nguyenQuan;
    private String danToc;
    private String tonGiao;
    private String quocTich;
    private String soHoChieu;
    private String noiThuongTru;
    private String diaChiHienNay;
    private String trinhDoHocVan;
    private String trinhDoChuyenMon;
    private String bietTiengDanToc;
    private String trinhDoNgoaiNgu;
    private String ngheNghiep;
    private String noiLamViec;
    private String tienAn;
    private java.sql.Date ngayChuyenDen;
    private String lyDoChuyenDen;
    private java.sql.Date ngayChuyenDi;
    private String lyDoChuyenDi;
    private String diaChiMoi;
    private java.sql.Date ngayTao;
    private Integer idNguoiTao;
    private java.sql.Date ngayXoa;
    private Integer idNguoiXoa;
    private String lyDoXoa;
    private String ghiChu;
}
