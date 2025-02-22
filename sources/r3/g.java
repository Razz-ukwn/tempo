package r3;

import android.view.View;
import java.util.ArrayList;

public final class g extends n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f13825a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f13826b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13827c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f13828d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f13829e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f13830f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f13831g;

    public g(f fVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f13831g = fVar;
        this.f13825a = obj;
        this.f13826b = arrayList;
        this.f13829e = obj2;
        this.f13830f = arrayList2;
    }

    public final void c(k kVar) {
        kVar.z(this);
    }

    public final void e(k kVar) {
        f fVar = this.f13831g;
        Object obj = this.f13825a;
        if (obj != null) {
            fVar.s(obj, this.f13826b, (ArrayList<View>) null);
        }
        Object obj2 = this.f13827c;
        if (obj2 != null) {
            fVar.s(obj2, this.f13828d, (ArrayList<View>) null);
        }
        Object obj3 = this.f13829e;
        if (obj3 != null) {
            fVar.s(obj3, this.f13830f, (ArrayList<View>) null);
        }
    }
}
