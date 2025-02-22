package z9;

import ea.d;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

public final /* synthetic */ class j implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17847a;

    public /* synthetic */ j(int i8) {
        this.f17847a = i8;
    }

    public final boolean accept(File file, String str) {
        switch (this.f17847a) {
            case 0:
                return str.startsWith(".ae");
            default:
                Charset charset = d.f7895d;
                return str.startsWith("event");
        }
    }
}
