package com.spotify.automation.pagesobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class ExplorerPlayLists extends PageObject {

    @FindBy(xpath = "//div[@data-transition='sponsoredPlaylistHeaderText']")
    public  WebElementFacade titlePlayLists;

    @FindBy(xpath = "//div[@role='listitem']")
    public List<WebElementFacade> listItems;

    @FindBy(xpath ="//div[@data-encore-id='card']")
    public List<WebElementFacade> playlists;

    @FindBy(xpath ="//h2[@data-encore-id='listRowTitle']")
    public List<WebElementFacade> playlistsPage;


    public void clickItemByText(List<WebElementFacade> playlist, String name){
        for(WebElementFacade item : playlist){
            if(item.getText().equals(name)){
                item.click();
                return;
            }
        }
        throw new IllegalArgumentException("Item not found in list: " + name);
    }

    public void iterateThePlayList(List<WebElementFacade> playlists){
        for(WebElementFacade item: playlists){
            that(item.isVisible());
            that(item.getText()).isNotEmpty();
            return;
        }
    }

}
