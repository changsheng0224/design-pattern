动态代理和静态代理相比，明显的变化是：虽然Subject接口定义了很多方法，
但是动态代理类始终只有一个invoke方法（代理类是动态生成的），
这样当Subject接口发生变化的时候，动态代理的接口就不需要跟着变化了

动态代理：[参考](https://www.cnblogs.com/zhangjianbing/p/9406576.html)

* 增强类。作用：前置增强、后置增强。beforeAction afterAction
* Proxy.作用：调度管理