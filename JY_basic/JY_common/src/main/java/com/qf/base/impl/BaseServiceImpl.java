package com.qf.base.impl;

import com.qf.base.IBaseDao;
import com.qf.base.IBaseService;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    public abstract IBaseDao<T> getDao();

    public int deleteByPrimaryKey(Long cid) {
        return getDao().deleteByPrimaryKey(cid);
    }

    public int insert(T record) {
        return getDao().insert(record);
    }

    public int insertSelective(T record) {
        return getDao().insertSelective(record);
    }

    public T selectByPrimaryKey(Long cid) {
        return getDao().selectByPrimaryKey(cid);
    }

    public int updateByPrimaryKeySelective(T record) {
        return getDao().updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(T record) {
        return getDao().updateByPrimaryKey(record);
    }
}
