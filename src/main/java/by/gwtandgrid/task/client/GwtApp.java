package by.gwtandgrid.task.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.user.client.ui.*;

import static by.gwtandgrid.task.util.SortingUtil.*;

public class GwtApp implements EntryPoint {

    private TextArea ta;
    private Button b ;
    private Grid g;

    {
        ta = new TextArea();
        ta.setCharacterWidth(60);
        ta.setVisibleLines(20);

        b = new Button("Process",new ClickHandler() {
            public void onClick(ClickEvent event) {
                sendInfoToServer();
            }
        });
    }

    private final GwtAppServiceIntfAsync gwtAppService = GWT.create(GwtAppServiceIntf.class);

    public void onModuleLoad() {
        RootPanel.get("textArea").add(ta);
        RootPanel.get("button").add(b);
    }

    private void sendInfoToServer() {
        String textArea=ta.getText();
        g= sortingTextAreaAndGetGrid(textArea);
        if(g!=null){
            RootPanel.get("table").clear();
            RootPanel.get("table").add(g);}
    }
}
