package cn.ljh.controller.po;

public class Userlog {
    private Integer userlogId;

    private String userlogLog;

    public Integer getUserlogId() {
        return userlogId;
    }

    public void setUserlogId(Integer userlogId) {
        this.userlogId = userlogId;
    }

    public String getUserlogLog() {
        return userlogLog;
    }

    public void setUserlogLog(String userlogLog) {
        this.userlogLog = userlogLog == null ? null : userlogLog.trim();
    }
}