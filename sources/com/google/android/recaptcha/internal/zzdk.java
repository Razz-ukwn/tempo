package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import cb.d;
import gf.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import sf.j;

public final class zzdk {
    public static final zzdk zza = new zzdk();
    private static final List zzb = zzc(d.P("www.recaptcha.net", "www.gstatic.com/recaptcha"));

    private zzdk() {
    }

    public static final boolean zza(Uri uri) {
        return !TextUtils.isEmpty(uri.toString()) && j.a("https", uri.getScheme()) && !TextUtils.isEmpty(uri.getHost()) && zzb(uri.toString());
    }

    private static final boolean zzb(String str) {
        List<String> list = zzb;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String x02 : list) {
            if (zf.j.x0(str, x02, false)) {
                return true;
            }
        }
        return false;
    }

    private static final List zzc(List list) {
        ArrayList arrayList = new ArrayList(m.n0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }
}
