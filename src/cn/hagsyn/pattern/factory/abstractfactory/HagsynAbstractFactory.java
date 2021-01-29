package cn.hagsyn.pattern.factory.abstractfactory;

import cn.hagsyn.pattern.factory.entity.HagsynSample;
import cn.hagsyn.pattern.factory.entity.ISample;

/**
 * @Description
 * @Auther Hagsyn
 * @Date 2020/10/14 14:09
 */
public class HagsynAbstractFactory extends AbstractFactory{
    @Override
    public ISample getSample() {
        return new HagsynSample();
    }
}
