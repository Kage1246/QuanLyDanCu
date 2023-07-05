/**
 * This class was created by Kage
 * This class was created at 04-Jul-23 23:33:39
 */
package edu.hust.quanlydancu.repositories;

import edu.hust.quanlydancu.entities.HoKhau;
import edu.hust.quanlydancu.entities.ThanhVienCuaHo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ThanhVienCuaHoRepository extends JpaRepository<ThanhVienCuaHo, Integer> {
    @Query("select count(t) from ThanhVienCuaHo t where t.hoKhauByIdHoKhau = ?1")
    int getNumberByHoKhau(HoKhau hoKhau);
}
