package com.star.generator;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 交互式生成
 */
public class FastGenerator {

    private static String author ="聂建强";//作者名称
    private static String outputDir ="D:/";//生成的位置
    private static String url ="jdbc:mysql://localhost:3306/library?characterEncoding=utf8&useUnicode=true&useSSL=false&serverTimezone=UTC";
    private static String username ="root";//数据库用户名
    private static String password ="123456";//数据库密码
    private static String parentPackage = "com.star";//顶级包结构
    private static String mapper = "mapper";//数据访问层包名称
    private static String service = "service";//业务逻辑层包名称
    private static String serviceImpl = "service.impl";//业务逻辑层包实现类名称
    private static String entity = "entity";//实体层包名称
    private static String controller = "controller";//控制器层包名称
    private static String mapperxml = "mapper";//mapper映射文件包名称

    private static String moduleName = "sys";//模块名
    private static String tablePrefix ="t_";//数据库表的前缀，如t_user


    public static void main(String[] args) {

        FastAutoGenerator.create(url, username, password)
                // 全局配置
                .globalConfig((scanner, builder) -> builder.author(author)
                        // .outputDir(System.getProperty("user.dir") + "/src/main/java")  //当前项目下
                        .outputDir(outputDir+"/src/main/java")
                        .commentDate("yyyy-MM-dd")
                        // .enableSwagger()
                        .fileOverride()
                )
                // 包配置
                .packageConfig((scanner, builder) -> builder.parent(parentPackage)
                        // .moduleName(scanner.apply("请输入父包模块名？"))
                        .entity(entity)
                        .service(service)
                        .serviceImpl(serviceImpl)
                        .controller(controller)
                        .mapper(mapper)
                        .xml(mapperxml)
                        // .pathInfo(Collections.singletonMap(OutputFile.mapperXml, System.getProperty("user.dir")+"/src/main/resources/mapper"))
                        .pathInfo(Collections.singletonMap(OutputFile.mapperXml,outputDir+"/src/main/resources/mapper"))
                )
                // 策略配置
                .strategyConfig((scanner, builder) -> {
                    builder.addInclude(getTables(scanner.apply("请输入表名，多个英文逗号分隔？所有输入 all")))
                            // .addTablePrefix(scanner.apply("请输入实体类名要过滤的表名前缀"))
                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .entityBuilder()        //实体类策略配置
                            .enableLombok()         //开启 Lombok
                            .disableSerialVersionUID()
                            .logicDeleteColumnName("deleted")        //逻辑删除字段
                            .enableTableFieldAnnotation()       // 开启生成实体时生成字段注解
                            .controllerBuilder()
                            .formatFileName("%sController")
                            .enableRestStyle()
                            .mapperBuilder()
                            .superClass(BaseMapper.class)
                            .formatMapperFileName("%sMapper")
                            .enableMapperAnnotation()       //@mapper
                            .formatXmlFileName("%sMapper")
                            .enableBaseColumnList()  //生成通用sql字段
                            .enableBaseResultMap()   //生成ResultMap
                    ;
                })
                //执行
                .execute();
    }

    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }

}
