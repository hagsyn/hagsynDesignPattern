<!-- TOC -->

- [一.工厂模式](#工厂模式)
    - [1.1 简单工厂模式](#11-简单工厂模式)
    - [1.2 工厂方法模式](#12-工厂方法模式)
    - [1.2 抽象工厂模式](#13-抽象工厂模式)
- [二.优点](#优点)  
- [三.缺点](#缺点)  
- [四.举例场景](#举例场景)  
- [五.注意事项](#注意事项)  

<!-- /TOC -->

#一.工厂模式
- 面向接口编程，体现了面向对象的思想；
- 将创建对象的工作转移到了工厂类；

### 1.1 简单工厂模式
该模式对对象创建管理方式最为简单，因为其仅仅简单的对不同类对象的创建进行了一层薄薄的封装。该模式通过向工厂传递类型来指定要创建的对象。



### 1.2 工厂方法模式
和简单工厂模式中工厂负责生产所有产品相比，工厂方法模式将生成具体产品的任务分发给具体的产品工厂。

也就是定义一个抽象工厂，其定义了产品的生产接口，但不负责具体的产品，将生产任务交给不同的派生类工厂。这样不用通过指定类型来创建对象了。



### 1.3 抽象工厂模式
抽象工厂模式通过在AbstarctFactory中增加创建产品的接口，并在具体子工厂中实现新加产品的创建，当然前提是子工厂支持生产该产品。否则继承的这个接口可以什么也不干。

#二.优点
 1. 一个调用者想创建一个对象，只要知道其名称就可以了。
 2. 扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
 3. 屏蔽产品的具体实现，调用者只关心产品的接口。

#三.缺点
每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。

#四.举例场景
1. 日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。 
2. 数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。
3. 设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。

#五.注意事项
作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。

