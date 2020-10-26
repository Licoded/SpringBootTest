package com.licoded.tools.resModel;

import com.alibaba.fastjson.JSON;

class Result{
    private int errno;
    private String msg;
    private Object data;

    public int getCode() {
        return errno;
    }

    public void setCode(int errno) {
        this.errno = errno;
    }

    public String getmsg() {
        return msg;
    }

    public void setmsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result(int errno, String msg, Object data) {
        this.errno = errno;
        this.msg = msg;
        this.data = data;
    }
}

public class BaseModel {
    private Result result;

    BaseModel(int errno, String msg, Object data){
        result = new Result(errno, msg, data);
    }

    BaseModel(int errno, Object data){
        result = new Result(errno,"这个程序员很懒，什么也没写", data);
    }

    @Override
    public String toString() {
        return JSON.toJSONString(result);
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
