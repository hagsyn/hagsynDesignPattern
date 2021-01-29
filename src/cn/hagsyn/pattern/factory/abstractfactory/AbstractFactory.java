package cn.hagsyn.pattern.factory.abstractfactory;

import cn.hagsyn.pattern.factory.entity.ISample;

/**
 * @Description 抽象工厂
 * @Auther Hagsyn
 * @Date 2020/10/14 13:44
 */
public abstract class AbstractFactory {

    protected abstract ISample getSample();

    /**
     * 这个方法是可以动态获取，一种委派模式
     * @param name
     * @return
     */
    public ISample getSample(String name) {
        if ("H".equals(name)) {
            return new HagsynAbstractFactory().getSample();
        } else if ("I".equals(name)) {
            return new IceAbstractFactory().getSample();
        }
        return null;
    }

}