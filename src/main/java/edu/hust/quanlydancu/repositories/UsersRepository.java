/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 21:18:04
 */
package edu.hust.quanlydancu.repositories;

import edu.hust.quanlydancu.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
}
