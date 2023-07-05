/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 02:43:01
 */
package edu.hust.quanlydancu.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Collection;

@Data
@Entity
@Table(name = "khoan_phi", schema = "quan_ly_nhan_khau")
public class KhoanPhi {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ten", nullable = true, length = 50)
    private String ten;
    @Basic
    @Column(name = "bat_dau", nullable = true)
    private Date batDau;
    @Basic
    @Column(name = "ket_thuc", nullable = true)
    private Date ketThuc;
    @Basic
    @Column(name = "bat_buoc", nullable = true)
    private Byte batBuoc;
    @Basic
    @Column(name = "dinh_muc", nullable = true)
    private Long dinhMuc;
    @OneToMany(mappedBy = "khoanPhiByIdKhoanPhi")
    private Collection<DongGop> dongGopsById;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KhoanPhi khoanPhi = (KhoanPhi) o;

        if (id != khoanPhi.id) return false;
        if (ten != null ? !ten.equals(khoanPhi.ten) : khoanPhi.ten != null) return false;
        if (batDau != null ? !batDau.equals(khoanPhi.batDau) : khoanPhi.batDau != null) return false;
        if (ketThuc != null ? !ketThuc.equals(khoanPhi.ketThuc) : khoanPhi.ketThuc != null) return false;
        if (batBuoc != null ? !batBuoc.equals(khoanPhi.batBuoc) : khoanPhi.batBuoc != null) return false;
        if (dinhMuc != null ? !dinhMuc.equals(khoanPhi.dinhMuc) : khoanPhi.dinhMuc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        result = 31 * result + (batDau != null ? batDau.hashCode() : 0);
        result = 31 * result + (ketThuc != null ? ketThuc.hashCode() : 0);
        result = 31 * result + (batBuoc != null ? batBuoc.hashCode() : 0);
        result = 31 * result + (dinhMuc != null ? dinhMuc.hashCode() : 0);
        return result;
    }
}
