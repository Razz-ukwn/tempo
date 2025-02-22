package ea;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class a implements FilenameFilter {
    public final boolean accept(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }
}
