package com.bin.david.smarttable.bean;

import com.smarttable.annotation.ColumnType;
import com.smarttable.annotation.SmartColumn;


/**
 * Created by huang on 2018/2/2.
 */

public class LessonPoint {

    @SmartColumn(id=4,name="知识点")
    private String name;
    public LessonPoint(String name) {
        this.name = name;
    }
}
