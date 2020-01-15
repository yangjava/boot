package com.boot.core.quartz.CustomQuartz;

import com.boot.entity.SysUser;
import com.boot.service.SysUserService;
import com.boot.service.impl.SysUserServiceImpl;
import com.boot.util.SpringUtil;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author zhuxiaomeng
 * @date 2018/1/7.
 * @email 154040976@qq.com
 *
 * 定时测试类
 */
public class JobDemo4 implements Job{


  @Override
  public void execute(JobExecutionContext context) throws JobExecutionException {
    System.out.println("JobDemo4：启动任务=======================");
    run();
    System.out.println("JobDemo4：下次执行时间====="+
        new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
            .format(context.getNextFireTime())+"==============");
  }

  public void run(){
    ApplicationContext applicationContext=SpringUtil.getApplicationContext();
    SysUserService sys=SpringUtil.getBean(SysUserServiceImpl.class);
    List<SysUser> userList=sys.selectListByPage(new SysUser());
    System.out.println(userList.get(0).getUsername());;
    System.out.println("JobDemo4：执行完毕=======================");

  }
}
