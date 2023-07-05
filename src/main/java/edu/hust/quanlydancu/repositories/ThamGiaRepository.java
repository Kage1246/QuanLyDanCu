/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 21:17:27
 */
package edu.hust.quanlydancu.repositories;

import edu.hust.quanlydancu.entities.ThamGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThamGiaRepository extends JpaRepository<ThamGia, Integer> {
}
