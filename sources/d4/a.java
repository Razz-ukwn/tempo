package d4;

import h4.l;
import java.io.File;

public final class a implements b<File> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7297a;

    public a(boolean z10) {
        this.f7297a = z10;
    }

    public final String a(Object obj, l lVar) {
        File file = (File) obj;
        if (!this.f7297a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
