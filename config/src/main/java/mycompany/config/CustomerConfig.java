package mycompany.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "mycompany.config")
public class CustomerConfig {
	@Bean
	public DataSource dataSource() {
	return new DriverManagerDataSource("jdbc:mysql://localhost:3306/service", "root", "welcome");

}
     @Bean
public JdbcTemplate jdbcTemplate(DataSource dataSource)
{
	return new JdbcTemplate(dataSource());
}

}
