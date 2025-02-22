package com.lassi.data.database;

import android.content.Context;
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
import m3.c;
import n3.c;
import ob.f;
import sf.j;

public final class MediaFileDatabase_Impl extends MediaFileDatabase {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f6419p = 0;

    /* renamed from: o  reason: collision with root package name */
    public volatile f f6420o;

    public class a extends q.a {
        public a() {
            super(1);
        }

        public final void a(c cVar) {
            cVar.l("CREATE TABLE IF NOT EXISTS `media` (`media_id` INTEGER NOT NULL, `media_name` TEXT NOT NULL, `media_path` TEXT NOT NULL, `media_bucket` TEXT NOT NULL DEFAULT 'default_media_bucket', `media_size` INTEGER NOT NULL, `media_date_added` INTEGER NOT NULL, `media_type` INTEGER NOT NULL, PRIMARY KEY(`media_id`))");
            cVar.l("CREATE UNIQUE INDEX IF NOT EXISTS `index_media_media_id` ON `media` (`media_id`)");
            cVar.l("CREATE TABLE IF NOT EXISTS `duration` (`duration_media_id` INTEGER NOT NULL, `media_duration` INTEGER NOT NULL DEFAULT default_media_duration, PRIMARY KEY(`duration_media_id`), FOREIGN KEY(`duration_media_id`) REFERENCES `media`(`media_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            cVar.l("CREATE TABLE IF NOT EXISTS `album_cover` (`album_cover_media_id` INTEGER NOT NULL, `album_cover_path` TEXT NOT NULL DEFAULT 'default_media_album_cover_path', PRIMARY KEY(`album_cover_media_id`), FOREIGN KEY(`album_cover_media_id`) REFERENCES `media`(`media_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            cVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bfc0f3b6c16f887afa8ee56c070921c8')");
        }

        public final void b(c cVar) {
            cVar.l("DROP TABLE IF EXISTS `media`");
            cVar.l("DROP TABLE IF EXISTS `duration`");
            cVar.l("DROP TABLE IF EXISTS `album_cover`");
            int i8 = MediaFileDatabase_Impl.f6419p;
            MediaFileDatabase_Impl mediaFileDatabase_Impl = MediaFileDatabase_Impl.this;
            List<? extends p.b> list = mediaFileDatabase_Impl.f9513g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p.b) mediaFileDatabase_Impl.f9513g.get(i10)).getClass();
                }
            }
        }

        public final void c(c cVar) {
            int i8 = MediaFileDatabase_Impl.f6419p;
            MediaFileDatabase_Impl mediaFileDatabase_Impl = MediaFileDatabase_Impl.this;
            List<? extends p.b> list = mediaFileDatabase_Impl.f9513g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p.b) mediaFileDatabase_Impl.f9513g.get(i10)).getClass();
                }
            }
        }

        public final void d(c cVar) {
            MediaFileDatabase_Impl mediaFileDatabase_Impl = MediaFileDatabase_Impl.this;
            int i8 = MediaFileDatabase_Impl.f6419p;
            mediaFileDatabase_Impl.f9507a = cVar;
            cVar.l("PRAGMA foreign_keys = ON");
            MediaFileDatabase_Impl.this.l(cVar);
            List<? extends p.b> list = MediaFileDatabase_Impl.this.f9513g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p.b) MediaFileDatabase_Impl.this.f9513g.get(i10)).getClass();
                }
            }
        }

        public final void e() {
        }

        public final void f(c cVar) {
            e9.c.f(cVar);
        }

        public final q.b g(c cVar) {
            c cVar2 = cVar;
            HashMap hashMap = new HashMap(7);
            hashMap.put("media_id", new a.C0188a("media_id", "INTEGER", true, 1, (String) null, 1));
            hashMap.put("media_name", new a.C0188a("media_name", "TEXT", true, 0, (String) null, 1));
            hashMap.put("media_path", new a.C0188a("media_path", "TEXT", true, 0, (String) null, 1));
            hashMap.put("media_bucket", new a.C0188a("media_bucket", "TEXT", true, 0, "'default_media_bucket'", 1));
            hashMap.put("media_size", new a.C0188a("media_size", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("media_date_added", new a.C0188a("media_date_added", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("media_type", new a.C0188a("media_type", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new a.d("index_media_media_id", true, Arrays.asList(new String[]{"media_id"}), Arrays.asList(new String[]{"ASC"})));
            k3.a aVar = new k3.a("media", hashMap, hashSet, hashSet2);
            k3.a a10 = k3.a.a(cVar2, "media");
            if (!aVar.equals(a10)) {
                return new q.b("media(com.lassi.data.media.entity.MediaFileEntity).\n Expected:\n" + aVar + "\n Found:\n" + a10, false);
            }
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("duration_media_id", new a.C0188a("duration_media_id", "INTEGER", true, 1, (String) null, 1));
            hashMap2.put("media_duration", new a.C0188a("media_duration", "INTEGER", true, 0, "default_media_duration", 1));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new a.b("media", "CASCADE", "NO ACTION", Arrays.asList(new String[]{"duration_media_id"}), Arrays.asList(new String[]{"media_id"})));
            k3.a aVar2 = new k3.a("duration", hashMap2, hashSet3, new HashSet(0));
            k3.a a11 = k3.a.a(cVar2, "duration");
            if (!aVar2.equals(a11)) {
                return new q.b("duration(com.lassi.data.media.entity.DurationEntity).\n Expected:\n" + aVar2 + "\n Found:\n" + a11, false);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("album_cover_media_id", new a.C0188a("album_cover_media_id", "INTEGER", true, 1, (String) null, 1));
            hashMap3.put("album_cover_path", new a.C0188a("album_cover_path", "TEXT", true, 0, "'default_media_album_cover_path'", 1));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new a.b("media", "CASCADE", "NO ACTION", Arrays.asList(new String[]{"album_cover_media_id"}), Arrays.asList(new String[]{"media_id"})));
            k3.a aVar3 = new k3.a("album_cover", hashMap3, hashSet4, new HashSet(0));
            k3.a a12 = k3.a.a(cVar2, "album_cover");
            if (aVar3.equals(a12)) {
                return new q.b((String) null, true);
            }
            return new q.b("album_cover(com.lassi.data.media.entity.AlbumCoverPathEntity).\n Expected:\n" + aVar3 + "\n Found:\n" + a12, false);
        }
    }

    public final k c() {
        return new k(this, new HashMap(0), new HashMap(0), "media", "duration", "album_cover");
    }

    public final m3.c d(i3.f fVar) {
        q qVar = new q(fVar, new a(), "bfc0f3b6c16f887afa8ee56c070921c8", "5b57cd1c8a65e17bb89f163fc891f1cc");
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
        hashMap.put(ob.c.class, Collections.emptyList());
        return hashMap;
    }

    public final ob.c p() {
        f fVar;
        if (this.f6420o != null) {
            return this.f6420o;
        }
        synchronized (this) {
            if (this.f6420o == null) {
                this.f6420o = new f(this);
            }
            fVar = this.f6420o;
        }
        return fVar;
    }
}
