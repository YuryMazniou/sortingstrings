package by.gwtandgrid.task.util;

import com.google.gwt.regexp.shared.MatchResult;
import com.google.gwt.regexp.shared.RegExp;
import com.google.gwt.user.client.ui.Grid;
import java.math.BigDecimal;

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

    public static int compareLine(String first,String second){
        RegExp reg = RegExp.compile("\\d+|\\d+\\.\\d+");
        MatchResult matcherF = reg.exec(first);
        MatchResult matcherS = reg.exec(second);
        boolean result=matcherF!=null||matcherS!=null;
        if(result){
            BigDecimal f=new BigDecimal(first);
            BigDecimal s=new BigDecimal(second);
            return first.compareTo(second);
        }
        else {
            if(matcherF==null&&matcherS!=null){
                return -1;
            }
            else {
                if(matcherF!=null&&matcherS==null){
                    return 1;
                }
            }
        }
        return first.compareTo(second);
    }

    public static void main(String[] args) {
        BigDecimal first=new BigDecimal("2.2");
        BigDecimal second=new BigDecimal("2.21");
        System.out.println(false||false);
    }
}
