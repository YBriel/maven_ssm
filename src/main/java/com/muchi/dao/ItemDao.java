package com.muchi.dao;

import com.muchi.domain.Items;

/**
 * Created by EDZ on 2019/3/14.
 */
public interface ItemDao {

    public Items findById(Integer id);
}
