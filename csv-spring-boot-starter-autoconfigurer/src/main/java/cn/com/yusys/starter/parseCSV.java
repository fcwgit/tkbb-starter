package cn.com.yusys.starter;

import cn.com.yusys.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class parseCSV {
    public List<BaseEntity>  parseCSV(Class<BaseEntity> clazz){
        /**
         * 1、解析CSV文件
         * 2、按行读取记录
         * 3、将按行读取的字符串，赋值给BaseEntity的initEntity函数初始化BaseEntity
         * 4、
         */
        List<BaseEntity> baseEntityList = new ArrayList<>();
        try {
            BaseEntity baseEntity = clazz.newInstance();

            baseEntity.initEntity("");
            baseEntityList.add(baseEntity);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return baseEntityList;
    }
}
