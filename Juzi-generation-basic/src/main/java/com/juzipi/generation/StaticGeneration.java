package com.juzipi.generation;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ArrayUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * 静态生成目录文件
 */
public class StaticGeneration {
    public static void copyFilesByHutool(String inputPath,String outputPath){
        FileUtil.copy(inputPath,outputPath,false);
    }

    /**
     * 递归拷贝文件
     * @param inputPath
     * @param outputPath
     */
    public static void copyFilesByRecursive(String inputPath,String outputPath){
        File inputFile = new File(inputPath);
        File outputFile = new File(outputPath);
        try{
            copyFilesByRecursive(inputFile,outputFile);
        }catch (Exception e){
            System.out.println("文件复制失败");
            e.printStackTrace();
        }
    }

    /**
     * 文件A -》 目录B ，则 文件A 放在目录 B下
     * 文件A -》 文件B ，则 文件A 覆盖 文件B
     * 目录A -》 目录B ，则 目录A 放在 目录B 下
     *
     * 核心思路：先创建目录，然后遍历目录内的文件，依次复制
     * @param inputFile
     * @param outputFile
     * @throws IOException
     */
    private static void copyFilesByRecursive(File inputFile,File outputFile) throws IOException {
        //区分是文件还是目录
        if (inputFile.isDirectory()){
            System.out.println(inputFile.getName());
            File desOutputFile = new File(outputFile, inputFile.getName());
            //如果是目录，首先创建目标目录
            if (!desOutputFile.exists()){
                desOutputFile.mkdir();
            }
            //获取目录下的所有文件和子目录
            File[] files = inputFile.listFiles();
            //无子文件，直接结束
            if (ArrayUtil.isEmpty(files)){
                return;
            }
            for (File file : files) {
                //递归拷贝下一层文件
                copyFilesByRecursive(file,desOutputFile);
            }
        }else {
            //是文件，直接复制到目标目录下
            Path destPath = outputFile.toPath().resolve(inputFile.getName());
            Files.copy(inputFile.toPath(),destPath, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
