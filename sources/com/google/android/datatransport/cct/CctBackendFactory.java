package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import b6.b;
import e6.d;
import e6.h;
import e6.m;

@Keep
public class CctBackendFactory implements d {
    public m create(h hVar) {
        return new b(hVar.a(), hVar.d(), hVar.c());
    }
}
