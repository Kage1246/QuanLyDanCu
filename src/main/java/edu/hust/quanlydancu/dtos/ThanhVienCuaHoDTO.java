package edu.hust.quanlydancu.dtos;

import lombok.Data;

@Data
public class ThanhVienCuaHoDTO {
    private Integer id;
    private Integer idHoKhau;
    private Integer idNhanKhau;
    private String quanHeVoiChuHo;
}
