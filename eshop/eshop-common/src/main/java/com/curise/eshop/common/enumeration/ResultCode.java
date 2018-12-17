package com.curise.eshop.common.enumeration;


/**
 * 〈响应状态码〉
 *
 * @author Curise
 * @create 2018/12/13
 * @since 1.0.0
 */
public enum ResultCode {

    //处理成功
    SUCCESS(200, "Successful"),

    //处理失败
    FAILED(500, "Failed"),

    //未登录
    NOT_LOGIN(401, "not login"),

    //未激活
    NOT_ACTIVED(402, "account not actived"),

    //访问拒绝
    ACCESS_DENIED(403, "Access denied"),

    //数据库错误
    DB_ERROR(503, "Error querying database"),

    //参数错误
    PARAM_PARAMETER_ERROR(501, "Parameter error"),

    //参数为空
    PARAM_PARAMETER_IS_NULL(502, "Parameter is null"),
    ;

    private int code;

    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public String getMessage(String message) {
        return String.format(this.message, message == null ? "" : message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
