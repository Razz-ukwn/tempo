package androidx.compose.ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import cg.a;
import cg.f;
import ff.m;

public final class s3 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f<m> f1461a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s3(a aVar, Handler handler) {
        super(handler);
        this.f1461a = aVar;
    }

    public final void onChange(boolean z10, Uri uri) {
        this.f1461a.o(m.f8717a);
    }
}
