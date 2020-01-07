# 项目说明
项目采用springboot+springCloud+mybatis-plus,聚合工程管理jar包

## file.conf中添加配置:
- DataSourceProxy加载 只有spring.datasource.autoproxy 为true才会使用seata的DataSource
- 具体代码请看io.seata.spring.annotation.GlobalTransactionScanner.postProcessBeforeInitialization
```
support {
  ## spring
  spring {
    # auto proxy the DataSource bean
    datasource.autoproxy = true
  }
}
```
## seata版本
- 2019-10-15 version:0.9.0

## 配置文件
- application.yml  需要修改数据源
- 需要导入sql

## 启动步骤
1. 启动consul
2. 启动seata服务端
3. 依次启动项目 seat-account -> seat-storage -> seat-order

## END
- 访问 http://localhost:8082/order/create?userId=1&productId=1&count=10&money=100
- 因在account service中有睡眠方法,导致失败,seata全局回滚会生效