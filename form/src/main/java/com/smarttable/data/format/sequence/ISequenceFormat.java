package com.smarttable.data.format.sequence;

import android.graphics.Canvas;
import android.graphics.Rect;

import com.smarttable.core.TableConfig;
import com.smarttable.data.format.IFormat;

/**
 * Created by huang on 2017/11/7.
 *
 *序号格式化
 */

public interface ISequenceFormat extends IFormat<Integer>{


   void draw(Canvas canvas, int sequence, Rect rect,TableConfig config);

}
