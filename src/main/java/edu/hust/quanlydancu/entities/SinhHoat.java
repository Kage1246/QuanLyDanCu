/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 02:43:08
 */
package edu.hust.quanlydancu.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Collection;

@Data
@Entity
@Table(name = "sinh_hoat", schema = "quan_ly_nhan_khau")
public class SinhHoat {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "chu_de", nullable = true, length = 50)
    private String chuDe;
    @Basic
    @Column(name = "bat_dau", nullable = true)
    private Timestamp batDau;
    @Basic
    @Column(name = "ket_thuc", nullable = true)
    private Timestamp ketThuc;
    @Basic
    @Column(name = "dia_diem", nullable = true, length = 50)
    private String diaDiem;
    @OneToMany(mappedBy = "sinhHoatByIdSinhHoat")
    private Collection<ThamGia> thamGiasById;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SinhHoat sinhHoat = (SinhHoat) o;

        if (id != sinhHoat.id) return false;
        if (chuDe != null ? !chuDe.equals(sinhHoat.chuDe) : sinhHoat.chuDe != null) return false;
        if (batDau != null ? !batDau.equals(sinhHoat.batDau) : sinhHoat.batDau != null) return false;
        if (ketThuc != null ? !ketThuc.equals(sinhHoat.ketThuc) : sinhHoat.ketThuc != null) return false;
        if (diaDiem != null ? !diaDiem.equals(sinhHoat.diaDiem) : sinhHoat.diaDiem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (chuDe != null ? chuDe.hashCode() : 0);
        result = 31 * result + (batDau != null ? batDau.hashCode() : 0);
        result = 31 * result + (ketThuc != null ? ketThuc.hashCode() : 0);
        result = 31 * result + (diaDiem != null ? diaDiem.hashCode() : 0);
        return result;
    }
}
