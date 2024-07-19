package com.hengtiansoft.myblog.common;

import com.hengtiansoft.myblog.constant.ResultEnum;
import lombok.Data;

/**
 * @Author: Logan
 * @CreateTime: 2024/7/17 22:54
 * @Description: 统一封装返回结果
 */
@Data
public class Response<T> {
    // 操作代码
    private Integer code;

    // 提示信息
    private String message;

    // 结果数据
    private T data;

    public Response(ResultEnum resultCode) {
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public Response(ResultEnum resultCode, T data) {
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.data = data;
    }

    public Response(String message) {
        this.message = message;
    }

    //成功返回封装-无数据
    public static Response<String> success() {
        return new Response<String>(ResultEnum.SUCCESS);
    }

    //成功返回封装-带数据
    public static <T> Response<T> success(T data) {
        return new Response<T>(ResultEnum.SUCCESS, data);
    }

    //失败返回封装-使用默认提示信息
    public static Response<String> error() {
        return new Response<String>(ResultEnum.FAIL);
    }

    //失败返回封装-使用返回结果枚举提示信息
    public static Response<String> error(ResultEnum resultCode) {
        return new Response<String>(resultCode);
    }

    //失败返回封装-使用自定义提示信息
    public static Response<String> error(String message) {
        return new Response<String>(message);
    }
}