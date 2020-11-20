package com.gloryh.mybatisplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * MP 自动生成启动类
 *
 * @author 黄光辉
 * @since 2020/10/10
 **/
public class Main {
    public static void main(String[] args) {
        //创建一个 generator 对象
        AutoGenerator autoGenerator = new AutoGenerator();
        //配置数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setUrl("jdbc:mysql://39.97.170.244:3306/test?useUnicode=true&characterEncoding=UTF-8");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("GloryH0828..");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        //装入 generator 对象
        autoGenerator.setDataSource(dataSourceConfig);
        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/src/main/java");
        //创建完成后，是否打开文件夹
        globalConfig.setOpen(false);
        //设置创建完成后的作者名
        globalConfig.setAuthor("黄光辉");
        //装入generator对象
        autoGenerator.setGlobalConfig(globalConfig);
        //配置各类文件要存放的包信息
        PackageConfig packageConfig =new PackageConfig();
        //父包名
        packageConfig.setParent("com.gloryh.mybatisplus");
        //所有文件要存放的包名
        packageConfig.setModuleName("generator");
        //设置各类型文件的包名
        packageConfig.setEntity("entity");
        packageConfig.setMapper("mapper");
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.Impl");
        //装入 generator 对象
        autoGenerator.setPackageInfo(packageConfig);
        //配置策略
        StrategyConfig strategyConfig =new StrategyConfig();
        //是否给创建好的实体类添加Lombok注解
        strategyConfig.setEntityLombokModel(true);
        //创建实体类成员变量属性时使用驼峰式命名
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        //装入generator对象
        autoGenerator.setStrategy(strategyConfig);

        //根据 generator 配置执行自动生成代码
        autoGenerator.execute();
    }
}
