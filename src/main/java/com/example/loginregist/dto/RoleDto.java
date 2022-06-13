package com.example.loginregist.dto;

import com.example.loginregist.model.ERole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {

    private Integer id;
    private ERole name;
}
