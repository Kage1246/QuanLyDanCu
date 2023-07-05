/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 02:43:02
 */
package edu.hust.quanlydancu.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Collection;

@Data
@Entity
@Table(name = "nhan_khau", schema = "quan_ly_nhan_khau")
public class NhanKhau {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_nhan_khau", nullable = true, length = 100)
    private String maNhanKhau;
    @Basic
    @Column(name = "ho_ten", nullable = true, length = 100)
    private String hoTen;
    @Basic
    @Column(name = "biet_danh", nullable = true, length = 100)
    private String bietDanh;
    @Basic
    @Column(name = "nam_sinh", nullable = true)
    private Date namSinh;
    @Basic
    @Column(name = "gioi_tinh", nullable = true, length = 100)
    private String gioiTinh;
    @Basic
    @Column(name = "noi_sinh", nullable = true, length = 100)
    private String noiSinh;
    @Basic
    @Column(name = "nguyen_quan", nullable = true, length = 100)
    private String nguyenQuan;
    @Basic
    @Column(name = "dan_toc", nullable = true, length = 100)
    private String danToc;
    @Basic
    @Column(name = "ton_giao", nullable = true, length = 100)
    private String tonGiao;
    @Basic
    @Column(name = "quoc_tich", nullable = true, length = 100)
    private String quocTich;
    @Basic
    @Column(name = "so_ho_chieu", nullable = true, length = 100)
    private String soHoChieu;
    @Basic
    @Column(name = "noi_thuong_tru", nullable = true, length = 100)
    private String noiThuongTru;
    @Basic
    @Column(name = "dia_chi_hien_nay", nullable = true, length = 100)
    private String diaChiHienNay;
    @Basic
    @Column(name = "trinh_do_hoc_van", nullable = true, length = 100)
    private String trinhDoHocVan;
    @Basic
    @Column(name = "trinh_do_chuyen_mon", nullable = true, length = 100)
    private String trinhDoChuyenMon;
    @Basic
    @Column(name = "biet_tieng_dan_toc", nullable = true, length = 100)
    private String bietTiengDanToc;
    @Basic
    @Column(name = "trinh_do_ngoai_ngu", nullable = true, length = 100)
    private String trinhDoNgoaiNgu;
    @Basic
    @Column(name = "nghe_nghiep", nullable = true, length = 100)
    private String ngheNghiep;
    @Basic
    @Column(name = "noi_lam_viec", nullable = true, length = 100)
    private String noiLamViec;
    @Basic
    @Column(name = "tien_an", nullable = true, length = 100)
    private String tienAn;
    @Basic
    @Column(name = "ngay_chuyen_den", nullable = true)
    private Date ngayChuyenDen;
    @Basic
    @Column(name = "ly_do_chuyen_den", nullable = true, length = 100)
    private String lyDoChuyenDen;
    @Basic
    @Column(name = "ngay_chuyen_di", nullable = true)
    private Date ngayChuyenDi;
    @Basic
    @Column(name = "ly_do_chuyen_di", nullable = true, length = 100)
    private String lyDoChuyenDi;
    @Basic
    @Column(name = "dia_chi_moi", nullable = true, length = 100)
    private String diaChiMoi;
    @Basic
    @Column(name = "ngay_tao", nullable = true)
    private Date ngayTao;
    @Basic
    @Column(name = "id_nguoi_tao", nullable = true)
    private Integer idNguoiTao;
    @Basic
    @Column(name = "ngay_xoa", nullable = true)
    private Date ngayXoa;
    @Basic
    @Column(name = "id_nguoi_xoa", nullable = true)
    private Integer idNguoiXoa;
    @Basic
    @Column(name = "ly_do_xoa", nullable = true, length = 100)
    private String lyDoXoa;
    @Basic
    @Column(name = "ghi_chu", nullable = true, length = 100)
    private String ghiChu;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NhanKhau nhanKhau = (NhanKhau) o;

