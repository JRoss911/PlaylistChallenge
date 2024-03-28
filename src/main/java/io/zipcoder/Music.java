package io.zipcoder;

import java.util.Arrays;

public class Music {

    private String[] playList;

    //have to compare starting index to index of selected song
    //return the index distance between the two
    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        Integer i = 0;
        --i;
        Integer selectionIndex = Arrays.asList(playList).indexOf(selection);
        {
            if (i < playList.length || i > playList.length) {
                return selectionIndex - startIndex % 1 -1;
            }
        }
        return i;
    }
}