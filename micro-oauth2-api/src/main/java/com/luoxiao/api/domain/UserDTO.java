package com.luoxiao.api.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @description:
 * @author: luox
 * @date： 2021/7/22
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private List<String> roles;
}
