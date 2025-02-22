package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class c implements DynamiteModule.b {
    public final DynamiteModule.b.C0070b a(Context context, String str, DynamiteModule.b.a aVar) {
        int i8;
        DynamiteModule.b.C0070b bVar = new DynamiteModule.b.C0070b();
        int b10 = aVar.b(context, str);
        bVar.f4360a = b10;
        int i10 = 0;
        if (b10 != 0) {
            i8 = aVar.a(context, str, false);
            bVar.f4361b = i8;
        } else {
            i8 = aVar.a(context, str, true);
            bVar.f4361b = i8;
        }
        int i11 = bVar.f4360a;
        if (i11 != 0) {
            i10 = i11;
        } else if (i8 == 0) {
            bVar.f4362c = 0;
            return bVar;
        }
        if (i10 >= i8) {
            bVar.f4362c = -1;
        } else {
            bVar.f4362c = 1;
        }
        return bVar;
    }
}
