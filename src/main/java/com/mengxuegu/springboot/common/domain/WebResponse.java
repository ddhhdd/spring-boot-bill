package com.mengxuegu.springboot.common.domain;

import com.mengxuegu.springboot.common.constant.SysConstant;
import lombok.Data;

/**
 * Created by ddhhdd on 2020/8/27 1:16.
 */
@Data
public class WebResponse<T> {
    private String code = SysConstant.SUCCESS;

    private T body;

    public WebResponse() {

    }

    public WebResponse(T body) {
        this.body = body;
    }
}
