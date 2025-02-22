package u6;

import android.app.Activity;
import android.content.Intent;

public final class z extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent f15879a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f15880b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15881c;

    public z(int i8, Activity activity, Intent intent) {
        this.f15879a = intent;
        this.f15880b = activity;
        this.f15881c = i8;
    }

    public final void a() {
        Intent intent = this.f15879a;
        if (intent != null) {
            this.f15880b.startActivityForResult(intent, this.f15881c);
        }
    }
}
