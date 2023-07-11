/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 23:50:12
 */
package edu.hust.quanlydancu.controllers;

import edu.hust.quanlydancu.dtos.ThamGiaDTO;
import edu.hust.quanlydancu.services.ThamGiaService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping("/api/v1/tham-gia")
public class ThamGiaController {
    @Autowired
    ThamGiaService thamGiaService;
    //http://localhost:8081/api/v1/tham-gia/all
    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.ok(thamGiaService.getAll());
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/tham-gia?id=10
    @GetMapping("")
    public ResponseEntity<?> getById(@RequestParam String id) {
        try {
            return ResponseEntity.ok(thamGiaService.getById(Integer.valueOf(id)));
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/tham-gia thêm body
    @PostMapping("")
    public ResponseEntity<?> createNew(@RequestBody ThamGiaDTO dto) {
        try {
            return ResponseEntity.ok(thamGiaService.createNew(dto));
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/tham-gia?id=10 nhớ thêm body
    @PutMapping("")
    public ResponseEntity<?> updateById(@RequestBody ThamGiaDTO dto, @RequestParam String id) {
        try {
            thamGiaService.updateById(dto, Integer.valueOf(id));
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/tham-gia
    @DeleteMapping("")
    public ResponseEntity<?> deleteById(@RequestParam String id) {
        try {
            thamGiaService.deleteById(Integer.valueOf(id));
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/tham-gia/by-sinh-hoat?name=vệ sinh&from=2022-01-01&to=2024-01-01
    @GetMapping("/by-sinh-hoat")
    public ResponseEntity<?> getBySinhHoat(@RequestParam String name, @RequestParam String from, @RequestParam String to) {
        try {
            System.out.println(from);
            System.out.println(to);
            return ResponseEntity.ok(thamGiaService.getAllBySinhHoat(name, Date.valueOf(from), Date.valueOf(to)));
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/tham-gia/by-chu-ho?name=vệ sinh&from=2022-01-01&to=2024-01-01
    @GetMapping("/by-chu-ho")
    public ResponseEntity<?> getByChuHo(@RequestParam String name, @RequestParam String from, @RequestParam String to) {
        try {
            System.out.println(from);
            System.out.println(to);
            return ResponseEntity.ok(thamGiaService.getAllByChuHo(name, Date.valueOf(from), Date.valueOf(to)));
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
}
