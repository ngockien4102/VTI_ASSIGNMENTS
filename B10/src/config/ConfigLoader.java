package config;

import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {

    public static Properties load() throws Exception {
        Properties props = new Properties();

        try (InputStream is = ConfigLoader.class
                .getClassLoader()
                .getResourceAsStream("./config/config.properties")) {

            if (is == null) {
                throw new RuntimeException("Không tìm thấy file config.properties");
            }
            props.load(is);
        }

        return props;
    }
}