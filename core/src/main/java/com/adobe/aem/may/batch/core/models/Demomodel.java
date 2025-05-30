package com.adobe.aem.may.batch.core.models;

import org.apache.sling.api.resource.Resource;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Demomodel  implements Demo{
    
    @ValueMapValue
    private String articletitle;
    @ValueMapValue
    private String articledesc;
    @ValueMapValue
    private int articlenum;
    @Override
    public String getArticleTitle() {
        return articletitle;
    }
    @Override
    public String getArticleDesc() {
        return articledesc;
    }
    @Override
    public int getArticleNum() {
        return articlenum;
    }
    
   
}