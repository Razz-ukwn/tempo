package u6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public final class x0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f15873a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f15874b;

    public x0(b bVar, int i8) {
        this.f15874b = bVar;
        this.f15873a = i8;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i8;
        int i10;
        b bVar = this.f15874b;
        if (iBinder == null) {
            synchronized (bVar.f15749g) {
                i8 = bVar.f15755n;
            }
            if (i8 == 3) {
                bVar.f15762u = true;
                i10 = 5;
            } else {
                i10 = 4;
            }
            u0 u0Var = bVar.f15748f;
            u0Var.sendMessage(u0Var.obtainMessage(i10, bVar.f15764w.get(), 16));
            return;
        }
        synchronized (bVar.f15750h) {
            b bVar2 = this.f15874b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            bVar2.f15751i = (queryLocalInterface == null || !(queryLocalInterface instanceof l)) ? new o0(iBinder) : (l) queryLocalInterface;
        }
        b bVar3 = this.f15874b;
        int i11 = this.f15873a;
        bVar3.getClass();
        z0 z0Var = new z0(bVar3, 0);
        u0 u0Var2 = bVar3.f15748f;
        u0Var2.sendMessage(u0Var2.obtainMessage(7, i11, -1, z0Var));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        b bVar;
        synchronized (this.f15874b.f15750h) {
            bVar = this.f15874b;
            bVar.f15751i = null;
        }
        u0 u0Var = bVar.f15748f;
        u0Var.sendMessage(u0Var.obtainMessage(6, this.f15873a, 1));
    }
}
