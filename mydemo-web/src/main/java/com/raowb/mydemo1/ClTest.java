package com.raowb.mydemo1;
/**
 * 策略模式测试类
 * @author wraow
 *
 */
public class ClTest {
    public static void main(String[] args) {
		Dogfq bigDog = new BigDog();
		bigDog.setPaolu(new KPaoluImpl());
		bigDog.eat();
		bigDog.paolu();
		
		Dogfq minDog = new MinDog();
		minDog.setPaolu(new MPaoluImpl());
		minDog.eat();
		minDog.paolu();
		
	}
}
