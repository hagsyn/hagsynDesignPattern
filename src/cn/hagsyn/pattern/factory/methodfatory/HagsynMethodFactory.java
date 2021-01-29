package cn.hagsyn.pattern.factory.methodfatory;

import cn.hagsyn.pattern.factory.entity.HagsynSample;
import cn.hagsyn.pattern.factory.entity.ISample;

/**
 * @Description
 * @Auther Hagsyn
 * @Date 2020/10/14 13:58
 */
public class HagsynMethodFactory implements MethodFactory{
    @Override
    public ISample getSample() {
        return new HagsynSample();
    }
}
