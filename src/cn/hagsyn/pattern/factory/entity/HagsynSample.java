package cn.hagsyn.pattern.factory.entity;

/**
 * @Description 简单的举例
 * @Auther Hagsyn
 * @Date 2020/10/14 13:25
 */
public class HagsynSample implements ISample {
    @Override
    public void say() {
        System.out.println("I am Hagsyn!");
    }
}

class HagsynSampleOne extends HagsynSample{
    @Override
    public void say() {
        System.out.println("I am Hagsyn One!");
    }
}

class HagsynSampleTwo extends HagsynSample{
    @Override
    public void say() {
        System.out.println("I am Hagsyn Two!");
    }
}