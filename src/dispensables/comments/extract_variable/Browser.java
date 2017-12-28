package dispensables.comments.extract_variable;

public class Browser {
    private String platform;
    private String browser;
    private int resize;

    void renderBanner() {
        // some lengthy explanation what this complex condition means...
        if ((platform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("IE") > -1) &&
                wasInitialized() && resize > 0 )
        {
            // do something
        }
    }

    private boolean wasInitialized() {
        return false;
    }
}
