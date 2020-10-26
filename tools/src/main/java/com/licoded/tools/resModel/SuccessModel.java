package com.licoded.tools.resModel;

public class SuccessModel extends BaseModel{
    private static final int errno = 0;
    public SuccessModel(String msg, Object data) {
        super(errno, msg, data);
    }
    public SuccessModel(Object data) {
        super(errno, data);
    }
}
