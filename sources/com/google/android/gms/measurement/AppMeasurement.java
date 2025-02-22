package com.google.android.gms.measurement;

import ag.m;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o7.a;
import o7.b;
import o7.c;
import q7.b5;
import q7.x3;
import u6.q;

@Deprecated
public class AppMeasurement {

    /* renamed from: b  reason: collision with root package name */
    public static volatile AppMeasurement f5661b;

    /* renamed from: a  reason: collision with root package name */
    public final c f5662a;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            q.i(bundle);
            Class<String> cls = String.class;
            this.mAppId = (String) m.t(bundle, "app_id", cls, (Object) null);
            this.mOrigin = (String) m.t(bundle, "origin", cls, (Object) null);
            this.mName = (String) m.t(bundle, "name", cls, (Object) null);
            this.mValue = m.t(bundle, "value", Object.class, (Object) null);
            this.mTriggerEventName = (String) m.t(bundle, "trigger_event_name", cls, (Object) null);
            Class<Long> cls2 = Long.class;
            this.mTriggerTimeout = ((Long) m.t(bundle, "trigger_timeout", cls2, 0L)).longValue();
            this.mTimedOutEventName = (String) m.t(bundle, "timed_out_event_name", cls, (Object) null);
            Class<Bundle> cls3 = Bundle.class;
            this.mTimedOutEventParams = (Bundle) m.t(bundle, "timed_out_event_params", cls3, (Object) null);
            this.mTriggeredEventName = (String) m.t(bundle, "triggered_event_name", cls, (Object) null);
            this.mTriggeredEventParams = (Bundle) m.t(bundle, "triggered_event_params", cls3, (Object) null);
            this.mTimeToLive = ((Long) m.t(bundle, "time_to_live", cls2, 0L)).longValue();
            this.mExpiredEventName = (String) m.t(bundle, "expired_event_name", cls, (Object) null);
            this.mExpiredEventParams = (Bundle) m.t(bundle, "expired_event_params", cls3, (Object) null);
            this.mActive = ((Boolean) m.t(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) m.t(bundle, "creation_timestamp", cls2, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) m.t(bundle, "triggered_timestamp", cls2, 0L)).longValue();
        }
    }

    public AppMeasurement(x3 x3Var) {
        this.f5662a = new a(x3Var);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @java.lang.Deprecated
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f5661b
            if (r0 != 0) goto L_0x0059
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f5661b     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0054
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            java.lang.String r3 = "getScionFrontendApiImplementation"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{  }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch:{  }
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            r8 = 1
            r5[r8] = r6     // Catch:{  }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{  }
            r3[r7] = r14     // Catch:{  }
            r3[r8] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            q7.b5 r2 = (q7.b5) r2     // Catch:{  }
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r14.<init>((q7.b5) r2)     // Catch:{ all -> 0x0056 }
            f5661b = r14     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x0039:
            com.google.android.gms.internal.measurement.a1 r13 = new com.google.android.gms.internal.measurement.a1     // Catch:{ all -> 0x0056 }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0056 }
            q7.x3 r14 = q7.x3.t(r14, r13, r1)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r1.<init>((q7.x3) r14)     // Catch:{ all -> 0x0056 }
            f5661b = r1     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r14
        L_0x0059:
            com.google.android.gms.measurement.AppMeasurement r14 = f5661b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f5662a.e(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f5662a.f(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f5662a.g(str);
    }

    @Keep
    public long generateEventId() {
        return this.f5662a.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f5662a.zzh();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> a10 = this.f5662a.a(str, str2);
        ArrayList arrayList = new ArrayList(a10 == null ? 0 : a10.size());
        for (Bundle conditionalUserProperty : a10) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f5662a.zzi();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f5662a.zzj();
    }

    @Keep
    public String getGmpAppId() {
        return this.f5662a.zzk();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f5662a.zza(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f5662a.b(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f5662a.d(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        q.i(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            m.D(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f5662a.c(bundle);
    }

    public AppMeasurement(b5 b5Var) {
        this.f5662a = new b(b5Var);
    }
}
