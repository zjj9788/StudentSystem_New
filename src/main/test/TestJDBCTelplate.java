import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class TestJDBCTelplate {
    @Test
    public void testJDBCTemplate() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
        String sql = "select * from tb_user";
        List<Map<String, Object>> userList = jt.queryForList(sql);
        System.out.println(JSON.toJSON(userList));
    }
}
