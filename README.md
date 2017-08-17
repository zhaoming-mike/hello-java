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

1. [默认(/hello)接口测试](http://localhost:8888/hello?github.com=http://github.com "access github.com")
1. [自定义接口测试](http://localhost:9999/hi?github.com=http://github.com "access github.com")

# TODO LIST

* JSON 编解码处理框架
* **日期**字符串处理
* 好用的**排序算法**框架
* 加解密工具类
* 线程池**隔离**技术
* 不重启进程，**自刷新**配置方案
* 数据库**连接池**管理
* _待完善


## demo
- [x] 如果你感兴趣可以联系@zhaoming-mike
- [ ] emoji表情：:boom::pineapple::iphone:
- [ ] 测试

## code
```java
public int test() {
	return 1;
}
```

- 测试`<html>` inline 标签 ~~删除线内容~~
- 有个问题#3
- zhaoming-mike#3
- zhaoming-mike/hello-java#3

## 表格

域名|备注
----------|----
google.com|谷歌
baidu.com|百度

## 引用

### 毛主席作战思想
>敌进我退、敌驻我扰、敌疲我打、敌退我追
