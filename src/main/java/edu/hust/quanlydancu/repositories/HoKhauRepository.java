/**
 * This class was created by Kage
 * This class was created at 04-Jul-23 23:32:49
 */
package edu.hust.quanlydancu.repositories;

import edu.hust.quanlydancu.entities.HoKhau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface HoKhauRepository extends JpaRepository<HoKhau, Integer> {
    @Query("""
    select v.hoKhauByIdHoKhau from ThanhVienCuaHo v
    join ThamGia g on g.nhanKhauByIdNhanKhau = v.nhanKhauByIdNhanKhau
    where g.sinhHoatByIdSinhHoat.chuDe like concat('%', ?1, '%')
    and g.sinhHoatByIdSinhHoat.batDau between ?2 and ?3
    """)
    List<HoKhau> findBySinhHoat(String chuDe, Date from, Date to);
}
