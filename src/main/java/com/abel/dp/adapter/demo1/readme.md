* 冲突：Target期待调用Request方法，而Adaptee并没有
  （这就是所谓的不兼容了）。

* 解决方案：为使Target能够使用Adaptee类里的SpecificRequest方法，
  故提供一个中间环节Adapter类**（继承Adaptee & 实现Target接口）**，
  把Adaptee的API与Target的API衔接起来（适配）。