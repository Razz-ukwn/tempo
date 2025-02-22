package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g4  reason: invalid package */
public final class g4 extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h4 f4567a;

    public /* synthetic */ g4(h4 h4Var) {
        this.f4567a = h4Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        Object value = entry.getValue();
        this.f4567a.put((Comparable) entry.getKey(), value);
        return true;
    }

    public final void clear() {
        this.f4567a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f4567a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 != null) {
            return obj2.equals(value);
        }
        return false;
    }

    public final Iterator iterator() {
        return new f4(this.f4567a);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f4567a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f4567a.size();
    }
}
