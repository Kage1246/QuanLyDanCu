package edu.hust.quanlydancu.dtos;

import lombok.Data;

import java.util.Collection;

@Data
public class KhoanPhiDTO {
    private Integer id;
    private String ten;
    private java.sql.Date batDau;
    private java.sql.Date ketThuc;
    private Byte batBuoc;
    private Long dinhMuc;
    private Collection<DongGopDTO> dongGopsById;
}