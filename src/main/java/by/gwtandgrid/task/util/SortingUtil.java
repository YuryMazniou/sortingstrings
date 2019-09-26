package by.gwtandgrid.task.util;

import com.google.gwt.user.client.ui.Grid;

public class SortingUtil {
    private static int height =0;
    private static int width=0;

    public static Grid sortingTextAreaAndGetGrid(String textArea){
        String[]line=textArea.split("\n");
        height =line.length;
        int count=0;
        for (int i = 0; i <line.length; i++) {
            String[]wLine=line[i].split("\t");
            if(wLine.length>count)count=wLine.length;
            if(line.length-1==i)width=count;
        }

        return null;
    }
}
