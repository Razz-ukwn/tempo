package lb;

import android.media.MediaScannerConnection;
import android.net.Uri;
import android.util.Log;
import rf.p;
import sf.j;

public final /* synthetic */ class a implements MediaScannerConnection.OnScanCompletedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f11057a;

    public /* synthetic */ a(p pVar) {
        this.f11057a = pVar;
    }

    public final void onScanCompleted(String str, Uri uri) {
        p pVar = this.f11057a;
        j.f(pVar, "$onFileScanComplete");
        Log.d("ExternalStorage", "Scanned " + str);
        pVar.invoke(uri, str);
    }
}
