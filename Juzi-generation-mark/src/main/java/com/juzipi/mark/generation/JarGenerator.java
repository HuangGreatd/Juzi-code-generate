package com.juzipi.mark.generation;

import java.io.*;

/** 构建jar包
 * @author Juzipi
 * @version 1.0
 * @date 2024-03-22 17:08
 */
public class JarGenerator {
    public static void doGenerator(String projectDir) throws IOException, InterruptedException {
        //清理之前的构建打包
        //注意不同的操作系统，执行命令不同
        String winMavenCommand = "mvn.cmd clean package -DskipTests=true";
        String otherMavenCommand = "mvn cmd clean package -DskipTests=true";
        String mavenCommand = winMavenCommand;


        //这里一定要拆分
        ProcessBuilder processBuilder = new ProcessBuilder(mavenCommand.split(" "));
        processBuilder.directory(new File(projectDir));

        Process process = processBuilder.start();

        //读取命令的输出
        InputStream inputStream = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while((line =reader.readLine()) != null){
            System.out.println(line);
        }

        //等待命令执行完成
        int exitCode = process.waitFor();
        System.out.println("命令执行结束，退出码:" + exitCode);

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        doGenerator("D:\\code\\Ju-code-generation\\Juzi-generator-demo-projects\\acm-template-pro");
    }
}
