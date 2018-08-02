import com.alibaba.fastjson.JSON;
import com.just4cool.entity.User;
import com.just4cool.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hubin on 2018/8/2.
 */
@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath*:spring-mvc.xml","classpath*:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);

//    private ApplicationContext ac = null;

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        User user = userService.getUser(1l);
        logger.info(JSON.toJSONString(user));
    }

}
