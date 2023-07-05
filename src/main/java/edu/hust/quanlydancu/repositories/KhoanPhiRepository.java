/**
 * This class was created by Kage
 * This class was created at 04-Jul-23 23:14:14
 */
package edu.hust.quanlydancu.repositories;

import edu.hust.quanlydancu.entities.HoKhau;
import edu.hust.quanlydancu.entities.KhoanPhi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Timestamp;

@Repository
public interface KhoanPhiRepository extends JpaRepository<KhoanPhi, Integer> {
    @Query("""
        update KhoanPhi
        set ten = ?1, batDau = ?2, ketThuc = ?3,
        batBuoc = ?4, dinhMuc = ?5
        where id = ?6""")
    void setKhoanPhiById(String name, Date from, Date to, Byte compulsory, Long price, Integer id);
}
