package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class b implements DynamiteModule.b {
    public final DynamiteModule.b.C0070b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0070b bVar = new DynamiteModule.b.C0070b();
        bVar.f4360a = aVar.b(context, str);
        int a10 = aVar.a(context, str, true);
        bVar.f4361b = a10;
        int i8 = bVar.f4360a;
        if (i8 == 0) {
            i8 = 0;
            if (a10 == 0) {
                bVar.f4362c = 0;
                return bVar;
            }
        }
        if (i8 >= a10) {
            bVar.f4362c = -1;
        } else {
            bVar.f4362c = 1;
        }
        return bVar;
    }
}
