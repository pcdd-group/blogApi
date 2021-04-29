package work.pcdd.blogApi.service;

import work.pcdd.blogApi.entity.LoginLog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 1907263405@qq.com
 * @since 2021-04-15
 */
public interface LoginLogService extends IService<LoginLog> {
    int deleteByDay(int day);
}
