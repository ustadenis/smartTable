package com.bin.david.smarttable.bean;

import com.smarttable.annotation.ColumnType;
import com.smarttable.annotation.SmartColumn;

import java.util.List;

/**
 * Created by huang on 2018/2/6.
 */

public class Week {
    @SmartColumn(id=2,name ="星期")
    private String name;
    @SmartColumn(type = ColumnType.ArrayChild)
    private List<DayTime> times;

    public Week(String name, List<DayTime> times) {
        this.name = name;
        this.times = times;
    }
}
