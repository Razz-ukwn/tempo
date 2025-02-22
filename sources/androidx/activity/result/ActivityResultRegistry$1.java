package androidx.activity.result;

import android.os.Bundle;
import androidx.activity.result.g;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import c.a;
import java.util.HashMap;

class ActivityResultRegistry$1 implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f605a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f606b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f607c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f608d;

    public ActivityResultRegistry$1(g gVar, String str, b bVar, a aVar) {
        this.f608d = gVar;
        this.f605a = str;
        this.f606b = bVar;
        this.f607c = aVar;
    }

    public final void d(p pVar, j.a aVar) {
        boolean equals = j.a.ON_START.equals(aVar);
        String str = this.f605a;
        g gVar = this.f608d;
        if (equals) {
            HashMap hashMap = gVar.f622f;
            b bVar = this.f606b;
            a aVar2 = this.f607c;
            hashMap.put(str, new g.a(bVar, aVar2));
            HashMap hashMap2 = gVar.f623g;
            if (hashMap2.containsKey(str)) {
                Object obj = hashMap2.get(str);
                hashMap2.remove(str);
                bVar.a(obj);
            }
            Bundle bundle = gVar.f624h;
            a aVar3 = (a) bundle.getParcelable(str);
            if (aVar3 != null) {
                bundle.remove(str);
                bVar.a(aVar2.c(aVar3.f610b, aVar3.f609a));
            }
        } else if (j.a.ON_STOP.equals(aVar)) {
            gVar.f622f.remove(str);
        } else if (j.a.ON_DESTROY.equals(aVar)) {
            gVar.f(str);
        }
    }
}
