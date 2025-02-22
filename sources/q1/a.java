package q1;

import androidx.compose.ui.platform.j3;
import androidx.lifecycle.u;
import c2.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.m0;
import com.google.android.gms.internal.p000firebaseauthapi.n;
import com.google.android.gms.internal.p000firebaseauthapi.q0;
import com.google.android.gms.internal.p000firebaseauthapi.v6;
import com.google.android.gms.internal.p000firebaseauthapi.w;
import com.google.android.gms.internal.p000firebaseauthapi.x;
import ha.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o.f;
import r9.g0;
import s9.j;
import u6.q;

public final class a implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12824a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f12825b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f12826c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12827d;

    public /* synthetic */ a(u uVar, String str, String str2, j3 j3Var) {
        this.f12827d = uVar;
        this.f12824a = str;
        this.f12825b = str2;
        this.f12826c = j3Var;
    }

    public /* synthetic */ a(Status status, g0 g0Var, String str, String str2) {
        this.f12824a = status;
        this.f12825b = g0Var;
        this.f12826c = str;
        this.f12827d = str2;
    }

    public /* synthetic */ a(Throwable th, c cVar) {
        this.f12824a = th.getLocalizedMessage();
        this.f12825b = th.getClass().getName();
        this.f12826c = cVar.c(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f12827d = cause != null ? new a(cause, cVar) : null;
    }

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((f) this.f12825b).getOrDefault(obj, null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        a(arrayList2.get(i8), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public final void d(n nVar) {
        m0 m0Var = (m0) nVar;
        q0 q0Var = new q0();
        String str = m0Var.f4724b;
        q.f(str);
        q0Var.f4825a = str;
        String str2 = (String) this.f12824a;
        u uVar = q0Var.f4828d;
        if (str2 == null) {
            ((List) uVar.f2324b).add("EMAIL");
        } else {
            q0Var.f4826b = str2;
        }
        String str3 = (String) this.f12825b;
        if (str3 == null) {
            ((List) uVar.f2324b).add("PASSWORD");
        } else {
            q0Var.f4827c = str3;
        }
        u uVar2 = (u) this.f12827d;
        j3 j3Var = (j3) this.f12826c;
        q.i(j3Var);
        ((x) uVar2.f2324b).d(new u(m0Var.f4724b), new v6(j3Var, uVar2, this, m0Var, q0Var));
    }

    public final void zza(String str) {
        ((j3) this.f12826c).i(j.a(str));
    }

    public /* synthetic */ a() {
        this.f12824a = new e(10);
        this.f12825b = new f();
        this.f12826c = new ArrayList();
        this.f12827d = new HashSet();
    }
}
