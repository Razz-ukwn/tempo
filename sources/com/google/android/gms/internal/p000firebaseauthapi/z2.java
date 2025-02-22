package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z2  reason: invalid package */
public final class z2 extends f1 implements RandomAccess, a3 {

    /* renamed from: b  reason: collision with root package name */
    public final List f5120b;

    static {
        new z2((Object) null);
    }

    public z2() {
        this(10);
    }

    public final /* bridge */ /* synthetic */ void add(int i8, Object obj) {
        a();
        this.f5120b.add(i8, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i8, Collection collection) {
        a();
        if (collection instanceof a3) {
            collection = ((a3) collection).zzh();
        }
        boolean addAll = this.f5120b.addAll(i8, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: b */
    public final String get(int i8) {
        List list = this.f5120b;
        Object obj = list.get(i8);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            String h3 = q1Var.c() == 0 ? "" : q1Var.h(u2.f4974a);
            if (q1Var.j()) {
                list.set(i8, h3);
            }
            return h3;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, u2.f4974a);
        w4 w4Var = y4.f5099a;
        int length = bArr.length;
        w4Var.getClass();
        if (v4.a(bArr, 0, length)) {
            list.set(i8, str);
        }
        return str;
    }

    public final void clear() {
        a();
        this.f5120b.clear();
        this.modCount++;
    }

    public final void n(q1 q1Var) {
        a();
        this.f5120b.add(q1Var);
        this.modCount++;
    }

    public final Object remove(int i8) {
        a();
        Object remove = this.f5120b.remove(i8);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof q1)) {
            return new String((byte[]) remove, u2.f4974a);
        }
        q1 q1Var = (q1) remove;
        return q1Var.c() == 0 ? "" : q1Var.h(u2.f4974a);
    }

    public final Object set(int i8, Object obj) {
        a();
        Object obj2 = this.f5120b.set(i8, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof q1)) {
            return new String((byte[]) obj2, u2.f4974a);
        }
        q1 q1Var = (q1) obj2;
        return q1Var.c() == 0 ? "" : q1Var.h(u2.f4974a);
    }

    public final int size() {
        return this.f5120b.size();
    }

    public final /* bridge */ /* synthetic */ t2 zzd(int i8) {
        if (i8 >= size()) {
            ArrayList arrayList = new ArrayList(i8);
            arrayList.addAll(this.f5120b);
            return new z2(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final a3 zze() {
        return this.f4535a ? new p4(this) : this;
    }

    public final Object zzf(int i8) {
        return this.f5120b.get(i8);
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.f5120b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z2(int i8) {
        super(true);
        ArrayList arrayList = new ArrayList(i8);
        this.f5120b = arrayList;
    }

    public z2(ArrayList arrayList) {
        super(true);
        this.f5120b = arrayList;
    }

    public z2(Object obj) {
        super(false);
        this.f5120b = Collections.emptyList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
