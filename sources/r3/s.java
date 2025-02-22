package r3;

import android.content.res.Resources;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.internal.p000firebaseauthapi.bh;
import com.google.android.gms.internal.p000firebaseauthapi.ch;
import com.google.android.gms.internal.p000firebaseauthapi.dh;
import com.google.android.gms.internal.p000firebaseauthapi.lh;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.b;
import e9.e;
import f9.c;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import jc.i;
import q7.q2;
import q7.r3;
import q7.s2;
import q7.x3;
import qe.h;
import r4.w;
import r9.d0;
import re.a;
import s9.p;
import s9.p0;
import sf.j;
import u6.q;
import u6.t;
import w6.d;

public final class s implements b, n, bh, c {

    /* renamed from: a  reason: collision with root package name */
    public Object f13862a;

    public /* synthetic */ s(int i8) {
    }

    public /* synthetic */ s(dh dhVar) {
        this.f13862a = dhVar;
    }

    public /* synthetic */ s(Object obj) {
        this.f13862a = obj;
    }

    public /* synthetic */ s(x3 x3Var) {
        this.f13862a = x3Var;
    }

    public static s i(byte[] bArr) {
        return new s((Object) lh.a(bArr));
    }

    public final ArrayList a() {
        p pVar = ((p0) this.f13862a).H;
        if (pVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (r9.s add : pVar.f14855a) {
            arrayList.add(add);
        }
        for (d0 add2 : pVar.f14856b) {
            arrayList.add(add2);
        }
        return arrayList;
    }

    public final boolean b(CharSequence charSequence, h hVar) {
        String str = hVar.f13603b;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = ((a) this.f13862a).a(str).matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        return matcher.matches();
    }

    /* JADX INFO: finally extract failed */
    public final void c(a.e eVar, Object obj) {
        t tVar = (t) this.f13862a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
        com.google.android.gms.common.api.a aVar = w6.c.f16494k;
        w6.a aVar2 = (w6.a) ((d) eVar).x();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar2.f9271c);
        int i8 = h7.c.f9273a;
        if (tVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            tVar.writeToParcel(obtain, 0);
        }
        try {
            aVar2.f9270b.transact(1, obtain, (Parcel) null, 1);
            obtain.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final w d(w wVar, p4.h hVar) {
        Resources resources = (Resources) this.f13862a;
        if (wVar == null) {
            return null;
        }
        return new y4.t(resources, wVar);
    }

    public final void e(String str, i.a aVar) {
        ((Map) this.f13862a).put(str, aVar);
    }

    public final int f() {
        return ((lh) this.f13862a).f4722a.length;
    }

    public final void g(int i8, String str, List list, boolean z10, boolean z11) {
        q2 q2Var;
        int i10 = i8 - 1;
        if (i10 == 0) {
            s2 s2Var = ((x3) ((r3) this.f13862a).f13121a).E;
            x3.l(s2Var);
            q2Var = s2Var.I;
        } else if (i10 != 1) {
            if (i10 == 3) {
                s2 s2Var2 = ((x3) ((r3) this.f13862a).f13121a).E;
                x3.l(s2Var2);
                q2Var = s2Var2.J;
            } else if (i10 != 4) {
                s2 s2Var3 = ((x3) ((r3) this.f13862a).f13121a).E;
                x3.l(s2Var3);
                q2Var = s2Var3.H;
            } else if (z10) {
                s2 s2Var4 = ((x3) ((r3) this.f13862a).f13121a).E;
                x3.l(s2Var4);
                q2Var = s2Var4.F;
            } else if (!z11) {
                s2 s2Var5 = ((x3) ((r3) this.f13862a).f13121a).E;
                x3.l(s2Var5);
                q2Var = s2Var5.G;
            } else {
                s2 s2Var6 = ((x3) ((r3) this.f13862a).f13121a).E;
                x3.l(s2Var6);
                q2Var = s2Var6.E;
            }
        } else if (z10) {
            s2 s2Var7 = ((x3) ((r3) this.f13862a).f13121a).E;
            x3.l(s2Var7);
            q2Var = s2Var7.C;
        } else if (!z11) {
            s2 s2Var8 = ((x3) ((r3) this.f13862a).f13121a).E;
            x3.l(s2Var8);
            q2Var = s2Var8.D;
        } else {
            s2 s2Var9 = ((x3) ((r3) this.f13862a).f13121a).E;
            x3.l(s2Var9);
            q2Var = s2Var9.B;
        }
        int size = list.size();
        if (size == 1) {
            q2Var.c(list.get(0), str);
        } else if (size == 2) {
            q2Var.d(list.get(0), list.get(1), str);
        } else if (size != 3) {
            q2Var.b(str);
        } else {
            q2Var.e(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public final boolean h() {
        if (!TextUtils.isEmpty(((x3) this.f13862a).f13421b)) {
            return false;
        }
        s2 s2Var = ((x3) this.f13862a).E;
        x3.l(s2Var);
        return Log.isLoggable(s2Var.v(), 3);
    }

    public final Object zza() {
        e eVar = (e) ((c) this.f13862a).zza();
        if (eVar != null) {
            return eVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public s(p0 p0Var) {
        q.i(p0Var);
        this.f13862a = p0Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public s(int i8, int i10) {
        this(TimeUnit.MINUTES);
        if (i8 == 13) {
            this.f13862a = new re.a(100);
        } else if (i8 != 14) {
            this.f13862a = new ArrayList();
        }
    }

    public final Object zza(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ch chVar = ch.f4470b;
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < 2; i8++) {
            Provider provider = Security.getProvider(strArr[i8]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                return ((dh) this.f13862a).b(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return ((dh) this.f13862a).b(str, (Provider) null);
    }

    public /* synthetic */ s(ArrayList arrayList) {
        this.f13862a = Collections.unmodifiableList(arrayList);
    }

    public s() {
        this.f13862a = new LinkedHashMap((int) ((((float) 29) / 0.75f) + 1.0f));
    }

    public /* synthetic */ s(ViewGroup viewGroup) {
        this.f13862a = viewGroup.getOverlay();
    }

    public /* synthetic */ s(Resources resources) {
        this.f13862a = resources;
    }

    public /* synthetic */ s(TimeUnit timeUnit) {
        j.f(timeUnit, "timeUnit");
        this.f13862a = new ng.i(mg.d.f11492i, timeUnit);
    }
}
