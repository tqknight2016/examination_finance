package com.examination.finance.entity;

public class BaseDataVO {
    public static final Integer SUCCESS = 0;
    public static final Integer ERROR = -1;

    private Integer code;
    private String msg;
    private Object data;

    public BaseDataVO() {
        this.code = SUCCESS;
    }

    public BaseDataVO(Integer code) {
        this.code = code;
    }

    public BaseDataVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseDataVO{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
