package com.lianggzone.designpattern.proxy.sample;

/**
 * <h3>概要:</h3><p>Client</p>
 * <h3>功能:</h3><p>客户类</p>
 * <h3>履历:</h3>
 * <li>2017年6月20日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public class Client {
	public static void main(String[] args) {
		Subject proxy = new Proxy();
		proxy.request();
	}
}
