package com.garanti.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ogretmen
{
    private Integer ID;

    private String NAME;

    private boolean IS_GICIK;
}