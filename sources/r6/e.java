package r6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.o;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import u6.q;
import x6.a;

public final class e implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public static final a f14074c = new a("RevokeAccessOperation", new String[0]);

    /* renamed from: a  reason: collision with root package name */
    public final String f14075a;

    /* renamed from: b  reason: collision with root package name */
    public final o f14076b = new o((f0) null);

    public e(String str) {
        q.f(str);
        this.f14075a = str;
    }

    public final void run() {
        a aVar = f14074c;
        Status status = Status.D;
        try {
            String str = this.f14075a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.B;
            } else {
                aVar.c("Unable to revoke access!", new Object[0]);
            }
            aVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            aVar.c("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            aVar.c("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f14076b.e(status);
    }
}
