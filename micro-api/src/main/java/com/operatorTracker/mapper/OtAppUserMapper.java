package com.operatorTracker.mapper;

import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.OtAppUser;
import org.springframework.stereotype.Component;

/**
 * appUserMapper
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Component
public interface OtAppUserMapper
{
    /**
     * Query appUser
     *
     * @param userNo appUserID
     * @return appUser
     */
    public OtAppUser selectOtAppUserById(Long userNo);

    /**
     * Query appUser list
     *
     * @param otAppUser appUser
     * @return appUser list
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
     * delete appUser
     *
     * @param userNo appUserID
     * @return
     */
    public int deleteOtAppUserById(Long userNo);

    /**
     * more delete appUser
     *
     * @param userNos need  delete ID
     * @return
     */
    public int deleteOtAppUserByIds(String[] userNos);
}
