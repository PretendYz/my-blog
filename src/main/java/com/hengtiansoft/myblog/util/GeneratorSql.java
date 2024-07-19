package com.hengtiansoft.myblog.util;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Logan
 * @CreateTime: 2024/7/16 13:16
 * @Description: 逆向工程核心生成代码
 */

public class GeneratorSql {
    public void generator() throws Exception {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        // 指定逆向工程配置文件
        File configFile = new File("src/main/resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    // 执行main方法以生成代码
    public static void main(String[] args) {
        try {
            GeneratorSql generatorSql = new GeneratorSql();
            generatorSql.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
