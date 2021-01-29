package cn.hagsyn.pattern.facade.facadeTwo;

import cn.hagsyn.pattern.facade.entity.Bus;
import cn.hagsyn.pattern.facade.entity.Car;
import cn.hagsyn.pattern.facade.entity.Plane;
import cn.hagsyn.pattern.facade.entity.Train;

/**
 * 这几个交通工具只是举例，他们对应的是不同的子系统，方法名可以是不一样的
 * @Auther Hagsyn
 * @Date 2021/1/29 10:48
 */
public class TrafficFacadeImpl2 extends AbstractTrafficFacade{

    private Bus bus;

    private Train train;

    private Plane plane;

    public TrafficFacadeImpl2() {
        this.bus = new Bus();
        this.train = new Train();
        this.plane = new Plane();
    }

    @Override
    public void takeOne() {
        bus.take();
    }

    @Override
    public void takeTwo() {
        train.take();
    }

    @Override
    public void takeThree() {
        plane.take();
    }
}
