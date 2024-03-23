package com.juzipi.mark.generation.main;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.StrUtil;
import com.juzipi.mark.generation.JarGenerator;
import com.juzipi.mark.generation.ScriptGenerator;
import com.juzipi.mark.generation.file.DynamicFileGenerator;
import com.juzipi.mark.meta.Meta;
import com.juzipi.mark.meta.MeteManage;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * 模板方法模式 -> 子类
 *
 * @author Juzipi
 * @version 1.0
 * @date 2024-03-22 8:34
 */
public class MainGenerator extends GenerateTemplate {

    @Override
    protected void buildDist(String outputPath, String sourceCopyPath, String jarPath, String shellOutputPath) {
        System.out.println("不要输出dist");
    }
}
