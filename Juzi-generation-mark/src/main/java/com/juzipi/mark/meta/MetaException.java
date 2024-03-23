package com.juzipi.mark.meta;

/**
 * @author Juzipi
 * @version 1.0
 * @date 2024-03-23 10:36
 */
public class MetaException extends RuntimeException{
    public MetaException(String message){
        super(message);
    }

    public MetaException(String message,Throwable cause){
        super(message,cause);
    }
}
