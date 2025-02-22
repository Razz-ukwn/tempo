package i6;

import a6.d;
import android.content.Context;
import ef.a;
import f6.b;
import j6.c;
import j6.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9611a;

    /* renamed from: b  reason: collision with root package name */
    public final a f9612b;

    public /* synthetic */ f(a aVar, int i8) {
        this.f9611a = i8;
        this.f9612b = aVar;
    }

    public final Object get() {
        int i8 = this.f9611a;
        a aVar = this.f9612b;
        switch (i8) {
            case 0:
                m6.a aVar2 = (m6.a) aVar.get();
                HashMap hashMap = new HashMap();
                d dVar = d.f118a;
                c.a aVar3 = new c.a();
                Set<e.b> emptySet = Collections.emptySet();
                if (emptySet != null) {
                    aVar3.f9805c = emptySet;
                    aVar3.f9803a = 30000L;
                    aVar3.f9804b = 86400000L;
                    hashMap.put(dVar, aVar3.a());
                    d dVar2 = d.f120c;
                    c.a aVar4 = new c.a();
                    Set<e.b> emptySet2 = Collections.emptySet();
                    if (emptySet2 != null) {
                        aVar4.f9805c = emptySet2;
                        aVar4.f9803a = 1000L;
                        aVar4.f9804b = 86400000L;
                        hashMap.put(dVar2, aVar4.a());
                        d dVar3 = d.f119b;
                        c.a aVar5 = new c.a();
                        Set<e.b> emptySet3 = Collections.emptySet();
                        if (emptySet3 != null) {
                            aVar5.f9805c = emptySet3;
                            aVar5.f9803a = 86400000L;
                            aVar5.f9804b = 86400000L;
                            Set<e.b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new e.b[]{e.b.f9810b})));
                            if (unmodifiableSet != null) {
                                aVar5.f9805c = unmodifiableSet;
                                hashMap.put(dVar3, aVar5.a());
                                if (aVar2 == null) {
                                    throw new NullPointerException("missing required property: clock");
                                } else if (hashMap.keySet().size() >= d.values().length) {
                                    new HashMap();
                                    return new j6.b(aVar2, hashMap);
                                } else {
                                    throw new IllegalStateException("Not all priorities have been configured");
                                }
                            } else {
                                throw new NullPointerException("Null flags");
                            }
                        } else {
                            throw new NullPointerException("Null flags");
                        }
                    } else {
                        throw new NullPointerException("Null flags");
                    }
                } else {
                    throw new NullPointerException("Null flags");
                }
            default:
                String packageName = ((Context) aVar.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
