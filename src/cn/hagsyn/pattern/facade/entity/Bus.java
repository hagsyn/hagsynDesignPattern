package cn.hagsyn.pattern.facade.entity;

/**
 * @Description
 * @Auther Hagsyn
 * @Date 2021/1/29 11:03
 */
public class Bus implements Traffic{
    @Override
    public void take() {
        System.out.println("===take the bus===");
    }
}
