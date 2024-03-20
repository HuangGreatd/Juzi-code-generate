package com.juzipi;

import com.juzipi.cli.command.CommandExecutor;

import java.io.File;

import static com.juzipi.generation.StaticGeneration.copyFilesByHutool;

public class Main {
    public static void main(String[] args) {
//        String projectPath = System.getProperty("user.dir");
//        System.out.println("projectPath = " + projectPath);
//        File parentFile = new File(projectPath).getParentFile();
//        //输入路径，ACM 示例代码路径
//        String inputPath = new File(parentFile, "Juzi-generator-demo-projects/acm-template").getAbsolutePath();
//        //输出路径 直接输出到项目的跟目录
//        String outputPath = projectPath;
//        copyFilesByHutool(inputPath,outputPath);
//        args = new String[]{"generate"};
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}