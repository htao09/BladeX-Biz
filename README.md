## BladeX是什么
* BladeX 是一个基于 Spring Boot 2 & Spring Cloud Greenwich & Mybatis 等核心技术，用于快速构建中大型系统的基础框架
* 已稳定生产近一年，经历了从Camden->Greenwich的技术架构，也经历了从FatJar->Docker->K8S+Jenkins的部署架构
* 采用前后端分离的模式，前端开发两个框架：Sword(基于React、Ant Design)、Saber(基于Vue、ElementUI)
* 后端采用SpringCloud系列，对其基础组件做了高度的封装，单独出一个后端核心框架：BladeX-Tool
* BladeX-Tool已推送至Maven私有库，直接引入减少工程的模块与依赖，可更注重于业务开发
* 集成Sentinel从流量控制、熔断降级、系统负载保护等多个维度保护服务的稳定性
* 注册中心、配置中心选型Nacos，为工程瘦身的同时加强各模块之间的联动
* 使用Traefik进行反向代理，监听后台变化自动化应用新的配置文件
* 集成Oauth2协议，完美支持了多终端的接入与认证授权
* 集成工作流Flowable，复杂流程需求不再难办
* 创建多租户模式，发布简单，数据隔离轻松
* 项目分包明确，规范微服务的开发模式

## 工程结构

``` 
BladeX
├── blade-auth -- 授权服务提供
├── blade-common -- 常用工具封装包
├── blade-gateway -- Spring Cloud 网关
├── blade-ops -- 运维中心
├    ├── blade-admin -- spring-cloud后台管理
├    ├── blade-develop -- 代码生成
├── blade-service -- 业务模块
├    ├── blade-desk -- 工作台模块 
├    ├── blade-log -- 日志模块 
├    ├── blade-system -- 系统模块 
├    └── blade-user -- 用户模块 
├── blade-service-api -- 业务模块api封装
├    ├── blade-desk-api -- 工作台api 
├    ├── blade-dict-api -- 字典api 
├    ├── blade-system-api -- 系统api 
└──  └── blade-user-api -- 用户api 
```
