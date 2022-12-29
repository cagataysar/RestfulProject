package com.garanti.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Konu
{
    private Integer ID;

    // aman dikkat repoda boş gelmesin
    private String NAME;

    @Override
    public String toString() {
        return "Konu{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                '}';
    }
}
