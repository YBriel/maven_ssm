package com.muchi.dao;

import com.muchi.domain.Items;
import org.apache.ibatis.annotations.Select;

/**
 * Created by yuzq on 2019/3/14.
 */
public interface ItemDao {

    @Select("select * from items where id=#{id}")
    public Items findById(Integer id);
}
