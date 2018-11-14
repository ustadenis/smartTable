package com.smarttable.listener;

import com.smarttable.data.column.Column;

/**
 * Created by huang on 2017/11/4.
 */

public interface OnColumnItemLongClickListener<T> {

    void onLongClick(Column<T> column, String value, T t, int position);
}
