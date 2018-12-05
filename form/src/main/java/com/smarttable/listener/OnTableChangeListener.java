package com.smarttable.listener;

import android.view.MotionEvent;

/**
 * Created by huang on 2017/11/4.
 */

public interface OnTableChangeListener {

    void onTableChanged(float scale, float translateX, float translateY);

    void onScrolled(float dx, float dy);

}
