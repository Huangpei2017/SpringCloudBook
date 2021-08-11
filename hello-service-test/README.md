1 如何注册服务提供者？？

首先，pom加 springboot,springcloud依赖
 <!-- 添加 1,2-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-eureka-server</artifactId>
        </dependency>
        
        
  <dependencyManagement>
         <dependencies>
             <dependency>
                 <groupId>org.springframework.cloud</groupId>
                 <artifactId>spring-cloud-dependencies</artifactId>
                 <version>Brixton.SR5</version>
                 <type>pom</type>
                 <scope>import</scope>
             </dependency>
         </dependencies>
     </dependencyManagement>
     
 然后， 声明注册的服务名称，和 注册中心地址
 spring.application.name=hello-service
 
 #注册服务器的地址
 eureka.client.service-url.defaultZone=http://localhost:1111/eureka/
 
 然后， Application声明为 @EnableDiscoveryClient
 @SpringBootApplication
 @EnableDiscoveryClient
 public class HelloApplication {
        


