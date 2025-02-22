package com.google.firebase.datatransport;

import a6.g;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import t9.b;
import t9.l;
import u9.n;
import ya.f;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<b<?>> getComponents() {
        b.a<g> a10 = b.a(g.class);
        a10.f15455a = LIBRARY_NAME;
        a10.a(l.a(Context.class));
        a10.f15460f = new n(1);
        return Arrays.asList(new b[]{a10.b(), f.a(LIBRARY_NAME, "18.1.7")});
    }
}
