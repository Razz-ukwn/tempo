package b3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.d;
import b3.b0;
import b3.z;
import gf.k;
import gf.q;
import java.util.ArrayList;
import java.util.Iterator;
import s1.c0;
import sf.j;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3190a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f3191b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f3192c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f3193d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f3194a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f3195b;

        public a(int i8, Bundle bundle) {
            this.f3194a = i8;
            this.f3195b = bundle;
        }
    }

    public v(m mVar) {
        Intent intent;
        j.f(mVar, "navController");
        Context context = mVar.f3101a;
        j.f(context, "context");
        this.f3190a = context;
        if (context instanceof Activity) {
            intent = new Intent(context, context.getClass());
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (intent == null) {
                intent = new Intent();
            }
        }
        intent.addFlags(268468224);
        this.f3191b = intent;
        this.f3193d = new ArrayList();
        this.f3192c = mVar.i();
    }

    public final c0 a() {
        b0 b0Var = this.f3192c;
        if (b0Var != null) {
            ArrayList arrayList = this.f3193d;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                z zVar = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    int i8 = 0;
                    Context context = this.f3190a;
                    if (hasNext) {
                        a aVar = (a) it.next();
                        int i10 = aVar.f3194a;
                        z b10 = b(i10);
                        if (b10 != null) {
                            int[] c3 = b10.c(zVar);
                            int length = c3.length;
                            while (i8 < length) {
                                arrayList2.add(Integer.valueOf(c3[i8]));
                                arrayList3.add(aVar.f3195b);
                                i8++;
                            }
                            zVar = b10;
                        } else {
                            int i11 = z.F;
                            String a10 = z.a.a(context, i10);
                            throw new IllegalArgumentException("Navigation destination " + a10 + " cannot be found in the navigation graph " + b0Var);
                        }
                    } else {
                        int[] N0 = q.N0(arrayList2);
                        Intent intent = this.f3191b;
                        intent.putExtra("android-support-nav:controller:deepLinkIds", N0);
                        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                        c0 c0Var = new c0(context);
                        Intent intent2 = new Intent(intent);
                        ComponentName component = intent2.getComponent();
                        if (component == null) {
                            component = intent2.resolveActivity(c0Var.f14477b.getPackageManager());
                        }
                        if (component != null) {
                            c0Var.a(component);
                        }
                        ArrayList<Intent> arrayList4 = c0Var.f14476a;
                        arrayList4.add(intent2);
                        int size = arrayList4.size();
                        while (i8 < size) {
                            Intent intent3 = arrayList4.get(i8);
                            if (intent3 != null) {
                                intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                            }
                            i8++;
                        }
                        return c0Var;
                    }
                }
            } else {
                throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
            }
        } else {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        }
    }

    public final z b(int i8) {
        k kVar = new k();
        b0 b0Var = this.f3192c;
        j.c(b0Var);
        kVar.addLast(b0Var);
        while (!kVar.isEmpty()) {
            z zVar = (z) kVar.removeFirst();
            if (zVar.D == i8) {
                return zVar;
            }
            if (zVar instanceof b0) {
                b0.b bVar = new b0.b((b0) zVar);
                while (bVar.hasNext()) {
                    kVar.addLast((z) bVar.next());
                }
            }
        }
        return null;
    }

    public final void c() {
        Iterator it = this.f3193d.iterator();
        while (it.hasNext()) {
            int i8 = ((a) it.next()).f3194a;
            if (b(i8) == null) {
                int i10 = z.F;
                StringBuilder c3 = d.c("Navigation destination ", z.a.a(this.f3190a, i8), " cannot be found in the navigation graph ");
                c3.append(this.f3192c);
                throw new IllegalArgumentException(c3.toString());
            }
        }
    }
}
