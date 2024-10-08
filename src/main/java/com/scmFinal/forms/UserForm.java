package com.scmFinal.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class UserForm {
    
    // jo fields hmne form k andar banaayi h, vo sb yha dege
    // field name same as that of entity
    private String name;
    private String email;
    private String password;
    private String about;
    private String phoneNumber;
}
