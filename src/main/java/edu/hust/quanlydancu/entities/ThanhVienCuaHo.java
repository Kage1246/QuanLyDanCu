/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 02:43:13
 */
package edu.hust.quanlydancu.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "thanh_vien_cua_ho", schema = "quan_ly_nhan_khau")
public class ThanhVienCuaHo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "quan_he_voi_chu_ho", nullable = true, length = 50)
    private String quanHeVoiChuHo;
    @ManyToOne
    @JoinColumn(name = "id_ho_khau", referencedColumnName = "id", nullable = false)
    private HoKhau hoKhauByIdHoKhau;
    @ManyToOne
    @JoinColumn(name = "id_nhan_khau", referencedColumnName = "id", nullable = false)
    private NhanKhau nhanKhauByIdNhanKhau;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThanhVienCuaHo that = (ThanhVienCuaHo) o;

        if (id != that.id) return false;
        if (quanHeVoiChuHo != null ? !quanHeVoiChuHo.equals(that.quanHeVoiChuHo) : that.quanHeVoiChuHo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (quanHeVoiChuHo != null ? quanHeVoiChuHo.hashCode() : 0);
        return result;
    }
}
