/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 02:43:12
 */
package edu.hust.quanlydancu.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tham_gia", schema = "quan_ly_nhan_khau")
public class ThamGia {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_sinh_hoat", referencedColumnName = "id", nullable = false)
    private SinhHoat sinhHoatByIdSinhHoat;
    @ManyToOne
    @JoinColumn(name = "id_nhan_khau", referencedColumnName = "id", nullable = false)
    private NhanKhau nhanKhauByIdNhanKhau;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThamGia thamGia = (ThamGia) o;

        if (id != thamGia.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        return result;
    }

    public SinhHoat getSinhHoatByIdSinhHoat() {
        return sinhHoatByIdSinhHoat;
    }

    public void setSinhHoatByIdSinhHoat(SinhHoat sinhHoatByIdSinhHoat) {
        this.sinhHoatByIdSinhHoat = sinhHoatByIdSinhHoat;
    }

    public NhanKhau getNhanKhauByIdNhanKhau() {
        return nhanKhauByIdNhanKhau;
    }

    public void setNhanKhauByIdNhanKhau(NhanKhau nhanKhauByIdNhanKhau) {
        this.nhanKhauByIdNhanKhau = nhanKhauByIdNhanKhau;
    }
}
