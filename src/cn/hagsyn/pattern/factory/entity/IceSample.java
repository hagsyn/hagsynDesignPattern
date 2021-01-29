package cn.hagsyn.pattern.factory.entity;

/**
 * @Description 简单的举例
 * @Auther  Ice
 * @Date 2020/10/14 13:25
 */
public class IceSample implements ISample {
    @Override
    public void say() {
        System.out.println("I am Ice!");
    }
}

class  IceSampleOne extends  IceSample{
    @Override
    public void say() {
        System.out.println("I am  Ice One!");
    }
}

class  IceSampleTwo extends  IceSample{
    @Override
    public void say() {
        System.out.println("I am  Ice Two!");
    }
}