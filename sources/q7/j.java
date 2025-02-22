package q7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class j extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f13133a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f13133a = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002f A[SYNTHETIC, Splitter:B:7:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        /*
            r9 = this;
            q7.k r0 = r9.f13133a
            q7.j6 r1 = r0.f13146e
            q7.k4 r2 = r0.f13121a
            r3 = r2
            q7.x3 r3 = (q7.x3) r3
            r3.getClass()
            long r3 = r1.f13142b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0015
            goto L_0x002a
        L_0x0015:
            z6.b r3 = r1.f13141a
            ag.m r3 = (ag.m) r3
            r3.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r7 = r1.f13142b
            long r3 = r3 - r7
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x002c
        L_0x002a:
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x008f
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0034 }
            return r0
        L_0x0034:
            q7.j6 r0 = r0.f13146e
            z6.b r1 = r0.f13141a
            ag.m r1 = (ag.m) r1
            r1.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0.f13142b = r3
            r1 = r2
            q7.x3 r1 = (q7.x3) r1
            q7.s2 r1 = r1.E
            q7.x3.l(r1)
            java.lang.String r3 = "Opening the database failed, dropping and recreating it"
            q7.q2 r1 = r1.B
            r1.b(r3)
            r1 = r2
            q7.x3 r1 = (q7.x3) r1
            r1.getClass()
            r1 = r2
            q7.x3 r1 = (q7.x3) r1
            android.content.Context r1 = r1.f13419a
            java.lang.String r3 = "google_app_measurement.db"
            java.io.File r1 = r1.getDatabasePath(r3)
            boolean r1 = r1.delete()
            if (r1 != 0) goto L_0x0078
            r1 = r2
            q7.x3 r1 = (q7.x3) r1
            q7.s2 r1 = r1.E
            q7.x3.l(r1)
            java.lang.String r4 = "Failed to delete corrupted db file"
            q7.q2 r1 = r1.B
            r1.c(r3, r4)
        L_0x0078:
            android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch:{ SQLiteException -> 0x007f }
            r0.f13142b = r5     // Catch:{ SQLiteException -> 0x007f }
            return r1
        L_0x007f:
            r0 = move-exception
            q7.x3 r2 = (q7.x3) r2
            q7.s2 r1 = r2.E
            q7.x3.l(r1)
            java.lang.String r2 = "Failed to open freshly created database"
            q7.q2 r1 = r1.B
            r1.c(r0, r2)
            throw r0
        L_0x008f:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            java.lang.String r1 = "Database open failed"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.j.getWritableDatabase():android.database.sqlite.SQLiteDatabase");
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        s2 s2Var = ((x3) this.f13133a.f13121a).E;
        x3.l(s2Var);
        l.b(s2Var, sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i10) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        k kVar = this.f13133a;
        s2 s2Var = ((x3) kVar.f13121a).E;
        x3.l(s2Var);
        l.a(s2Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", k.B);
        s2 s2Var2 = ((x3) kVar.f13121a).E;
        x3.l(s2Var2);
        l.a(s2Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", (String[]) null);
        s2 s2Var3 = ((x3) kVar.f13121a).E;
        x3.l(s2Var3);
        l.a(s2Var3, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", k.C);
        s2 s2Var4 = ((x3) kVar.f13121a).E;
        x3.l(s2Var4);
        l.a(s2Var4, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", k.D);
        s2 s2Var5 = ((x3) kVar.f13121a).E;
        x3.l(s2Var5);
        l.a(s2Var5, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", k.F);
        s2 s2Var6 = ((x3) kVar.f13121a).E;
        x3.l(s2Var6);
        l.a(s2Var6, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", (String[]) null);
        s2 s2Var7 = ((x3) kVar.f13121a).E;
        x3.l(s2Var7);
        l.a(s2Var7, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", k.E);
        s2 s2Var8 = ((x3) kVar.f13121a).E;
        x3.l(s2Var8);
        l.a(s2Var8, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", k.G);
        s2 s2Var9 = ((x3) kVar.f13121a).E;
        x3.l(s2Var9);
        l.a(s2Var9, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", k.H);
        s2 s2Var10 = ((x3) kVar.f13121a).E;
        x3.l(s2Var10);
        l.a(s2Var10, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", (String[]) null);
        s2 s2Var11 = ((x3) kVar.f13121a).E;
        x3.l(s2Var11);
        l.a(s2Var11, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", k.I);
        s2 s2Var12 = ((x3) kVar.f13121a).E;
        x3.l(s2Var12);
        l.a(s2Var12, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", (String[]) null);
        s2 s2Var13 = ((x3) kVar.f13121a).E;
        x3.l(s2Var13);
        l.a(s2Var13, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", (String[]) null);
        s2 s2Var14 = ((x3) kVar.f13121a).E;
        x3.l(s2Var14);
        l.a(s2Var14, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i10) {
    }
}
