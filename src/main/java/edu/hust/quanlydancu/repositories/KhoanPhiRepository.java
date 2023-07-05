/**
 * This class was created by Kage
 * This class was created at 04-Jul-23 23:14:14
 */
package edu.hust.quanlydancu.repositories;

import edu.hust.quanlydancu.entities.KhoanPhi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhoanPhiRepository extends JpaRepository<KhoanPhi, Integer> {
}
