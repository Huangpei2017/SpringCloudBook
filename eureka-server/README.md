1，如何引入一个eureka注册中心？？参考eureka-server
首先pom文件引入
<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-eureka-server</artifactId>
		</dependency>
		
和
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
	
然后 application.properties添加
注册中心的名字等信息
spring.application.name=eureka-server
server.port=1111
eureka.instance.hostname=localhost
和相关控制参数
# 这句表示注册中心 不注册自己。
eureka.client.register-with-eureka=true  
#无须检索服务
eureka.client.fetch-registry=true
eureka.client.serviceUrl.defaultZone=http://${eureka.instance.hostname}:${server.port}/eureka/

然后Application主程序 添加
eureka组件@EnableEurekaServer