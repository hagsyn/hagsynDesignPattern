package cn.hagsyn.pattern.facade.entity;

/**
 * @Description
 * @Auther Hagsyn
 * @Date 2021/1/29 10:46
 */
public class Train implements Traffic{
    @Override
    public void take() {
        System.out.println("===take the train===");
    }
}
