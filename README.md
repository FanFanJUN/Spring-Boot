# Spring-Boot&&AntD-Pro
#### 201906192084

```
idea初始化项目工程
Spring-Boot&&AntD-Pro整合
pom文件配置热启动
```
[热启动设置](https://blog.csdn.net/u012190514/article/details/79951258)
#### 插件推荐

```
FindBugs
Maven Helper
Alibaba Java Coding Guidelines
CodeGlance

```
#### Springboot简单查询User表
![image](https://res.cloudinary.com/dnmtpbj1g/image/upload/v1561090506/antd/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7_2019-06-21_12.13.10.png)
```
MBG 自动生成mapper.xml,entity,dao接口
<!--Running MyBatis Generator With Maven-->
            <plugin>
                <groupId>org.mybatis.generator</groupId>
                <artifactId>mybatis-generator-maven-plugin</artifactId>
                <version>1.3.2</version>
                <executions>
                    <execution>
                        <id>Generate MyBatis Artifacts</id>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <!-- Mybatis-Generator 工具配置文件的位置 -->
                    <configurationFile>src/main/resources/mybatis-generator/generatorConfig.xml</configurationFile>
                    <verbose>true</verbose>
                    <overwrite>true</overwrite>
                </configuration>

                <dependencies>
                    <!-- 链接MySQL -->
                    <dependency>
                        <groupId>mysql</groupId>
                        <artifactId>mysql-connector-java</artifactId>
                        <version>8.0.15</version>
                    </dependency>


                    <dependency>
                        <groupId>org.mybatis.generator</groupId>
                        <artifactId>mybatis-generator-core</artifactId>
                        <version>1.3.2</version>
                    </dependency>
                </dependencies>
            </plugin>
具体配置在工程下
mvn install
run application 
访问 http://localhost:8888/api/lc/getTabledata
```
