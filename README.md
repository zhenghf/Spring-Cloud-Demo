# Spring-Cloud-Demo
基于Spring Cloud Finchley.RELEASE，个人学习demo

eureka项目：提供服务注册中心，注册中心地址http://127.0.0.1:9000

product项目：商品服务，现在只包含一个返回固定字符串的controller，包含两个模块server和client，server模块实现具体的业务逻辑，client暴露对外提供的接口服务，两模块都继承父pom

order项目：订单服务，包含一个controller，这个controller调用product暴露出来的一个接口服务，包含两个模块server和client，server模块实现具体的业务逻辑，client暴露对外提供的接口服务，两模块都继承父pom
