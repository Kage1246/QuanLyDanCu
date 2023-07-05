/**
 * This class was created by Kage
 * This class was created at 04-Jul-23 23:32:49
 */
package edu.hust.quanlydancu.repositories;

import edu.hust.quanlydancu.entities.HoKhau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoKhauRepository extends JpaRepository<HoKhau, Integer> {
}
