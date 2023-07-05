/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 21:16:48
 */
package edu.hust.quanlydancu.repositories;

import edu.hust.quanlydancu.entities.SinhHoat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface SinhHoatRepository extends JpaRepository<SinhHoat, Integer> {
    @Query("""
        update SinhHoat
        set chuDe = ?1, batDau = ?2, ketThuc = ?3,
        diaDiem = ?4
        where id = ?5""")
    void setSinhHoatById(String chuDe, Timestamp from, Timestamp to, String diaDiem, Integer id);
}
