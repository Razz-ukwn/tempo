package d4;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import h4.l;
import sf.j;

public final class c implements b<Uri> {
    public final String a(Object obj, l lVar) {
        Uri uri = (Uri) obj;
        if (!j.a(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        Configuration configuration = lVar.f9195a.getResources().getConfiguration();
        Bitmap.Config[] configArr = m4.c.f11189a;
        sb2.append(configuration.uiMode & 48);
        return sb2.toString();
    }
}
