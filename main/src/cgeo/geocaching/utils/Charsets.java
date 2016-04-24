package cgeo.geocaching.utils;

import java.nio.charset.Charset;

/**
 * utility class, just for disabling the deprecated warning at a single place
 */
public final class Charsets {
    private Charsets() {
        // utility class
    }

    /**
     * We cannot use the recommend java.nio charset, this that is not available in old android target versions
     */
    @SuppressWarnings("deprecation") public static Charset UTF_8 = org.apache.commons.io.Charsets.UTF_8;
}
