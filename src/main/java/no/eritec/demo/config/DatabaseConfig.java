package no.eritec.demo.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

@Configuration
public class DatabaseConfig {

    @Value("${c3p0.max_size}")
    private int maxSize;

    @Value("${c3p0.min_size}")
    private int minSize;

    @Value("${c3p0.acquire_increment}")
    private int acquireIncrement;

    @Value("${c3p0.idle_test_period}")
    private int idleTestPeriod;

    @Value("${c3p0.max_statements}")
    private int maxStatements;

    @Value("${c3p0.max_idle_time}")
    private int maxIdleTime;

    @Value("${c3p0.url}")
    private String url;

    @Value("${c3p0.username}")
    private String username;

    @Value("${c3p0.password}")
    private String password;

    @Value("${c3p0.driverClassName}")
    private String driverClassName;

    @Bean
    public ComboPooledDataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setMaxPoolSize(maxSize);
        dataSource.setMinPoolSize(minSize);
        dataSource.setAcquireIncrement(acquireIncrement);
        dataSource.setIdleConnectionTestPeriod(idleTestPeriod);
        dataSource.setMaxStatements(maxStatements);
        dataSource.setMaxIdleTime(maxIdleTime);
        dataSource.setJdbcUrl(url);
        dataSource.setPassword(password);
        dataSource.setUser(username);
        dataSource.setDriverClass(driverClassName);
        dataSource.setPreferredTestQuery("SELECT 1 FROM DUAL");
        dataSource.setTestConnectionOnCheckin(true);
        return dataSource;
    }
}

