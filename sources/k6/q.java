package k6;

import a6.e;
import android.content.Context;
import android.database.Cursor;
import android.util.Base64;
import android.util.JsonReader;
import ba.b0;
import ba.o;
import ca.a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
import k6.s;
import la.d;
import ma.g;
import t9.u;
import t9.v;
import wa.l;
import wa.t;
import xa.b;
import ya.c;
import ya.f;

public final /* synthetic */ class q implements s.a, f.a, a.C0060a, e, Continuation, t9.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10327a;

    public /* synthetic */ q(int i8) {
        this.f10327a = i8;
    }

    public Object apply(Object obj) {
        switch (this.f10327a) {
            case 0:
                Cursor cursor = (Cursor) obj;
                ArrayList arrayList = new ArrayList();
                int i8 = 0;
                while (cursor.moveToNext()) {
                    byte[] blob = cursor.getBlob(0);
                    arrayList.add(blob);
                    i8 += blob.length;
                }
                byte[] bArr = new byte[i8];
                int i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    byte[] bArr2 = (byte[]) arrayList.get(i11);
                    System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                    i10 += bArr2.length;
                }
                return bArr;
            case 4:
                b0 b0Var = (b0) obj;
                fa.a.f8642b.getClass();
                d dVar = a.f3872a;
                dVar.getClass();
                StringWriter stringWriter = new StringWriter();
                try {
                    dVar.a(b0Var, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes(Charset.forName("UTF-8"));
            default:
                b bVar = (b) obj;
                bVar.getClass();
                g gVar = t.f16646a;
                gVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gVar.a(bVar, byteArrayOutputStream);
                } catch (IOException unused2) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    public Object b(JsonReader jsonReader) {
        switch (this.f10327a) {
            case 2:
                d dVar = a.f3872a;
                jsonReader.beginObject();
                String str = null;
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    if (nextName.equals("filename")) {
                        str = jsonReader.nextString();
                        if (str == null) {
                            throw new NullPointerException("Null filename");
                        }
                    } else if (!nextName.equals("contents")) {
                        jsonReader.skipValue();
                    } else {
                        bArr = Base64.decode(jsonReader.nextString(), 2);
                        if (bArr == null) {
                            throw new NullPointerException("Null contents");
                        }
                    }
                }
                jsonReader.endObject();
                String str2 = str == null ? " filename" : "";
                if (bArr == null) {
                    str2 = str2.concat(" contents");
                }
                if (str2.isEmpty()) {
                    return new ba.g(str, bArr);
                }
                throw new IllegalStateException("Missing required properties:".concat(str2));
            default:
                d dVar2 = a.f3872a;
                o.a aVar = new o.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    char c3 = 65535;
                    switch (nextName2.hashCode()) {
                        case 3373707:
                            if (nextName2.equals("name")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case 3530753:
                            if (nextName2.equals("size")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 3601339:
                            if (nextName2.equals("uuid")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 1153765347:
                            if (nextName2.equals("baseAddress")) {
                                c3 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                aVar.f3547c = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        case 1:
                            aVar.f3546b = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            aVar.f3548d = new String(Base64.decode(jsonReader.nextString(), 2), b0.f3440a);
                            break;
                        case 3:
                            aVar.f3545a = Long.valueOf(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return aVar.a();
        }
    }

    public String c(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }

    public Object e(v vVar) {
        switch (this.f10327a) {
            case 0:
                return ExecutorsRegistrar.f6325b.get();
            default:
                Set<ya.d> b10 = vVar.b(u.a(ya.d.class));
                c cVar = c.f17324b;
                if (cVar == null) {
                    synchronized (c.class) {
                        cVar = c.f17324b;
                        if (cVar == null) {
                            cVar = new c();
                            c.f17324b = cVar;
                        }
                    }
                }
                return new ya.b(b10, cVar);
        }
    }

    public Object then(Task task) {
        Object obj = l.f16623c;
        return 403;
    }
}
