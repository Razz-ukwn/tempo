package j1;

import android.util.Log;
import android.util.SparseArray;
import androidx.compose.ui.platform.j3;
import androidx.fragment.app.i0;
import androidx.fragment.app.l0;
import androidx.fragment.app.n0;
import androidx.fragment.app.o0;
import androidx.fragment.app.p;
import androidx.lifecycle.u;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.p000firebaseauthapi.d;
import com.google.android.gms.internal.p000firebaseauthapi.e0;
import com.google.android.gms.internal.p000firebaseauthapi.m0;
import com.google.android.gms.internal.p000firebaseauthapi.n;
import com.google.android.gms.internal.p000firebaseauthapi.rh;
import com.google.android.gms.internal.p000firebaseauthapi.w;
import com.google.android.gms.internal.p000firebaseauthapi.x;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.a;
import s9.j;
import s9.s;
import u6.q;

public final class c implements w, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9755a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9756b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f9757c;

    /* renamed from: d  reason: collision with root package name */
    public Object f9758d;

    public /* synthetic */ c(u uVar, r9.c cVar, String str, j3 j3Var) {
        this.f9758d = uVar;
        this.f9755a = cVar;
        this.f9756b = str;
        this.f9757c = j3Var;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f9755a = obj;
        this.f9756b = obj2;
        this.f9757c = obj3;
        this.f9758d = obj4;
    }

    public final void a(p pVar) {
        if (!((ArrayList) this.f9755a).contains(pVar)) {
            synchronized (((ArrayList) this.f9755a)) {
                ((ArrayList) this.f9755a).add(pVar);
            }
            pVar.H = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + pVar);
    }

    public final void b() {
        ((HashMap) this.f9756b).values().removeAll(Collections.singleton((Object) null));
    }

    public final p c(String str) {
        o0 o0Var = (o0) ((HashMap) this.f9756b).get(str);
        if (o0Var != null) {
            return o0Var.f2054c;
        }
        return null;
    }

    public final void d(n nVar) {
        e0 e0Var = new e0((r9.c) this.f9755a, ((m0) nVar).f4724b, (String) this.f9756b);
        u uVar = (u) this.f9758d;
        j3 j3Var = (j3) this.f9757c;
        uVar.getClass();
        q.i(j3Var);
        ((x) uVar.f2324b).b(e0Var, new rh(uVar, j3Var, 0));
    }

    public final p e(String str) {
        for (o0 o0Var : ((HashMap) this.f9756b).values()) {
            if (o0Var != null) {
                p pVar = o0Var.f2054c;
                if (!str.equals(pVar.B)) {
                    pVar = pVar.R.f1968c.e(str);
                }
                if (pVar != null) {
                    return pVar;
                }
            }
        }
        return null;
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.f9756b).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.f9756b).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var.f2054c);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    public final List h() {
        ArrayList arrayList;
        if (((ArrayList) this.f9755a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f9755a)) {
            arrayList = new ArrayList((ArrayList) this.f9755a);
        }
        return arrayList;
    }

    public final void i(o0 o0Var) {
        p pVar = o0Var.f2054c;
        String str = pVar.B;
        Object obj = this.f9756b;
        if (!(((HashMap) obj).get(str) != null)) {
            ((HashMap) obj).put(pVar.B, o0Var);
            if (i0.J(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + pVar);
            }
        }
    }

    public final void j(o0 o0Var) {
        p pVar = o0Var.f2054c;
        if (pVar.Y) {
            ((l0) this.f9758d).g(pVar);
        }
        if (((o0) ((HashMap) this.f9756b).put(pVar.B, (Object) null)) != null && i0.J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + pVar);
        }
    }

    public final n0 k(String str, n0 n0Var) {
        Object obj = this.f9757c;
        return n0Var != null ? (n0) ((HashMap) obj).put(str, n0Var) : (n0) ((HashMap) obj).remove(str);
    }

    public final c l() {
        return new c(this, (j3) this.f9756b);
    }

    public final o m(o oVar) {
        return ((j3) this.f9756b).b(this, oVar);
    }

    public final o n(e eVar) {
        o oVar = o.f5428j;
        Iterator h3 = eVar.h();
        while (h3.hasNext()) {
            oVar = ((j3) this.f9756b).b(this, eVar.f(((Integer) h3.next()).intValue()));
            if (oVar instanceof g) {
                break;
            }
        }
        return oVar;
    }

    public final o o(String str) {
        Object obj = this.f9757c;
        if (((Map) obj).containsKey(str)) {
            return (o) ((Map) obj).get(str);
        }
        c cVar = (c) this.f9755a;
        if (cVar != null) {
            return cVar.o(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    public final void p(String str, o oVar) {
        if (!((Map) this.f9758d).containsKey(str)) {
            Object obj = this.f9757c;
            if (oVar == null) {
                ((Map) obj).remove(str);
            } else {
                ((Map) obj).put(str, oVar);
            }
        }
    }

    public final void q(String str, o oVar) {
        Object obj = this.f9757c;
        if (!((Map) obj).containsKey(str)) {
            Object obj2 = this.f9755a;
            c cVar = (c) obj2;
            if (cVar != null && cVar.r(str)) {
                ((c) obj2).q(str, oVar);
                return;
            }
        }
        if (!((Map) this.f9758d).containsKey(str)) {
            if (oVar == null) {
                ((Map) obj).remove(str);
            } else {
                ((Map) obj).put(str, oVar);
            }
        }
    }

    public final boolean r(String str) {
        if (((Map) this.f9757c).containsKey(str)) {
            return true;
        }
        c cVar = (c) this.f9755a;
        if (cVar != null) {
            return cVar.r(str);
        }
        return false;
    }

    public final Object then(Task task) {
        s9.x xVar;
        s9.x xVar2;
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.f9755a;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f9756b;
        String str = (String) this.f9757c;
        Continuation continuation = (Continuation) this.f9758d;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        q.i(exception);
        SparseArray sparseArray = d.f4476a;
        if (!(exception instanceof r9.g) || !((r9.g) exception).f14123a.endsWith("MISSING_RECAPTCHA_TOKEN")) {
            String valueOf = String.valueOf(recaptchaAction);
            String message = exception.getMessage();
            Log.e("RecaptchaCallWrapper", "Initial task failed for action " + valueOf + "with exception - " + message);
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
        }
        synchronized (firebaseAuth) {
            xVar = firebaseAuth.f6314j;
        }
        if (xVar == null) {
            s9.x xVar3 = new s9.x(firebaseAuth.f6305a, firebaseAuth);
            synchronized (firebaseAuth) {
                firebaseAuth.f6314j = xVar3;
            }
        }
        synchronized (firebaseAuth) {
            xVar2 = firebaseAuth.f6314j;
        }
        Task a10 = xVar2.a(str, Boolean.FALSE, recaptchaAction);
        return a10.continueWithTask(continuation).continueWithTask(new s(continuation, recaptchaAction, xVar2, str));
    }

    public final void zza(String str) {
        ((j3) this.f9757c).i(j.a(str));
    }

    public /* synthetic */ c(c cVar, j3 j3Var) {
        this.f9757c = new HashMap();
        this.f9758d = new HashMap();
        this.f9755a = cVar;
        this.f9756b = j3Var;
    }

    public c(int i8) {
        if (i8 == 1) {
            this.f9755a = new ArrayList();
            this.f9756b = new HashMap();
            this.f9757c = new HashMap();
        } else if (i8 != 2) {
            this.f9755a = new e();
            this.f9756b = new e();
            this.f9757c = new e();
            this.f9758d = new g[32];
        } else {
            this.f9755a = new a();
            this.f9756b = new SparseArray();
            this.f9757c = new o.d();
            this.f9758d = new a();
        }
    }
}
