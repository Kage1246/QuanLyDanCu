package edu.hust.quanlydancu.dtos;

import lombok.Data;

import java.util.Collection;

@Data
public class SinhHoatDTO {
    private Integer id;
    private String chuDe;
    private java.sql.Timestamp batDau;
    private java.sql.Timestamp ketThuc;
    private String diaDiem;
    private Collection<ThamGiaDTO> thamGiasById;
}