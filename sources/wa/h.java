package wa;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class h implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f16600a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f16601b;

    public /* synthetic */ h(i iVar, Intent intent) {
        this.f16600a = iVar;
        this.f16601b = intent;
    }

    public final void onComplete(Task task) {
        this.f16600a.a(this.f16601b);
    }
}
