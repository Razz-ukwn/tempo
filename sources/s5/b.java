package s5;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import r5.i;
import s5.f;
import t5.c;
import w5.d;

public abstract class b<T extends f> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f14706a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f14707b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14708c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a f14709d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14710e;

    /* renamed from: f  reason: collision with root package name */
    public transient c f14711f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14712g;

    /* renamed from: h  reason: collision with root package name */
    public final float f14713h;

    /* renamed from: i  reason: collision with root package name */
    public final float f14714i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f14715j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f14716k;

    /* renamed from: l  reason: collision with root package name */
    public final z5.c f14717l;
    public final float m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f14718n;

    public b() {
        this.f14706a = null;
        this.f14707b = null;
        this.f14708c = "DataSet";
        this.f14709d = i.a.f14064a;
        this.f14710e = true;
        this.f14712g = 3;
        this.f14713h = Float.NaN;
        this.f14714i = Float.NaN;
        this.f14715j = true;
        this.f14716k = true;
        this.f14717l = new z5.c();
        this.m = 17.0f;
        this.f14718n = true;
        this.f14706a = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f14707b = arrayList;
        this.f14706a.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        arrayList.add(-16777216);
        this.f14708c = "dB-A";
    }

    public final float B() {
        return this.f14713h;
    }

    public final int D(int i8) {
        ArrayList arrayList = this.f14706a;
        return ((Integer) arrayList.get(i8 % arrayList.size())).intValue();
    }

    public final void E() {
    }

    public final boolean F() {
        return this.f14711f == null;
    }

    public final int G(int i8) {
        ArrayList arrayList = this.f14707b;
        return ((Integer) arrayList.get(i8 % arrayList.size())).intValue();
    }

    public final List<Integer> I() {
        return this.f14706a;
    }

    public final boolean P() {
        return this.f14715j;
    }

    public final i.a U() {
        return this.f14709d;
    }

    public final z5.c W() {
        return this.f14717l;
    }

    public final int X() {
        return ((Integer) this.f14706a.get(0)).intValue();
    }

    public final boolean Z() {
        return this.f14710e;
    }

    public final int b() {
        return this.f14712g;
    }

    public final void i() {
    }

    public final boolean isVisible() {
        return this.f14718n;
    }

    public final boolean l() {
        return this.f14716k;
    }

    public final String n() {
        return this.f14708c;
    }

    public final float t() {
        return this.m;
    }

    public final c u() {
        return F() ? z5.f.f17752g : this.f14711f;
    }

    public final void v(t5.b bVar) {
        if (bVar != null) {
            this.f14711f = bVar;
        }
    }

    public final float x() {
        return this.f14714i;
    }
}
