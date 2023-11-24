package StepDefinitions;

import Pages.LoginPage;
import Pages.MapViewerPage;
//import Pages.MapViewerPage;

public class PageInitializer {

    public  static LoginPage login;

    public static MapViewerPage mapViewer;



    public  static void initializePageObjects() {
        login = new LoginPage();
        mapViewer = new MapViewerPage();


    }

}
