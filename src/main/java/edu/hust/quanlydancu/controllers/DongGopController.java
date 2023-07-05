/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 22:05:32
 */
package edu.hust.quanlydancu.controllers;

import edu.hust.quanlydancu.dtos.DongGopDTO;
import edu.hust.quanlydancu.services.DongGopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/dong-gop")
public class DongGopController {
    @Autowired
    DongGopService dongGopService;

    //http://localhost:8081/api/v1/dong-gop/all
    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.ok(dongGopService.getAll());
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/dong-gop?id=10
    @GetMapping("")
    public ResponseEntity<?> getById(@RequestParam String id) {
        try {
            return ResponseEntity.ok(dongGopService.getById(Integer.valueOf(id)));
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/dong-gop thêm body
    @PostMapping("")
    public ResponseEntity<?> createNew(@RequestBody DongGopDTO dto) {
        try {
            return ResponseEntity.ok(dongGopService.createNew(dto));
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/dong-gop?id=10 nhớ thêm body
    @PutMapping("")
    public ResponseEntity<?> updateById(@RequestBody DongGopDTO dto, @RequestParam String id) {
        try {
            dongGopService.updateById(dto, Integer.valueOf(id));
            return ResponseEntity.ok().build();
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/dong-gop
    @DeleteMapping("")
    public ResponseEntity<?> deleteById(@RequestParam String id) {
        try {
            dongGopService.deleteById(Integer.valueOf(id));
            return ResponseEntity.ok().build();
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/dong-gop/by-ho-khau?id=10
    @GetMapping("/by-ho-khau")
    ResponseEntity<?> getByHoKhau(@RequestParam Integer id) {
        try {
            return ResponseEntity.ok(dongGopService.getListByIdHoKhau(id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Get failed.");
        }
    }
    //http://localhost:8081/api/v1/dong-gop/by-khoan-phi?name=vệ sinh&from=2022-01-01&to=2024-01-01
    @GetMapping("/by-khoan-phi")
    public ResponseEntity<?> getByKhoanPhi(@RequestParam String name, @RequestParam String from, @RequestParam String to) {
        try {
            System.out.println(from);
            System.out.println(to);
            return ResponseEntity.ok(dongGopService.getByKhoanPhi(name, Date.valueOf(from), Date.valueOf(to)));
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/dong-gop/by-chu-ho?name=vệ sinh&from=2022-01-01&to=2024-01-01
    @GetMapping("/by-chu-ho")
    public ResponseEntity<?> getByChuHo(@RequestParam String name, @RequestParam String from, @RequestParam String to) {
        try {
            System.out.println(from);
            System.out.println(to);
            return ResponseEntity.ok(dongGopService.getByChuHo(name, Date.valueOf(from), Date.valueOf(to)));
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    //http://localhost:8081/api/v1/dong-gop/all
    @PutMapping("/all")
    public ResponseEntity<?> updateList(@RequestBody List<DongGopDTO> dtoList) {
        try {
            dongGopService.updateList(dtoList);
            return ResponseEntity.ok().build();
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
}
