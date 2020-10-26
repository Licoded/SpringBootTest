package com.licoded.tools.resModel;

public class ErrorModel extends BaseModel{
    private static final int errno = 1;
    public ErrorModel(String msg, Object data) {
        super(errno, msg, data);
    }
    public ErrorModel(Object data) {
        super(errno, data);
    }
}
