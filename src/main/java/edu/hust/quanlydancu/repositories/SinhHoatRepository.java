/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 21:16:48
 */
package edu.hust.quanlydancu.repositories;

import edu.hust.quanlydancu.entities.SinhHoat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Repository
public interface SinhHoatRepository extends JpaRepository<SinhHoat, Integer> {
}
