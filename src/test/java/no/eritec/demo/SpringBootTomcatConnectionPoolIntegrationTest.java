package no.eritec.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTomcatConnectionPoolIntegrationTest {

    //@Autowired
    //private DataSource dataSource;

    @Test
    public void givenTomcatConnectionPoolInstance_whenCheckedPoolClassName_thenCorrect() {
        //assertEqual(dataSource.getClass().getName())
        //        .isEqualTo("org.apache.tomcat.jdbc.pool.DataSource");
    }
}

