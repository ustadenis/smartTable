package com.smarttable.data.format.title;

import android.graphics.Canvas;
import android.graphics.Rect;

import com.smarttable.core.TableConfig;
import com.smarttable.data.column.Column;

/**
 * Created by huang on 2017/11/6.
 */

public interface ITitleDrawFormat {

    /**
     * 测量宽
     */
    int measureWidth(Column column, TableConfig config);

    /**
     * 测量高
     */
    int measureHeight(TableConfig config);

    /**
     * 绘制
     *
     * @param c      画笔
     * @param column 列信息
     */
    void draw(Canvas c, Column column, Rect rect, TableConfig config);


}
