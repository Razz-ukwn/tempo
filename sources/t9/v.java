package t9;

import com.google.android.gms.internal.measurement.c9;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import na.c;
import qa.b;

public final class v implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Set<u<?>> f15497a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<u<?>> f15498b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<u<?>> f15499c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<u<?>> f15500d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<u<?>> f15501e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<Class<?>> f15502f;

    /* renamed from: g  reason: collision with root package name */
    public final c f15503g;

    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Class<?>> f15504a;

        /* renamed from: b  reason: collision with root package name */
        public final c f15505b;

        public a(Set<Class<?>> set, c cVar) {
            this.f15504a = set;
            this.f15505b = cVar;
        }
    }

    public v(b bVar, j jVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (l next : bVar.f15450c) {
            int i8 = next.f15481c;
            boolean z10 = true;
            boolean z11 = i8 == 0;
            int i10 = next.f15480b;
            u<?> uVar = next.f15479a;
            if (z11) {
                if (i10 != 2 ? false : z10) {
                    hashSet4.add(uVar);
                } else {
                    hashSet.add(uVar);
                }
            } else {
                if (i8 == 2) {
                    hashSet3.add(uVar);
                } else {
                    if (i10 != 2 ? false : z10) {
                        hashSet5.add(uVar);
                    } else {
                        hashSet2.add(uVar);
                    }
                }
            }
        }
        Set<Class<?>> set = bVar.f15454g;
        if (!set.isEmpty()) {
            hashSet.add(u.a(c.class));
        }
        this.f15497a = Collections.unmodifiableSet(hashSet);
        this.f15498b = Collections.unmodifiableSet(hashSet2);
        this.f15499c = Collections.unmodifiableSet(hashSet3);
        this.f15500d = Collections.unmodifiableSet(hashSet4);
        this.f15501e = Collections.unmodifiableSet(hashSet5);
        this.f15502f = set;
        this.f15503g = jVar;
    }

    public final <T> T a(Class<T> cls) {
        if (this.f15497a.contains(u.a(cls))) {
            T a10 = this.f15503g.a(cls);
            return !cls.equals(c.class) ? a10 : new a(this.f15502f, (c) a10);
        }
        throw new c9(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public final <T> Set<T> b(u<T> uVar) {
        if (this.f15500d.contains(uVar)) {
            return this.f15503g.b(uVar);
        }
        throw new c9(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{uVar}));
    }

    public final <T> b<T> c(u<T> uVar) {
        if (this.f15498b.contains(uVar)) {
            return this.f15503g.c(uVar);
        }
        throw new c9(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{uVar}));
    }

    public final <T> qa.a<T> d(u<T> uVar) {
        if (this.f15499c.contains(uVar)) {
            return this.f15503g.d(uVar);
        }
        throw new c9(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{uVar}));
    }

    public final <T> b<T> e(Class<T> cls) {
        return c(u.a(cls));
    }

    public final <T> b<Set<T>> f(u<T> uVar) {
        if (this.f15501e.contains(uVar)) {
            return this.f15503g.f(uVar);
        }
        throw new c9(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{uVar}));
    }

    public final <T> T g(u<T> uVar) {
        if (this.f15497a.contains(uVar)) {
            return this.f15503g.g(uVar);
        }
        throw new c9(String.format("Attempting to request an undeclared dependency %s.", new Object[]{uVar}));
    }

    public final <T> qa.a<T> h(Class<T> cls) {
        return d(u.a(cls));
    }
}
