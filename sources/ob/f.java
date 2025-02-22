package ob;

import ag.v1;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Parcelable;
import ff.m;
import i3.h;
import i3.p;
import i3.r;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.n0;
import pb.e;
import pb.h;
import sf.j;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public final p f12268a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12269b;

    /* renamed from: c  reason: collision with root package name */
    public final b f12270c;

    /* renamed from: d  reason: collision with root package name */
    public final c f12271d;

    public class a extends h {
        public a(p pVar) {
            super(pVar, 1);
        }

        public final String b() {
            return "INSERT OR REPLACE INTO `media` (`media_id`,`media_name`,`media_path`,`media_bucket`,`media_size`,`media_date_added`,`media_type`) VALUES (?,?,?,?,?,?,?)";
        }

        public final void c(m3.f fVar, Parcelable parcelable) {
            i iVar = (i) parcelable;
            fVar.H(1, iVar.f12284a);
            String str = iVar.f12285b;
            if (str == null) {
                fVar.h0(2);
            } else {
                fVar.m(2, str);
            }
            String str2 = iVar.f12286c;
            if (str2 == null) {
                fVar.h0(3);
            } else {
                fVar.m(3, str2);
            }
            String str3 = iVar.f12287d;
            if (str3 == null) {
                fVar.h0(4);
            } else {
                fVar.m(4, str3);
            }
            fVar.H(5, iVar.f12288e);
            fVar.H(6, iVar.B);
            fVar.H(7, (long) iVar.C);
        }
    }

    public class b extends h {
        public b(p pVar) {
            super(pVar, 1);
        }

        public final String b() {
            return "INSERT OR REPLACE INTO `duration` (`duration_media_id`,`media_duration`) VALUES (?,?)";
        }

        public final void c(m3.f fVar, Parcelable parcelable) {
            b bVar = (b) parcelable;
            fVar.H(1, bVar.f12262a);
            fVar.H(2, bVar.f12263b);
        }
    }

    public class c extends h {
        public c(p pVar) {
            super(pVar, 1);
        }

        public final String b() {
            return "INSERT OR REPLACE INTO `album_cover` (`album_cover_media_id`,`album_cover_path`) VALUES (?,?)";
        }

        public final void c(m3.f fVar, Parcelable parcelable) {
            a aVar = (a) parcelable;
            fVar.H(1, aVar.f12260a);
            String str = aVar.f12261b;
            if (str == null) {
                fVar.h0(2);
            } else {
                fVar.m(2, str);
            }
        }
    }

    public class d implements Callable<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f12272a;

        public d(i iVar) {
            this.f12272a = iVar;
        }

        public final Object call() {
            f fVar = f.this;
            p pVar = fVar.f12268a;
            pVar.a();
            pVar.a();
            m3.b N = pVar.f().N();
            pVar.f9511e.f(N);
            if (N.s0()) {
                N.J();
            } else {
                N.f();
            }
            try {
                fVar.f12269b.d(this.f12272a);
                pVar.f().N().I();
                return m.f8717a;
            } finally {
                pVar.k();
            }
        }
    }

    public class e implements Callable<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f12274a;

        public e(b bVar) {
            this.f12274a = bVar;
        }

        public final Object call() {
            f fVar = f.this;
            p pVar = fVar.f12268a;
            pVar.a();
            pVar.a();
            m3.b N = pVar.f().N();
            pVar.f9511e.f(N);
            if (N.s0()) {
                N.J();
            } else {
                N.f();
            }
            try {
                fVar.f12270c.d(this.f12274a);
                pVar.f().N().I();
                return m.f8717a;
            } finally {
                pVar.k();
            }
        }
    }

    /* renamed from: ob.f$f  reason: collision with other inner class name */
    public class C0236f implements Callable<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f12276a;

        public C0236f(a aVar) {
            this.f12276a = aVar;
        }

        public final Object call() {
            f fVar = f.this;
            p pVar = fVar.f12268a;
            pVar.a();
            pVar.a();
            m3.b N = pVar.f().N();
            pVar.f9511e.f(N);
            if (N.s0()) {
                N.J();
            } else {
                N.f();
            }
            try {
                fVar.f12271d.d(this.f12276a);
                pVar.f().N().I();
                return m.f8717a;
            } finally {
                pVar.k();
            }
        }
    }

    public class g implements Callable<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f12278a;

        public g(r rVar) {
            this.f12278a = rVar;
        }

        public final Object call() {
            Long l10;
            p pVar = f.this.f12268a;
            r rVar = this.f12278a;
            Cursor i8 = e9.c.i(pVar, rVar);
            try {
                if (i8.moveToFirst()) {
                    if (!i8.isNull(0)) {
                        l10 = Long.valueOf(i8.getLong(0));
                        return l10;
                    }
                }
                l10 = null;
                return l10;
            } finally {
                i8.close();
                rVar.j();
            }
        }
    }

    public f(p pVar) {
        this.f12268a = pVar;
        this.f12269b = new a(pVar);
        this.f12270c = new b(pVar);
        this.f12271d = new c(pVar);
    }

    public final Object a(String str, int i8, e.a.C0246a aVar) {
        r e10 = r.e(3, "SELECT media_path as LatestItem FROM media WHERE media_bucket = ?  AND media_type = ? AND media_date_added = (SELECT MAX(media_date_added) as LargestDate FROM media WHERE media_bucket = ?)");
        if (str == null) {
            e10.h0(1);
        } else {
            e10.m(1, str);
        }
        e10.H(2, (long) i8);
        if (str == null) {
            e10.h0(3);
        } else {
            e10.m(3, str);
        }
        return v1.i(this.f12268a, new CancellationSignal(), new d(this, e10), aVar);
    }

    public final Object b(int i8, h.a aVar) {
        r e10 = r.e(1, "SELECT COUNT(*) == 0 FROM media WHERE media_type = ?");
        e10.H(1, (long) i8);
        return v1.i(this.f12268a, new CancellationSignal(), new g(this, e10), aVar);
    }

    public final n0 c(int i8) {
        r e10 = r.e(1, "SELECT DISTINCT media_bucket FROM media WHERE media_type = ?");
        e10.H(1, (long) i8);
        h hVar = new h(this, e10);
        p pVar = this.f12268a;
        j.f(pVar, "db");
        return new n0(new i3.b(false, pVar, new String[]{"media"}, hVar, (jf.d<? super i3.b>) null));
    }

    public final Object d(int i8, jf.d<? super Long> dVar) {
        r e10 = r.e(1, "SELECT MAX(media_date_added) as LargestDate FROM media WHERE media_type = ?");
        e10.H(1, (long) i8);
        return v1.i(this.f12268a, new CancellationSignal(), new g(e10), dVar);
    }

    public final ArrayList e(int i8, String str) {
        String str2 = str;
        r e10 = r.e(2, "SELECT * FROM media WHERE media_bucket = ? AND media_type = ?");
        if (str2 == null) {
            e10.h0(1);
        } else {
            e10.m(1, str2);
        }
        e10.H(2, (long) i8);
        p pVar = this.f12268a;
        pVar.b();
        Cursor i10 = e9.c.i(pVar, e10);
        try {
            int k10 = gc.b.k(i10, "media_id");
            int k11 = gc.b.k(i10, "media_name");
            int k12 = gc.b.k(i10, "media_path");
            int k13 = gc.b.k(i10, "media_bucket");
            int k14 = gc.b.k(i10, "media_size");
            int k15 = gc.b.k(i10, "media_date_added");
            int k16 = gc.b.k(i10, "media_type");
            ArrayList arrayList = new ArrayList(i10.getCount());
            while (i10.moveToNext()) {
                arrayList.add(new i(i10.getLong(k10), i10.isNull(k11) ? null : i10.getString(k11), i10.isNull(k12) ? null : i10.getString(k12), i10.isNull(k13) ? null : i10.getString(k13), i10.getLong(k14), i10.getLong(k15), i10.getInt(k16)));
            }
            return arrayList;
        } finally {
            i10.close();
            e10.j();
        }
    }

    public final Object f(i iVar, jf.d<? super m> dVar) {
        return v1.j(this.f12268a, new d(iVar), dVar);
    }

    public final Object g(String str, int i8, e.a.C0246a aVar) {
        r e10 = r.e(2, "SELECT COUNT(media_id) FROM media WHERE media_bucket = ? AND media_type = ?");
        if (str == null) {
            e10.h0(1);
        } else {
            e10.m(1, str);
        }
        e10.H(2, (long) i8);
        return v1.i(this.f12268a, new CancellationSignal(), new e(this, e10), aVar);
    }

    public final Object h(b bVar, jf.d<? super m> dVar) {
        return v1.j(this.f12268a, new e(bVar), dVar);
    }

    public final Object i(a aVar, jf.d<? super m> dVar) {
        return v1.j(this.f12268a, new C0236f(aVar), dVar);
    }

    public final ArrayList j(int i8, String str) {
        String str2 = str;
        r e10 = r.e(2, "SELECT media.media_id as mediaId, media.media_name as mediaName, media.media_path as mediaPath, media.media_size as mediaSize, duration.media_duration as mediaDuration, album_cover.album_cover_path as mediaAlbumCoverPath FROM media INNER JOIN duration ON media.media_id = duration.duration_media_id INNER JOIN  album_cover ON media.media_id = album_cover.album_cover_media_id WHERE media_bucket = ? AND media_type = ?");
        if (str2 == null) {
            e10.h0(1);
        } else {
            e10.m(1, str2);
        }
        e10.H(2, (long) i8);
        p pVar = this.f12268a;
        pVar.b();
        Cursor i10 = e9.c.i(pVar, e10);
        try {
            ArrayList arrayList = new ArrayList(i10.getCount());
            while (i10.moveToNext()) {
                arrayList.add(new j(i10.getLong(0), i10.isNull(1) ? null : i10.getString(1), i10.isNull(2) ? null : i10.getString(2), i10.getLong(3), i10.getLong(4), i10.isNull(5) ? null : i10.getString(5)));
            }
            return arrayList;
        } finally {
            i10.close();
            e10.j();
        }
    }
}
