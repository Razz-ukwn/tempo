package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class r7 extends a6 implements RandomAccess, s7 {

    /* renamed from: b  reason: collision with root package name */
    public final List f5501b;

    static {
        new r7((Object) null);
    }

    public r7() {
        this(10);
    }

    public final /* bridge */ /* synthetic */ void add(int i8, Object obj) {
        a();
        this.f5501b.add(i8, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i8, Collection collection) {
        a();
        if (collection instanceof s7) {
            collection = ((s7) collection).zzh();
        }
        boolean addAll = this.f5501b.addAll(i8, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: b */
    public final String get(int i8) {
        List list = this.f5501b;
        Object obj = list.get(i8);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof k6) {
            k6 k6Var = (k6) obj;
            String f10 = k6Var.c() == 0 ? "" : k6Var.f(m7.f5399a);
            if (k6Var.h()) {
                list.set(i8, f10);
            }
            return f10;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, m7.f5399a);
        p9 p9Var = r9.f5506a;
        int length = bArr.length;
        p9Var.getClass();
        if (o9.a(bArr, 0, length)) {
            list.set(i8, str);
        }
        return str;
    }

    public final void clear() {
        a();
        this.f5501b.clear();
        this.modCount++;
    }

    public final Object remove(int i8) {
        a();
        Object remove = this.f5501b.remove(i8);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof k6)) {
            return new String((byte[]) remove, m7.f5399a);
        }
        k6 k6Var = (k6) remove;
        return k6Var.c() == 0 ? "" : k6Var.f(m7.f5399a);
    }

    public final Object set(int i8, Object obj) {
        a();
        Object obj2 = this.f5501b.set(i8, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof k6)) {
            return new String((byte[]) obj2, m7.f5399a);
        }
        k6 k6Var = (k6) obj2;
        return k6Var.c() == 0 ? "" : k6Var.f(m7.f5399a);
    }

    public final int size() {
        return this.f5501b.size();
    }

    public final void u(k6 k6Var) {
        a();
        this.f5501b.add(k6Var);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ l7 zzd(int i8) {
        if (i8 >= size()) {
            ArrayList arrayList = new ArrayList(i8);
            arrayList.addAll(this.f5501b);
            return new r7(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final s7 zze() {
        return this.f5147a ? new i9(this) : this;
    }

    public final Object zzf(int i8) {
        return this.f5501b.get(i8);
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.f5501b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r7(int i8) {
        super(true);
        ArrayList arrayList = new ArrayList(i8);
        this.f5501b = arrayList;
    }

    public r7(ArrayList arrayList) {
        super(true);
        this.f5501b = arrayList;
    }

    public r7(Object obj) {
        super(false);
        this.f5501b = Collections.emptyList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
