[代理模式](https://blog.csdn.net/xiongchun11/article/details/77848902)

1. 远程代理。
   > 为一个对象在不同的地址空间提供局部代表，这样可以隐藏一个对象存在不同地址空间的事实。
2. 虚拟代理。
   > 根据需要创建开销很大的对象。通过它来存放实力化需要很长时间的真实对象
3. 安全代理。
   > 用来控制真实对象访问时的权限
4. 智能指引。
   > 当调用真实对象时，代理处理另外一些事
   


**1. 如果需要控制对原始对象的访问的时候，如权限控制**
**2. 需要在访问对象的时候执行一些附加操作的时候，例如打印日志等**