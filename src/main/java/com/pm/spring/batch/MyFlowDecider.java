package com.pm.spring.batch;


import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;

public class MyFlowDecider implements JobExecutionDecider {

    private boolean checkCondition() {
        return false;
    }

    @Override
    public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution) {
        boolean flag = checkCondition();
        if(flag){
            return new FlowExecutionStatus("SUCCESS");
        }
        return new FlowExecutionStatus("FAILED");
    }
}
