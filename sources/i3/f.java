package i3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import b7.a;
import com.google.android.gms.internal.measurement.f2;
import i3.p;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import m3.c;
import sf.j;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9447a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9448b;

    /* renamed from: c  reason: collision with root package name */
    public final c.C0212c f9449c;

    /* renamed from: d  reason: collision with root package name */
    public final p.c f9450d;

    /* renamed from: e  reason: collision with root package name */
    public final List<p.b> f9451e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9452f = false;

    /* renamed from: g  reason: collision with root package name */
    public final int f9453g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f9454h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f9455i;

    /* renamed from: j  reason: collision with root package name */
    public final Intent f9456j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f9457k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f9458l;
    public final Set<Integer> m;

    /* renamed from: n  reason: collision with root package name */
    public final Callable<InputStream> f9459n;

    /* renamed from: o  reason: collision with root package name */
    public final List<Object> f9460o;

    /* renamed from: p  reason: collision with root package name */
    public final List<Object> f9461p;

    @SuppressLint({"LambdaLast"})
    public f(Context context, String str, a aVar, p.c cVar, ArrayList arrayList, int i8, Executor executor, Executor executor2, boolean z10, boolean z11, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        j.f(context, "context");
        j.f(cVar, "migrationContainer");
        f2.a(i8, "journalMode");
        j.f(arrayList2, "typeConverters");
        j.f(arrayList3, "autoMigrationSpecs");
        this.f9447a = context;
        this.f9448b = str;
        this.f9449c = aVar;
        this.f9450d = cVar;
        this.f9451e = arrayList;
        this.f9453g = i8;
        this.f9454h = executor;
        this.f9455i = executor2;
        this.f9456j = null;
        this.f9457k = z10;
        this.f9458l = z11;
        this.m = linkedHashSet;
        this.f9459n = null;
        this.f9460o = arrayList2;
        this.f9461p = arrayList3;
    }

    public final boolean a(int i8, int i10) {
        Set<Integer> set;
        if (!(i8 > i10) || !this.f9458l) {
            return this.f9457k && ((set = this.m) == null || !set.contains(Integer.valueOf(i8)));
        }
        return false;
    }
}
