package com.garanti.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ders_Ogrenci
{
    private Integer ID;

    private Integer DERS_ID;

    private Integer OGRENCI_ID;

    private Integer NOTE;

    private Integer DEVAMSIZLIK;

    public Ders_Ogrenci (int id, int ders_id, int ogrenci_id) {
    }

    @Override
    public String toString() {
        return "Ders_Ogrenci{" +
                "ID=" + ID +
                ", DERS_ID=" + DERS_ID +
                ", OGRENCI_ID=" + OGRENCI_ID +
                ", NOTE=" + NOTE +
                ", DEVAMSIZLIK=" + DEVAMSIZLIK +
                '}';
    }
}
