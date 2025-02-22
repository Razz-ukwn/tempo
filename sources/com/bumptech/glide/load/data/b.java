package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import p4.a;

public abstract class b<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f4102a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager f4103b;

    /* renamed from: c  reason: collision with root package name */
    public T f4104c;

    public b(AssetManager assetManager, String str) {
        this.f4103b = assetManager;
        this.f4102a = str;
    }

    public final void b() {
        T t2 = this.f4104c;
        if (t2 != null) {
            try {
                c(t2);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t2);

    public final void cancel() {
    }

    public final a d() {
        return a.f12446a;
    }

    public final void e(j jVar, d.a<? super T> aVar) {
        try {
            T f10 = f(this.f4103b, this.f4102a);
            this.f4104c = f10;
            aVar.f(f10);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }

    public abstract T f(AssetManager assetManager, String str);
}
