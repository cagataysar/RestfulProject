package com.garanti.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ders
{
    private Integer ID;

    // bu bir foreign key 'dir
    private Integer OGR_ID;

    // bu bir foreign key 'dir
    private Integer KONU_ID;

    @Override
    public String toString() {
        return "Ders{" +
                "ID=" + ID +
                ", OGR_ID=" + OGR_ID +
                ", KONU_ID=" + KONU_ID +
                '}';
    }
}
