package beansdemo;

import java.awt.Checkbox;
import java.util.concurrent.CountDownLatch;

public class Stage {
	
	private int count = 0;

	private Stage() {
	}

	private static class StageSingletonHolder {
		static Stage instance = new Stage();
	}

	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
	
	public void check() {
		count++;
		System.out.println("count = " + count);
	}
}
