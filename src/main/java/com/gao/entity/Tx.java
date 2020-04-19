package com.gao.entity;

import java.io.Serializable;

/**
 * (Tx)实体类
 *
 * @author makejava
 * @since 2020-04-15 13:04:31
 */
public class Tx implements Serializable {
    private static final long serialVersionUID = 793145712246733171L;
    
    private Integer num;
    
    private Integer id;


    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}