package com.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableTransactionManagement
@SpringBootApplication
@ComponentScan
@EnableCaching
@EnableAsync
public class AccountmanagerApplication implements CommandLineRunner ,EmbeddedServletContainerCustomizer {

	public static void main(String[] args) {
		SpringApplication.run(AccountmanagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
		//设置端口号,阿里云服务器上面用的是9091
		configurableEmbeddedServletContainer.setPort(9091);
	}
}
