package com.example.demo.data.login;


import com.example.demo.data.IServiceData;
import com.example.demo.data.user.UserInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginData implements IServiceData {

    private boolean success;

    private String msg;

    private String token;

    private UserInfo userInfo;
}
