package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.h4  reason: invalid package */
public class h4 extends AbstractMap {
    public static final /* synthetic */ int C = 0;
    public Map B = Collections.emptyMap();

    /* renamed from: a  reason: collision with root package name */
    public final int f4610a;

    /* renamed from: b  reason: collision with root package name */
    public List f4611b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public Map f4612c = Collections.emptyMap();

    /* renamed from: d  reason: collision with root package name */
    public boolean f4613d;

    /* renamed from: e  reason: collision with root package name */
    public volatile g4 f4614e;

    public /* synthetic */ h4(int i8) {
        this.f4610a = i8;
    }

    public void a() {
        if (!this.f4613d) {
            this.f4612c = this.f4612c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4612c);
            this.B = this.B.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.B);
            this.f4613d = true;
        }
    }

    public final int b() {
        return this.f4611b.size();
    }

    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int d10 = d(comparable);
        if (d10 >= 0) {
            return ((e4) this.f4611b.get(d10)).setValue(obj);
        }
        h();
        boolean isEmpty = this.f4611b.isEmpty();
        int i8 = this.f4610a;
        if (isEmpty && !(this.f4611b instanceof ArrayList)) {
            this.f4611b = new ArrayList(i8);
        }
        int i10 = -(d10 + 1);
        if (i10 >= i8) {
            return g().put(comparable, obj);
        }
        if (this.f4611b.size() == i8) {
            e4 e4Var = (e4) this.f4611b.remove(i8 - 1);
            g().put(e4Var.f4506a, e4Var.f4507b);
        }
        this.f4611b.add(i10, new e4(this, comparable, obj));
        return null;
    }

    public final void clear() {
        h();
        if (!this.f4611b.isEmpty()) {
            this.f4611b.clear();
        }
        if (!this.f4612c.isEmpty()) {
            this.f4612c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return d(comparable) >= 0 || this.f4612c.containsKey(comparable);
    }

    public final int d(Comparable comparable) {
        int size = this.f4611b.size() - 1;
        int i8 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((e4) this.f4611b.get(size)).f4506a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i8 <= size) {
            int i10 = (i8 + size) / 2;
            int compareTo2 = comparable.compareTo(((e4) this.f4611b.get(i10)).f4506a);
            if (compareTo2 < 0) {
                size = i10 - 1;
            } else if (compareTo2 <= 0) {
                return i10;
            } else {
                i8 = i10 + 1;
            }
        }
        return -(i8 + 1);
    }

    public final Object e(int i8) {
        h();
        Object obj = ((e4) this.f4611b.remove(i8)).f4507b;
        if (!this.f4612c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            List list = this.f4611b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new e4(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final Set entrySet() {
        if (this.f4614e == null) {
            this.f4614e = new g4(this);
        }
        return this.f4614e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return super.equals(obj);
        }
        h4 h4Var = (h4) obj;
        int size = size();
        if (size != h4Var.size()) {
            return false;
        }
        int b10 = b();
        if (b10 != h4Var.b()) {
            return entrySet().equals(h4Var.entrySet());
        }
        for (int i8 = 0; i8 < b10; i8++) {
            if (!((Map.Entry) this.f4611b.get(i8)).equals((Map.Entry) h4Var.f4611b.get(i8))) {
                return false;
            }
        }
        if (b10 != size) {
            return this.f4612c.equals(h4Var.f4612c);
        }
        return true;
    }

    public final SortedMap g() {
        h();
        if (this.f4612c.isEmpty() && !(this.f4612c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4612c = treeMap;
            this.B = treeMap.descendingMap();
        }
        return (SortedMap) this.f4612c;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d10 = d(comparable);
        return d10 >= 0 ? ((e4) this.f4611b.get(d10)).f4507b : this.f4612c.get(comparable);
    }

    public final void h() {
        if (this.f4613d) {
            throw new UnsupportedOperationException();
        }
    }

    public final int hashCode() {
        int b10 = b();
        int i8 = 0;
        for (int i10 = 0; i10 < b10; i10++) {
            i8 += ((e4) this.f4611b.get(i10)).hashCode();
        }
        return this.f4612c.size() > 0 ? this.f4612c.hashCode() + i8 : i8;
    }

    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int d10 = d(comparable);
        if (d10 >= 0) {
            return e(d10);
        }
        if (this.f4612c.isEmpty()) {
            return null;
        }
        return this.f4612c.remove(comparable);
    }

    public final int size() {
        return this.f4612c.size() + this.f4611b.size();
    }
}
