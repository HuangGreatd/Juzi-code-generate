package com.juzipi.mark.meta.enums;

/**
 * @author Juzipi
 * @version 1.0
 * @date 2024-03-23 11:41
 */
public enum FileTypeEnum {
    DIR("目录","dir"),
    FILE("文件","file");

    private final String text;
    private final String value;

    FileTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }
    public String getText() {
        return text;
    }
    public String getValue() {
        return value;
    }

}
