package com.icss.oa.job.pojo;

public class Job {
	private Integer jobId;
	private String jobName;
	private Integer jobMinSal;
	private Integer jobMaxSal;
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public Integer getJobMinSal() {
		return jobMinSal;
	}
	public void setJobMinSal(Integer jobMinSal) {
		this.jobMinSal = jobMinSal;
	}
	public Integer getJobMaxSal() {
		return jobMaxSal;
	}
	public void setJobMaxSal(Integer jobMaxSal) {
		this.jobMaxSal = jobMaxSal;
	}
	public Job() {
		super();
	}
	public Job(String jobName, Integer jobMinSal, Integer jobMaxSal) {
		super();
		this.jobName = jobName;
		this.jobMinSal = jobMinSal;
		this.jobMaxSal = jobMaxSal;
	}
	public Job(Integer jobId, String jobName, Integer jobMinSal, Integer jobMaxSal) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.jobMinSal = jobMinSal;
		this.jobMaxSal = jobMaxSal;
	}
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobName=" + jobName + ", jobMinSal=" + jobMinSal + ", jobMaxSal=" + jobMaxSal
				+ "]";
	}


}
