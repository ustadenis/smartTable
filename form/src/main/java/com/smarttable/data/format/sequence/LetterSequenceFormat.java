package com.smarttable.data.format.sequence;


import com.smarttable.utils.LetterUtils;

/**
 * Created by huang on 2017/11/7.
 */

public class LetterSequenceFormat extends BaseSequenceFormat{

    @Override
    public String format(Integer position) {
        return LetterUtils.ToNumberSystem26(position);
    }
}
