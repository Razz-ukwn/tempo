package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c7.a;

public final class p0 extends e0 implements r0 {
    public p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j10) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeLong(j10);
        c(a10, 23);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        g0.c(a10, bundle);
        c(a10, 9);
    }

    public final void endAdUnitExposure(String str, long j10) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeLong(j10);
        c(a10, 24);
    }

    public final void generateEventId(u0 u0Var) {
        Parcel a10 = a();
        g0.d(a10, u0Var);
        c(a10, 22);
    }

    public final void getCachedAppInstanceId(u0 u0Var) {
        Parcel a10 = a();
        g0.d(a10, u0Var);
        c(a10, 19);
    }

    public final void getConditionalUserProperties(String str, String str2, u0 u0Var) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        g0.d(a10, u0Var);
        c(a10, 10);
    }

    public final void getCurrentScreenClass(u0 u0Var) {
        Parcel a10 = a();
        g0.d(a10, u0Var);
        c(a10, 17);
    }

    public final void getCurrentScreenName(u0 u0Var) {
        Parcel a10 = a();
        g0.d(a10, u0Var);
        c(a10, 16);
    }

    public final void getGmpAppId(u0 u0Var) {
        Parcel a10 = a();
        g0.d(a10, u0Var);
        c(a10, 21);
    }

    public final void getMaxUserProperties(String str, u0 u0Var) {
        Parcel a10 = a();
        a10.writeString(str);
        g0.d(a10, u0Var);
        c(a10, 6);
    }

    public final void getUserProperties(String str, String str2, boolean z10, u0 u0Var) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        ClassLoader classLoader = g0.f5282a;
        a10.writeInt(z10 ? 1 : 0);
        g0.d(a10, u0Var);
        c(a10, 5);
    }

    public final void initialize(a aVar, a1 a1Var, long j10) {
        Parcel a10 = a();
        g0.d(a10, aVar);
        g0.c(a10, a1Var);
        a10.writeLong(j10);
        c(a10, 1);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        g0.c(a10, bundle);
        a10.writeInt(z10 ? 1 : 0);
        a10.writeInt(z11 ? 1 : 0);
        a10.writeLong(j10);
        c(a10, 2);
    }

    public final void logHealthData(int i8, String str, a aVar, a aVar2, a aVar3) {
        Parcel a10 = a();
        a10.writeInt(5);
        a10.writeString(str);
        g0.d(a10, aVar);
        g0.d(a10, aVar2);
        g0.d(a10, aVar3);
        c(a10, 33);
    }

    public final void onActivityCreated(a aVar, Bundle bundle, long j10) {
        Parcel a10 = a();
        g0.d(a10, aVar);
        g0.c(a10, bundle);
        a10.writeLong(j10);
        c(a10, 27);
    }

    public final void onActivityDestroyed(a aVar, long j10) {
        Parcel a10 = a();
        g0.d(a10, aVar);
        a10.writeLong(j10);
        c(a10, 28);
    }

    public final void onActivityPaused(a aVar, long j10) {
        Parcel a10 = a();
        g0.d(a10, aVar);
        a10.writeLong(j10);
        c(a10, 29);
    }

    public final void onActivityResumed(a aVar, long j10) {
        Parcel a10 = a();
        g0.d(a10, aVar);
        a10.writeLong(j10);
        c(a10, 30);
    }

    public final void onActivitySaveInstanceState(a aVar, u0 u0Var, long j10) {
        Parcel a10 = a();
        g0.d(a10, aVar);
        g0.d(a10, u0Var);
        a10.writeLong(j10);
        c(a10, 31);
    }

    public final void onActivityStarted(a aVar, long j10) {
        Parcel a10 = a();
        g0.d(a10, aVar);
        a10.writeLong(j10);
        c(a10, 25);
    }

    public final void onActivityStopped(a aVar, long j10) {
        Parcel a10 = a();
        g0.d(a10, aVar);
        a10.writeLong(j10);
        c(a10, 26);
    }

    public final void registerOnMeasurementEventListener(x0 x0Var) {
        Parcel a10 = a();
        g0.d(a10, x0Var);
        c(a10, 35);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel a10 = a();
        g0.c(a10, bundle);
        a10.writeLong(j10);
        c(a10, 8);
    }

    public final void setCurrentScreen(a aVar, String str, String str2, long j10) {
        Parcel a10 = a();
        g0.d(a10, aVar);
        a10.writeString(str);
        a10.writeString(str2);
        a10.writeLong(j10);
        c(a10, 15);
    }

    public final void setDataCollectionEnabled(boolean z10) {
        Parcel a10 = a();
        ClassLoader classLoader = g0.f5282a;
        a10.writeInt(z10 ? 1 : 0);
        c(a10, 39);
    }

    public final void setUserProperty(String str, String str2, a aVar, boolean z10, long j10) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        g0.d(a10, aVar);
        a10.writeInt(z10 ? 1 : 0);
        a10.writeLong(j10);
        c(a10, 4);
    }
}
