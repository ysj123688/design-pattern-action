package com.lianggzone.designpattern.observer.example.course;

/**
 * <h3>概要:</h3><p>Observer</p>
 * <h3>功能:</h3><p>观察者类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public interface Observer {
    void update(OperTypeEnum operTypeEnum);
}