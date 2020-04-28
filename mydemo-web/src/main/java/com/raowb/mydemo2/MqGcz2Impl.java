package com.raowb.mydemo2;
/**
 * 观察者实现2
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
