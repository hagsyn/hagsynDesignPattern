package cn.hagsyn.pattern.factory.abstractfactory;

import cn.hagsyn.pattern.factory.entity.ISample;

/**
 * @Description 默认抽象工厂类
 * @Auther Hagsyn
 * @Date 2020/10/14 14:15
 */
public class DefaultAbstractFactory extends AbstractFactory{

    private AbstractFactory defaultFactory = new HagsynAbstractFactory();

    @Override
    public ISample getSample() {
        return defaultFactory.getSample();
    }
}
