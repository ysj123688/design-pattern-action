/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.chain.template;

/**
 * 
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月7日  v0.1</p><p>版本内容: 创建</p>
 */
public class ConcreteHandler3 extends Handler{

	@Override
	public void handleRequest(int param) {
		if(param < 90){            
        	System.out.println("ConcreteHandler3 处理请求");           
        }
        else{            
        	System.out.println("ConcreteHandler3 拒绝请求");
        }
	}

}
