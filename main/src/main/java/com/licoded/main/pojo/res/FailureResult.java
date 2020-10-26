package com.licoded.main.pojo.res;

import com.alibaba.fastjson.JSON;

public class FailureResult {
    Result result;

    public FailureResult(String message, Object data) {
        this.result = new Result(-1, message, data);
    }
    public FailureResult(Object data) {
        this.result = new Result(1, "未知错误！", data);
    }

    @Override
    public String toString() {
        return JSON.toJSONString(result);
    }
}
