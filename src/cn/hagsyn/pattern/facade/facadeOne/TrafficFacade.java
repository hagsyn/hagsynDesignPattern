package cn.hagsyn.pattern.facade.facadeOne;

import cn.hagsyn.pattern.facade.entity.Car;
import cn.hagsyn.pattern.facade.entity.Plane;
import cn.hagsyn.pattern.facade.entity.Train;

/**
 * 这几个交通工具只是举例，他们对应的是不同的子系统，方法名可以是不一样的
 * @Auther Hagsyn
 * @Date 2021/1/29 10:48
 */
public class TrafficFacade {

    private Car car;

    private Train train;

    private Plane plane;

    public TrafficFacade() {
        this.car = new Car();
        this.train = new Train();
        this.plane = new Plane();
    }

    public void takeCar() {
        car.take();
    }

    public void takeTrain() {
        train.take();
    }

    public void takePlane() {
        plane.take();
    }
}
