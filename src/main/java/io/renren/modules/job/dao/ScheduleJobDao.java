package io.renren.modules.job.dao;

import io.renren.modules.sys.dao.BaseDao;
import io.renren.modules.job.entity.ScheduleJobEntity;

import java.util.Map;

/**
 * 定时任务
 * 
 * @author pan.he
 * @email 13257499906@163.com
 * @date 2016年12月1日 下午10:29:57
 */
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
