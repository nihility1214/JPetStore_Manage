package com.example.jpetstore_manage.POJO.DataObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Raymond Li
 * @create 2023-03-20 22:33
 * @description 对应数据库的user_main表，通过MapStruct插件转换封装后，传给前端
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserMainDO {
    private String userId;
    private String password;
}
