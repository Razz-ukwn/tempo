package i3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.activity.l;
import androidx.appcompat.widget.n1;
import i3.i;
import i3.j;
import i3.k;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import sf.j;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f9491a;

    /* renamed from: b  reason: collision with root package name */
    public final k f9492b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f9493c;

    /* renamed from: d  reason: collision with root package name */
    public int f9494d;

    /* renamed from: e  reason: collision with root package name */
    public k.c f9495e;

    /* renamed from: f  reason: collision with root package name */
    public j f9496f;

    /* renamed from: g  reason: collision with root package name */
    public final b f9497g = new b(this);

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f9498h = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    public final l f9499i;

    /* renamed from: j  reason: collision with root package name */
    public final n1 f9500j;

    public static final class a extends k.c {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ m f9501b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m mVar, String[] strArr) {
            super(strArr);
            this.f9501b = mVar;
        }

        public final void a(Set<String> set) {
            j.f(set, "tables");
            m mVar = this.f9501b;
            if (!mVar.f9498h.get()) {
                try {
                    j jVar = mVar.f9496f;
                    if (jVar != null) {
                        int i8 = mVar.f9494d;
                        Object[] array = set.toArray(new String[0]);
                        j.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        jVar.I(i8, (String[]) array);
                    }
                } catch (RemoteException e10) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e10);
                }
            }
        }
    }

    public static final class b extends i.a {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f9502b = 0;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f9503a;

        public b(m mVar) {
            this.f9503a = mVar;
        }

        public final void h(String[] strArr) {
            j.f(strArr, "tables");
            m mVar = this.f9503a;
            mVar.f9493c.execute(new a2.a(3, mVar, strArr));
        }
    }

    public static final class c implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f9504a;

        public c(m mVar) {
            this.f9504a = mVar;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            j.f(componentName, "name");
            j.f(iBinder, "service");
            int i8 = j.a.f9463a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            j aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof j)) ? new j.a.C0175a(iBinder) : (j) queryLocalInterface;
            m mVar = this.f9504a;
            mVar.f9496f = aVar;
            mVar.f9493c.execute(mVar.f9499i);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            sf.j.f(componentName, "name");
            m mVar = this.f9504a;
            mVar.f9493c.execute(mVar.f9500j);
            mVar.f9496f = null;
        }
    }

    public m(Context context, String str, Intent intent, k kVar, Executor executor) {
        this.f9491a = str;
        this.f9492b = kVar;
        this.f9493c = executor;
        Context applicationContext = context.getApplicationContext();
        c cVar = new c(this);
        this.f9499i = new l(this, 5);
        this.f9500j = new n1(this, 2);
        Object[] array = kVar.f9469d.keySet().toArray(new String[0]);
        sf.j.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f9495e = new a(this, (String[]) array);
        applicationContext.bindService(intent, cVar, 1);
    }
}
