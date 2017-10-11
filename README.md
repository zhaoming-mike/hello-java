# hello-java

本Java项目用来验证一些常用代码的最佳实践写法

1. http server
1. http client
1. IPv4 long2ip ip2long

# Checkout

`git clone https://github.com/zhaoming-mike/hello-java.git`

# Run

1. `mvn clean install exec:java`
1. `mvn clean install exec:java -Dexec.args="hi 9999"`
1. `mvn clean install exec:java -DskipTests`

# Test

1. [默认(/hello)接口测试](http://localhost:8888/hello?hello=http://github.com "access github.com")
1. [自定义(/hi)接口测试](http://localhost:9999/hi?hi=http://github.com "access github.com")

# TODO LIST
- [x] 内嵌 Http 服务(embed http server/client)
- [x] 微基准测试 Demo (microbenchmark demo)
- [x] 设计模式 Gof
- [ ] JSON 编解码处理框架
- [ ] **日期**字符串处理
- [x] 好用的**排序算法**框架
- [ ] 加解密工具类
- [ ] 线程池**隔离**技术
- [ ] 不重启进程，**自刷新**配置方案
- [ ] 数据库**连接池**管理
- [x] 阿里巴巴编程规范 v1.3.0 2017-09-25 [英文版](https://alibaba.github.io/Alibaba-Java-Coding-Guidelines "goto")
- [ ] _待完善

