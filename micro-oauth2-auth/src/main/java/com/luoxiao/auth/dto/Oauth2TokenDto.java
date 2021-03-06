package com.luoxiao.auth.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description:
 * @author: luox
 * @date： 2021/7/20
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class Oauth2TokenDto {

    /**
     * 访问令牌
     */
    private String token;
    /**
     * 刷新令牌
     */
    private String refreshToken;
    /**
     * 访问令牌头前缀
     */
    private String tokenHead;
    /**
     * 有效时间（秒）
     */
    private int expiresIn;

}
