package c;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import c.a;
import gf.s;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import sf.j;

public final class b extends a<String[], List<Uri>> {
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        j.f(componentActivity, "context");
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", (String[]) obj).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
        j.e(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
        return type;
    }

    public final a.C0054a b(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        j.f(componentActivity, "context");
        return null;
    }

    public final Object c(Intent intent, int i8) {
        if (!(i8 == -1)) {
            intent = null;
        }
        s sVar = s.f8978a;
        if (intent == null) {
            return sVar;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data = intent.getData();
        if (data != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            return sVar;
        }
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                Uri uri = clipData.getItemAt(i10).getUri();
                if (uri != null) {
                    linkedHashSet.add(uri);
                }
            }
        }
        return new ArrayList(linkedHashSet);
    }
}
