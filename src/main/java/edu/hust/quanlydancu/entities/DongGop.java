/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 02:42:57
 */
package edu.hust.quanlydancu.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.sql.Date;

@Data
@Entity
@Table(name = "dong_gop", schema = "quan_ly_nhan_khau")
public class DongGop {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "so_tien", nullable = true)
    private Long soTien;
    @Basic
    @Column(name = "ngay_dong", nullable = true)
    private Date ngayDong;
    @Basic
    @Column(name = "da_dong", nullable = true)
    private Byte daDong;

    @ManyToOne
    @JoinColumn(name = "id_ho_khau", referencedColumnName = "id", nullable = false)
    @ToString.Exclude
    private HoKhau hoKhauByIdHoKhau;

    @ManyToOne
    @JoinColumn(name = "id_khoan_phi", referencedColumnName = "id", nullable = false)
    @ToString.Exclude
    private KhoanPhi khoanPhiByIdKhoanPhi;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DongGop dongGop = (DongGop) o;

        if (id != dongGop.id) return false;
        if (soTien != null ? !soTien.equals(dongGop.soTien) : dongGop.soTien != null) return false;
        if (ngayDong != null ? !ngayDong.equals(dongGop.ngayDong) : dongGop.ngayDong != null) return false;
        if (daDong != null ? !daDong.equals(dongGop.daDong) : dongGop.daDong != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (soTien != null ? soTien.hashCode() : 0);
        result = 31 * result + (ngayDong != null ? ngayDong.hashCode() : 0);
        result = 31 * result + (daDong != null ? daDong.hashCode() : 0);
        return result;
    }

    public HoKhau getHoKhauByIdHoKhau() {
        return hoKhauByIdHoKhau;
    }

    public void setHoKhauByIdHoKhau(HoKhau hoKhauByIdHoKhau) {
        this.hoKhauByIdHoKhau = hoKhauByIdHoKhau;
    }

    public KhoanPhi getKhoanPhiByIdKhoanPhi() {
        return khoanPhiByIdKhoanPhi;
    }

    public void setKhoanPhiByIdKhoanPhi(KhoanPhi khoanPhiByIdKhoanPhi) {
        this.khoanPhiByIdKhoanPhi = khoanPhiByIdKhoanPhi;
    }
}
