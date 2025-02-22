package androidx.lifecycle;

import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import ff.d;
import rf.a;
import xf.b;

public final class k0<VM extends j0> implements d<VM> {

    /* renamed from: a  reason: collision with root package name */
    public final b<VM> f2285a;

    /* renamed from: b  reason: collision with root package name */
    public final a<o0> f2286b;

    /* renamed from: c  reason: collision with root package name */
    public final a<m0.b> f2287c;

    /* renamed from: d  reason: collision with root package name */
    public final a<x2.a> f2288d;

    /* renamed from: e  reason: collision with root package name */
    public VM f2289e;

    public k0(sf.d dVar, a aVar, a aVar2, a aVar3) {
        this.f2285a = dVar;
        this.f2286b = aVar;
        this.f2287c = aVar2;
        this.f2288d = aVar3;
    }

    public final Object getValue() {
        VM vm = this.f2289e;
        if (vm != null) {
            return vm;
        }
        VM a10 = new m0(this.f2286b.d(), this.f2287c.d(), this.f2288d.d()).a(cb.b.y(this.f2285a));
        this.f2289e = a10;
        return a10;
    }
}
