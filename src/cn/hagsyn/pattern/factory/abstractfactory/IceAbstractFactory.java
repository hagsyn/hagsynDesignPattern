package cn.hagsyn.pattern.factory.abstractfactory;

import cn.hagsyn.pattern.factory.entity.ISample;
import cn.hagsyn.pattern.factory.entity.IceSample;

/**
 * @Description
 * @Auther Hagsyn
 * @Date 2020/10/14 14:09
 */
public class IceAbstractFactory extends AbstractFactory{
    @Override
    public ISample getSample() {
        return new IceSample();
    }
}
