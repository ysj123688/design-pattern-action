package com.lianggzone.designpattern.decorator.action.finery;

/**
 * 装饰者子类（裤子）
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class Pants extends Finery {

    private static final String name = "裤子";
    
    public Pants(Person person) {
        super(person);
        System.out.println(name);
    }
}
