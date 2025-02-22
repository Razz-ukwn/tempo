package i3;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import ff.m;
import gf.u;
import i3.k;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k.b;
import m3.b;
import sf.j;

public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f9490a;

    public l(k kVar) {
        this.f9490a = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        e9.c.c(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final hf.f a() {
        /*
            r4 = this;
            i3.k r0 = r4.f9490a
            hf.f r1 = new hf.f
            r1.<init>()
            i3.p r0 = r0.f9466a
            m3.a r2 = new m3.a
            java.lang.String r3 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
            r2.<init>(r3)
            r3 = 0
            android.database.Cursor r0 = r0.n(r2, r3)
        L_0x0015:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x0028
            r2 = 0
            int r2 = r0.getInt(r2)     // Catch:{ all -> 0x005f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x005f }
            r1.add(r2)     // Catch:{ all -> 0x005f }
            goto L_0x0015
        L_0x0028:
            ff.m r2 = ff.m.f8717a     // Catch:{ all -> 0x005f }
            e9.c.c(r0, r3)
            e9.c.b(r1)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005e
            i3.k r0 = r4.f9490a
            m3.f r0 = r0.f9473h
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x0054
            i3.k r0 = r4.f9490a
            m3.f r0 = r0.f9473h
            if (r0 == 0) goto L_0x004a
            r0.n()
            goto L_0x005e
        L_0x004a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0054:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x005e:
            return r1
        L_0x005f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r2 = move-exception
            e9.c.c(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.l.a():hf.f");
    }

    public final void run() {
        Set set;
        b N;
        ReentrantReadWriteLock.ReadLock readLock = this.f9490a.f9466a.f9515i.readLock();
        j.e(readLock, "readWriteLock.readLock()");
        readLock.lock();
        try {
            if (this.f9490a.b()) {
                if (this.f9490a.f9471f.compareAndSet(true, false)) {
                    if (!this.f9490a.f9466a.i()) {
                        N = this.f9490a.f9466a.f().N();
                        N.J();
                        set = a();
                        N.I();
                        N.U();
                        readLock.unlock();
                        this.f9490a.getClass();
                        if (!set.isEmpty()) {
                            k kVar = this.f9490a;
                            synchronized (kVar.f9476k) {
                                Iterator<Map.Entry<k.c, k.d>> it = kVar.f9476k.iterator();
                                while (true) {
                                    b.e eVar = (b.e) it;
                                    if (eVar.hasNext()) {
                                        ((k.d) ((Map.Entry) eVar.next()).getValue()).a(set);
                                    } else {
                                        m mVar = m.f8717a;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            readLock.unlock();
            this.f9490a.getClass();
        } catch (IllegalStateException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
            set = u.f8980a;
        } catch (SQLiteException e11) {
            try {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                set = u.f8980a;
            } catch (Throwable th) {
                readLock.unlock();
                this.f9490a.getClass();
                throw th;
            }
        } catch (Throwable th2) {
            N.U();
            throw th2;
        }
    }
}
