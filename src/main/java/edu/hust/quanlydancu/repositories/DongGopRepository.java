/**
 * This class was created by Kage
 * This class was created at 04-Jul-23 23:32:00
 */
package edu.hust.quanlydancu.repositories;

import edu.hust.quanlydancu.entities.DongGop;
import edu.hust.quanlydancu.entities.HoKhau;
import edu.hust.quanlydancu.entities.KhoanPhi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface DongGopRepository extends JpaRepository<DongGop, Integer> {
    @Query("select d from DongGop d where d.hoKhauByIdHoKhau = ?1")
    List<DongGop> findAllByHoKhauByIdHoKhau(Optional<HoKhau> hoKhau);

    @Query("""
        update DongGop
        set soTien = ?1, daDong = ?2, ngayDong = ?3,
        khoanPhiByIdKhoanPhi = ?4,
        hoKhauByIdHoKhau = ?5
        where id = ?6""")
    void setDongGopById(Long soTien, Byte daDong, Date ngayDong, KhoanPhi khoanPhi, HoKhau hoKhau, Integer id);

    @Query("""
            select d from DongGop d
            where d.khoanPhiByIdKhoanPhi.ten like concat('%', ?1, '%') and d.ngayDong between ?2 and ?3""")
    List<DongGop> findByKhoanPhiByIdKhoanPhiContainsAndNgayDongBetween(String khoanPhi, Date from, Date to);
}
