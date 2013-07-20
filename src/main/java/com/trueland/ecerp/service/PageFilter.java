package com.trueland.ecerp.service;

import java.util.List;

import org.hibernate.criterion.Criterion;

/**
 * @author Vincent
 *
 */
public abstract class PageFilter implements IFilter{
    
    private int pageNumber = 1;
    private int pageSize = 4;
    
    private List<Criterion> criterions; 
    
    public int getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    /**
     * @param criterions the criterions to set
     */
    public void setCriterions(List<Criterion> criterions) {
        this.criterions = criterions;
    }
    /**
     * @return the criterions
     */
    public List<Criterion> getCriterions() {
        return criterions;
    }
    
    
}