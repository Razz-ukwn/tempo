package q7;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import b2.c;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.ga;
import com.google.android.gms.internal.measurement.ha;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u6.q;

public final class k extends n6 {
    public static final String[] B = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] C = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] D = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;"};
    public static final String[] E = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] F = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] G = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] H = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] I = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d  reason: collision with root package name */
    public final j f13145d;

    /* renamed from: e  reason: collision with root package name */
    public final j6 f13146e = new j6(((x3) this.f13121a).J);

    public k(t6 t6Var) {
        super(t6Var);
        ((x3) this.f13121a).getClass();
        this.f13145d = new j(this, ((x3) this.f13121a).f13419a);
    }

    public static final void v(ContentValues contentValues, Object obj) {
        q.f("value");
        q.i(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final long A(String str) {
        q.f(str);
        return y("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    public final SQLiteDatabase B() {
        i();
        try {
            return this.f13145d.getWritableDatabase();
        } catch (SQLiteException e10) {
            s2 s2Var = ((x3) this.f13121a).E;
            x3.l(s2Var);
            s2Var.E.c(e10, "Error opening database");
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0124 A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0126 A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0134 A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0138 A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x016c A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0184 A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0186 A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x019d A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01a0 A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01af A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0214 A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x024e A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x027b A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q7.l4 C(java.lang.String r39) {
        /*
            r38 = this;
            r1 = r38
            r2 = r39
            q7.k4 r3 = r1.f13121a
            u6.q.f(r39)
            r38.i()
            r38.j()
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r38.B()     // Catch:{ SQLiteException -> 0x0294, all -> 0x0292 }
            java.lang.String r6 = "apps"
            java.lang.String r7 = "app_instance_id"
            java.lang.String r8 = "gmp_app_id"
            java.lang.String r9 = "resettable_device_id_hash"
            java.lang.String r10 = "last_bundle_index"
            java.lang.String r11 = "last_bundle_start_timestamp"
            java.lang.String r12 = "last_bundle_end_timestamp"
            java.lang.String r13 = "app_version"
            java.lang.String r14 = "app_store"
            java.lang.String r15 = "gmp_version"
            java.lang.String r16 = "dev_cert_hash"
            java.lang.String r17 = "measurement_enabled"
            java.lang.String r18 = "day"
            java.lang.String r19 = "daily_public_events_count"
            java.lang.String r20 = "daily_events_count"
            java.lang.String r21 = "daily_conversions_count"
            java.lang.String r22 = "config_fetched_time"
            java.lang.String r23 = "failed_config_fetch_time"
            java.lang.String r24 = "app_version_int"
            java.lang.String r25 = "firebase_instance_id"
            java.lang.String r26 = "daily_error_events_count"
            java.lang.String r27 = "daily_realtime_events_count"
            java.lang.String r28 = "health_monitor_sample"
            java.lang.String r29 = "android_id"
            java.lang.String r30 = "adid_reporting_enabled"
            java.lang.String r31 = "admob_app_id"
            java.lang.String r32 = "dynamite_version"
            java.lang.String r33 = "safelisted_events"
            java.lang.String r34 = "ga_app_id"
            java.lang.String r35 = "session_stitching_token"
            java.lang.String r36 = "sgtm_upload_enabled"
            java.lang.String r37 = "target_os_version"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37}     // Catch:{ SQLiteException -> 0x0294, all -> 0x0292 }
            java.lang.String r8 = "app_id=?"
            r0 = 1
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0294, all -> 0x0292 }
            r13 = 0
            r9[r13] = r2     // Catch:{ SQLiteException -> 0x0294, all -> 0x0292 }
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0294, all -> 0x0292 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x023c }
            if (r6 != 0) goto L_0x0071
            r5.close()
            return r4
        L_0x0071:
            q7.l4 r6 = new q7.l4     // Catch:{ SQLiteException -> 0x023c }
            q7.t6 r7 = r1.f13208b     // Catch:{ SQLiteException -> 0x023c }
            q7.x3 r7 = r7.H     // Catch:{ SQLiteException -> 0x023c }
            r6.<init>(r7, r2)     // Catch:{ SQLiteException -> 0x023c }
            q7.x3 r7 = r6.f13162a     // Catch:{ SQLiteException -> 0x023c }
            java.lang.String r8 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x023c }
            r6.b(r8)     // Catch:{ SQLiteException -> 0x023c }
            java.lang.String r8 = r5.getString(r0)     // Catch:{ SQLiteException -> 0x023c }
            r6.p(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 2
            java.lang.String r8 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.w(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 3
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.t(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 4
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.u(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 5
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.s(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 6
            java.lang.String r8 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.d(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 7
            java.lang.String r8 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.c(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 8
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.q(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 9
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.m(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 10
            boolean r9 = r5.isNull(r8)     // Catch:{ SQLiteException -> 0x023c }
            if (r9 != 0) goto L_0x00dd
            int r8 = r5.getInt(r8)     // Catch:{ SQLiteException -> 0x023c }
            if (r8 == 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r8 = r13
            goto L_0x00de
        L_0x00dd:
            r8 = r0
        L_0x00de:
            r6.v(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 11
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.l(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 12
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.j(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 13
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.i(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 14
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.g(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 15
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.f(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 16
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
            q7.w3 r10 = r7.F     // Catch:{ SQLiteException -> 0x023c }
            q7.x3.l(r10)     // Catch:{ SQLiteException -> 0x023c }
            r10.i()     // Catch:{ SQLiteException -> 0x023c }
            boolean r10 = r6.E     // Catch:{ SQLiteException -> 0x023c }
            long r11 = r6.G     // Catch:{ SQLiteException -> 0x023c }
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto L_0x0126
            r11 = r0
            goto L_0x0127
        L_0x0126:
            r11 = r13
        L_0x0127:
            r10 = r10 | r11
            r6.E = r10     // Catch:{ SQLiteException -> 0x023c }
            r6.G = r8     // Catch:{ SQLiteException -> 0x023c }
            r8 = 17
            boolean r9 = r5.isNull(r8)     // Catch:{ SQLiteException -> 0x023c }
            if (r9 == 0) goto L_0x0138
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x013d
        L_0x0138:
            int r8 = r5.getInt(r8)     // Catch:{ SQLiteException -> 0x023c }
            long r8 = (long) r8     // Catch:{ SQLiteException -> 0x023c }
        L_0x013d:
            r6.e(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 18
            java.lang.String r8 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.o(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 19
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.h(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 20
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.k(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 21
            java.lang.String r8 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.r(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 23
            boolean r9 = r5.isNull(r8)     // Catch:{ SQLiteException -> 0x023c }
            if (r9 != 0) goto L_0x0175
            int r8 = r5.getInt(r8)     // Catch:{ SQLiteException -> 0x023c }
            if (r8 == 0) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            r8 = r13
            goto L_0x0176
        L_0x0175:
            r8 = r0
        L_0x0176:
            q7.w3 r9 = r7.F     // Catch:{ SQLiteException -> 0x023c }
            q7.x3.l(r9)     // Catch:{ SQLiteException -> 0x023c }
            r9.i()     // Catch:{ SQLiteException -> 0x023c }
            boolean r9 = r6.E     // Catch:{ SQLiteException -> 0x023c }
            boolean r10 = r6.f13176p     // Catch:{ SQLiteException -> 0x023c }
            if (r10 == r8) goto L_0x0186
            r10 = r0
            goto L_0x0187
        L_0x0186:
            r10 = r13
        L_0x0187:
            r9 = r9 | r10
            r6.E = r9     // Catch:{ SQLiteException -> 0x023c }
            r6.f13176p = r8     // Catch:{ SQLiteException -> 0x023c }
            r8 = 24
            java.lang.String r8 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.a(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 25
            boolean r9 = r5.isNull(r8)     // Catch:{ SQLiteException -> 0x023c }
            if (r9 == 0) goto L_0x01a0
            r8 = 0
            goto L_0x01a4
        L_0x01a0:
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
        L_0x01a4:
            r6.n(r8)     // Catch:{ SQLiteException -> 0x023c }
            r8 = 26
            boolean r9 = r5.isNull(r8)     // Catch:{ SQLiteException -> 0x023c }
            if (r9 != 0) goto L_0x01c1
            java.lang.String r8 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x023c }
            java.lang.String r9 = ","
            r10 = -1
            java.lang.String[] r8 = r8.split(r9, r10)     // Catch:{ SQLiteException -> 0x023c }
            java.util.List r8 = java.util.Arrays.asList(r8)     // Catch:{ SQLiteException -> 0x023c }
            r6.x(r8)     // Catch:{ SQLiteException -> 0x023c }
        L_0x01c1:
            com.google.android.gms.internal.measurement.kc.b()     // Catch:{ SQLiteException -> 0x023c }
            r8 = r3
            q7.x3 r8 = (q7.x3) r8     // Catch:{ SQLiteException -> 0x023c }
            q7.f r8 = r8.C     // Catch:{ SQLiteException -> 0x023c }
            q7.f2 r9 = q7.g2.f13045l0     // Catch:{ SQLiteException -> 0x023c }
            boolean r8 = r8.r(r2, r9)     // Catch:{ SQLiteException -> 0x023c }
            if (r8 != 0) goto L_0x01de
            r8 = r3
            q7.x3 r8 = (q7.x3) r8     // Catch:{ SQLiteException -> 0x023c }
            q7.f r8 = r8.C     // Catch:{ SQLiteException -> 0x023c }
            q7.f2 r9 = q7.g2.f13041j0     // Catch:{ SQLiteException -> 0x023c }
            boolean r8 = r8.r(r4, r9)     // Catch:{ SQLiteException -> 0x023c }
            if (r8 == 0) goto L_0x01fa
        L_0x01de:
            r8 = 28
            java.lang.String r8 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x023c }
            q7.w3 r9 = r7.F     // Catch:{ SQLiteException -> 0x023c }
            q7.x3.l(r9)     // Catch:{ SQLiteException -> 0x023c }
            r9.i()     // Catch:{ SQLiteException -> 0x023c }
            boolean r9 = r6.E     // Catch:{ SQLiteException -> 0x023c }
            java.lang.String r10 = r6.f13181u     // Catch:{ SQLiteException -> 0x023c }
            boolean r10 = cb.c.m(r10, r8)     // Catch:{ SQLiteException -> 0x023c }
            r10 = r10 ^ r0
            r9 = r9 | r10
            r6.E = r9     // Catch:{ SQLiteException -> 0x023c }
            r6.f13181u = r8     // Catch:{ SQLiteException -> 0x023c }
        L_0x01fa:
            com.google.android.gms.internal.measurement.tc r8 = com.google.android.gms.internal.measurement.tc.f5539b     // Catch:{ SQLiteException -> 0x023c }
            com.google.android.gms.internal.measurement.g5 r8 = r8.f5540a     // Catch:{ SQLiteException -> 0x023c }
            java.lang.Object r8 = r8.zza()     // Catch:{ SQLiteException -> 0x023c }
            com.google.android.gms.internal.measurement.uc r8 = (com.google.android.gms.internal.measurement.uc) r8     // Catch:{ SQLiteException -> 0x023c }
            r8.zza()     // Catch:{ SQLiteException -> 0x023c }
            r8 = r3
            q7.x3 r8 = (q7.x3) r8     // Catch:{ SQLiteException -> 0x023c }
            q7.f r8 = r8.C     // Catch:{ SQLiteException -> 0x023c }
            q7.f2 r9 = q7.g2.f13046m0     // Catch:{ SQLiteException -> 0x023c }
            boolean r8 = r8.r(r4, r9)     // Catch:{ SQLiteException -> 0x023c }
            if (r8 == 0) goto L_0x023e
            r8 = 29
            boolean r9 = r5.isNull(r8)     // Catch:{ SQLiteException -> 0x023c }
            if (r9 != 0) goto L_0x0224
            int r8 = r5.getInt(r8)     // Catch:{ SQLiteException -> 0x023c }
            if (r8 == 0) goto L_0x0224
            r8 = r0
            goto L_0x0225
        L_0x0224:
            r8 = r13
        L_0x0225:
            q7.w3 r9 = r7.F     // Catch:{ SQLiteException -> 0x023c }
            q7.x3.l(r9)     // Catch:{ SQLiteException -> 0x023c }
            r9.i()     // Catch:{ SQLiteException -> 0x023c }
            boolean r9 = r6.E     // Catch:{ SQLiteException -> 0x023c }
            boolean r10 = r6.f13182v     // Catch:{ SQLiteException -> 0x023c }
            if (r10 == r8) goto L_0x0235
            r10 = r0
            goto L_0x0236
        L_0x0235:
            r10 = r13
        L_0x0236:
            r9 = r9 | r10
            r6.E = r9     // Catch:{ SQLiteException -> 0x023c }
            r6.f13182v = r8     // Catch:{ SQLiteException -> 0x023c }
            goto L_0x023e
        L_0x023c:
            r0 = move-exception
            goto L_0x0296
        L_0x023e:
            com.google.android.gms.internal.measurement.ob.a()     // Catch:{ SQLiteException -> 0x023c }
            r8 = r3
            q7.x3 r8 = (q7.x3) r8     // Catch:{ SQLiteException -> 0x023c }
            q7.f r8 = r8.C     // Catch:{ SQLiteException -> 0x023c }
            q7.f2 r9 = q7.g2.f13068x0     // Catch:{ SQLiteException -> 0x023c }
            boolean r8 = r8.r(r4, r9)     // Catch:{ SQLiteException -> 0x023c }
            if (r8 == 0) goto L_0x026b
            r8 = 30
            long r8 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x023c }
            q7.w3 r10 = r7.F     // Catch:{ SQLiteException -> 0x023c }
            q7.x3.l(r10)     // Catch:{ SQLiteException -> 0x023c }
            r10.i()     // Catch:{ SQLiteException -> 0x023c }
            boolean r10 = r6.E     // Catch:{ SQLiteException -> 0x023c }
            long r11 = r6.f13183w     // Catch:{ SQLiteException -> 0x023c }
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto L_0x0265
            goto L_0x0266
        L_0x0265:
            r0 = r13
        L_0x0266:
            r0 = r0 | r10
            r6.E = r0     // Catch:{ SQLiteException -> 0x023c }
            r6.f13183w = r8     // Catch:{ SQLiteException -> 0x023c }
        L_0x026b:
            q7.w3 r0 = r7.F     // Catch:{ SQLiteException -> 0x023c }
            q7.x3.l(r0)     // Catch:{ SQLiteException -> 0x023c }
            r0.i()     // Catch:{ SQLiteException -> 0x023c }
            r6.E = r13     // Catch:{ SQLiteException -> 0x023c }
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x023c }
            if (r0 == 0) goto L_0x028e
            r0 = r3
            q7.x3 r0 = (q7.x3) r0     // Catch:{ SQLiteException -> 0x023c }
            q7.s2 r0 = r0.E     // Catch:{ SQLiteException -> 0x023c }
            q7.x3.l(r0)     // Catch:{ SQLiteException -> 0x023c }
            q7.q2 r0 = r0.B     // Catch:{ SQLiteException -> 0x023c }
            java.lang.String r7 = "Got multiple records for app, expected one. appId"
            q7.r2 r8 = q7.s2.r(r39)     // Catch:{ SQLiteException -> 0x023c }
            r0.c(r8, r7)     // Catch:{ SQLiteException -> 0x023c }
        L_0x028e:
            r5.close()
            return r6
        L_0x0292:
            r0 = move-exception
            goto L_0x02b0
        L_0x0294:
            r0 = move-exception
            r5 = r4
        L_0x0296:
            q7.x3 r3 = (q7.x3) r3     // Catch:{ all -> 0x02ae }
            q7.s2 r3 = r3.E     // Catch:{ all -> 0x02ae }
            q7.x3.l(r3)     // Catch:{ all -> 0x02ae }
            q7.q2 r3 = r3.B     // Catch:{ all -> 0x02ae }
            java.lang.String r6 = "Error querying app. appId"
            q7.r2 r2 = q7.s2.r(r39)     // Catch:{ all -> 0x02ae }
            r3.d(r2, r0, r6)     // Catch:{ all -> 0x02ae }
            if (r5 == 0) goto L_0x02ad
            r5.close()
        L_0x02ad:
            return r4
        L_0x02ae:
            r0 = move-exception
            r4 = r5
        L_0x02b0:
            if (r4 == 0) goto L_0x02b5
            r4.close()
        L_0x02b5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.k.C(java.lang.String):q7.l4");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q7.c D(java.lang.String r32, java.lang.String r33) {
        /*
            r31 = this;
            r1 = r31
            r8 = r33
            q7.t6 r0 = r1.f13208b
            q7.k4 r9 = r1.f13121a
            u6.q.f(r32)
            u6.q.f(r33)
            r31.i()
            r31.j()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r31.B()     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fc }
            java.lang.String r12 = "conditional_properties"
            java.lang.String r13 = "origin"
            java.lang.String r14 = "value"
            java.lang.String r15 = "active"
            java.lang.String r16 = "trigger_event_name"
            java.lang.String r17 = "trigger_timeout"
            java.lang.String r18 = "timed_out_event"
            java.lang.String r19 = "creation_timestamp"
            java.lang.String r20 = "triggered_event"
            java.lang.String r21 = "triggered_timestamp"
            java.lang.String r22 = "time_to_live"
            java.lang.String r23 = "expired_event"
            java.lang.String[] r13 = new java.lang.String[]{r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fc }
            java.lang.String r14 = "app_id=? and name=?"
            r2 = 2
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fc }
            r3 = 0
            r15[r3] = r32     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fc }
            r4 = 1
            r15[r4] = r8     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fc }
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fc }
            boolean r5 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x00fa }
            if (r5 != 0) goto L_0x0054
            r11.close()
            return r10
        L_0x0054:
            java.lang.String r5 = r11.getString(r3)     // Catch:{ SQLiteException -> 0x00fa }
            if (r5 != 0) goto L_0x005c
            java.lang.String r5 = ""
        L_0x005c:
            r18 = r5
            java.lang.Object r5 = r1.I(r4, r11)     // Catch:{ SQLiteException -> 0x00fa }
            int r2 = r11.getInt(r2)     // Catch:{ SQLiteException -> 0x00fa }
            if (r2 == 0) goto L_0x006b
            r22 = r4
            goto L_0x006d
        L_0x006b:
            r22 = r3
        L_0x006d:
            r2 = 3
            java.lang.String r23 = r11.getString(r2)     // Catch:{ SQLiteException -> 0x00fa }
            r2 = 4
            long r25 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00fa }
            q7.v6 r2 = r0.C     // Catch:{ SQLiteException -> 0x00fa }
            q7.v6 r0 = r0.C
            q7.t6.H(r2)     // Catch:{ SQLiteException -> 0x00fa }
            r3 = 5
            byte[] r3 = r11.getBlob(r3)     // Catch:{ SQLiteException -> 0x00fa }
            android.os.Parcelable$Creator<q7.s> r4 = q7.s.CREATOR     // Catch:{ SQLiteException -> 0x00fa }
            android.os.Parcelable r2 = r2.y(r3, r4)     // Catch:{ SQLiteException -> 0x00fa }
            r24 = r2
            q7.s r24 = (q7.s) r24     // Catch:{ SQLiteException -> 0x00fa }
            r2 = 6
            long r20 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00fa }
            q7.t6.H(r0)     // Catch:{ SQLiteException -> 0x00fa }
            r2 = 7
            byte[] r2 = r11.getBlob(r2)     // Catch:{ SQLiteException -> 0x00fa }
            android.os.Parcelable r2 = r0.y(r2, r4)     // Catch:{ SQLiteException -> 0x00fa }
            r27 = r2
            q7.s r27 = (q7.s) r27     // Catch:{ SQLiteException -> 0x00fa }
            r2 = 8
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00fa }
            r2 = 9
            long r28 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00fa }
            q7.t6.H(r0)     // Catch:{ SQLiteException -> 0x00fa }
            r2 = 10
            byte[] r2 = r11.getBlob(r2)     // Catch:{ SQLiteException -> 0x00fa }
            android.os.Parcelable r0 = r0.y(r2, r4)     // Catch:{ SQLiteException -> 0x00fa }
            r30 = r0
            q7.s r30 = (q7.s) r30     // Catch:{ SQLiteException -> 0x00fa }
            q7.w6 r19 = new q7.w6     // Catch:{ SQLiteException -> 0x00fa }
            r2 = r19
            r3 = r6
            r6 = r33
            r7 = r18
            r2.<init>(r3, r5, r6, r7)     // Catch:{ SQLiteException -> 0x00fa }
            q7.c r0 = new q7.c     // Catch:{ SQLiteException -> 0x00fa }
            r16 = r0
            r17 = r32
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r30)     // Catch:{ SQLiteException -> 0x00fa }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x00fa }
            if (r2 == 0) goto L_0x00f6
            r2 = r9
            q7.x3 r2 = (q7.x3) r2     // Catch:{ SQLiteException -> 0x00fa }
            q7.s2 r2 = r2.E     // Catch:{ SQLiteException -> 0x00fa }
            q7.x3.l(r2)     // Catch:{ SQLiteException -> 0x00fa }
            q7.q2 r2 = r2.B     // Catch:{ SQLiteException -> 0x00fa }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            q7.r2 r4 = q7.s2.r(r32)     // Catch:{ SQLiteException -> 0x00fa }
            r5 = r9
            q7.x3 r5 = (q7.x3) r5     // Catch:{ SQLiteException -> 0x00fa }
            q7.n2 r5 = r5.I     // Catch:{ SQLiteException -> 0x00fa }
            java.lang.String r5 = r5.f(r8)     // Catch:{ SQLiteException -> 0x00fa }
            r2.d(r4, r5, r3)     // Catch:{ SQLiteException -> 0x00fa }
        L_0x00f6:
            r11.close()
            return r0
        L_0x00fa:
            r0 = move-exception
            goto L_0x0100
        L_0x00fc:
            r0 = move-exception
            goto L_0x0123
        L_0x00fe:
            r0 = move-exception
            r11 = r10
        L_0x0100:
            r2 = r9
            q7.x3 r2 = (q7.x3) r2     // Catch:{ all -> 0x0121 }
            q7.s2 r2 = r2.E     // Catch:{ all -> 0x0121 }
            q7.x3.l(r2)     // Catch:{ all -> 0x0121 }
            q7.q2 r2 = r2.B     // Catch:{ all -> 0x0121 }
            java.lang.String r3 = "Error querying conditional property"
            q7.r2 r4 = q7.s2.r(r32)     // Catch:{ all -> 0x0121 }
            q7.x3 r9 = (q7.x3) r9     // Catch:{ all -> 0x0121 }
            q7.n2 r5 = r9.I     // Catch:{ all -> 0x0121 }
            java.lang.String r5 = r5.f(r8)     // Catch:{ all -> 0x0121 }
            r2.e(r3, r4, r5, r0)     // Catch:{ all -> 0x0121 }
            if (r11 == 0) goto L_0x0120
            r11.close()
        L_0x0120:
            return r10
        L_0x0121:
            r0 = move-exception
            r10 = r11
        L_0x0123:
            if (r10 == 0) goto L_0x0128
            r10.close()
        L_0x0128:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.k.D(java.lang.String, java.lang.String):q7.c");
    }

    public final i E(long j10, String str, boolean z10, boolean z11) {
        return F(j10, str, 1, false, false, z10, false, z11);
    }

    public final i F(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        k4 k4Var = this.f13121a;
        q.f(str);
        i();
        j();
        String[] strArr = {str};
        i iVar = new i();
        Cursor cursor = null;
        try {
            SQLiteDatabase B2 = B();
            cursor = B2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.E.c(s2.r(str), "Not updating daily counts, app is not known. appId");
                cursor.close();
                return iVar;
            }
            if (cursor.getLong(0) == j10) {
                iVar.f13113b = cursor.getLong(1);
                iVar.f13112a = cursor.getLong(2);
                iVar.f13114c = cursor.getLong(3);
                iVar.f13115d = cursor.getLong(4);
                iVar.f13116e = cursor.getLong(5);
            }
            if (z10) {
                iVar.f13113b += j11;
            }
            if (z11) {
                iVar.f13112a += j11;
            }
            if (z12) {
                iVar.f13114c += j11;
            }
            if (z13) {
                iVar.f13115d += j11;
            }
            if (z14) {
                iVar.f13116e += j11;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j10));
            contentValues.put("daily_public_events_count", Long.valueOf(iVar.f13112a));
            contentValues.put("daily_events_count", Long.valueOf(iVar.f13113b));
            contentValues.put("daily_conversions_count", Long.valueOf(iVar.f13114c));
            contentValues.put("daily_error_events_count", Long.valueOf(iVar.f13115d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(iVar.f13116e));
            B2.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return iVar;
        } catch (SQLiteException e10) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.B.d(s2.r(str), e10, "Error updating daily counts. appId");
            if (cursor != null) {
                cursor.close();
            }
            return iVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q7.p G(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            q7.k4 r13 = r1.f13121a
            u6.q.f(r28)
            u6.q.f(r29)
            r27.i()
            r27.j()
            java.lang.String r2 = "lifetime_count"
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.B()     // Catch:{ SQLiteException -> 0x012c, all -> 0x012a }
            java.lang.String r3 = "events"
            r10 = 0
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x012c, all -> 0x012a }
            java.lang.Object[] r0 = r0.toArray(r4)     // Catch:{ SQLiteException -> 0x012c, all -> 0x012a }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x012c, all -> 0x012a }
            java.lang.String r5 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x012c, all -> 0x012a }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x012c, all -> 0x012a }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x012c, all -> 0x012a }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r14 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x012c, all -> 0x012a }
            boolean r2 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r2 != 0) goto L_0x005e
            r14.close()
            return r19
        L_0x005e:
            long r5 = r14.getLong(r10)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            long r7 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            long r16 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r0 = 3
            boolean r2 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r3 = 0
            if (r2 == 0) goto L_0x0076
            r20 = r3
            goto L_0x007a
        L_0x0076:
            long r20 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
        L_0x007a:
            r0 = 4
            boolean r2 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r2 == 0) goto L_0x0084
            r0 = r19
            goto L_0x008c
        L_0x0084:
            long r22 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
        L_0x008c:
            r2 = 5
            boolean r9 = r14.isNull(r2)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r9 == 0) goto L_0x0096
            r18 = r19
            goto L_0x00a0
        L_0x0096:
            long r22 = r14.getLong(r2)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r18 = r2
        L_0x00a0:
            r2 = 6
            boolean r9 = r14.isNull(r2)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r9 == 0) goto L_0x00aa
            r22 = r19
            goto L_0x00b4
        L_0x00aa:
            long r22 = r14.getLong(r2)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r22 = r2
        L_0x00b4:
            r2 = 7
            boolean r9 = r14.isNull(r2)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r9 != 0) goto L_0x00cd
            long r23 = r14.getLong(r2)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c6
            r10 = r11
        L_0x00c6:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r23 = r2
            goto L_0x00cf
        L_0x00cd:
            r23 = r19
        L_0x00cf:
            r2 = 8
            boolean r9 = r14.isNull(r2)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r9 == 0) goto L_0x00d9
            r9 = r3
            goto L_0x00de
        L_0x00d9:
            long r2 = r14.getLong(r2)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r9 = r2
        L_0x00de:
            q7.p r24 = new q7.p     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r26 = r13
            r25 = r14
            r13 = r20
            r1 = r15
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0117 }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0119, all -> 0x0117 }
            if (r0 == 0) goto L_0x0113
            r13 = r26
            q7.x3 r13 = (q7.x3) r13     // Catch:{ SQLiteException -> 0x0119, all -> 0x0117 }
            q7.s2 r0 = r13.E     // Catch:{ SQLiteException -> 0x0119, all -> 0x0117 }
            q7.x3.l(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0117 }
            q7.q2 r0 = r0.B     // Catch:{ SQLiteException -> 0x0119, all -> 0x0117 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            q7.r2 r3 = q7.s2.r(r28)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0117 }
            r0.c(r3, r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0117 }
        L_0x0113:
            r25.close()
            return r24
        L_0x0117:
            r0 = move-exception
            goto L_0x011e
        L_0x0119:
            r0 = move-exception
            goto L_0x0127
        L_0x011b:
            r0 = move-exception
            r25 = r14
        L_0x011e:
            r19 = r25
            goto L_0x0159
        L_0x0121:
            r0 = move-exception
            r26 = r13
            r25 = r14
            r1 = r15
        L_0x0127:
            r14 = r25
            goto L_0x0132
        L_0x012a:
            r0 = move-exception
            goto L_0x0159
        L_0x012c:
            r0 = move-exception
            r26 = r13
            r1 = r15
            r14 = r19
        L_0x0132:
            r13 = r26
            q7.x3 r13 = (q7.x3) r13     // Catch:{ all -> 0x0156 }
            q7.s2 r2 = r13.E     // Catch:{ all -> 0x0156 }
            q7.x3.l(r2)     // Catch:{ all -> 0x0156 }
            q7.q2 r2 = r2.B     // Catch:{ all -> 0x0156 }
            java.lang.String r3 = "Error querying events. appId"
            q7.r2 r4 = q7.s2.r(r28)     // Catch:{ all -> 0x0156 }
            r13 = r26
            q7.x3 r13 = (q7.x3) r13     // Catch:{ all -> 0x0156 }
            q7.n2 r5 = r13.I     // Catch:{ all -> 0x0156 }
            java.lang.String r1 = r5.d(r1)     // Catch:{ all -> 0x0156 }
            r2.e(r3, r4, r1, r0)     // Catch:{ all -> 0x0156 }
            if (r14 == 0) goto L_0x0155
            r14.close()
        L_0x0155:
            return r19
        L_0x0156:
            r0 = move-exception
            r19 = r14
        L_0x0159:
            if (r19 == 0) goto L_0x015e
            r19.close()
        L_0x015e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.k.G(java.lang.String, java.lang.String):q7.p");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q7.y6 H(java.lang.String r21, java.lang.String r22) {
        /*
            r20 = this;
            r1 = r20
            r9 = r22
            q7.k4 r10 = r1.f13121a
            u6.q.f(r21)
            u6.q.f(r22)
            r20.i()
            r20.j()
            r11 = 0
            android.database.sqlite.SQLiteDatabase r12 = r20.B()     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            java.lang.String r13 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r14 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            java.lang.String r15 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            r3 = 0
            r2[r3] = r21     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            r4 = 1
            r2[r4] = r9     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r2
            android.database.Cursor r12 = r12.query(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            boolean r2 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x007d }
            if (r2 != 0) goto L_0x0044
            r12.close()
            return r11
        L_0x0044:
            long r6 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x007d }
            java.lang.Object r8 = r1.I(r4, r12)     // Catch:{ SQLiteException -> 0x007d }
            if (r8 != 0) goto L_0x0052
            r12.close()
            return r11
        L_0x0052:
            java.lang.String r4 = r12.getString(r0)     // Catch:{ SQLiteException -> 0x007d }
            q7.y6 r0 = new q7.y6     // Catch:{ SQLiteException -> 0x007d }
            r2 = r0
            r3 = r21
            r5 = r22
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x007d }
            boolean r2 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x007d }
            if (r2 == 0) goto L_0x0079
            r2 = r10
            q7.x3 r2 = (q7.x3) r2     // Catch:{ SQLiteException -> 0x007d }
            q7.s2 r2 = r2.E     // Catch:{ SQLiteException -> 0x007d }
            q7.x3.l(r2)     // Catch:{ SQLiteException -> 0x007d }
            q7.q2 r2 = r2.B     // Catch:{ SQLiteException -> 0x007d }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            q7.r2 r4 = q7.s2.r(r21)     // Catch:{ SQLiteException -> 0x007d }
            r2.c(r4, r3)     // Catch:{ SQLiteException -> 0x007d }
        L_0x0079:
            r12.close()
            return r0
        L_0x007d:
            r0 = move-exception
            goto L_0x0083
        L_0x007f:
            r0 = move-exception
            goto L_0x00a6
        L_0x0081:
            r0 = move-exception
            r12 = r11
        L_0x0083:
            r2 = r10
            q7.x3 r2 = (q7.x3) r2     // Catch:{ all -> 0x00a4 }
            q7.s2 r2 = r2.E     // Catch:{ all -> 0x00a4 }
            q7.x3.l(r2)     // Catch:{ all -> 0x00a4 }
            q7.q2 r2 = r2.B     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = "Error querying user property. appId"
            q7.r2 r4 = q7.s2.r(r21)     // Catch:{ all -> 0x00a4 }
            q7.x3 r10 = (q7.x3) r10     // Catch:{ all -> 0x00a4 }
            q7.n2 r5 = r10.I     // Catch:{ all -> 0x00a4 }
            java.lang.String r5 = r5.f(r9)     // Catch:{ all -> 0x00a4 }
            r2.e(r3, r4, r5, r0)     // Catch:{ all -> 0x00a4 }
            if (r12 == 0) goto L_0x00a3
            r12.close()
        L_0x00a3:
            return r11
        L_0x00a4:
            r0 = move-exception
            r11 = r12
        L_0x00a6:
            if (r11 == 0) goto L_0x00ab
            r11.close()
        L_0x00ab:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.k.H(java.lang.String, java.lang.String):q7.y6");
    }

    public final Object I(int i8, Cursor cursor) {
        int type = cursor.getType(i8);
        k4 k4Var = this.f13121a;
        if (type == 0) {
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            s2Var.B.b("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i8));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i8));
            }
            if (type == 3) {
                return cursor.getString(i8);
            }
            if (type != 4) {
                s2 s2Var2 = ((x3) k4Var).E;
                x3.l(s2Var2);
                s2Var2.B.c(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                return null;
            }
            s2 s2Var3 = ((x3) k4Var).E;
            x3.l(s2Var3);
            s2Var3.B.b("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String J() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.B()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003f
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            q7.k4 r3 = r6.f13121a     // Catch:{ all -> 0x003b }
            q7.x3 r3 = (q7.x3) r3     // Catch:{ all -> 0x003b }
            q7.s2 r3 = r3.E     // Catch:{ all -> 0x003b }
            q7.x3.l(r3)     // Catch:{ all -> 0x003b }
            q7.q2 r3 = r3.B     // Catch:{ all -> 0x003b }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.c(r2, r4)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x003a
            r0.close()
        L_0x003a:
            return r1
        L_0x003b:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003f:
            if (r1 == 0) goto L_0x0044
            r1.close()
        L_0x0044:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.k.J():java.lang.String");
    }

    public final List K(String str, String str2, String str3) {
        q.f(str);
        i();
        j();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return L(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List L(String str, String[] strArr) {
        t6 t6Var = this.f13208b;
        k4 k4Var = this.f13121a;
        i();
        j();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            ((x3) k4Var).getClass();
            cursor = B().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (cursor.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    ((x3) k4Var).getClass();
                    if (size < 1000) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object I2 = I(3, cursor);
                        boolean z10 = cursor.getInt(4) != 0;
                        String string4 = cursor.getString(5);
                        long j10 = cursor.getLong(6);
                        v6 v6Var = t6Var.C;
                        v6 v6Var2 = t6Var.C;
                        t6.H(v6Var);
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<s> creator = s.CREATOR;
                        long j11 = cursor.getLong(8);
                        t6.H(v6Var2);
                        long j12 = cursor.getLong(10);
                        long j13 = cursor.getLong(11);
                        t6.H(v6Var2);
                        arrayList.add(new c(string, string2, new w6(j12, I2, string3, string2), j11, z10, string4, (s) v6Var.y(blob, creator), j10, (s) v6Var2.y(cursor.getBlob(9), creator), j13, (s) v6Var2.y(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    } else {
                        s2 s2Var = ((x3) k4Var).E;
                        x3.l(s2Var);
                        q2 q2Var = s2Var.B;
                        ((x3) k4Var).getClass();
                        q2Var.c(1000, "Read more than the max allowed conditional properties, ignoring extra");
                        break;
                    }
                }
                cursor.close();
                return arrayList;
            }
            cursor.close();
            return arrayList;
        } catch (SQLiteException e10) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.B.c(e10, "Error querying conditional user property value");
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List M(String str) {
        k4 k4Var = this.f13121a;
        q.f(str);
        i();
        j();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            ((x3) k4Var).getClass();
            Cursor query = B().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = query.getLong(2);
                    Object I2 = I(3, query);
                    if (I2 == null) {
                        s2 s2Var = ((x3) k4Var).E;
                        x3.l(s2Var);
                        s2Var.B.c(s2.r(str), "Read invalid user property value, ignoring it. appId");
                    } else {
                        arrayList.add(new y6(str, str2, string, j10, I2));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e10) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.B.d(s2.r(str), e10, "Error querying user properties. appId");
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010f, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0111, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0112, code lost:
        r15 = r18;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0016] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List N(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            q7.k4 r2 = r1.f13121a
            u6.q.f(r18)
            r17.i()
            r17.j()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r12 = "1001"
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            r14 = 3
            r4.<init>(r14)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010e }
            r15 = r18
            r4.add(r15)     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            java.lang.String r6 = "app_id=?"
            r5.<init>(r6)     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            boolean r6 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            if (r6 != 0) goto L_0x0039
            r11 = r19
            r4.add(r11)     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            java.lang.String r6 = " and origin=?"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            goto L_0x003b
        L_0x0039:
            r11 = r19
        L_0x003b:
            boolean r6 = android.text.TextUtils.isEmpty(r20)     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            if (r6 != 0) goto L_0x005a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            r6.<init>()     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            r6.append(r0)     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            java.lang.String r7 = "*"
            r6.append(r7)     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            java.lang.String r6 = r6.toString()     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            r4.add(r6)     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            java.lang.String r6 = " and name glob ?"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
        L_0x005a:
            int r6 = r4.size()     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            java.lang.Object[] r4 = r4.toArray(r6)     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            r8 = r4
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            android.database.sqlite.SQLiteDatabase r4 = r17.B()     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            java.lang.String r6 = "user_attributes"
            java.lang.String r7 = "name"
            java.lang.String r9 = "set_timestamp"
            java.lang.String r10 = "value"
            java.lang.String r13 = "origin"
            java.lang.String[] r7 = new java.lang.String[]{r7, r9, r10, r13}     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            java.lang.String r9 = r5.toString()     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            java.lang.String r13 = "rowid"
            r5 = r2
            q7.x3 r5 = (q7.x3) r5     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            r5.getClass()     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            r10 = 0
            r16 = 0
            r5 = r6
            r6 = r7
            r7 = r9
            r9 = r10
            r10 = r16
            r11 = r13
            android.database.Cursor r13 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x010c, all -> 0x010e }
            boolean r4 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0108 }
            if (r4 != 0) goto L_0x009d
            r13.close()
            return r3
        L_0x009d:
            r4 = r19
        L_0x009f:
            int r5 = r3.size()     // Catch:{ SQLiteException -> 0x0106 }
            r6 = r2
            q7.x3 r6 = (q7.x3) r6     // Catch:{ SQLiteException -> 0x0106 }
            r6.getClass()     // Catch:{ SQLiteException -> 0x0106 }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r5 < r6) goto L_0x00c7
            r0 = r2
            q7.x3 r0 = (q7.x3) r0     // Catch:{ SQLiteException -> 0x0106 }
            q7.s2 r0 = r0.E     // Catch:{ SQLiteException -> 0x0106 }
            q7.x3.l(r0)     // Catch:{ SQLiteException -> 0x0106 }
            q7.q2 r0 = r0.B     // Catch:{ SQLiteException -> 0x0106 }
            java.lang.String r5 = "Read more than the max allowed user properties, ignoring excess"
            r7 = r2
            q7.x3 r7 = (q7.x3) r7     // Catch:{ SQLiteException -> 0x0106 }
            r7.getClass()     // Catch:{ SQLiteException -> 0x0106 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x0106 }
            r0.c(r6, r5)     // Catch:{ SQLiteException -> 0x0106 }
            goto L_0x0102
        L_0x00c7:
            r5 = 0
            java.lang.String r8 = r13.getString(r5)     // Catch:{ SQLiteException -> 0x0106 }
            r5 = 1
            long r9 = r13.getLong(r5)     // Catch:{ SQLiteException -> 0x0106 }
            r5 = 2
            java.lang.Object r11 = r1.I(r5, r13)     // Catch:{ SQLiteException -> 0x0106 }
            java.lang.String r4 = r13.getString(r14)     // Catch:{ SQLiteException -> 0x0106 }
            if (r11 != 0) goto L_0x00f0
            r5 = r2
            q7.x3 r5 = (q7.x3) r5     // Catch:{ SQLiteException -> 0x0106 }
            q7.s2 r5 = r5.E     // Catch:{ SQLiteException -> 0x0106 }
            q7.x3.l(r5)     // Catch:{ SQLiteException -> 0x0106 }
            q7.q2 r5 = r5.B     // Catch:{ SQLiteException -> 0x0106 }
            java.lang.String r6 = "(2)Read invalid user property value, ignoring it"
            q7.r2 r7 = q7.s2.r(r18)     // Catch:{ SQLiteException -> 0x0106 }
            r5.e(r6, r7, r4, r0)     // Catch:{ SQLiteException -> 0x0106 }
            goto L_0x00fc
        L_0x00f0:
            q7.y6 r12 = new q7.y6     // Catch:{ SQLiteException -> 0x0106 }
            r5 = r12
            r6 = r18
            r7 = r4
            r5.<init>(r6, r7, r8, r9, r11)     // Catch:{ SQLiteException -> 0x0106 }
            r3.add(r12)     // Catch:{ SQLiteException -> 0x0106 }
        L_0x00fc:
            boolean r5 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x0106 }
            if (r5 != 0) goto L_0x009f
        L_0x0102:
            r13.close()
            return r3
        L_0x0106:
            r0 = move-exception
            goto L_0x0117
        L_0x0108:
            r0 = move-exception
            r4 = r19
            goto L_0x0117
        L_0x010c:
            r0 = move-exception
            goto L_0x0114
        L_0x010e:
            r0 = move-exception
            r13 = 0
            goto L_0x0134
        L_0x0111:
            r0 = move-exception
            r15 = r18
        L_0x0114:
            r4 = r19
            r13 = 0
        L_0x0117:
            q7.x3 r2 = (q7.x3) r2     // Catch:{ all -> 0x0133 }
            q7.s2 r2 = r2.E     // Catch:{ all -> 0x0133 }
            q7.x3.l(r2)     // Catch:{ all -> 0x0133 }
            q7.q2 r2 = r2.B     // Catch:{ all -> 0x0133 }
            java.lang.String r3 = "(2)Error querying user properties"
            q7.r2 r5 = q7.s2.r(r18)     // Catch:{ all -> 0x0133 }
            r2.e(r3, r5, r4, r0)     // Catch:{ all -> 0x0133 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0133 }
            if (r13 == 0) goto L_0x0132
            r13.close()
        L_0x0132:
            return r0
        L_0x0133:
            r0 = move-exception
        L_0x0134:
            if (r13 == 0) goto L_0x0139
            r13.close()
        L_0x0139:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.k.N(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void O() {
        j();
        B().beginTransaction();
    }

    public final void P() {
        j();
        B().endTransaction();
    }

    public final void Q(List list) {
        i();
        j();
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        } else if (q()) {
            String a10 = c.a("(", TextUtils.join(",", list), ")");
            int i8 = (w("SELECT COUNT(1) FROM queue WHERE rowid IN " + a10 + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0 ? 1 : (w("SELECT COUNT(1) FROM queue WHERE rowid IN " + a10 + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) == 0 ? 0 : -1));
            k4 k4Var = this.f13121a;
            if (i8 > 0) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.E.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase B2 = B();
                B2.execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + a10 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                s2 s2Var2 = ((x3) k4Var).E;
                x3.l(s2Var2);
                s2Var2.B.c(e10, "Error incrementing retry count. error");
            }
        }
    }

    public final void R() {
        i();
        j();
        if (q()) {
            t6 t6Var = this.f13208b;
            long a10 = t6Var.E.f13468e.a();
            x3 x3Var = (x3) this.f13121a;
            x3Var.J.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - a10);
            x3Var.getClass();
            if (abs > ((Long) g2.f13071z.a((Object) null)).longValue()) {
                t6Var.E.f13468e.b(elapsedRealtime);
                i();
                j();
                if (q()) {
                    SQLiteDatabase B2 = B();
                    x3Var.J.getClass();
                    x3Var.getClass();
                    int delete = B2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) g2.E.a((Object) null)).longValue())});
                    if (delete > 0) {
                        s2 s2Var = x3Var.E;
                        x3.l(s2Var);
                        s2Var.J.c(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final boolean l() {
        return false;
    }

    public final void m(String str, String str2) {
        q.f(str);
        q.f(str2);
        i();
        j();
        try {
            B().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            x3 x3Var = (x3) this.f13121a;
            s2 s2Var = x3Var.E;
            x3.l(s2Var);
            s2Var.B.e("Error deleting user property. appId", s2.r(str), x3Var.I.f(str2), e10);
        }
    }

    public final void n() {
        j();
        B().setTransactionSuccessful();
    }

    public final void o(l4 l4Var) {
        i();
        j();
        String E2 = l4Var.E();
        q.i(E2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", E2);
        contentValues.put("app_instance_id", l4Var.F());
        contentValues.put("gmp_app_id", l4Var.I());
        x3 x3Var = l4Var.f13162a;
        w3 w3Var = x3Var.F;
        x3.l(w3Var);
        w3Var.i();
        contentValues.put("resettable_device_id_hash", l4Var.f13166e);
        w3 w3Var2 = x3Var.F;
        x3.l(w3Var2);
        w3Var2.i();
        contentValues.put("last_bundle_index", Long.valueOf(l4Var.f13168g));
        w3 w3Var3 = x3Var.F;
        x3.l(w3Var3);
        w3Var3.i();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(l4Var.f13169h));
        w3 w3Var4 = x3Var.F;
        x3.l(w3Var4);
        w3Var4.i();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(l4Var.f13170i));
        contentValues.put("app_version", l4Var.G());
        w3 w3Var5 = x3Var.F;
        x3.l(w3Var5);
        w3Var5.i();
        contentValues.put("app_store", l4Var.f13173l);
        w3 w3Var6 = x3Var.F;
        x3.l(w3Var6);
        w3Var6.i();
        contentValues.put("gmp_version", Long.valueOf(l4Var.m));
        w3 w3Var7 = x3Var.F;
        x3.l(w3Var7);
        w3Var7.i();
        contentValues.put("dev_cert_hash", Long.valueOf(l4Var.f13174n));
        w3 w3Var8 = x3Var.F;
        x3.l(w3Var8);
        w3Var8.i();
        contentValues.put("measurement_enabled", Boolean.valueOf(l4Var.f13175o));
        w3 w3Var9 = x3Var.F;
        x3.l(w3Var9);
        w3Var9.i();
        contentValues.put("day", Long.valueOf(l4Var.f13184x));
        w3 w3Var10 = x3Var.F;
        x3.l(w3Var10);
        w3Var10.i();
        contentValues.put("daily_public_events_count", Long.valueOf(l4Var.f13185y));
        x3.l(w3Var10);
        w3Var10.i();
        contentValues.put("daily_events_count", Long.valueOf(l4Var.f13186z));
        x3.l(w3Var10);
        w3Var10.i();
        contentValues.put("daily_conversions_count", Long.valueOf(l4Var.A));
        w3 w3Var11 = x3Var.F;
        x3.l(w3Var11);
        w3Var11.i();
        contentValues.put("config_fetched_time", Long.valueOf(l4Var.F));
        w3 w3Var12 = x3Var.F;
        x3.l(w3Var12);
        w3Var12.i();
        contentValues.put("failed_config_fetch_time", Long.valueOf(l4Var.G));
        contentValues.put("app_version_int", Long.valueOf(l4Var.A()));
        contentValues.put("firebase_instance_id", l4Var.H());
        x3.l(w3Var10);
        w3Var10.i();
        contentValues.put("daily_error_events_count", Long.valueOf(l4Var.B));
        x3.l(w3Var10);
        w3Var10.i();
        contentValues.put("daily_realtime_events_count", Long.valueOf(l4Var.C));
        x3.l(w3Var10);
        w3Var10.i();
        contentValues.put("health_monitor_sample", l4Var.D);
        w3 w3Var13 = x3Var.F;
        x3.l(w3Var13);
        w3Var13.i();
        contentValues.put("android_id", 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(l4Var.y()));
        contentValues.put("admob_app_id", l4Var.C());
        contentValues.put("dynamite_version", Long.valueOf(l4Var.B()));
        w3 w3Var14 = x3Var.F;
        x3.l(w3Var14);
        w3Var14.i();
        contentValues.put("session_stitching_token", l4Var.f13181u);
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(l4Var.z()));
        w3 w3Var15 = x3Var.F;
        x3.l(w3Var15);
        w3Var15.i();
        contentValues.put("target_os_version", Long.valueOf(l4Var.f13183w));
        w3 w3Var16 = x3Var.F;
        x3.l(w3Var16);
        w3Var16.i();
        ArrayList arrayList = l4Var.f13180t;
        k4 k4Var = this.f13121a;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.E.c(E2, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        ((ha) ga.f5297b.f5298a.zza()).zza();
        x3 x3Var2 = (x3) k4Var;
        if (x3Var2.C.r((String) null, g2.f13037h0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase B2 = B();
            if (((long) B2.update("apps", contentValues, "app_id = ?", new String[]{E2})) == 0 && B2.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                s2 s2Var2 = ((x3) k4Var).E;
                x3.l(s2Var2);
                s2Var2.B.c(s2.r(E2), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e10) {
            s2 s2Var3 = x3Var2.E;
            x3.l(s2Var3);
            s2Var3.B.d(s2.r(E2), e10, "Error storing app. appId");
        }
    }

    public final void p(p pVar) {
        k4 k4Var = this.f13121a;
        q.i(pVar);
        i();
        j();
        ContentValues contentValues = new ContentValues();
        String str = pVar.f13253a;
        contentValues.put("app_id", str);
        contentValues.put("name", pVar.f13254b);
        contentValues.put("lifetime_count", Long.valueOf(pVar.f13255c));
        contentValues.put("current_bundle_count", Long.valueOf(pVar.f13256d));
        contentValues.put("last_fire_timestamp", Long.valueOf(pVar.f13258f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(pVar.f13259g));
        contentValues.put("last_bundled_day", pVar.f13260h);
        contentValues.put("last_sampled_complex_event_id", pVar.f13261i);
        contentValues.put("last_sampling_rate", pVar.f13262j);
        contentValues.put("current_session_count", Long.valueOf(pVar.f13257e));
        Boolean bool = pVar.f13263k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (B().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.B.c(s2.r(str), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e10) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.B.d(s2.r(str), e10, "Error storing event aggregates. appId");
        }
    }

    public final boolean q() {
        k4 k4Var = this.f13121a;
        Context context = ((x3) k4Var).f13419a;
        ((x3) k4Var).getClass();
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    public final void r(String str, Long l10, long j10, f3 f3Var) {
        i();
        j();
        q.i(f3Var);
        q.f(str);
        byte[] e10 = f3Var.e();
        k4 k4Var = this.f13121a;
        x3 x3Var = (x3) k4Var;
        s2 s2Var = x3Var.E;
        x3.l(s2Var);
        s2Var.J.d(x3Var.I.d(str), Integer.valueOf(e10.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", e10);
        try {
            if (B().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) == -1) {
                s2 s2Var2 = ((x3) k4Var).E;
                x3.l(s2Var2);
                s2Var2.B.c(s2.r(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e11) {
            s2 s2Var3 = x3Var.E;
            x3.l(s2Var3);
            s2Var3.B.d(s2.r(str), e11, "Error storing complex main event. appId");
        }
    }

    public final boolean s(c cVar) {
        i();
        j();
        String str = cVar.f12926a;
        q.i(str);
        y6 H2 = H(str, cVar.f12928c.f13410b);
        k4 k4Var = this.f13121a;
        if (H2 == null) {
            long w10 = w("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            ((x3) k4Var).getClass();
            if (w10 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", cVar.f12927b);
        contentValues.put("name", cVar.f12928c.f13410b);
        Object w11 = cVar.f12928c.w();
        q.i(w11);
        v(contentValues, w11);
        contentValues.put("active", Boolean.valueOf(cVar.f12930e));
        contentValues.put("trigger_event_name", cVar.B);
        contentValues.put("trigger_timeout", Long.valueOf(cVar.D));
        x3 x3Var = (x3) k4Var;
        a7 a7Var = x3Var.H;
        x3.j(a7Var);
        a7Var.getClass();
        contentValues.put("timed_out_event", a7.a0(cVar.C));
        contentValues.put("creation_timestamp", Long.valueOf(cVar.f12929d));
        a7 a7Var2 = x3Var.H;
        x3.j(a7Var2);
        s sVar = cVar.E;
        a7Var2.getClass();
        contentValues.put("triggered_event", a7.a0(sVar));
        contentValues.put("triggered_timestamp", Long.valueOf(cVar.f12928c.f13411c));
        contentValues.put("time_to_live", Long.valueOf(cVar.F));
        a7 a7Var3 = x3Var.H;
        x3.j(a7Var3);
        a7Var3.getClass();
        contentValues.put("expired_event", a7.a0(cVar.G));
        try {
            if (B().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.B.c(s2.r(str), "Failed to insert/update conditional user property (got -1)");
            }
        } catch (SQLiteException e10) {
            s2 s2Var2 = x3Var.E;
            x3.l(s2Var2);
            s2Var2.B.d(s2.r(str), e10, "Error storing conditional user property");
        }
        return true;
    }

    public final boolean t(y6 y6Var) {
        i();
        j();
        String str = y6Var.f13450a;
        String str2 = y6Var.f13452c;
        y6 H2 = H(str, str2);
        k4 k4Var = this.f13121a;
        String str3 = y6Var.f13451b;
        if (H2 == null) {
            if (a7.X(str2)) {
                if (w("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= ((long) ((x3) k4Var).C.m(str, g2.H, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long w10 = w("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3});
                ((x3) k4Var).getClass();
                if (w10 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(y6Var.f13453d));
        v(contentValues, y6Var.f13454e);
        try {
            if (B().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.B.c(s2.r(str), "Failed to insert/update user property (got -1). appId");
            }
        } catch (SQLiteException e10) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.B.d(s2.r(str), e10, "Error storing user property. appId");
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x021f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(long r23, long r25, q7.r6 r27) {
        /*
            r22 = this;
            r1 = r22
            r2 = r27
            q7.k4 r3 = r1.f13121a
            java.lang.String r0 = "select app_id, metadata_fingerprint from raw_events where "
            java.lang.String r4 = "select metadata_fingerprint from raw_events where app_id = ?"
            r22.i()
            r22.j()
            r5 = 0
            android.database.sqlite.SQLiteDatabase r15 = r22.B()     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            r14 = 0
            r13 = 2
            r12 = 1
            java.lang.String r7 = ""
            r16 = -1
            if (r6 == 0) goto L_0x006c
            int r4 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0035
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            java.lang.String r8 = java.lang.String.valueOf(r25)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            r6[r14] = r8     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            java.lang.String r8 = java.lang.String.valueOf(r23)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            r6[r12] = r8     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            goto L_0x003d
        L_0x0035:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            java.lang.String r8 = java.lang.String.valueOf(r23)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            r6[r14] = r8     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
        L_0x003d:
            if (r4 == 0) goto L_0x0041
            java.lang.String r7 = "rowid <= ? and "
        L_0x0041:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            r4.<init>(r0)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            r4.append(r7)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            java.lang.String r0 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r4.append(r0)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            java.lang.String r0 = r4.toString()     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            android.database.Cursor r4 = r15.rawQuery(r0, r6)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            if (r0 != 0) goto L_0x0060
            r4.close()
            return
        L_0x0060:
            java.lang.String r5 = r4.getString(r14)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            java.lang.String r0 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r4.close()     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            goto L_0x00a9
        L_0x006c:
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x007b
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            r6[r14] = r5     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            java.lang.String r8 = java.lang.String.valueOf(r25)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            r6[r12] = r8     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            goto L_0x007f
        L_0x007b:
            java.lang.String[] r6 = new java.lang.String[]{r5}     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
        L_0x007f:
            if (r0 == 0) goto L_0x0083
            java.lang.String r7 = " and rowid <= ?"
        L_0x0083:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            r0.<init>(r4)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            r0.append(r7)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            java.lang.String r4 = " order by rowid limit 1;"
            r0.append(r4)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            java.lang.String r0 = r0.toString()     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            android.database.Cursor r4 = r15.rawQuery(r0, r6)     // Catch:{ SQLiteException -> 0x0201, all -> 0x01ff }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            if (r0 != 0) goto L_0x00a2
            r4.close()
            return
        L_0x00a2:
            java.lang.String r0 = r4.getString(r14)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r4.close()     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
        L_0x00a9:
            java.lang.String r7 = "raw_events_metadata"
            java.lang.String r6 = "metadata"
            java.lang.String[] r8 = new java.lang.String[]{r6}     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            java.lang.String r9 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r10 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r10[r14] = r5     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r10[r12] = r0     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r11 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "2"
            r6 = r15
            r12 = r18
            r13 = r19
            r1 = r14
            r14 = r20
            android.database.Cursor r4 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            boolean r6 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            if (r6 != 0) goto L_0x00e9
            r0 = r3
            q7.x3 r0 = (q7.x3) r0     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.s2 r0 = r0.E     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.x3.l(r0)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.q2 r0 = r0.B     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            java.lang.String r1 = "Raw event metadata record is missing. appId"
            q7.r2 r2 = q7.s2.r(r5)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r0.c(r2, r1)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r4.close()
            return
        L_0x00e9:
            byte[] r6 = r4.getBlob(r1)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            com.google.android.gms.internal.measurement.n3 r7 = com.google.android.gms.internal.measurement.o3.G1()     // Catch:{ IOException -> 0x01db }
            com.google.android.gms.internal.measurement.c7 r6 = q7.v6.A(r7, r6)     // Catch:{ IOException -> 0x01db }
            com.google.android.gms.internal.measurement.n3 r6 = (com.google.android.gms.internal.measurement.n3) r6     // Catch:{ IOException -> 0x01db }
            com.google.android.gms.internal.measurement.g7 r6 = r6.j()     // Catch:{ IOException -> 0x01db }
            com.google.android.gms.internal.measurement.o3 r6 = (com.google.android.gms.internal.measurement.o3) r6     // Catch:{ IOException -> 0x01db }
            boolean r7 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            if (r7 == 0) goto L_0x0116
            r7 = r3
            q7.x3 r7 = (q7.x3) r7     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.s2 r7 = r7.E     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.x3.l(r7)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.q2 r7 = r7.E     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            java.lang.String r8 = "Get multiple raw event metadata records, expected one. appId"
            q7.r2 r9 = q7.s2.r(r5)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r7.c(r9, r8)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
        L_0x0116:
            r4.close()     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r2.f13306a = r6     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            int r6 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            r14 = 3
            if (r6 == 0) goto L_0x0131
            java.lang.String r6 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r7 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r7[r1] = r5     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r13 = 1
            r7[r13] = r0     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            java.lang.String r0 = java.lang.String.valueOf(r25)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r12 = 2
            r7[r12] = r0     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            goto L_0x013b
        L_0x0131:
            r12 = 2
            r13 = 1
            java.lang.String r6 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r7[r1] = r5     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r7[r13] = r0     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
        L_0x013b:
            r9 = r6
            r10 = r7
            java.lang.String r7 = "raw_events"
            java.lang.String r0 = "rowid"
            java.lang.String r6 = "name"
            java.lang.String r8 = "timestamp"
            java.lang.String r11 = "data"
            java.lang.String[] r8 = new java.lang.String[]{r0, r6, r8, r11}     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r11 = 0
            r0 = 0
            java.lang.String r16 = "rowid"
            r17 = 0
            r6 = r15
            r15 = r12
            r12 = r0
            r15 = r13
            r13 = r16
            r15 = r14
            r14 = r17
            android.database.Cursor r4 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            if (r0 == 0) goto L_0x01c4
        L_0x0164:
            long r6 = r4.getLong(r1)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            byte[] r0 = r4.getBlob(r15)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            com.google.android.gms.internal.measurement.e3 r8 = com.google.android.gms.internal.measurement.f3.x()     // Catch:{ IOException -> 0x01a4 }
            com.google.android.gms.internal.measurement.c7 r0 = q7.v6.A(r8, r0)     // Catch:{ IOException -> 0x01a4 }
            com.google.android.gms.internal.measurement.e3 r0 = (com.google.android.gms.internal.measurement.e3) r0     // Catch:{ IOException -> 0x01a4 }
            r8 = 1
            java.lang.String r9 = r4.getString(r8)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r0.l()     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            com.google.android.gms.internal.measurement.g7 r10 = r0.f5179b     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            com.google.android.gms.internal.measurement.f3 r10 = (com.google.android.gms.internal.measurement.f3) r10     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            com.google.android.gms.internal.measurement.f3.H(r10, r9)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r9 = 2
            long r10 = r4.getLong(r9)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r0.l()     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            com.google.android.gms.internal.measurement.g7 r12 = r0.f5179b     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            com.google.android.gms.internal.measurement.f3 r12 = (com.google.android.gms.internal.measurement.f3) r12     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            com.google.android.gms.internal.measurement.f3.I(r10, r12)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            com.google.android.gms.internal.measurement.g7 r0 = r0.j()     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            com.google.android.gms.internal.measurement.f3 r0 = (com.google.android.gms.internal.measurement.f3) r0     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            boolean r0 = r2.a(r6, r0)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            if (r0 != 0) goto L_0x01ba
            r4.close()
            return
        L_0x01a4:
            r0 = move-exception
            r8 = 1
            r9 = 2
            r6 = r3
            q7.x3 r6 = (q7.x3) r6     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.s2 r6 = r6.E     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.x3.l(r6)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.q2 r6 = r6.B     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            java.lang.String r7 = "Data loss. Failed to merge raw event. appId"
            q7.r2 r10 = q7.s2.r(r5)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r6.d(r10, r0, r7)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
        L_0x01ba:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            if (r0 != 0) goto L_0x0164
            r4.close()
            return
        L_0x01c4:
            r0 = r3
            q7.x3 r0 = (q7.x3) r0     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.s2 r0 = r0.E     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.x3.l(r0)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.q2 r0 = r0.E     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            java.lang.String r1 = "Raw event data disappeared while in transaction. appId"
            q7.r2 r2 = q7.s2.r(r5)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r0.c(r2, r1)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r4.close()
            return
        L_0x01db:
            r0 = move-exception
            r1 = r3
            q7.x3 r1 = (q7.x3) r1     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.s2 r1 = r1.E     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.x3.l(r1)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            q7.q2 r1 = r1.B     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            java.lang.String r2 = "Data loss. Failed to merge raw event metadata. appId"
            q7.r2 r6 = q7.s2.r(r5)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r1.d(r6, r0, r2)     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f3 }
            r4.close()
            return
        L_0x01f3:
            r0 = move-exception
            r5 = r4
            goto L_0x021d
        L_0x01f6:
            r0 = move-exception
            r1 = r5
            r5 = r4
            r21 = r5
            r5 = r1
            r1 = r21
            goto L_0x0203
        L_0x01ff:
            r0 = move-exception
            goto L_0x021d
        L_0x0201:
            r0 = move-exception
            r1 = r5
        L_0x0203:
            q7.x3 r3 = (q7.x3) r3     // Catch:{ all -> 0x021b }
            q7.s2 r2 = r3.E     // Catch:{ all -> 0x021b }
            q7.x3.l(r2)     // Catch:{ all -> 0x021b }
            q7.q2 r2 = r2.B     // Catch:{ all -> 0x021b }
            java.lang.String r3 = "Data loss. Error selecting raw event. appId"
            q7.r2 r4 = q7.s2.r(r5)     // Catch:{ all -> 0x021b }
            r2.d(r4, r0, r3)     // Catch:{ all -> 0x021b }
            if (r1 == 0) goto L_0x021a
            r1.close()
        L_0x021a:
            return
        L_0x021b:
            r0 = move-exception
            r5 = r1
        L_0x021d:
            if (r5 == 0) goto L_0x0222
            r5.close()
        L_0x0222:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.k.u(long, long, q7.r6):void");
    }

    public final long w(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = B().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j10 = cursor.getLong(0);
                cursor.close();
                return j10;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e10) {
            s2 s2Var = ((x3) this.f13121a).E;
            x3.l(s2Var);
            s2Var.B.d(str, e10, "Database error");
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void x(String str, String str2) {
        q.f(str);
        q.f(str2);
        i();
        j();
        try {
            B().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            x3 x3Var = (x3) this.f13121a;
            s2 s2Var = x3Var.E;
            x3.l(s2Var);
            s2Var.B.e("Error deleting conditional property", s2.r(str), x3Var.I.f(str2), e10);
        }
    }

    public final long y(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = B().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j11 = rawQuery.getLong(0);
                rawQuery.close();
                return j11;
            }
            rawQuery.close();
            return j10;
        } catch (SQLiteException e10) {
            s2 s2Var = ((x3) this.f13121a).E;
            x3.l(s2Var);
            s2Var.B.d(str, e10, "Database error");
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final long z(String str) {
        String str2 = str;
        k4 k4Var = this.f13121a;
        q.f(str);
        q.f("first_open_count");
        i();
        j();
        SQLiteDatabase B2 = B();
        B2.beginTransaction();
        long j10 = 0;
        try {
            long y10 = y("select first_open_count from app2 where app_id=?", new String[]{str2}, -1);
            if (y10 == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str2);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (B2.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    s2 s2Var = ((x3) k4Var).E;
                    x3.l(s2Var);
                    s2Var.B.d(s2.r(str), "first_open_count", "Failed to insert column (got -1). appId");
                    B2.endTransaction();
                    return -1;
                }
                y10 = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str2);
                contentValues2.put("first_open_count", Long.valueOf(1 + y10));
                if (((long) B2.update("app2", contentValues2, "app_id = ?", new String[]{str2})) == 0) {
                    s2 s2Var2 = ((x3) k4Var).E;
                    x3.l(s2Var2);
                    s2Var2.B.d(s2.r(str), "first_open_count", "Failed to update column (got 0). appId");
                    B2.endTransaction();
                    return -1;
                }
                B2.setTransactionSuccessful();
                B2.endTransaction();
                return y10;
            } catch (SQLiteException e10) {
                e = e10;
                j10 = y10;
                try {
                    s2 s2Var3 = ((x3) k4Var).E;
                    x3.l(s2Var3);
                    s2Var3.B.e("Error inserting column. appId", s2.r(str), "first_open_count", e);
                    B2.endTransaction();
                    return j10;
                } catch (Throwable th) {
                    B2.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e11) {
            e = e11;
            s2 s2Var32 = ((x3) k4Var).E;
            x3.l(s2Var32);
            s2Var32.B.e("Error inserting column. appId", s2.r(str), "first_open_count", e);
            B2.endTransaction();
            return j10;
        }
    }
}
