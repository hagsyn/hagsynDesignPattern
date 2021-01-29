package cn.hagsyn.pattern.facade;

import cn.hagsyn.pattern.facade.facadeOne.TrafficFacade;
import cn.hagsyn.pattern.facade.facadeTwo.AbstractTrafficFacade;
import cn.hagsyn.pattern.facade.facadeTwo.TrafficFacadeImpl1;
import cn.hagsyn.pattern.facade.facadeTwo.TrafficFacadeImpl2;
import org.junit.jupiter.api.Test;

/**
 * @Description 普通模式
 * @Auther Hagsyn
 * @Date 2020/10/14 13:27
 */
public class FacadeTest {

    /**
     * 可通过外观代理类使用对应的子系统的功能
     */
    TrafficFacade trafficFacade = new TrafficFacade();

    //定义一个配置让抽象外观类选择具体的使用
    private String type = "two";

    /**
     *考虑到“开闭原则”，如果某一个子系统被删掉了，或者增加了，就会修改当前的外观类
     * 当前类中有三种交通工具，如果我现在加一种，是不是就要修改外观类，同事还要修改调用端调用的外观类
     */
    @Test
    public void testFacade() {
        //调用不同的子系统
        trafficFacade.takeCar();
        trafficFacade.takePlane();
        trafficFacade.takeTrain();
    }

    /**
     * 可以自定义添加外观实现类，通过配置决定实现即可
     */
    @Test
    public void testFacade2() {
        //调用不同的子系统
        AbstractTrafficFacade abstractTrafficFacade = null;
        switch (type) {
            case "one":
                abstractTrafficFacade = new TrafficFacadeImpl1();
                break;
            case "two":
                abstractTrafficFacade = new TrafficFacadeImpl2();
                break;
            default:
                break;
        }
        if (abstractTrafficFacade != null) {
            abstractTrafficFacade.takeOne();
            abstractTrafficFacade.takeTwo();
            abstractTrafficFacade.takeThree();
        }
        /**
         * 当type==“one”时：
         * ===take the car===
         * ===take the train===
         * ===take the plane===
         *
         * 当type==“two”时：
         * ===take the bus===
         * ===take the train===
         * ===take the plane===
         *
         */
    }

}
