package s6;

import a7.b;
import android.content.Context;
import android.util.Log;
import cg.e;
import com.google.android.gms.tasks.Task;
import gf.l;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import jf.f;
import sf.j;
import u.c;

public final class u {

    /* renamed from: e  reason: collision with root package name */
    public static u f14788e;

    /* renamed from: a  reason: collision with root package name */
    public int f14789a;

    /* renamed from: b  reason: collision with root package name */
    public Object f14790b;

    /* renamed from: c  reason: collision with root package name */
    public Object f14791c;

    /* renamed from: d  reason: collision with root package name */
    public Object f14792d;

    public /* synthetic */ u(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f14792d = new p(this);
        this.f14789a = 1;
        this.f14791c = scheduledExecutorService;
        this.f14790b = context.getApplicationContext();
    }

    public static synchronized u h(Context context) {
        u uVar;
        synchronized (u.class) {
            if (f14788e == null) {
                f14788e = new u(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new b("MessengerIpcClient"))));
            }
            uVar = f14788e;
        }
        return uVar;
    }

    public final void a(Object obj, Object obj2) {
        c cVar;
        int i8;
        j.f(obj, "value");
        j.f(obj2, "scope");
        if (this.f14789a > 0) {
            i8 = d(obj);
            if (i8 >= 0) {
                cVar = g(i8);
                cVar.add(obj2);
            }
        } else {
            i8 = -1;
        }
        int i10 = -(i8 + 1);
        int i11 = this.f14789a;
        int[] iArr = (int[]) this.f14790b;
        if (i11 < iArr.length) {
            int i12 = iArr[i11];
            ((Object[]) this.f14791c)[i12] = obj;
            cVar = ((c[]) this.f14792d)[i12];
            if (cVar == null) {
                cVar = new c();
                ((c[]) this.f14792d)[i12] = cVar;
            }
            int i13 = this.f14789a;
            if (i10 < i13) {
                int[] iArr2 = (int[]) this.f14790b;
                l.U(i10 + 1, i10, i13, iArr2, iArr2);
            }
            ((int[]) this.f14790b)[i10] = i12;
            this.f14789a++;
        } else {
            int length = iArr.length * 2;
            Object[] copyOf = Arrays.copyOf((c[]) this.f14792d, length);
            j.e(copyOf, "copyOf(this, newSize)");
            this.f14792d = (c[]) copyOf;
            c cVar2 = new c();
            ((c[]) this.f14792d)[i11] = cVar2;
            Object[] copyOf2 = Arrays.copyOf((Object[]) this.f14791c, length);
            j.e(copyOf2, "copyOf(this, newSize)");
            this.f14791c = copyOf2;
            copyOf2[i11] = obj;
            int[] iArr3 = new int[length];
            int i14 = this.f14789a;
            while (true) {
                i14++;
                if (i14 >= length) {
                    break;
                }
                iArr3[i14] = i14;
            }
            int i15 = this.f14789a;
            if (i10 < i15) {
                l.U(i10 + 1, i10, i15, (int[]) this.f14790b, iArr3);
            }
            iArr3[i10] = i11;
            if (i10 > 0) {
                l.W((int[]) this.f14790b, iArr3, i10, 6);
            }
            this.f14790b = iArr3;
            this.f14789a++;
            cVar = cVar2;
        }
        cVar.add(obj2);
    }

    public final void b() {
        int length = ((c[]) this.f14792d).length;
        for (int i8 = 0; i8 < length; i8++) {
            c cVar = ((c[]) this.f14792d)[i8];
            if (cVar != null) {
                cVar.clear();
            }
            ((int[]) this.f14790b)[i8] = i8;
            ((Object[]) this.f14791c)[i8] = null;
        }
        this.f14789a = 0;
    }

    public final boolean c(Object obj) {
        j.f(obj, "element");
        return d(obj) >= 0;
    }

    public final int d(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i8 = this.f14789a - 1;
        int i10 = 0;
        while (i10 <= i8) {
            int i11 = (i10 + i8) >>> 1;
            Object obj2 = ((Object[]) this.f14791c)[((int[]) this.f14790b)[i11]];
            j.c(obj2);
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i10 = i11 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i8 = i11 - 1;
            } else if (obj == obj2) {
                return i11;
            } else {
                for (int i12 = i11 - 1; -1 < i12; i12--) {
                    Object obj3 = ((Object[]) this.f14791c)[((int[]) this.f14790b)[i12]];
                    j.c(obj3);
                    if (obj3 == obj) {
                        return i12;
                    }
                    if (System.identityHashCode(obj3) != identityHashCode) {
                        break;
                    }
                }
                int i13 = i11 + 1;
                int i14 = this.f14789a;
                while (i13 < i14) {
                    Object obj4 = ((Object[]) this.f14791c)[((int[]) this.f14790b)[i13]];
                    j.c(obj4);
                    if (obj4 == obj) {
                        return i13;
                    }
                    i13++;
                    if (System.identityHashCode(obj4) != identityHashCode) {
                        return -i13;
                    }
                }
                return -(this.f14789a + 1);
            }
        }
        return -(i10 + 1);
    }

    public final boolean e(Object obj, Object obj2) {
        int i8;
        c cVar;
        j.f(obj, "value");
        int d10 = d(obj);
        if (d10 < 0 || (cVar = ((c[]) this.f14792d)[i8]) == null) {
            return false;
        }
        boolean remove = cVar.remove(obj2);
        if (cVar.f15634a == 0) {
            int i10 = d10 + 1;
            int i11 = this.f14789a;
            if (i10 < i11) {
                int[] iArr = (int[]) this.f14790b;
                l.U(d10, i10, i11, iArr, iArr);
            }
            int i12 = this.f14789a - 1;
            ((int[]) this.f14790b)[i12] = (i8 = ((int[]) this.f14790b)[d10]);
            ((Object[]) this.f14791c)[i8] = null;
            this.f14789a = i12;
        }
        return remove;
    }

    public final void f(Object obj) {
        j.f(obj, "scope");
        int i8 = this.f14789a;
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = ((int[]) this.f14790b)[i11];
            c cVar = ((c[]) this.f14792d)[i12];
            j.c(cVar);
            cVar.remove(obj);
            if (cVar.f15634a > 0) {
                if (i10 != i11) {
                    Object obj2 = this.f14790b;
                    int i13 = ((int[]) obj2)[i10];
                    ((int[]) obj2)[i10] = i12;
                    ((int[]) obj2)[i11] = i13;
                }
                i10++;
            }
        }
        int i14 = this.f14789a;
        for (int i15 = i10; i15 < i14; i15++) {
            ((Object[]) this.f14791c)[((int[]) this.f14790b)[i15]] = null;
        }
        this.f14789a = i10;
    }

    public final c g(int i8) {
        c cVar = ((c[]) this.f14792d)[((int[]) this.f14790b)[i8]];
        j.c(cVar);
        return cVar;
    }

    public final synchronized Task i(r rVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(rVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!((p) this.f14792d).d(rVar)) {
            p pVar = new p(this);
            this.f14792d = pVar;
            pVar.d(rVar);
        }
        return rVar.f14785b.getTask();
    }

    public /* synthetic */ u() {
        int[] iArr = new int[50];
        for (int i8 = 0; i8 < 50; i8++) {
            iArr[i8] = i8;
        }
        this.f14790b = iArr;
        this.f14791c = new Object[50];
        this.f14792d = new c[50];
    }

    public /* synthetic */ u(int i8, f fVar, e eVar, kotlinx.coroutines.flow.f fVar2) {
        this.f14790b = fVar2;
        this.f14789a = i8;
        this.f14791c = eVar;
        this.f14792d = fVar;
    }
}
