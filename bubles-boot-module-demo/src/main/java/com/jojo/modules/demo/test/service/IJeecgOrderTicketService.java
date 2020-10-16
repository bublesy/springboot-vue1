package com.jojo.modules.demo.test.service;

import java.util.List;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jojo.modules.demo.test.entity.JeecgOrderTicket;

/**
 * @Description: 订单机票
 */
public interface IJeecgOrderTicketService extends IService<JeecgOrderTicket> {
	
	public List<JeecgOrderTicket> selectTicketsByMainId(String mainId);
}
