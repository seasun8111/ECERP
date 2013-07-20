package com.trueland.ecerp.service;

import java.util.List;

import org.hibernate.criterion.Criterion;

/**
 * @author Vincent
 *
 */
public interface IFilter {
    /**
     * 把用户输入的搜索条件转成查询条件
     * @return 返回一个Criterion对象，其中包括了所有查询条件。
     */
    public List<Criterion> getCriterions();   

}
