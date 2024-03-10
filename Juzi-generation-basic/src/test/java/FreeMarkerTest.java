import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FreeMarker 学习测试
 */
public class FreeMarkerTest {
    @Test
    public void testFreeMarker() throws IOException, TemplateException {
        //new 出 configuration 对象，参数为 FreeMarker 对象
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);

        //指定模板文件所在的路径
        configuration.setDirectoryForTemplateLoading(new File("src/main/resources/templates"));

        //设置模板文件使用的字符集
        configuration.setDefaultEncoding("utf-8");

        //创建模板对象。加载指定模板
        Template template = configuration.getTemplate("myweb.html.ftl");

        //创建数据模型
        HashMap<String, Object> dataModel = new HashMap<>();
        dataModel.put("currentYear","2023");
        List<Map<String, Object>> menuItems = new ArrayList<>();
        Map<String, Object> menuItem1 = new HashMap<>();
        menuItem1.put("url","http://juzipi.xyz");
        menuItem1.put("label","编程导航");
        Map<String, Object> menuItems2 = new HashMap<>();
        menuItems2.put("url","https://www.juzipi.xyz");
        menuItems2.put("label","捞鱼简历");
        menuItems.add(menuItem1);
        menuItems.add(menuItems2);
        dataModel.put("menuItems", menuItems);


        Writer out = new FileWriter("myweb.html");

        template.process(dataModel,out);

        //生产文件后关闭
        out.close();


    }
}
