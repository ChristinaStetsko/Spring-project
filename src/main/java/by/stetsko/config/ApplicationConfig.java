package by.stetsko.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("by.stetsko")
@EnableAspectJAutoProxy
public class ApplicationConfig {
}
