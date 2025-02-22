package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import p4.a;

public abstract class l<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f4123a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentResolver f4124b;

    /* renamed from: c  reason: collision with root package name */
    public T f4125c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f4124b = contentResolver;
        this.f4123a = uri;
    }

    public final void b() {
        T t2 = this.f4125c;
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
            T f10 = f(this.f4124b, this.f4123a);
            this.f4125c = f10;
            aVar.f(f10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);
}
