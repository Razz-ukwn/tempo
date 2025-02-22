package oa;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f12251a;

    public /* synthetic */ b(e eVar) {
        this.f12251a = eVar;
    }

    public final Object call() {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        e eVar = this.f12251a;
        synchronized (eVar) {
            i iVar = eVar.f12254a.get();
            ArrayList c3 = iVar.c();
            iVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i8 = 0; i8 < c3.size(); i8++) {
                j jVar = (j) c3.get(i8);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", jVar.b());
                jSONObject.put("dates", new JSONArray(jVar.a()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
        throw th;
    }
}
