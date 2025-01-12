package com.feng.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
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
public class Activity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 活动id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 活动名称
     */
    private String activityName;
    /**
     * 活动地点
     */
    private String site;
    /**
     * 活动举行时间
     */
    private String holdTime;
    /**
     * 活动介绍
     */
    private String introduce;
    private Date applyTime;
    /**
     * 社团联是否批准
     */
    private Integer permission;
    private Integer activityTypeId;
    private Integer clubId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getHoldTime() {
        return holdTime;
    }

    public void setHoldTime(String holdTime) {
        this.holdTime = holdTime;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public Integer getActivityTypeId() {
        return activityTypeId;
    }

    public void setActivityTypeId(Integer activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    @Override
    public String toString() {
        return "Activity{" +
        "id=" + id +
        ", activityName=" + activityName +
        ", site=" + site +
        ", holdTime=" + holdTime +
        ", introduce=" + introduce +
        ", applyTime=" + applyTime +
        ", permission=" + permission +
        ", activityTypeId=" + activityTypeId +
        ", clubId=" + clubId +
        "}";
    }
}
