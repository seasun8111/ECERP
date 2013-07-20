package com.trueland.ecerp.vo;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.trueland.ecerp.domain.BaseDomain;
import com.trueland.ecerp.domain.Product;

/**
 * @author Vincent
 *所有VO的基类。用于和VIEW层交互。
 *不可以把Domain包的类直接返回给VIEW层。
 *也不可以把VO类用于业务操作。
 *
 *Domain类在返回给VIEW 层前必须要转成VO。
 *同样VO在传递给service处理前要转成Domain类。
 */
public class BaseVO implements IVO,Serializable{

    BaseDomain domainObject;
    
    public void convertFromDomain() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException{
        PropertyUtils.copyProperties(this, domainObject);
    }

    public BaseDomain getDomainObject() {
        return domainObject;
    }

    public void setDomainObject(BaseDomain domainObject) {
        this.domainObject = domainObject;
    }
    
    
}
