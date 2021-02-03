package com.douyuehan.doubao.model.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


@Data
public class RegisterDTO {

    @NotEmpty(message = "请输入账号")
    @Length(min = 2, max = 15, message = "长度在2-15")
    private String name;

    @NotEmpty(message = "请输入密码")
    @Length(min = 6, max = 20, message = "长度在6-20")
    private String pass;

    @NotEmpty(message = "请再次输入密码")
    @Length(min = 6, max = 20, message = "长度在6-20")
    private String checkPass;

    @NotEmpty(message = "请输入电子邮箱")
    @Email(message = "邮箱格式不正确")
    private String email;
}
