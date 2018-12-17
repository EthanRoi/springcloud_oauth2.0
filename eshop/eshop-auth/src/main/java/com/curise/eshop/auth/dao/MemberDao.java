package com.curise.eshop.auth.dao;


import com.curise.eshop.common.entity.Member;

/**
 * 〈用户Dao〉
 *
 * @author Curise
 * @create 2018/12/13
 * @since 1.0.0
 */
public interface MemberDao {

    /**
     * 根据会员名查找会员
     * @param memberName 会员名
     * @return 会员
     */
    Member findByMemberName(String memberName);
}
