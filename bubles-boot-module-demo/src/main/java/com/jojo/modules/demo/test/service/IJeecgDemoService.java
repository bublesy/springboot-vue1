package com.jojo.modules.demo.test.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jojo.common.system.base.service.JeecgService;
import com.jojo.modules.demo.test.entity.JeecgDemo;

/**
 * @Description: 测试demo
 */
public interface IJeecgDemoService extends JeecgService<JeecgDemo> {
	
	public void testTran();
	
	public JeecgDemo getByIdCacheable(String id);
	
	/**
	 * 查询列表数据 在service中获取数据权限sql信息
	 * @param pageSize
	 * @param pageNo
	 * @return
	 */
	IPage<JeecgDemo> queryListWithPermission(int pageSize, int pageNo);
}
