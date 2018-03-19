package com.man.quartz;

import javax.annotation.Resource;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ComplexScheduledJob extends QuartzJobBean {

	@Resource
	private ComplexBean complexBean;

	public void setComplexBean(ComplexBean complexBean) {
		this.complexBean = complexBean;
	}

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		complexBean.printMessage();
		
	}

}
