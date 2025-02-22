package ea;

import android.util.Log;
import b2.c;
import ba.l;
import ca.a;
import ga.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import z9.j;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f7895d = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    public static final int f7896e = 15;

    /* renamed from: f  reason: collision with root package name */
    public static final a f7897f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static final c f7898g = new c();

    /* renamed from: h  reason: collision with root package name */
    public static final j f7899h = new j(1);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f7900a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final e f7901b;

    /* renamed from: c  reason: collision with root package name */
    public final f f7902c;

    public d(e eVar, ga.d dVar) {
        this.f7901b = eVar;
        this.f7902c = dVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String d(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f7895d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    public static void e(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f7895d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        e eVar = this.f7901b;
        arrayList.addAll(e.e(eVar.f7907e.listFiles()));
        arrayList.addAll(e.e(eVar.f7908f.listFiles()));
        c cVar = f7898g;
        Collections.sort(arrayList, cVar);
        List e10 = e.e(eVar.f7906d.listFiles());
        Collections.sort(e10, cVar);
        arrayList.addAll(e10);
        return arrayList;
    }

    public final void c(l lVar, String str, boolean z10) {
        e eVar = this.f7901b;
        int i8 = ((ga.d) this.f7902c).b().f8899a.f8908a;
        f7897f.getClass();
        la.d dVar = a.f3872a;
        dVar.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            dVar.a(lVar, stringWriter);
        } catch (IOException unused) {
        }
        try {
            e(eVar.b(str, c.a("event", String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(this.f7900a.getAndIncrement())}), z10 ? "_" : "")), stringWriter.toString());
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        a aVar = new a();
        eVar.getClass();
        File file = new File(eVar.f7905c, str);
        file.mkdirs();
        List<File> e11 = e.e(file.listFiles(aVar));
        Collections.sort(e11, new b());
        int size = e11.size();
        for (File file2 : e11) {
            if (size > i8) {
                e.d(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
