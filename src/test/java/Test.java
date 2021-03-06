import com.qfedu.shiroDemo.dao.PermissionDAO;
import com.qfedu.shiroDemo.dao.RoleDAO;
import com.qfedu.shiroDemo.dao.UserDAO;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml",
        "classpath:spring-context-druid.xml",
        "classpath:spring-context-mybatis.xml",
        "classpath:spring-context-tx.xml"})
public class Test {

    @Autowired
    private PermissionDAO permissionDAO;

    @org.junit.Test
    public void test(){
        System.out.println(permissionDAO.queryPermissionByUserName("zhangsan"));
    }

}
