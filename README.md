# DesignPattern
# 23种设计模式： #
## 创建型模式 ##

- **singleton单例模式：**
   - lazySingleton懒汉式单例模式：延迟加载，创建效率低，需要同步整个方法块
   - hungrySingleton饿汉式单例模式：创建对象时便加载
   - DoubleCheckSingleton双重检测式单例模式：通过双重检测进行生成一个对象，可延迟加载，但限于jvm，可能会报错，不建议使用
   - StaticInnerSingleton静态内部类单例模式：可延迟加载，且创建效率高，推荐使用
   - EnumSingleton枚举式单例模式：枚举在实现时，便已经是单例
  ---
- **factory工厂模式：**
   - simpleFactory简单工厂：不符合设计模式的开闭原则（对扩展开放，修改关闭），每次新增新产品，均需要修改源代码
   - factorymethod工厂方法：符合设计模式原则，但增加了复杂度
   - abstractfactory抽象工厂：多个接口实现同一个接口时，可以考虑使用抽象，但增加产品族较为简单，增加产品困难
---
- **builder建造者模式：**
   - xxBuilder：生产零部件
   - xxDirector：组装零部件
---
- **prototype原型模式：**如果对象创建较为复杂，且需要创建多个对象时，可以考虑此方法
