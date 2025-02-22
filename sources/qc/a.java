package qc;

import ag.g0;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.z0;
import cg.o;
import cg.q;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import ff.m;
import java.util.List;
import jf.d;
import jf.f;
import lf.e;
import lf.i;
import n7.c;
import rf.p;
import sf.j;
import sf.k;
import t.w2;

@e(c = "com.quickkonnect.silencio.service.measuring.DefaultLocationClient$getLocationUpdates$1", f = "DefaultLocationClient.kt", l = {77}, m = "invokeSuspend")
public final class a extends i implements p<q<? super Location>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f13474a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f13475b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f13476c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f13477d;

    /* renamed from: qc.a$a  reason: collision with other inner class name */
    public static final class C0254a extends k implements rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13478a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f13479b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0254a(b bVar, b bVar2) {
            super(0);
            this.f13478a = bVar;
            this.f13479b = bVar2;
        }

        public final Object d() {
            k7.d dVar = (k7.d) this.f13478a.f13485b;
            dVar.getClass();
            String simpleName = c.class.getSimpleName();
            b bVar = this.f13479b;
            if (bVar != null) {
                u6.q.g("Listener type must not be empty", simpleName);
                dVar.b(new i.a(bVar, simpleName), 2418).continueWith(k7.a.f10346a, z0.D);
                return m.f8717a;
            }
            throw new NullPointerException("Listener must not be null");
        }
    }

    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q<Location> f13480a;

        @e(c = "com.quickkonnect.silencio.service.measuring.DefaultLocationClient$getLocationUpdates$1$locationCallback$1$onLocationResult$1$1", f = "DefaultLocationClient.kt", l = {66}, m = "invokeSuspend")
        /* renamed from: qc.a$b$a  reason: collision with other inner class name */
        public static final class C0255a extends lf.i implements p<g0, d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f13481a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ q<Location> f13482b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ Location f13483c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0255a(q<? super Location> qVar, Location location, d<? super C0255a> dVar) {
                super(2, dVar);
                this.f13482b = qVar;
                this.f13483c = location;
            }

            public final d<m> create(Object obj, d<?> dVar) {
                return new C0255a(this.f13482b, this.f13483c, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0255a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
            }

            public final Object invokeSuspend(Object obj) {
                kf.a aVar = kf.a.f10464a;
                int i8 = this.f13481a;
                if (i8 == 0) {
                    cb.b.J(obj);
                    this.f13481a = 1;
                    if (this.f13482b.t(this.f13483c, this) == aVar) {
                        return aVar;
                    }
                } else if (i8 == 1) {
                    cb.b.J(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return m.f8717a;
            }
        }

        public b(q<? super Location> qVar) {
            this.f13480a = qVar;
        }

        public final void a(LocationResult locationResult) {
            j.f(locationResult, "result");
            List list = locationResult.f5660a;
            j.e(list, "result.locations");
            Location location = (Location) gf.q.C0(list);
            if (location != null) {
                Log.e("===", "accuracy " + location.getAccuracy() + 'm');
                StringBuilder sb2 = new StringBuilder("has accuracy ");
                sb2.append(location.hasAccuracy());
                Log.e("===", sb2.toString());
                Log.e("===", "speed " + location.getSpeed() + "m/s");
                Log.e("===", "speed accuracy " + location.getSpeedAccuracyMetersPerSecond() + " m/s");
                q<Location> qVar = this.f13480a;
                cb.b.D(qVar, (f.b) null, 0, new C0255a(qVar, location, (d<? super C0255a>) null), 3);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar, long j10, d<? super a> dVar) {
        super(2, dVar);
        this.f13476c = bVar;
        this.f13477d = j10;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        a aVar = new a(this.f13476c, this.f13477d, dVar);
        aVar.f13475b = obj;
        return aVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((q) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f13474a;
        if (i8 == 0) {
            cb.b.J(obj);
            q qVar = (q) this.f13475b;
            if (t1.a.a(this.f13476c.f13484a, "android.permission.ACCESS_FINE_LOCATION") == 0 || t1.a.a(this.f13476c.f13484a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                Object systemService = this.f13476c.f13484a.getSystemService("location");
                j.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
                LocationManager locationManager = (LocationManager) systemService;
                boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
                boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
                if (isProviderEnabled || isProviderEnabled2) {
                    LocationRequest.a aVar2 = new LocationRequest.a(100, this.f13477d);
                    aVar2.b(2);
                    aVar2.c(500);
                    aVar2.f5651g = 0.0f;
                    ag.m.z(100);
                    aVar2.f5645a = 100;
                    aVar2.f5652h = true;
                    LocationRequest a10 = aVar2.a();
                    b bVar = new b(qVar);
                    n7.b bVar2 = this.f13476c.f13485b;
                    Looper mainLooper = Looper.getMainLooper();
                    k7.d dVar = (k7.d) bVar2;
                    dVar.getClass();
                    if (mainLooper == null) {
                        mainLooper = Looper.myLooper();
                        u6.q.j(mainLooper, "invalid null looper");
                    }
                    com.google.android.gms.common.api.internal.i iVar = new com.google.android.gms.common.api.internal.i(mainLooper, bVar, c.class.getSimpleName());
                    k7.c cVar = new k7.c(dVar, iVar);
                    w2 w2Var = new w2((Object) cVar, (Object) a10);
                    com.google.android.gms.common.api.internal.m mVar = new com.google.android.gms.common.api.internal.m();
                    mVar.f4303a = w2Var;
                    mVar.f4304b = cVar;
                    mVar.f4305c = iVar;
                    mVar.f4306d = 2436;
                    i.a aVar3 = iVar.f4275c;
                    u6.q.j(aVar3, "Key must not be null");
                    com.google.android.gms.common.api.internal.i iVar2 = mVar.f4305c;
                    int i10 = mVar.f4306d;
                    o0 o0Var = new o0(mVar, iVar2, i10);
                    p0 p0Var = new p0(mVar, aVar3);
                    u6.q.j(iVar2.f4275c, "Listener has already been released.");
                    com.google.android.gms.common.api.internal.e eVar = dVar.f4192j;
                    eVar.getClass();
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    eVar.e(taskCompletionSource, i10, dVar);
                    w0 w0Var = new w0(new m0(o0Var, p0Var), taskCompletionSource);
                    h7.i iVar3 = eVar.m;
                    iVar3.sendMessage(iVar3.obtainMessage(8, new l0(w0Var, eVar.f4248i.get(), dVar)));
                    taskCompletionSource.getTask();
                    C0254a aVar4 = new C0254a(this.f13476c, bVar);
                    this.f13474a = 1;
                    if (o.a(qVar, aVar4, this) == aVar) {
                        return aVar;
                    }
                } else {
                    throw new e("GPS is disabled");
                }
            } else {
                throw new e("Location permission is required");
            }
        } else if (i8 == 1) {
            cb.b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8717a;
    }
}
