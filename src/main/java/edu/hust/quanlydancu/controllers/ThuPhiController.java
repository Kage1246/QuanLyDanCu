/**
 * This class was created by Kage
 * This class was created at 05-Jul-23 00:44:38
 */
package edu.hust.quanlydancu.controllers;

import edu.hust.quanlydancu.dtos.KhoanPhiDTO;
import edu.hust.quanlydancu.services.ThuPhiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/thu-phi")
public class ThuPhiController {
    @Autowired
    ThuPhiService thuPhiService;

    @PostMapping("")
    ResponseEntity<?> createKhoanPhi(@RequestBody KhoanPhiDTO khoanPhiDTO) {
        try {
            thuPhiService.createKhoanPhi(khoanPhiDTO);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Create failed.");
        }
    }

    @GetMapping("/khoan-phi")
    ResponseEntity<?> getByKhoanPhi(@RequestParam Integer id) {
        try {
            return ResponseEntity.ok(thuPhiService.getListDongGopByKhoanPhi(id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Get failed.");
        }
    }
    @GetMapping("/ho-khau")
    ResponseEntity<?> getByHoKhau(@RequestParam Integer id) {
        try {
            return ResponseEntity.ok(thuPhiService.getAllByHoKhau(id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Get failed.");
        }
    }
}
