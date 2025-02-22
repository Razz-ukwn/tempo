package ea;

import java.io.File;
import java.util.Comparator;

public final /* synthetic */ class b implements Comparator {
    public final int compare(Object obj, Object obj2) {
        String name = ((File) obj).getName();
        int i8 = d.f7896e;
        return name.substring(0, i8).compareTo(((File) obj2).getName().substring(0, i8));
    }
}
