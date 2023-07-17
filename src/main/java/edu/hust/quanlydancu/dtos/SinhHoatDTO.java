package edu.hust.quanlydancu.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Collection;

@Data
public class SinhHoatDTO {
    private Integer id;
    private String chuDe;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private java.sql.Timestamp batDau;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private java.sql.Timestamp ketThuc;
    private String diaDiem;
    private Collection<ThamGiaDTO> thamGiasById;
}