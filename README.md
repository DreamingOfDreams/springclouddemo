# springCloud demo
[感谢纯洁的微笑](http://www.ityouknow.com)

### eureka
服务注册中心 http://localhost:8090/

### producer
服务提供 http://localhost:9000/hello?name=mm

### consumer
服务调用 http://localhost:9001/hello/dream

注解@EnableFeignClients 依赖 org.springframework.cloud:spring-cloud-starter-openfeign
