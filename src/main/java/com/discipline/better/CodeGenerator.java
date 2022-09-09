package com.discipline.better;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGenerator {
	public static void main(String[] args) {
	    String url = "jdbc:mysql://101.43.41.143:3306/award?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8 ";
	    String username = "root";
	    String password = "123456";
	    FastAutoGenerator.create(url, username, password)
	        // 全局配置
	        .globalConfig((scanner, builder) -> builder.author("zzp")
	                      .outputDir(System.getProperty("user.dir") + "/src/main/java")
	                      .commentDate("yyyy-MM-dd hh:mm:ss")
	                      .dateType(DateType.TIME_PACK)
	                      .disableOpenDir()
	                     )
	        // 包配置
	        .packageConfig((scanner, builder) -> builder.parent("com.discipline.better")
	                       //.moduleName("父包名")
	                       .entity("entity")
	                       .service("service")
	                       .serviceImpl("serviceImpl")
	                       .mapper("mapper")
	                       .xml("mapper")
	                       .other("utils")
	                       .pathInfo(Collections.singletonMap(OutputFile.xml, System.getProperty("user.dir")+"/src/main/resources/mapper"))
	                      )
	        // 策略配置
	        .strategyConfig((scanner, builder) -> {
	            builder.addInclude(getTables(scanner.apply("=====================策略配置=======================\n请输入表名，多个英文逗号分隔？所有输入 all")))
	                .serviceBuilder()
	                .formatServiceFileName("%sService")
	                .formatServiceImplFileName("%sServiceImpl")
	                .entityBuilder()        //实体类策略配置
	                .enableLombok()         //开启 Lombok
	                .disableSerialVersionUID()
	                //.logicDeleteColumnName("deleted")        //逻辑删除字段
	                .naming(NamingStrategy.underline_to_camel)
	                .columnNaming(NamingStrategy.underline_to_camel)
	                //.//addTableFills(new Column("create_time", FieldFill.INSERT), new Column("modify_time", FieldFill.INSERT_UPDATE))
	                .enableTableFieldAnnotation()       // 开启生成实体时生成字段注解
	                .controllerBuilder()
	                .formatFileName("%sController")
	                .enableRestStyle()
	                .mapperBuilder()
	                .superClass(BaseMapper.class)
	                .formatMapperFileName("%sMapper")
	                .enableMapperAnnotation()       //@mapper
	                .formatXmlFileName("%sMapper");
	        })
	        .execute();
	}

	// 处理 all 情况
	protected static List<String> getTables(String tables) {
	    return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
	}
}
