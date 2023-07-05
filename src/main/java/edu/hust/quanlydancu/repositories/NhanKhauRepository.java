/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 21:16:07
 */
package edu.hust.quanlydancu.repositories;

import edu.hust.quanlydancu.entities.NhanKhau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanKhauRepository extends JpaRepository<NhanKhau, Integer> {
}
