package com.dzj.demo.domain;

/**
*
*  @author author
*/
public class DzjBean {

    //生成代码开始 don't delete


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer Id;

    /**
    * 
    * isNullAble:1
    */
    private String dzjText;

    /**
    * 
    * isNullAble:1
    */
    private String dzjTitle;


    public void setId(Integer Id){
        this.Id = Id;
    }

    public Integer getId(){
        return this.Id;
    }

    public void setDzjText(String dzjText){
        this.dzjText = dzjText;
    }

    public String getDzjText(){
        return this.dzjText;
    }

    public void setDzjTitle(String dzjTitle){
        this.dzjTitle = dzjTitle;
    }

}
