package k7;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class c implements n, l {

    /* renamed from: a  reason: collision with root package name */
    public i f10353a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10354b = true;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f10355c;

    public c(d dVar, i iVar) {
        this.f10355c = dVar;
        this.f10353a = iVar;
    }

    public final synchronized void b(i iVar) {
        i iVar2 = this.f10353a;
        if (iVar2 != iVar) {
            iVar2.f4274b = null;
            iVar2.f4275c = null;
            this.f10353a = iVar;
        }
    }

    public final void c(a.e eVar, Object obj) {
        i.a aVar;
        boolean z10;
        r rVar = (r) eVar;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
        synchronized (this) {
            aVar = this.f10353a.f4275c;
            z10 = this.f10354b;
            i iVar = this.f10353a;
            iVar.f4274b = null;
            iVar.f4275c = null;
        }
        if (aVar == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            rVar.F(aVar, z10, taskCompletionSource);
        }
    }

    public final synchronized i zza() {
        return this.f10353a;
    }

    public final void zzb() {
        i.a aVar;
        synchronized (this) {
            this.f10354b = false;
            aVar = this.f10353a.f4275c;
        }
        if (aVar != null) {
            this.f10355c.b(aVar, 2441);
        }
    }
}
