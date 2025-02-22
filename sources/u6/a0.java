package u6;

import android.content.Intent;
import com.google.android.gms.common.api.internal.h;

public final class a0 extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent f15736a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f15737b;

    public a0(Intent intent, h hVar) {
        this.f15736a = intent;
        this.f15737b = hVar;
    }

    public final void a() {
        Intent intent = this.f15736a;
        if (intent != null) {
            this.f15737b.startActivityForResult(intent, 2);
        }
    }
}
