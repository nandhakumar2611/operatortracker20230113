package com.operatorTracker.service;

import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.OtAppUser;

/**
 * appUserService
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
public interface IOtAppUserService
{
    /**
     * Query appUser
     *
     * @param userNo appUserID
     * @return appUser
     */
    public OtAppUser selectOtAppUserById(Long userNo);

    public OtAppUser selectOtAppUserOne(OtAppUser otAppUser);
    /**
     * Query appUser list
     *
     * @param otAppUser appUser
     * @return appUser集合
     */
    public List<OtAppUser> selectOtAppUserList(OtAppUser otAppUser);

    public List<Map> selectOtAppUserOperatorList(OtAppUser otAppUser);
    /**
     * add appUser
     *
     * @param otAppUser appUser
     * @return
     */
    public int insertOtAppUser(OtAppUser otAppUser);

    /**
     * edit appUser
     *
     * @param otAppUser appUser
     * @return
     */
    public int updateOtAppUser(OtAppUser otAppUser);

    /**
     * 批量delete appUser
     *
     * @param ids need  delete ID
     * @return
     */
    public int deleteOtAppUserByIds(String ids);

    /**
     * delete appUser
     *
     * @param userNo appUserID
     * @return
     */
    public int deleteOtAppUserById(Long userNo);
}
