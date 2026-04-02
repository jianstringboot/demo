package com.example.demo.data.multi;

import com.example.demo.data.IServiceData;
import com.example.demo.data.user.UserInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MultiFormData implements IServiceData {

    private String desc;

    private UserInfo userInfo;
}
