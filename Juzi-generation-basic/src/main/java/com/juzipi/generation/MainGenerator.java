package com.juzipi.generation;

import com.juzipi.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * 核心生成器
 */
public class MainGenerator {

    public static void doGenerate(Object model) throws TemplateException, IOException {
        String projectPath = System.getProperty("user.dir");
        // 整个项目的根路径
        File parentFile = new File(projectPath).getParentFile();
        // 输入路径
        String inputPath = new File(parentFile, "Juzi-gemeration-demo-projects/acm-template").getAbsolutePath();
        System.out.println("inputPath = " + inputPath);

        String outputPath = projectPath;
        // 生成静态文件
        StaticGeneration.copyFilesByRecursive(inputPath, outputPath);

        // 生成动态文件
        String inputDynamicFilePath = projectPath  + "\\" + "src\\main\\resources\\templates\\MainTemplate.java.ftl";

        System.out.println("inputDynamicFilePath = " + inputDynamicFilePath);
        String outputDynamicFilePath = outputPath + "\\acm-template\\src\\com\\juzipi\\acm\\MainTemplate.java";
        System.out.println("outputDynamicFilePath = " + outputDynamicFilePath);
        DynamicGeneration.doGenerate(inputDynamicFilePath, outputDynamicFilePath, model);
    }

    public static void main(String[] args) throws TemplateException, IOException {
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setLoop(false);
        mainTemplateConfig.setAuthor("juzipi");
        mainTemplateConfig.setOutputText("我要算求和");
        doGenerate(mainTemplateConfig);

    }
}
