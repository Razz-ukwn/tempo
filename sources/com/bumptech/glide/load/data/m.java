package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.InputStream;

public final class m extends b<InputStream> {
    public m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    public final void c(Object obj) {
        ((InputStream) obj).close();
    }

    public final Object f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
