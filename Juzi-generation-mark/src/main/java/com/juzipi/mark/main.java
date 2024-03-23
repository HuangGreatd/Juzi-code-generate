package com.juzipi.mark;

import com.juzipi.mark.generation.main.MainGenerator;
import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * @author Juzipi
 * @version 1.0
 * @date 2024-03-23 12:11
 */
public class main {
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
        MainGenerator mainGenerator = new MainGenerator();
        mainGenerator.doGenerate();
    }
}
