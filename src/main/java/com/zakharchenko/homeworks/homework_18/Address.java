package com.zakharchenko.homeworks.homework_18;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@NoArgsConstructor
public class Address {
    String street;
    String suite;
    String city;
    String zipcode;
    Geo geo;
}
