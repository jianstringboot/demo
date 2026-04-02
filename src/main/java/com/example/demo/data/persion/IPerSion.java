package com.example.demo.data.persion;

import com.example.demo.data.IServiceData;

public interface IPerSion extends IServiceData {


    /**
     * 名字
     */
    String getName();

    /**
     * 年龄
     *
     */
    String getAge();

    /**
     * 设置描述
     * @param desc
     */
    void setDesc(String desc);
}
