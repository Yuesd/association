package com.feng.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author rf
 * @since 2019-05-08
 */
public class ActivityType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 活动类型
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 活动类型
     */
    private String type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ActivityType{" +
        "id=" + id +
        ", type=" + type +
        "}";
    }
}
