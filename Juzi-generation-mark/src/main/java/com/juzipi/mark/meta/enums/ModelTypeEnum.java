package com.juzipi.mark.meta.enums;

/**
 * @author Juzipi
 * @version 1.0
 * @date 2024-03-23 11:41
 */
public enum ModelTypeEnum {
    SRING("字符串","String"),
    BOOLEAN("布尔","Boolean");

    private final String text;
    private final String value;

    ModelTypeEnum(String text, String value) {
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
