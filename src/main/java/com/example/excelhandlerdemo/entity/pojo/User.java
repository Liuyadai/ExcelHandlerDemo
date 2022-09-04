package com.example.excelhandlerdemo.entity.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("user")
public class User {

    /**
     * 用户id
     */
    private String id;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户权限：1 管理员，2 普通用户
     */
    private Integer grade;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

}
