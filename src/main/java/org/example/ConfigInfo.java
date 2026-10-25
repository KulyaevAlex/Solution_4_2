package org.example;

import java.util.ArrayList;
import java.util.List;

public class ConfigInfo {
    public static void main(String[] args) {
        Config config1 = new Config();
        Config config2 = new Config("1.1.1.0", 8081, 10, 10, true);
        Config config3 = new Config("1.1.1.1", 8090);

        List<Config> configs = new ArrayList<>();
        configs.add(config1);
        configs.add(config2);
        configs.add(config3);

        for (Config config : configs) {
            config.printConfig();
            System.out.println();
        }

        System.out.println("Количество созданных коонфигов равно: " + Config.getInstanceCount());
    }
}
