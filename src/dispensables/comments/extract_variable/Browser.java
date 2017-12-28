package dispensables.comments.extract_variable;

public class Browser {
    private String platform;
    private String browser;
    private int resize;

    void renderBanner() {
        final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;;
        final boolean isIE = browser.toUpperCase().indexOf("IE") > -1;
        final boolean wasResized = resize > 0;

        if (isMacOs && isIE && wasInitialized() && wasResized)
        {
            // do something
        }
    }

    private boolean wasInitialized() {
        return false;
    }
}
