package com.spotify.automation.steps;

import com.spotify.automation.pagesobject.ExplorerPlayLists;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class ExplorerPlayListsSteps {

    @Page
    ExplorerPlayLists explorerPlayLists;

    @Step("choose item playlist")
    public void selectItem(String value){
        explorerPlayLists.clickItemByText(explorerPlayLists.listItems,value);
    }

    @Step("Check that playlist is correct")
    public void chekPlayList(String value){
        explorerPlayLists.titlePlayLists.waitUntilVisible();
        that( explorerPlayLists.titlePlayLists.getText().equals(value));
        explorerPlayLists.playlists.get(0).waitUntilVisible();
        explorerPlayLists.iterateThePlayList(explorerPlayLists.playlistsPage);
        explorerPlayLists.iterateThePlayList(explorerPlayLists.playlists);
    }



}
