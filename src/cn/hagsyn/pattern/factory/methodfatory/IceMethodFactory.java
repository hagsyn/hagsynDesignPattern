package cn.hagsyn.pattern.factory.methodfatory;

import cn.hagsyn.pattern.factory.entity.ISample;
import cn.hagsyn.pattern.factory.entity.IceSample;

/**
 * @Description
 * @Auther Hagsyn
 * @Date 2020/10/14 13:58
 */
public class IceMethodFactory implements MethodFactory{
    @Override
    public ISample getSample() {
        return new IceSample();
    }
}
