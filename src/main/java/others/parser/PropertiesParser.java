package others.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-16 上午11:38
 **/
public class PropertiesParser {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
//        InputStream inputStream= Properties.class.getClassLoader()
//                .getResourceAsStream( "Test.properties");
//        InputStream inputStream = Properties.class.getClassLoader().getResourceAsStream("Test.properties");
        InputStream inputStream = Properties.class.getResourceAsStream("/Test.properties");
        properties.load(inputStream);
        System.out.println(properties.getProperty("jdbc.driver"));
    }
}
