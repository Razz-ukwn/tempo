package vd;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import com.google.android.gms.internal.p000firebaseauthapi.e6;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.tabs.map.MapFragment;
import sb.c;
import sf.j;

public final class d extends WebViewClient {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f16421b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MapFragment f16422a;

    public d(MapFragment mapFragment) {
        this.f16422a = mapFragment;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        MapFragment mapFragment = this.f16422a;
        e6 e6Var = mapFragment.f7126v0;
        if (e6Var != null && mapFragment.A0) {
            j.c(e6Var);
            ((WebView) e6Var.f4511b).evaluateJavascript("setloaction(" + mapFragment.f7129y0 + ", " + mapFragment.f7130z0 + ')', (ValueCallback) null);
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        MapFragment mapFragment = this.f16422a;
        b.a aVar = new b.a(mapFragment.e0());
        String string = mapFragment.v().getString(R.string.sslcertificaterror);
        j.e(string, "resources.getString(R.string.sslcertificaterror)");
        j.c(sslError);
        int primaryError = sslError.getPrimaryError();
        if (primaryError == 0) {
            string = mapFragment.v().getString(R.string.thecertificatenotyetvalid);
            j.e(string, "resources.getString(R.st…hecertificatenotyetvalid)");
        } else if (primaryError == 1) {
            string = mapFragment.v().getString(R.string.thecertificateexpired);
            j.e(string, "resources.getString(R.st…ng.thecertificateexpired)");
        } else if (primaryError == 2) {
            string = mapFragment.v().getString(R.string.certificatehostnamemismatch);
            j.e(string, "resources.getString(R.st…tificatehostnamemismatch)");
        } else if (primaryError == 3) {
            string = mapFragment.v().getString(R.string.certificateautorityisnottrusted);
            j.e(string, "resources.getString(R.st…cateautorityisnottrusted)");
        }
        String str = string + ' ' + mapFragment.v().getString(R.string.doyoucontinueanyway);
        String string2 = mapFragment.v().getString(R.string.sslcertificateerror);
        AlertController.b bVar = aVar.f681a;
        bVar.f664d = string2;
        bVar.f666f = str;
        String string3 = mapFragment.v().getString(R.string.lbl_continue);
        a aVar2 = new a(sslErrorHandler, 2);
        bVar.f667g = string3;
        bVar.f668h = aVar2;
        String string4 = mapFragment.v().getString(R.string.btnCancel);
        c cVar = new c(sslErrorHandler, 4);
        bVar.f669i = string4;
        bVar.f670j = cVar;
        aVar.a().show();
    }
}
