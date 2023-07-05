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

@RestController
@RequestMapping("/api/v1/dong-gop")
public class DongGopController {
    @Autowired
    DongGopService dongGopService;

//    @GetMapping("")
//    public ResponseEntity<?> getAll() {
//        try {
//            return ResponseEntity.ok(dongGopService.getAll());
//        }catch (Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.badRequest().body("Bad request");
//        }
//    }
    @GetMapping("")
    public ResponseEntity<?> getById(@RequestParam String id) {
        try {
            return ResponseEntity.ok(dongGopService.getById(Integer.valueOf(id)));
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
    @PostMapping("")
    public ResponseEntity<?> createNew(@RequestBody DongGopDTO dto) {
        try {
            return ResponseEntity.ok(dongGopService.createNew(dto));
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Bad request");
        }
    }
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
}
