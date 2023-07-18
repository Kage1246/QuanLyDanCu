/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 21:17:27
 */
package edu.hust.quanlydancu.repositories;

import edu.hust.quanlydancu.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ThamGiaRepository extends JpaRepository<ThamGia, Integer> {
//    @Query("""
//        update ThamGia
//        set nhanKhauByIdNhanKhau = ?1, sinhHoatByIdSinhHoat = ?2
//        where id = ?3""")
//    void setDongGopById(NhanKhau nhanKhau, SinhHoat sinhHoat, Integer id);

    @Query("""
    select t from ThamGia t
    where t.sinhHoatByIdSinhHoat.chuDe like concat('%', ?1, '%')
    and t.sinhHoatByIdSinhHoat.batDau between ?2 and ?3
    """)
    List<ThamGia> findBySinhHoatByIdSinhHoatContains(String chuDe, Date from, Date to);

    @Query("""
    select t from ThamGia t
    join ThanhVienCuaHo v
    on t.nhanKhauByIdNhanKhau.id = v.nhanKhauByIdNhanKhau.id
    where v.hoKhauByIdHoKhau.chuHo.hoTen like concat('%', ?1, '%')
    and t.sinhHoatByIdSinhHoat.batDau between ?2 and ?3
    """)
    List<ThamGia> findByChuHoContains(String chuHo, Date from, Date to);

    @Query("select t from ThamGia t where t.sinhHoatByIdSinhHoat.id = ?1")
    List<ThamGia> findAllByIdSinhHoat(Integer idSinhHoat);
}
