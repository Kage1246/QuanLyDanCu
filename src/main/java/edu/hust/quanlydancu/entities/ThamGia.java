/**
 * This class was created by Kage
 * This class was created at 18-Jul-23 21:55:21
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
    private SinhHoat sinhHoat;
    @ManyToOne
    @JoinColumn(name = "id_nhan_khau", referencedColumnName = "id", nullable = false)
    private NhanKhau nhanKhau;
    @Basic
    @Column(name = "co_mat", nullable = true)
    private Byte coMat;
}
