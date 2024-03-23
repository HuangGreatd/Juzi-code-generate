package com.juzipi.mark.meta;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;

/** 双检索单例模式
 * @author Juzipi
 * @version 1.0
 * @date 2024-03-21 20:31
 */
public class MeteManage {
    private static  volatile Meta meta;

    //私有化构造器
    private  MeteManage(){

    }

    public static Meta getMetaObject() {
        if (meta == null){
            synchronized (MeteManage.class){
                if (meta == null){
                    return initMeta();
                }
            }
        }
        return meta;
    }

    private static Meta initMeta() {
        String s = ResourceUtil.readUtf8Str("meta.json");
        Meta newMeta = JSONUtil.toBean(s, Meta.class);
        //校验和处理默认值
        MetaValidator.doValidAndFill(newMeta);
        //校验和处理默认值
        return newMeta;

    }
}
