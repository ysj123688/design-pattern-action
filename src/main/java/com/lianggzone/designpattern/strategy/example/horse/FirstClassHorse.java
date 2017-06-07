package com.lianggzone.designpattern.strategy.example.horse;

/**
 * <h3>概要:</h3><p>FirstClassHorse</p>
 * <h3>功能:</h3><p>上等马的策略</p>
 * <h3>履历:</h3>
 * <li>2017年1月19日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public class FirstClassHorse extends Strategy {
	@Override
	public void run() {
		System.out.println("上等马 跑!!!");
	}
}
