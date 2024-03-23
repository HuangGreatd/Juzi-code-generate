package com.juzipi.mark.model;

import lombok.Data;

/**
 * 动态配置模板
 */
@Data
public class DataModel {

    /**
     * 是否生成循环
     */
    private boolean loop;

    /**
     * 作者注释
     */
    private String author = "juzipi";

    /**
     * 输出信息
     */
    private String outputText = "sum = ";
}
