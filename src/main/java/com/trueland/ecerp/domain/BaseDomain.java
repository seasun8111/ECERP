package com.trueland.ecerp.domain;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.stereotype.Component;

/**
 * 
 *<br><b>类描述:</b>
 *<pre>所示PO的父类</pre>
 *@see
 *@since
 */

public class BaseDomain implements Serializable
{
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
