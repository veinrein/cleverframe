package org.cleverframe.sys.entity;

import org.cleverframe.core.persistence.entity.IdEntity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * 系统资源表
 * <p>
 * 作者：LiZW <br/>
 * 创建时间：2016-7-14 16:33 <br/>
 */
@Entity
@Table(name = "sys_resources")
@DynamicInsert
@DynamicUpdate
public class Resources extends IdEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 资源类型（1:Web页面URL地址, 2:后台请求URL地址, 3:Web页面UI资源）
     */
    public static final Character WEB_PAGE = '1';

    /**
     * 资源类型（1:Web页面URL地址, 2:后台请求URL地址, 3:Web页面UI资源）
     */
    public static final Character DATA_URL = '2';

    /**
     * 资源类型（1:Web页面URL地址, 2:后台请求URL地址, 3:Web页面UI资源）
     */
    public static final Character UI_ELEMENT = '3';

    /**
     * 需要授权才允许访问（1：需要；2：不需要）
     */
    public static final Character NEED = '1';

    /**
     * 需要授权才允许访问（1：需要；2：不需要）
     */
    public static final Character NO_NEED = '2';

    /**
     * 资源标题
     */
    private String title;

    /**
     * 资源URL地址
     */
    private String resourcesUrl;

    /**
     * 资源访问所需要的权限标识字符串
     */
    private String permission;

    /**
     * 资源类型（1:Web页面URL地址, 2:后台请求URL地址, 3:Web页面UI资源）
     */
    private Character resourcesType;

    /**
     * 需要授权才允许访问（1：需要；2：不需要）
     */
    private Character needAuthorization;

    /**
     * 资源说明
     */
    @Lob
    @Column(columnDefinition = "MediumText")
    private String description;

    /*--------------------------------------------------------------
     *          getter、setter
     * -------------------------------------------------------------*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResourcesUrl() {
        return resourcesUrl;
    }

    public void setResourcesUrl(String resourcesUrl) {
        this.resourcesUrl = resourcesUrl;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Character getResourcesType() {
        return resourcesType;
    }

    public void setResourcesType(Character resourcesType) {
        this.resourcesType = resourcesType;
    }

    public Character getNeedAuthorization() {
        return needAuthorization;
    }

    public void setNeedAuthorization(Character needAuthorization) {
        this.needAuthorization = needAuthorization;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
