package androidx.fragment.app;

import android.view.View;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class w0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2157a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2158b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2159c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2160d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2161e;

    public w0(int i8, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f2157a = i8;
        this.f2158b = arrayList;
        this.f2159c = arrayList2;
        this.f2160d = arrayList3;
        this.f2161e = arrayList4;
    }

    public final void run() {
        for (int i8 = 0; i8 < this.f2157a; i8++) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.i.v((View) this.f2158b.get(i8), (String) this.f2159c.get(i8));
            i0.i.v((View) this.f2160d.get(i8), (String) this.f2161e.get(i8));
        }
    }
}
