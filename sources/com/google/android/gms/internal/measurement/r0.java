package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import c7.a;
import java.util.Map;

public interface r0 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(u0 u0Var);

    void getAppInstanceId(u0 u0Var);

    void getCachedAppInstanceId(u0 u0Var);

    void getConditionalUserProperties(String str, String str2, u0 u0Var);

    void getCurrentScreenClass(u0 u0Var);

    void getCurrentScreenName(u0 u0Var);

    void getGmpAppId(u0 u0Var);

    void getMaxUserProperties(String str, u0 u0Var);

    void getSessionId(u0 u0Var);

    void getTestFlag(u0 u0Var, int i8);

    void getUserProperties(String str, String str2, boolean z10, u0 u0Var);

    void initForTests(Map map);

    void initialize(a aVar, a1 a1Var, long j10);

    void isDataCollectionEnabled(u0 u0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, u0 u0Var, long j10);

    void logHealthData(int i8, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j10);

    void onActivityDestroyed(a aVar, long j10);

    void onActivityPaused(a aVar, long j10);

    void onActivityResumed(a aVar, long j10);

    void onActivitySaveInstanceState(a aVar, u0 u0Var, long j10);

    void onActivityStarted(a aVar, long j10);

    void onActivityStopped(a aVar, long j10);

    void performAction(Bundle bundle, u0 u0Var, long j10);

    void registerOnMeasurementEventListener(x0 x0Var);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(a aVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(x0 x0Var);

    void setInstanceIdProvider(z0 z0Var);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, a aVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(x0 x0Var);
}
