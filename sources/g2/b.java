package g2;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import d2.f;
import d2.i0;
import g2.d;
import j0.n;

public final class b extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f8799a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, n nVar) {
        super(inputConnection, false);
        this.f8799a = nVar;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i8, Bundle bundle) {
        Bundle bundle2;
        d dVar = inputContentInfo == null ? null : new d(new d.a(inputContentInfo));
        View view = (View) ((n) this.f8799a).f9710b;
        boolean z10 = false;
        if ((i8 & 1) != 0) {
            try {
                ((d.a) dVar.f8800a).b();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((d.a) dVar.f8800a).a();
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((d.a) dVar.f8800a).f8801a.getDescription();
        d.a aVar = (d.a) dVar.f8800a;
        ClipData clipData = new ClipData(description, new ClipData.Item(aVar.f8801a.getContentUri()));
        f.b aVar2 = Build.VERSION.SDK_INT >= 31 ? new f.a(clipData, 2) : new f.c(clipData, 2);
        aVar2.a(aVar.f8801a.getLinkUri());
        aVar2.setExtras(bundle2);
        if (i0.j(view, aVar2.build()) == null) {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        return super.commitContent(inputContentInfo, i8, bundle);
    }
}
