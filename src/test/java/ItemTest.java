import com.muchi.dao.ItemDao;
import com.muchi.domain.Items;
import com.muchi.service.ItemService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yuzq on 2019/3/15.
 */
public class ItemTest {
    @Test
    public void daoTest(){
        //得到spring容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //从
        ItemDao itemDao = applicationContext.getBean(ItemDao.class);
        Items Id = itemDao.findById(2);
        System.out.println(Id.getName());
    }

    @Test
    public void serviceTest(){
        //得到spring容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //从
        ItemService itemDao = applicationContext.getBean(ItemService.class);
        Items Id = itemDao.findById(1);
        System.out.println(Id.getName());
    }
}
