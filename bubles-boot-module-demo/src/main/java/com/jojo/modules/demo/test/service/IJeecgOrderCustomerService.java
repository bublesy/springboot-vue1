package com.jojo.modules.demo.test.service;

import java.util.List;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jojo.modules.demo.test.entity.JeecgOrderCustomer;

/**
 * @Description: 订单客户
 */
public interface IJeecgOrderCustomerService extends IService<JeecgOrderCustomer> {
	
	public List<JeecgOrderCustomer> selectCustomersByMainId(String mainId);
}
