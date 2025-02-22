package h4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import i4.e;
import jg.q;
import q.g;
import sf.j;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9195a;

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap.Config f9196b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorSpace f9197c;

    /* renamed from: d  reason: collision with root package name */
    public final e f9198d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9199e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9200f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9201g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9202h;

    /* renamed from: i  reason: collision with root package name */
    public final String f9203i;

    /* renamed from: j  reason: collision with root package name */
    public final q f9204j;

    /* renamed from: k  reason: collision with root package name */
    public final o f9205k;

    /* renamed from: l  reason: collision with root package name */
    public final m f9206l;
    public final int m;

    /* renamed from: n  reason: collision with root package name */
    public final int f9207n;

    /* renamed from: o  reason: collision with root package name */
    public final int f9208o;

    public l(Context context, Bitmap.Config config, ColorSpace colorSpace, e eVar, int i8, boolean z10, boolean z11, boolean z12, String str, q qVar, o oVar, m mVar, int i10, int i11, int i12) {
        this.f9195a = context;
        this.f9196b = config;
        this.f9197c = colorSpace;
        this.f9198d = eVar;
        this.f9199e = i8;
        this.f9200f = z10;
        this.f9201g = z11;
        this.f9202h = z12;
        this.f9203i = str;
        this.f9204j = qVar;
        this.f9205k = oVar;
        this.f9206l = mVar;
        this.m = i10;
        this.f9207n = i11;
        this.f9208o = i12;
    }

    public static l a(l lVar, Bitmap.Config config) {
        l lVar2 = lVar;
        Context context = lVar2.f9195a;
        ColorSpace colorSpace = lVar2.f9197c;
        e eVar = lVar2.f9198d;
        int i8 = lVar2.f9199e;
        boolean z10 = lVar2.f9200f;
        boolean z11 = lVar2.f9201g;
        boolean z12 = lVar2.f9202h;
        String str = lVar2.f9203i;
        q qVar = lVar2.f9204j;
        o oVar = lVar2.f9205k;
        m mVar = lVar2.f9206l;
        int i10 = lVar2.m;
        int i11 = lVar2.f9207n;
        int i12 = lVar2.f9208o;
        lVar.getClass();
        return new l(context, config, colorSpace, eVar, i8, z10, z11, z12, str, qVar, oVar, mVar, i10, i11, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return j.a(this.f9195a, lVar.f9195a) && this.f9196b == lVar.f9196b && j.a(this.f9197c, lVar.f9197c) && j.a(this.f9198d, lVar.f9198d) && this.f9199e == lVar.f9199e && this.f9200f == lVar.f9200f && this.f9201g == lVar.f9201g && this.f9202h == lVar.f9202h && j.a(this.f9203i, lVar.f9203i) && j.a(this.f9204j, lVar.f9204j) && j.a(this.f9205k, lVar.f9205k) && j.a(this.f9206l, lVar.f9206l) && this.m == lVar.m && this.f9207n == lVar.f9207n && this.f9208o == lVar.f9208o;
        }
    }

    public final int hashCode() {
        int hashCode = (this.f9196b.hashCode() + (this.f9195a.hashCode() * 31)) * 31;
        int i8 = 0;
        ColorSpace colorSpace = this.f9197c;
        int hashCode2 = colorSpace != null ? colorSpace.hashCode() : 0;
        int hashCode3 = this.f9198d.hashCode();
        int c3 = g.c(this.f9199e);
        int hashCode4 = Boolean.hashCode(this.f9200f);
        int hashCode5 = (Boolean.hashCode(this.f9202h) + ((Boolean.hashCode(this.f9201g) + ((hashCode4 + ((c3 + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f9203i;
        if (str != null) {
            i8 = str.hashCode();
        }
        int hashCode6 = this.f9204j.hashCode();
        int hashCode7 = this.f9205k.hashCode();
        int hashCode8 = this.f9206l.hashCode();
        int c10 = g.c(this.m);
        return g.c(this.f9208o) + ((g.c(this.f9207n) + ((c10 + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + i8) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
