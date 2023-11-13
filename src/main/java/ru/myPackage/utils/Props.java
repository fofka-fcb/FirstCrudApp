package ru.myPackage.utils;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;

@Component
public class Props {
    private final Properties properties;

    public Props() {
        this.properties = new Properties();
        try {
            properties.load(Props.class.getClassLoader().getResourceAsStream("dataBase.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
