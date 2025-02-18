package com.example.jpetstore_manage.Service.impl;

import com.example.jpetstore_manage.Mapper.OrderMapper;
import com.example.jpetstore_manage.POJO.DataObject.OrderItemDO;
import com.example.jpetstore_manage.POJO.ViewObject.Message;
import com.example.jpetstore_manage.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Raymond Li
 * @create 2023-03-20 16:34
 * @description
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<OrderItemDO> getOrderItemList(String supplier) {
        return null;
    }

    @Override
    public Message ship(int orderItemId, String supplier) {
        return null;
    }
}
