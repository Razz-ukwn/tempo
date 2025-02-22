package u6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import t6.b;
import u6.b;

public final class y0 extends l0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f15877g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f15878h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y0(b bVar, int i8, IBinder iBinder, Bundle bundle) {
        super(bVar, i8, bundle);
        this.f15878h = bVar;
        this.f15877g = iBinder;
    }

    public final void c(b bVar) {
        b.C0293b bVar2 = this.f15878h.f15757p;
        if (bVar2 != null) {
            bVar2.a(bVar);
        }
        System.currentTimeMillis();
    }

    public final boolean d() {
        IBinder iBinder = this.f15877g;
        try {
            q.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            b bVar = this.f15878h;
            if (!bVar.y().equals(interfaceDescriptor)) {
                String y10 = bVar.y();
                Log.w("GmsClient", "service descriptor mismatch: " + y10 + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface r10 = bVar.r(iBinder);
            if (r10 == null || (!b.D(bVar, 2, 4, r10) && !b.D(bVar, 3, 4, r10))) {
                return false;
            }
            bVar.f15761t = null;
            b.a aVar = bVar.f15756o;
            if (aVar == null) {
                return true;
            }
            aVar.c();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
