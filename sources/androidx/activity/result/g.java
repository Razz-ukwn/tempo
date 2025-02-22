package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public Random f617a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f618b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f619c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f620d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f621e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient HashMap f622f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f623g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f624h = new Bundle();

    public static class a<O> {

        /* renamed from: a  reason: collision with root package name */
        public final b<O> f625a;

        /* renamed from: b  reason: collision with root package name */
        public final c.a<?, O> f626b;

        public a(b<O> bVar, c.a<?, O> aVar) {
            this.f625a = bVar;
            this.f626b = aVar;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final j f627a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<n> f628b = new ArrayList<>();

        public b(j jVar) {
            this.f627a = jVar;
        }
    }

    public final boolean a(int i8, int i10, Intent intent) {
        b<O> bVar;
        String str = (String) this.f618b.get(Integer.valueOf(i8));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f622f.get(str);
        if (aVar == null || (bVar = aVar.f625a) == null || !this.f621e.contains(str)) {
            this.f623g.remove(str);
            this.f624h.putParcelable(str, new a(intent, i10));
            return true;
        }
        bVar.a(aVar.f626b.c(intent, i10));
        this.f621e.remove(str);
        return true;
    }

    public abstract void b(int i8, c.a aVar, @SuppressLint({"UnknownNullness"}) Object obj);

    public final e c(String str, p pVar, c.a aVar, b bVar) {
        j b10 = pVar.b();
        if (!(b10.b().compareTo(j.b.f2280d) >= 0)) {
            e(str);
            HashMap hashMap = this.f620d;
            b bVar2 = (b) hashMap.get(str);
            if (bVar2 == null) {
                bVar2 = new b(b10);
            }
            ActivityResultRegistry$1 activityResultRegistry$1 = new ActivityResultRegistry$1(this, str, bVar, aVar);
            bVar2.f627a.a(activityResultRegistry$1);
            bVar2.f628b.add(activityResultRegistry$1);
            hashMap.put(str, bVar2);
            return new e(this, str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + pVar + " is attempting to register while current state is " + b10.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final f d(String str, c.a aVar, b bVar) {
        e(str);
        this.f622f.put(str, new a(bVar, aVar));
        HashMap hashMap = this.f623g;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            bVar.a(obj);
        }
        Bundle bundle = this.f624h;
        a aVar2 = (a) bundle.getParcelable(str);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.a(aVar.c(aVar2.f610b, aVar2.f609a));
        }
        return new f(this, str, aVar);
    }

    public final void e(String str) {
        HashMap hashMap = this.f619c;
        if (((Integer) hashMap.get(str)) == null) {
            int nextInt = this.f617a.nextInt(2147418112);
            while (true) {
                int i8 = nextInt + 65536;
                HashMap hashMap2 = this.f618b;
                if (hashMap2.containsKey(Integer.valueOf(i8))) {
                    nextInt = this.f617a.nextInt(2147418112);
                } else {
                    hashMap2.put(Integer.valueOf(i8), str);
                    hashMap.put(str, Integer.valueOf(i8));
                    return;
                }
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f621e.contains(str) && (num = (Integer) this.f619c.remove(str)) != null) {
            this.f618b.remove(num);
        }
        this.f622f.remove(str);
        HashMap hashMap = this.f623g;
        if (hashMap.containsKey(str)) {
            StringBuilder c3 = d.c("Dropping pending result for request ", str, ": ");
            c3.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", c3.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f624h;
        if (bundle.containsKey(str)) {
            StringBuilder c10 = d.c("Dropping pending result for request ", str, ": ");
            c10.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", c10.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f620d;
        b bVar = (b) hashMap2.get(str);
        if (bVar != null) {
            ArrayList<n> arrayList = bVar.f628b;
            Iterator<n> it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.f627a.c(it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
