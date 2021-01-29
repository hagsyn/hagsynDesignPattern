package cn.hagsyn.pattern.factory.easyfactory;

import cn.hagsyn.pattern.factory.entity.HagsynSample;
import cn.hagsyn.pattern.factory.entity.ISample;
import cn.hagsyn.pattern.factory.entity.IceSample;

/**
 * @Description 简单工厂模式
 * @Auther Hagsyn
 * @Date 2020/10/14 13:36
 */
public class EasyFactory {

    /**
     * 根据对应的数字获取想要的实现类，但是这样的方式维护起来也是比较差的
     * 如果只依靠一个简单工厂来实现，那么我们得在工厂类中嵌套多少个if..else if啊？
     * @param num
     * @return
     */
    public static ISample generateSimple(int num) {
        ISample sample = null;
        switch (num) {
            case 1:
                sample = new HagsynSample();
                break;
            case 2:
                sample = new IceSample();
            default:
                break;
        }
        return sample;
    }
}
