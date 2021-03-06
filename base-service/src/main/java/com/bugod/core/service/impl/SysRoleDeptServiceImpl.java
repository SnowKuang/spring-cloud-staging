package com.bugod.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bugod.core.mapper.SysRoleDeptMapper;
import com.bugod.core.service.ISysRoleDeptService;
import com.bugod.entity.pojo.SysRoleDept;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和部门关联表 服务实现类
 * </p>
 *
 * @author 虫神
 * @since 2020-03-27
 */
@Service
public class SysRoleDeptServiceImpl extends ServiceImpl<SysRoleDeptMapper, SysRoleDept> implements ISysRoleDeptService {

}
