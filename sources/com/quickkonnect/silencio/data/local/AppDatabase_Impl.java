package com.quickkonnect.silencio.data.local;

import android.content.Context;
import i3.f;
import i3.k;
import i3.p;
import i3.q;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k3.a;
import kc.b;
import kc.c;
import m3.c;
import sf.j;

public final class AppDatabase_Impl extends AppDatabase {
    public volatile c m;

    public class a extends q.a {
        public a() {
            super(3);
        }

        public final void a(n3.c cVar) {
            cVar.l("CREATE TABLE IF NOT EXISTS `user` (`uuid` INTEGER NOT NULL, `id` TEXT, `firstName` TEXT, `lastName` TEXT, `email` TEXT, `nickName` TEXT, `type` TEXT, `registrationType` TEXT, `countryCode` TEXT, `phone` TEXT, `walletBalance` TEXT, `recordingTime` TEXT, `recordingCount` TEXT, `avgTime` TEXT, `lastLogin` TEXT, `authToken` TEXT, `inviteCode` TEXT, `profileImg` TEXT, `createdAt` TEXT, PRIMARY KEY(`uuid`))");
            cVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0b42967bee2be0c1d578e154564098c3')");
        }

        public final void b(n3.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `user`");
            AppDatabase_Impl appDatabase_Impl = AppDatabase_Impl.this;
            List<? extends p.b> list = appDatabase_Impl.f9513g;
            if (list != null) {
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((p.b) appDatabase_Impl.f9513g.get(i8)).getClass();
                }
            }
        }

        public final void c(n3.c cVar) {
            AppDatabase_Impl appDatabase_Impl = AppDatabase_Impl.this;
            List<? extends p.b> list = appDatabase_Impl.f9513g;
            if (list != null) {
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((p.b) appDatabase_Impl.f9513g.get(i8)).getClass();
                }
            }
        }

        public final void d(n3.c cVar) {
            AppDatabase_Impl.this.f9507a = cVar;
            AppDatabase_Impl.this.l(cVar);
            List<? extends p.b> list = AppDatabase_Impl.this.f9513g;
            if (list != null) {
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((p.b) AppDatabase_Impl.this.f9513g.get(i8)).getClass();
                }
            }
        }

        public final void e() {
        }

        public final void f(n3.c cVar) {
            e9.c.f(cVar);
        }

        public final q.b g(n3.c cVar) {
            HashMap hashMap = new HashMap(19);
            hashMap.put("uuid", new a.C0188a("uuid", "INTEGER", true, 1, (String) null, 1));
            hashMap.put("id", new a.C0188a("id", "TEXT", false, 0, (String) null, 1));
            hashMap.put("firstName", new a.C0188a("firstName", "TEXT", false, 0, (String) null, 1));
            hashMap.put("lastName", new a.C0188a("lastName", "TEXT", false, 0, (String) null, 1));
            hashMap.put("email", new a.C0188a("email", "TEXT", false, 0, (String) null, 1));
            hashMap.put("nickName", new a.C0188a("nickName", "TEXT", false, 0, (String) null, 1));
            hashMap.put("type", new a.C0188a("type", "TEXT", false, 0, (String) null, 1));
            hashMap.put("registrationType", new a.C0188a("registrationType", "TEXT", false, 0, (String) null, 1));
            hashMap.put("countryCode", new a.C0188a("countryCode", "TEXT", false, 0, (String) null, 1));
            hashMap.put("phone", new a.C0188a("phone", "TEXT", false, 0, (String) null, 1));
            hashMap.put("walletBalance", new a.C0188a("walletBalance", "TEXT", false, 0, (String) null, 1));
            hashMap.put("recordingTime", new a.C0188a("recordingTime", "TEXT", false, 0, (String) null, 1));
            hashMap.put("recordingCount", new a.C0188a("recordingCount", "TEXT", false, 0, (String) null, 1));
            hashMap.put("avgTime", new a.C0188a("avgTime", "TEXT", false, 0, (String) null, 1));
            hashMap.put("lastLogin", new a.C0188a("lastLogin", "TEXT", false, 0, (String) null, 1));
            hashMap.put("authToken", new a.C0188a("authToken", "TEXT", false, 0, (String) null, 1));
            hashMap.put("inviteCode", new a.C0188a("inviteCode", "TEXT", false, 0, (String) null, 1));
            hashMap.put("profileImg", new a.C0188a("profileImg", "TEXT", false, 0, (String) null, 1));
            hashMap.put("createdAt", new a.C0188a("createdAt", "TEXT", false, 0, (String) null, 1));
            k3.a aVar = new k3.a("user", hashMap, new HashSet(0), new HashSet(0));
            k3.a a10 = k3.a.a(cVar, "user");
            if (aVar.equals(a10)) {
                return new q.b((String) null, true);
            }
            return new q.b("user(com.quickkonnect.silencio.models.response.auth.UserModel).\n Expected:\n" + aVar + "\n Found:\n" + a10, false);
        }
    }

    public final k c() {
        return new k(this, new HashMap(0), new HashMap(0), "user");
    }

    public final m3.c d(f fVar) {
        q qVar = new q(fVar, new a(), "0b42967bee2be0c1d578e154564098c3", "d60a450c3b19fda943ac463d62dc4510");
        Context context = fVar.f9447a;
        j.f(context, "context");
        return fVar.f9449c.b(new c.b(context, fVar.f9448b, qVar));
    }

    public final List e(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new j3.a[0]);
    }

    public final Set<Class<Object>> g() {
        return new HashSet();
    }

    public final Map<Class<?>, List<Class<?>>> h() {
        HashMap hashMap = new HashMap();
        hashMap.put(b.class, Collections.emptyList());
        return hashMap;
    }

    public final b p() {
        kc.c cVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new kc.c(this);
            }
            cVar = this.m;
        }
        return cVar;
    }
}
