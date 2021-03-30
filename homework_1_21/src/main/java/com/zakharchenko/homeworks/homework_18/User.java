package com.zakharchenko.homeworks.homework_18;

import lombok.*;

@Data
@NoArgsConstructor
public class User {
    Long id;
    String name;
    String username;
    String email;
    Address address;
    String phone;
    String website;
    Company company;
}
