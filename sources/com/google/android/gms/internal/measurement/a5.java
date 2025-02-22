package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import o.a;

public final class a5 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5146a = new a();

    public static synchronized void a() {
        synchronized (a5.class) {
            a aVar = f5146a;
            Iterator it = ((a.e) aVar.values()).iterator();
            if (!it.hasNext()) {
                aVar.clear();
            } else {
                ((a5) it.next()).getClass();
                throw null;
            }
        }
    }
}
