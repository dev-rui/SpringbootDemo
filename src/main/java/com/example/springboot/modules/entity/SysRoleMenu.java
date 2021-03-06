package com.example.springboot.modules.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * 角色与权限关系表(SysRoleMenu)表实体类
 *
 * @author hrh
 * @since 2020-05-15 14:44:22
 */
@Data
public class SysRoleMenu extends Model<SysRoleMenu> {
    //ID
    @TableId(type = IdType.AUTO)
    private Long id;
    //角色ID
    private Long roleId;
    //权限ID
    private Long menuId;



}