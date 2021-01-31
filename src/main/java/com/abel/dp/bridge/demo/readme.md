使用桥接模式重构案例需求后，大家重点来分析，桥是这么搭起来的，
首先 Ipad 的open() 方法其实调用的是父类Computer 的 open() 方法，
而父类里面的 open() 方法其实是调用的是聚合的接口 Brand 的open() 方法，
那实际调用的就是 Brand 接口的实现类 Apple/Huawei，
所以类 Computer 其实充当了一个桥梁的作用， 
Ipad 的open()方法真正的实现在Brand 接口的实现类里