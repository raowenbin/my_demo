package com.raowb.mydemo2;
/**
 * �۲���ʵ��2
 * @author wraow
 *
 */
public class MqGcz2Impl implements MqGcz{

	public void start(Object data) {
	    System.out.println(this.getClass().getName()+":start>>>>>>");
	}
	public void stop(Object data) {
	    System.out.println(this.getClass().getName()+":stop<<<<<<<<<");
	}
	
	

}
