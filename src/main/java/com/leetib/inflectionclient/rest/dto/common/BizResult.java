
package com.leetib.inflectionclient.rest.dto.common;

import java.io.Serializable;

/**
 *
 * @param <T>
 */
public class BizResult<T> implements Serializable {
    private static final long serialVersionUID = 4661096805690919752L;
    public static final String DEF_ERROR_MESSAGE = "系统繁忙，请稍候再试";
    private static final int SUCCESS_CODE = 0;
    private static final int FAIL_CODE = -1;
    private T data;
    private int code;
    private String bizCode;
    private String msg;

    public boolean getSuccess() {
        return this.code == 0;
    }

    public BizResult() {
        this.code = 0;
    }

    public BizResult(T data) {
        this.code = 0;
        this.data = data;
    }

    public BizResult(int code, String bizCode, String msg) {
        this.code = code;
        this.bizCode = bizCode;
        this.msg = msg;
    }

    public BizResult(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public BizResult(int code, T data, String bizCode, String msg) {
        this.code = code;
        this.data = data;
        this.bizCode = bizCode;
        this.msg = msg;
    }

    public static BizResult success() {
        return new BizResult();
    }

    public static <E> BizResult<E> success(E data) {
        return new BizResult(data);
    }

    public static <E> BizResult<E> success(E data, String msg) {
        return new BizResult(0, data, msg);
    }

    public static <E> BizResult<E> success(E data, String bizCode, String msg) {
        return new BizResult(0, data, bizCode, msg);
    }

    public static <E> BizResult<E> result(int code, E data, String bizCode, String msg) {
        return new BizResult(code, data, bizCode, msg);
    }

    public static <E> BizResult<E> fail(String bizCode, String msg) {
        return new BizResult(-1, bizCode, msg);
    }

    public static <E> BizResult<E> fail(BaseResultCode exceptionCode) {
        return new BizResult(-1, exceptionCode.getCode(), exceptionCode.getMsg());
    }

    public static <E> BizResult<E> fail(BizException bizException) {
        return new BizResult(-1, bizException.getCode(), bizException.getMessage());
    }

    public String getMsg() {
        return this.msg;
    }

    public BizResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return this.data;
    }

    public BizResult<T> setData(T data) {
        this.data = data;
        return this;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public BizResult<T> setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }

    public int getCode() {
        return this.code;
    }

    public BizResult<T> setCode(int code) {
        this.code = code;
        return this;
    }
}
