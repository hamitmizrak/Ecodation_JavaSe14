package com.ecodation.javase.ders008.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data //gettersetter+toString+hesahcode
@NoArgsConstructor//parametresiz constructur
@AllArgsConstructor//parametreli constructor
public class StudentLombok {

    //nesne değişkenleri
    private int studentId;
    private String studentName;
    private String studentSurname;
    private String studentMiddName;
    private String studentAddress;
    private String studentEmailAddress;
    private String studentHesCodes;

}
