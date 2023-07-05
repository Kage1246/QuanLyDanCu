/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 02:42:59
 */
package edu.hust.quanlydancu.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Collection;

@Data
@Entity
@Table(name = "ho_khau", schema = "quan_ly_nhan_khau")
public class HoKhau {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_ho_khau", nullable = true, length = 100)
    private String maHoKhau;
    @OneToOne
    @JoinColumn(name = "id_chu_ho", referencedColumnName = "id", nullable = true)
    private NhanKhau chuHo;
    @Basic
    @Column(name = "ma_khu_vuc", nullable = true, length = 100)
    private String maKhuVuc;
    @Basic
    @Column(name = "dia_chi", nullable = true, length = 100)
    private String diaChi;
    @Basic
    @Column(name = "ngay_lap", nullable = true)
    private Date ngayLap;
    @Basic
    @Column(name = "ngay_chuyen_di", nullable = true)
    private Date ngayChuyenDi;
    @Basic
    @Column(name = "ly_do_chuyen", nullable = true, length = -1)
    private String lyDoChuyen;
    @Basic
    @Column(name = "nguoi_thuc_hien", nullable = true)
    private Integer nguoiThucHien;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HoKhau hoKhau = (HoKhau) o;

        if (id != hoKhau.id) return false;
        if (maHoKhau != null ? !maHoKhau.equals(hoKhau.maHoKhau) : hoKhau.maHoKhau != null) return false;
        if (chuHo != null ? !chuHo.equals(hoKhau.chuHo) : hoKhau.chuHo != null) return false;
        if (maKhuVuc != null ? !maKhuVuc.equals(hoKhau.maKhuVuc) : hoKhau.maKhuVuc != null) return false;
        if (diaChi != null ? !diaChi.equals(hoKhau.diaChi) : hoKhau.diaChi != null) return false;
        if (ngayLap != null ? !ngayLap.equals(hoKhau.ngayLap) : hoKhau.ngayLap != null) return false;
        if (ngayChuyenDi != null ? !ngayChuyenDi.equals(hoKhau.ngayChuyenDi) : hoKhau.ngayChuyenDi != null)
            return false;
        if (lyDoChuyen != null ? !lyDoChuyen.equals(hoKhau.lyDoChuyen) : hoKhau.lyDoChuyen != null) return false;
        if (nguoiThucHien != null ? !nguoiThucHien.equals(hoKhau.nguoiThucHien) : hoKhau.nguoiThucHien != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (maHoKhau != null ? maHoKhau.hashCode() : 0);
        result = 31 * result + (chuHo != null ? chuHo.hashCode() : 0);
        result = 31 * result + (maKhuVuc != null ? maKhuVuc.hashCode() : 0);
        result = 31 * result + (diaChi != null ? diaChi.hashCode() : 0);
        result = 31 * result + (ngayLap != null ? ngayLap.hashCode() : 0);
        result = 31 * result + (ngayChuyenDi != null ? ngayChuyenDi.hashCode() : 0);
        result = 31 * result + (lyDoChuyen != null ? lyDoChuyen.hashCode() : 0);
        result = 31 * result + (nguoiThucHien != null ? nguoiThucHien.hashCode() : 0);
        return result;
    }
}
