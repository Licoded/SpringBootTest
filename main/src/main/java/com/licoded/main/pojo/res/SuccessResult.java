package com.licoded.main.pojo.res;

import com.alibaba.fastjson.JSON;

public class SuccessResult {
    Result result;

    public SuccessResult(String message, Object data) {
        this.result = new Result(1, message, data);
    }
    public SuccessResult(Object data) {
        this.result = new Result(1, "OK！", data);
    }

    @Override
    public String toString() {
//        System.out.println(JSON.toJSONString(this.result.getData()));
        return JSON.toJSONString(this.result);
    }
}
