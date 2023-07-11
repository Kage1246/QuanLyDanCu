/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 00:44:38
 */
package edu.hust.quanlydancu.controllers;

import edu.hust.quanlydancu.dtos.KhoanPhiDTO;
import edu.hust.quanlydancu.services.KhoanPhiService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/khoan-phi")
public class KhoanPhiController {
    @Autowired
    KhoanPhiService khoanPhiService;

    //http://localhost:8081/api/v1/khoan-phi/all
    @GetMapping("/all")
    ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.ok(khoanPhiService.getAll());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/khoan-phi?id=1
    @PutMapping("")
    ResponseEntity<?> updateById(@RequestBody KhoanPhiDTO dto, @RequestParam Integer id) {
        try {
            khoanPhiService.updateById(dto, id);
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/khoan-phi?id=1
    @DeleteMapping("")
    ResponseEntity<?> deleteById(@RequestParam Integer id) {
        try {
            khoanPhiService.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/khoan-phi thêm body là khoản phí, cái này tạo cả dữ liệu dóng góp
    @PostMapping("")
    ResponseEntity<?> createKhoanPhi(@RequestBody KhoanPhiDTO khoanPhiDTO) {
        try {
            khoanPhiService.createKhoanPhi(khoanPhiDTO);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/khoan-phi?id=10
    @GetMapping("")
    ResponseEntity<?> getByKhoanPhi(@RequestParam Integer id) {
        try {
            return ResponseEntity.ok(khoanPhiService.getListDongGopByKhoanPhi(id));
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
}
