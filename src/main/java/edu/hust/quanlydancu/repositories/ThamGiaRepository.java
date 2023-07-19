/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 21:17:27
 */
package edu.hust.quanlydancu.repositories;

import edu.hust.quanlydancu.entities.ThongKe;
import edu.hust.quanlydancu.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ThamGiaRepository extends JpaRepository<ThamGia, Integer> {
    @Query("""
    select new edu.hust.quanlydancu.entities.ThongKe(v.hoKhauByIdHoKhau.chuHo.hoTen, g.sinhHoat.chuDe)
    from ThanhVienCuaHo v
    join ThamGia g on g.nhanKhau = v.nhanKhauByIdNhanKhau
    where g.sinhHoat.chuDe like concat('%', ?1, '%')
    and g.coMat = 1
    and g.sinhHoat.batDau between ?2 and ?3
    """)
    List<ThongKe> findBySinhHoat(String chuDe, Date from, Date to);

    @Query("""
    select new edu.hust.quanlydancu.entities.ThongKe(v.hoKhauByIdHoKhau.chuHo.hoTen, g.sinhHoat.chuDe)
    from ThanhVienCuaHo v
    join ThamGia g on g.nhanKhau = v.nhanKhauByIdNhanKhau
    where v.hoKhauByIdHoKhau.chuHo.hoTen like concat('%', ?1, '%')
    and g.sinhHoat.batDau between ?2 and ?3
    """)
    List<ThongKe> findByChuHo(String chuHo, Date from, Date to);

    @Query("select t from ThamGia t where t.sinhHoat.id = ?1")
    List<ThamGia> findAllByIdSinhHoat(Integer idSinhHoat);
}
