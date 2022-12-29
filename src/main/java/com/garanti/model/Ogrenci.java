package com.garanti.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ogrenci {
    private Integer ID;
    private String NAME;
    private int OGR_NUMBER;
    private Integer YEAR;

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", OGR_NUMBER=" + OGR_NUMBER +
                ", YEAR=" + YEAR +
                '}';
    }
}