        if (id != nhanKhau.id) return false;
        if (maNhanKhau != null ? !maNhanKhau.equals(nhanKhau.maNhanKhau) : nhanKhau.maNhanKhau != null) return false;
        if (hoTen != null ? !hoTen.equals(nhanKhau.hoTen) : nhanKhau.hoTen != null) return false;
        if (bietDanh != null ? !bietDanh.equals(nhanKhau.bietDanh) : nhanKhau.bietDanh != null) return false;
        if (namSinh != null ? !namSinh.equals(nhanKhau.namSinh) : nhanKhau.namSinh != null) return false;
        if (gioiTinh != null ? !gioiTinh.equals(nhanKhau.gioiTinh) : nhanKhau.gioiTinh != null) return false;
        if (noiSinh != null ? !noiSinh.equals(nhanKhau.noiSinh) : nhanKhau.noiSinh != null) return false;
        if (nguyenQuan != null ? !nguyenQuan.equals(nhanKhau.nguyenQuan) : nhanKhau.nguyenQuan != null) return false;
        if (danToc != null ? !danToc.equals(nhanKhau.danToc) : nhanKhau.danToc != null) return false;
        if (tonGiao != null ? !tonGiao.equals(nhanKhau.tonGiao) : nhanKhau.tonGiao != null) return false;
        if (quocTich != null ? !quocTich.equals(nhanKhau.quocTich) : nhanKhau.quocTich != null) return false;
        if (soHoChieu != null ? !soHoChieu.equals(nhanKhau.soHoChieu) : nhanKhau.soHoChieu != null) return false;
        if (noiThuongTru != null ? !noiThuongTru.equals(nhanKhau.noiThuongTru) : nhanKhau.noiThuongTru != null)
            return false;
        if (diaChiHienNay != null ? !diaChiHienNay.equals(nhanKhau.diaChiHienNay) : nhanKhau.diaChiHienNay != null)
            return false;
        if (trinhDoHocVan != null ? !trinhDoHocVan.equals(nhanKhau.trinhDoHocVan) : nhanKhau.trinhDoHocVan != null)
            return false;
        if (trinhDoChuyenMon != null ? !trinhDoChuyenMon.equals(nhanKhau.trinhDoChuyenMon) : nhanKhau.trinhDoChuyenMon != null)
            return false;
        if (bietTiengDanToc != null ? !bietTiengDanToc.equals(nhanKhau.bietTiengDanToc) : nhanKhau.bietTiengDanToc != null)
            return false;
        if (trinhDoNgoaiNgu != null ? !trinhDoNgoaiNgu.equals(nhanKhau.trinhDoNgoaiNgu) : nhanKhau.trinhDoNgoaiNgu != null)
            return false;
        if (ngheNghiep != null ? !ngheNghiep.equals(nhanKhau.ngheNghiep) : nhanKhau.ngheNghiep != null) return false;
        if (noiLamViec != null ? !noiLamViec.equals(nhanKhau.noiLamViec) : nhanKhau.noiLamViec != null) return false;
        if (tienAn != null ? !tienAn.equals(nhanKhau.tienAn) : nhanKhau.tienAn != null) return false;
        if (ngayChuyenDen != null ? !ngayChuyenDen.equals(nhanKhau.ngayChuyenDen) : nhanKhau.ngayChuyenDen != null)
            return false;
        if (lyDoChuyenDen != null ? !lyDoChuyenDen.equals(nhanKhau.lyDoChuyenDen) : nhanKhau.lyDoChuyenDen != null)
            return false;
        if (ngayChuyenDi != null ? !ngayChuyenDi.equals(nhanKhau.ngayChuyenDi) : nhanKhau.ngayChuyenDi != null)
            return false;
        if (lyDoChuyenDi != null ? !lyDoChuyenDi.equals(nhanKhau.lyDoChuyenDi) : nhanKhau.lyDoChuyenDi != null)
            return false;
        if (diaChiMoi != null ? !diaChiMoi.equals(nhanKhau.diaChiMoi) : nhanKhau.diaChiMoi != null) return false;
        if (ngayTao != null ? !ngayTao.equals(nhanKhau.ngayTao) : nhanKhau.ngayTao != null) return false;
        if (idNguoiTao != null ? !idNguoiTao.equals(nhanKhau.idNguoiTao) : nhanKhau.idNguoiTao != null) return false;
        if (ngayXoa != null ? !ngayXoa.equals(nhanKhau.ngayXoa) : nhanKhau.ngayXoa != null) return false;
        if (idNguoiXoa != null ? !idNguoiXoa.equals(nhanKhau.idNguoiXoa) : nhanKhau.idNguoiXoa != null) return false;
        if (lyDoXoa != null ? !lyDoXoa.equals(nhanKhau.lyDoXoa) : nhanKhau.lyDoXoa != null) return false;
        if (ghiChu != null ? !ghiChu.equals(nhanKhau.ghiChu) : nhanKhau.ghiChu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (maNhanKhau != null ? maNhanKhau.hashCode() : 0);
        result = 31 * result + (hoTen != null ? hoTen.hashCode() : 0);
        result = 31 * result + (bietDanh != null ? bietDanh.hashCode() : 0);
        result = 31 * result + (namSinh != null ? namSinh.hashCode() : 0);
        result = 31 * result + (gioiTinh != null ? gioiTinh.hashCode() : 0);
        result = 31 * result + (noiSinh != null ? noiSinh.hashCode() : 0);
        result = 31 * result + (nguyenQuan != null ? nguyenQuan.hashCode() : 0);
        result = 31 * result + (danToc != null ? danToc.hashCode() : 0);
        result = 31 * result + (tonGiao != null ? tonGiao.hashCode() : 0);
        result = 31 * result + (quocTich != null ? quocTich.hashCode() : 0);
        result = 31 * result + (soHoChieu != null ? soHoChieu.hashCode() : 0);
        result = 31 * result + (noiThuongTru != null ? noiThuongTru.hashCode() : 0);
        result = 31 * result + (diaChiHienNay != null ? diaChiHienNay.hashCode() : 0);
        result = 31 * result + (trinhDoHocVan != null ? trinhDoHocVan.hashCode() : 0);
        result = 31 * result + (trinhDoChuyenMon != null ? trinhDoChuyenMon.hashCode() : 0);
        result = 31 * result + (bietTiengDanToc != null ? bietTiengDanToc.hashCode() : 0);
        result = 31 * result + (trinhDoNgoaiNgu != null ? trinhDoNgoaiNgu.hashCode() : 0);
        result = 31 * result + (ngheNghiep != null ? ngheNghiep.hashCode() : 0);
        result = 31 * result + (noiLamViec != null ? noiLamViec.hashCode() : 0);
        result = 31 * result + (tienAn != null ? tienAn.hashCode() : 0);
        result = 31 * result + (ngayChuyenDen != null ? ngayChuyenDen.hashCode() : 0);
        result = 31 * result + (lyDoChuyenDen != null ? lyDoChuyenDen.hashCode() : 0);
        result = 31 * result + (ngayChuyenDi != null ? ngayChuyenDi.hashCode() : 0);
        result = 31 * result + (lyDoChuyenDi != null ? lyDoChuyenDi.hashCode() : 0);
        result = 31 * result + (diaChiMoi != null ? diaChiMoi.hashCode() : 0);
        result = 31 * result + (ngayTao != null ? ngayTao.hashCode() : 0);
        result = 31 * result + (idNguoiTao != null ? idNguoiTao.hashCode() : 0);
        result = 31 * result + (ngayXoa != null ? ngayXoa.hashCode() : 0);
        result = 31 * result + (idNguoiXoa != null ? idNguoiXoa.hashCode() : 0);
        result = 31 * result + (lyDoXoa != null ? lyDoXoa.hashCode() : 0);
        result = 31 * result + (ghiChu != null ? ghiChu.hashCode() : 0);
        return result;
    }
}
