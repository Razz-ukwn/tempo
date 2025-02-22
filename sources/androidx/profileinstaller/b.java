package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import g3.a;
import g3.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f2345a;

    /* renamed from: b  reason: collision with root package name */
    public final c.C0027c f2346b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2347c;

    /* renamed from: d  reason: collision with root package name */
    public final File f2348d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2349e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2350f = false;

    /* renamed from: g  reason: collision with root package name */
    public g3.b[] f2351g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f2352h;

    public b(AssetManager assetManager, Executor executor, c.C0027c cVar, String str, File file) {
        byte[] bArr;
        this.f2345a = executor;
        this.f2346b = cVar;
        this.f2349e = str;
        this.f2348d = file;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 <= 33) {
            switch (i8) {
                case 26:
                    bArr = g.f8824d;
                    break;
                case 27:
                    bArr = g.f8823c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = g.f8822b;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = g.f8821a;
                    break;
            }
        }
        bArr = null;
        this.f2347c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2346b.a();
            }
            return null;
        }
    }

    public final void b(int i8, Serializable serializable) {
        this.f2345a.execute(new a(this, i8, serializable));
    }
}
