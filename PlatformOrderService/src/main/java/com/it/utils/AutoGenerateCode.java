/**************************************************************************************
 *                               @湖南千金医药股份有限公司                                 *
 *                                  @版权所有翻版必究                                    *
 * ************************************************************************************/

package com.it.utils;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: AutoGenerateCode
 * Package: com.it.utils
 * Description:
 *
 * @create: 2022-07-09 16:41
 * @author: fengwensdl@qq.com
 * @version: 1.0.0
 */
public class AutoGenerateCode {


    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir")+"/PlatformOrderService";
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setServiceName("%sService"); // 设置生成的service接口的名字的首字母
        gc.setAuthor("fengwensdl@qq.com");
        gc.setOpen(false);
        gc.setSwagger2(true);       //实体属性 Swagger2 注解
        gc.setFileOverride(true);   //覆盖原文件，谨慎使用
        //实体类结尾名称
             gc   .setEntityName("%sDO")
                //生成基本的resultMap
                .setBaseResultMap(true)
                //不使用AR模式
                .setActiveRecord(false)
                //生成基本的SQL片段
                .setBaseColumnList(true);
        mpg.setGlobalConfig(gc);


        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setUrl("jdbc:mysql://localhost:3306/test_data?serverTimezone=UTC&characterEncoding=utf8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("");
        dsc.setTypeConvert(new MySqlTypeConvert(){
            @Override
            public IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                if(fieldType.toLowerCase().contains("date") || fieldType.toLowerCase().contains("timestamp") || fieldType.toLowerCase().contains("datetime")){
                    return DbColumnType.DATE;
                }
//                if(fieldType.toLowerCase().contains("int")){
//                    return DbColumnType.INTEGER;
//                }
//                if(fieldType.toLowerCase().contains("decimal")){
//                    return DbColumnType.BIG_DECIMAL;
//                }
                return super.processTypeConvert(globalConfig, fieldType);
            }
        });
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(scanner("模块名"));
        pc.setParent("com.it");    //模块父包全路径
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
//         String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(com.baomidou.mybatisplus.generator.config.po.TableInfo tableInfo) {
                return projectPath + "/src/main/resources/mapper/" + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        // templateConfig.setEntity("templates/entity2.java");
        // templateConfig.setService();
        // templateConfig.setController();

        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 自定义需要填充的字段，对应数据库表中的字段
        List<TableFill> tableFillList = new ArrayList<>();
        tableFillList.add(new TableFill("CREATE_DATE", FieldFill.INSERT));
        tableFillList.add(new TableFill("UPDATE_DATE", FieldFill.INSERT_UPDATE));

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setTableFillList(tableFillList);                       //添加字段填充
        strategy.setNaming(NamingStrategy.underline_to_camel);          //表名驼峰命名
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);    //字段名驼峰命名
        //strategy.setSuperEntityClass("com.dybl.backstage.common.utils.BaseEntity");   //定义生成实体类需要继承的父类
        strategy.setEntityLombokModel(true);                            //实体类使用lombok注解
        strategy.setRestControllerStyle(true);                          //生成控制层类
        strategy.setSuperControllerClass("com.it.controller.BaseController");   //控制层类继承的父类
        //strategy.setSuperEntityColumns("id");
        strategy.setControllerMappingHyphenStyle(true);                 //标注@RequestMapper注解
        strategy.setTablePrefix("t_");                                  //去掉表名称的前缀

        strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());          // Freemarker模板引擎
        mpg.execute();
    }

}
