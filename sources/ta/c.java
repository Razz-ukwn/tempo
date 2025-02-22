package ta;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import m9.f;
import org.json.JSONException;
import org.json.JSONObject;
import q.g;
import ta.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public File f15523a;

    /* renamed from: b  reason: collision with root package name */
    public final f f15524b;

    public c(f fVar) {
        this.f15524b = fVar;
    }

    public final File a() {
        if (this.f15523a == null) {
            synchronized (this) {
                if (this.f15523a == null) {
                    f fVar = this.f15524b;
                    fVar.a();
                    File filesDir = fVar.f11331a.getFilesDir();
                    this.f15523a = new File(filesDir, "PersistedInstallation." + this.f15524b.f() + ".json");
                }
            }
        }
        return this.f15523a;
    }

    public final void b(a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f15506b);
            jSONObject.put("Status", g.c(aVar.f15507c));
            jSONObject.put("AuthToken", aVar.f15508d);
            jSONObject.put("RefreshToken", aVar.f15509e);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f15511g);
            jSONObject.put("ExpiresInSecs", aVar.f15510f);
            jSONObject.put("FisError", aVar.f15512h);
            f fVar = this.f15524b;
            fVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", fVar.f11331a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final a c() {
        JSONObject jSONObject;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        String optString = jSONObject.optString("Fid", (String) null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", (String) null);
        String optString3 = jSONObject.optString("RefreshToken", (String) null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        String optString4 = jSONObject.optString("FisError", (String) null);
        int i8 = d.f15525a;
        a.C0286a aVar = new a.C0286a();
        aVar.f15518f = 0L;
        aVar.b(1);
        aVar.f15517e = 0L;
        aVar.f15513a = optString;
        aVar.b(g.d(5)[optInt]);
        aVar.f15515c = optString2;
        aVar.f15516d = optString3;
        aVar.f15518f = Long.valueOf(optLong);
        aVar.f15517e = Long.valueOf(optLong2);
        aVar.f15519g = optString4;
        return aVar.a();
        throw th;
    }
}
