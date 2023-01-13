package com.operatorTracker.service.impl;

import java.util.List;
import java.util.Map;

import com.operatorTracker.utils.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.operatorTracker.mapper.OtAppUserMapper;
import com.operatorTracker.domain.OtAppUser;
import com.operatorTracker.service.IOtAppUserService;

/**
 * appUserService
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Service
public class OtAppUserServiceImpl implements IOtAppUserService
{
    @Autowired
    private OtAppUserMapper otAppUserMapper;

    /**
     * Query appUser
     *
     * @param userNo appUserID
     * @return appUser
     */
    @Override
    public OtAppUser selectOtAppUserById(Long userNo)
    {
        return otAppUserMapper.selectOtAppUserById(userNo);
    }


    @Override
    public OtAppUser selectOtAppUserOne(OtAppUser otAppUser)
    {
        List<OtAppUser> list=otAppUserMapper.selectOtAppUserList(otAppUser);
        if(list!=null && list.size()>0){
            return list.get(0);
        }else {
            return null;
        }
    }
    /**
     * Query appUser list
     *
     * @param otAppUser appUser
     * @return appUser
     */
    @Override
    public List<OtAppUser> selectOtAppUserList(OtAppUser otAppUser)
    {
        return otAppUserMapper.selectOtAppUserList(otAppUser);
    }

    @Override
    public List<Map> selectOtAppUserOperatorList(OtAppUser otAppUser)
    {
        return otAppUserMapper.selectOtAppUserOperatorList(otAppUser);
    }

    /**
     * add appUser
     *
     * @param otAppUser appUser
     * @return
     */
    @Override
    public int insertOtAppUser(OtAppUser otAppUser)
    {
        return otAppUserMapper.insertOtAppUser(otAppUser);
    }

    /**
     * edit appUser
     *
     * @param otAppUser appUser
     * @return
     */
    @Override
    public int updateOtAppUser(OtAppUser otAppUser)
    {
        return otAppUserMapper.updateOtAppUser(otAppUser);
    }

    /**
     * delete appUser object
     *
     * @param ids need  delete ID
     * @return
     */
    @Override
    public int deleteOtAppUserByIds(String ids)
    {
        return otAppUserMapper.deleteOtAppUserByIds(Convert.toStrArray(ids));
    }

    /**
     * delete appUser
     *
     * @param userNo appUserID
     * @return
     */
    @Override
    public int deleteOtAppUserById(Long userNo)
    {
        return otAppUserMapper.deleteOtAppUserById(userNo);
    }
}
