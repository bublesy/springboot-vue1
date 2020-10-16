package com.jojo.modules.demo.test.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jojo.modules.demo.test.entity.JeecgOrderCustomer;
import com.jojo.modules.demo.test.entity.JeecgOrderMain;
import com.jojo.modules.demo.test.entity.JeecgOrderTicket;

/**
 * @Description: 订单
 */
public interface IJeecgOrderMainService extends IService<JeecgOrderMain> {

	/**
	 * 添加一对多
	 * 
	 */
	public void saveMain(JeecgOrderMain jeecgOrderMain, List<JeecgOrderCustomer> jeecgOrderCustomerList, List<JeecgOrderTicket> jeecgOrderTicketList) ;
	
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(JeecgOrderMain jeecgOrderMain, List<JeecgOrderCustomer> jeecgOrderCustomerList, List<JeecgOrderTicket> jeecgOrderTicketList);
	
	/**
	 * 删除一对多
	 * @param jformOrderMain
	 */
	public void delMain(String id);
	
	/**
	 * 批量删除一对多
	 * @param jformOrderMain
	 */
	public void delBatchMain(Collection<? extends Serializable> idList);
}
