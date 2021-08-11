1,如何注册高可用注册中心？？？
首先，pom文件 引入eureka-server， springcloud的jar包
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
	
	
然后，配置文件一个节点配置一个。
配一个 peer1 节点
spring.application.name=eureka-server
server.port=1111
eureka.instance.hostname=peer1

eureka.client.serviceUrl.defaultZone=http://peer2:1112/eureka/

再配一个peer2节点， 互相指向对方。
spring.application.name=eureka-server
server.port=1112
eureka.instance.hostname=peer2

eureka.client.serviceUrl.defaultZone=http://peer1:1111/eureka/

然后 启动类配EnableEurekaServer
@EnableEurekaServer
@SpringBootApplication
public class Application {


然后，注册服务的client，改成这个配置指向，包含所有节点的defaultZone
eureka.client.service-url.defaultZone=http://peer1:1111/eureka/,http://peer2:1112/eureka/