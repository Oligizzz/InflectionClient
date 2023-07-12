
package com.leetib.inflectionclient.rest.dto.common;


public class BizException extends RuntimeException{
    private static final long serialVersionUID = -3843907364558373817L;
    protected String message;
    protected String code;

    public BizException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public BizException(BaseResultCode ex) {
        super(ex.getMsg());
        this.code = ex.getCode();
        this.message = ex.getMsg();
    }

    public static BizException warn(BaseResultCode ex) {
        return new BizException(ex);
    }

    public static BizException warn(String code, String message) {
        return new BizException(code, message);
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public String toString() {
        return "BizException [message=" + this.message + ", code=" + this.code + "]";
    }
}
