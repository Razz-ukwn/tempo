package bc;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.x;
import sf.j;

public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f3613a;

    public /* synthetic */ d(f fVar) {
        this.f3613a = fVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i8) {
        int i10 = f.F0;
        f fVar = this.f3613a;
        j.f(fVar, "this$0");
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        x o10 = fVar.o();
        intent.setData(Uri.fromParts("package", o10 != null ? o10.getPackageName() : null, (String) null));
        fVar.C0.a(intent);
    }
}
