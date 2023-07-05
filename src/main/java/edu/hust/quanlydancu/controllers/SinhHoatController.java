/**
 * This class was created by Kage
 * This class was created at 06-Jul-23 02:26:03
 */
package edu.hust.quanlydancu.controllers;

import edu.hust.quanlydancu.dtos.SinhHoatDTO;
import edu.hust.quanlydancu.services.SinhHoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sinh-hoat")
public class SinhHoatController {
    @Autowired
    SinhHoatService sinhHoatService;

    //http://localhost:8081/api/v1/sinh-hoat/all
    @GetMapping("/all")
    ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.ok(sinhHoatService.getAll());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/sinh-hoat?id=1
    @GetMapping("")
    ResponseEntity<?> getById(@RequestParam Integer id) {
        try {
            return ResponseEntity.ok(sinhHoatService.getById(id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/sinh-hoat?id=1
    @PutMapping("")
    ResponseEntity<?> updateById(@RequestBody SinhHoatDTO dto, @RequestParam Integer id) {
        try {
            sinhHoatService.updateById(dto, id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/sinh-hoat?id=1
    @DeleteMapping("")
    ResponseEntity<?> deleteById(@RequestParam Integer id) {
        try {
            sinhHoatService.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/sinh-hoat thêm body là khoản phí, cái này tạo cả dữ liệu dóng góp
    @PostMapping("")
    ResponseEntity<?> createKhoanPhi(@RequestBody SinhHoatDTO dto) {
        try {
            sinhHoatService.createNew(dto);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
}
