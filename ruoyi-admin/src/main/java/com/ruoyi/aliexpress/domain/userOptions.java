package com.ruoyi.aliexpress.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

public class userOptions extends BaseEntity {

    private static final long serialVersionUID = 1L;
    private int userId;
    private String nickName;

    public userOptions(int userId, String nickName) {
        this.userId = userId;
        this.nickName = nickName;
    }

    public userOptions() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setUserName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "userOptions{" +
                "userId=" + userId +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
