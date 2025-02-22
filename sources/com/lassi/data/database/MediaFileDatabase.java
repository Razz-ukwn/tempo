package com.lassi.data.database;

import android.content.Context;
import cb.f;
import i3.p;
import ob.c;
import sf.j;

public abstract class MediaFileDatabase extends p {
    public static volatile MediaFileDatabase m;

    /* renamed from: n  reason: collision with root package name */
    public static final Object f6418n = new Object();

    public static final class a {
        public static MediaFileDatabase a(Context context) {
            MediaFileDatabase mediaFileDatabase;
            j.f(context, "context");
            MediaFileDatabase mediaFileDatabase2 = MediaFileDatabase.m;
            if (mediaFileDatabase2 != null) {
                return mediaFileDatabase2;
            }
            synchronized (MediaFileDatabase.f6418n) {
                mediaFileDatabase = (MediaFileDatabase) f.d(context, MediaFileDatabase.class, "media_file_database").b();
                MediaFileDatabase.m = mediaFileDatabase;
            }
            return mediaFileDatabase;
        }
    }

    public abstract c p();
}
