package com.google.android.gms.internal.measurement;

import android.net.Uri;
import o.a;

public final class q4 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5481a = new a();

    public static synchronized Uri a() {
        synchronized (q4.class) {
            a aVar = f5481a;
            Uri uri = (Uri) aVar.getOrDefault("com.google.android.gms.measurement", null);
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            aVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
