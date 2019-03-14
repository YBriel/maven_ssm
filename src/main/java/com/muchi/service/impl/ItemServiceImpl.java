package com.muchi.service.impl;

import com.muchi.dao.ItemDao;
import com.muchi.domain.Items;
import com.muchi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yuzq
 * @date{$date}
 * @description
 */
@Service
@Transactional
public class ItemServiceImpl  implements ItemService{

    @Autowired
    private ItemDao itemDao;

    public Items findById(Integer id) {
        Items items = itemDao.findById(id);
        return items;
    }
}