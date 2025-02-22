package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class a9 extends AbstractMap {
    public static final /* synthetic */ int C = 0;
    public Map B = Collections.emptyMap();

    /* renamed from: a  reason: collision with root package name */
    public final int f5152a;

    /* renamed from: b  reason: collision with root package name */
    public List f5153b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public Map f5154c = Collections.emptyMap();

    /* renamed from: d  reason: collision with root package name */
    public boolean f5155d;

    /* renamed from: e  reason: collision with root package name */
    public volatile z8 f5156e;

    public /* synthetic */ a9(int i8) {
        this.f5152a = i8;
    }

    public void a() {
        if (!this.f5155d) {
            this.f5154c = this.f5154c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f5154c);
            this.B = this.B.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.B);
            this.f5155d = true;
        }
    }

    public final int b() {
        return this.f5153b.size();
    }

    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int d10 = d(comparable);
        if (d10 >= 0) {
            return ((x8) this.f5153b.get(d10)).setValue(obj);
        }
        h();
        boolean isEmpty = this.f5153b.isEmpty();
        int i8 = this.f5152a;
        if (isEmpty && !(this.f5153b instanceof ArrayList)) {
            this.f5153b = new ArrayList(i8);
        }
        int i10 = -(d10 + 1);
        if (i10 >= i8) {
            return g().put(comparable, obj);
        }
        if (this.f5153b.size() == i8) {
            x8 x8Var = (x8) this.f5153b.remove(i8 - 1);
            g().put(x8Var.f5585a, x8Var.f5586b);
        }
        this.f5153b.add(i10, new x8(this, comparable, obj));
        return null;
    }

    public final void clear() {
        h();
        if (!this.f5153b.isEmpty()) {
            this.f5153b.clear();
        }
        if (!this.f5154c.isEmpty()) {
            this.f5154c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return d(comparable) >= 0 || this.f5154c.containsKey(comparable);
    }

    public final int d(Comparable comparable) {
        int size = this.f5153b.size() - 1;
        int i8 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((x8) this.f5153b.get(size)).f5585a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i8 <= size) {
            int i10 = (i8 + size) / 2;
            int compareTo2 = comparable.compareTo(((x8) this.f5153b.get(i10)).f5585a);
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
        Object obj = ((x8) this.f5153b.remove(i8)).f5586b;
        if (!this.f5154c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            List list = this.f5153b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new x8(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final Set entrySet() {
        if (this.f5156e == null) {
            this.f5156e = new z8(this);
        }
        return this.f5156e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9)) {
            return super.equals(obj);
        }
        a9 a9Var = (a9) obj;
        int size = size();
        if (size != a9Var.size()) {
            return false;
        }
        int b10 = b();
        if (b10 != a9Var.b()) {
            return entrySet().equals(a9Var.entrySet());
        }
        for (int i8 = 0; i8 < b10; i8++) {
            if (!((Map.Entry) this.f5153b.get(i8)).equals((Map.Entry) a9Var.f5153b.get(i8))) {
                return false;
            }
        }
        if (b10 != size) {
            return this.f5154c.equals(a9Var.f5154c);
        }
        return true;
    }

    public final SortedMap g() {
        h();
        if (this.f5154c.isEmpty() && !(this.f5154c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5154c = treeMap;
            this.B = treeMap.descendingMap();
        }
        return (SortedMap) this.f5154c;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d10 = d(comparable);
        return d10 >= 0 ? ((x8) this.f5153b.get(d10)).f5586b : this.f5154c.get(comparable);
    }

    public final void h() {
        if (this.f5155d) {
            throw new UnsupportedOperationException();
        }
    }

    public final int hashCode() {
        int b10 = b();
        int i8 = 0;
        for (int i10 = 0; i10 < b10; i10++) {
            i8 += ((x8) this.f5153b.get(i10)).hashCode();
        }
        return this.f5154c.size() > 0 ? this.f5154c.hashCode() + i8 : i8;
    }

    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int d10 = d(comparable);
        if (d10 >= 0) {
            return e(d10);
        }
        if (this.f5154c.isEmpty()) {
            return null;
        }
        return this.f5154c.remove(comparable);
    }

    public final int size() {
        return this.f5154c.size() + this.f5153b.size();
    }
}
