package com.juzipi.mark.meta.enums;

/**
 * @author Juzipi
 * @version 1.0
 * @date 2024-03-23 11:41
 */
public enum FileGenerateTypeEnum {
    DYNAMIC("动态","dynamic"),
    STATIC("静态","static");

    private final String text;
    private final String value;

    FileGenerateTypeEnum(String text, String value) {
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
