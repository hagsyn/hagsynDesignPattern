package cn.hagsyn.pattern.factory;

import cn.hagsyn.pattern.factory.abstractfactory.DefaultAbstractFactory;
import cn.hagsyn.pattern.factory.abstractfactory.HagsynAbstractFactory;
import cn.hagsyn.pattern.factory.easyfactory.EasyFactory;
import cn.hagsyn.pattern.factory.entity.HagsynSample;
import cn.hagsyn.pattern.factory.entity.ISample;
import cn.hagsyn.pattern.factory.entity.IceSample;
import cn.hagsyn.pattern.factory.methodfatory.HagsynMethodFactory;
import cn.hagsyn.pattern.factory.methodfatory.IceMethodFactory;
import org.junit.jupiter.api.Test;

/**
 * @Description 普通模式
 * @Auther Hagsyn
 * @Date 2020/10/14 13:27
 */
public class FactoryTest {

    //这样每次获取都是new一个对应实例,这样的实例化是比较low的，
    //如果创建实例时所做的初始化工作不是像赋值这样简单的事，可能是很长一段代码，如果也写入构造函数中,代码就会比较臃肿了
    IceSample iceSample = new IceSample();
    HagsynSample hagsynSample = new HagsynSample();

    /**
     * 简单工厂测试
     */
    @Test
    public void testEasyFactory() {
        //获取Hagsyn实例
        ISample sample = EasyFactory.generateSimple(1);
        sample.say();
    }

    /**
     * 工厂方法测试
     * 缺点，每次需要获取一个实例，需要找不同的工厂来生产，增加了程序的复杂性
     */
    @Test
    public void testMethodFactory() {
        HagsynMethodFactory hagsynMethodFactory = new HagsynMethodFactory();
        hagsynMethodFactory.getSample().say();

        IceMethodFactory iceMethodFactory = new IceMethodFactory();
        iceMethodFactory.getSample().say();
    }

    /**
     * 抽象工厂测试
     * 可以根据自己的需求给工厂提
     */
    @Test
    public void testAbstractFactory() {
        DefaultAbstractFactory defaultAbstractFactory = new DefaultAbstractFactory();
        defaultAbstractFactory.getSample("I").say();

        HagsynAbstractFactory abstractFactory = new HagsynAbstractFactory();
        abstractFactory.getSample().say();
    }
}
