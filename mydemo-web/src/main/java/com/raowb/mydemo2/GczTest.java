package com.raowb.mydemo2;
/**
 * �۲���ģʽ������
 * @author wraow
 *
 */
public class GczTest {
     public static void main(String[] args) {
    	 MqZt zt = new MqZt();
    	 zt.zc(new MqGcz1Impl());
    	 zt.zc(new MqGcz2Impl());
    	 zt.start();
    	 zt.stop();
	}
}
