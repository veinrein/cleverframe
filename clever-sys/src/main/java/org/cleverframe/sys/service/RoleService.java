package org.cleverframe.sys.service;

import org.cleverframe.common.persistence.Page;
import org.cleverframe.common.service.BaseService;
import org.cleverframe.sys.SysBeanNames;
import org.cleverframe.sys.dao.RoleDao;
import org.cleverframe.sys.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service，对应表sys_role(角色表)<br/>
 * <p>
 * 作者：LiZW <br/>
 * 创建时间：2016-08-24 22:36:05 <br/>
 */
@Service(SysBeanNames.RoleService)
public class RoleService extends BaseService {

    @Autowired
    @Qualifier(SysBeanNames.RoleDao)
    private RoleDao roleDao;

    /**
     * 分页查询角色数据
     *
     * @param name 角色名称 like匹配
     */
    public Page<Role> findByPage(Page<Role> page, String uuid, Long id, Character delFlag, String name) {
        return roleDao.findByPage(page, uuid, id, delFlag, name);
    }

    /**
     * 新增角色
     *
     * @param role 角色对象
     * @return 成功返回 true
     */
    @Transactional(readOnly = false)
    public boolean saveRole(Role role) {
        roleDao.getHibernateDao().save(role);
        return true;
    }

    /**
     * 更新角色
     *
     * @param role 角色对象
     * @return 成功返回 true
     */
    @Transactional(readOnly = false)
    public boolean updateRole(Role role) {
        roleDao.getHibernateDao().update(role, false, true);
        return true;
    }

    /**
     * 删除角色 (软删除)
     *
     * @param role 角色
     * @return 成功返回 true
     */
    @Transactional(readOnly = false)
    public boolean deleteRole(Role role) {
        roleDao.getHibernateDao().deleteForSoft(role);
        return true;
    }
}
