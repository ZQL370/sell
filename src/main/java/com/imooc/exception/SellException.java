package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * 异常
 * 用来给前端返回消息提示，对作进行提示的
 * 在service层实现类方法中配合注解@transactionl,如果出现错误会进行回滚
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());//将Message的内容传到父类的构造方法中去

        this.code = resultEnum.getCode();
    }
}
