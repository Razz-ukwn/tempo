package u6;

import android.accounts.Account;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Account f15769a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f15770b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f15771c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f15772d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15773e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15774f;

    /* renamed from: g  reason: collision with root package name */
    public final r7.a f15775g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f15776h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Account f15777a;

        /* renamed from: b  reason: collision with root package name */
        public b f15778b;

        /* renamed from: c  reason: collision with root package name */
        public String f15779c;

        /* renamed from: d  reason: collision with root package name */
        public String f15780d;
    }

    public d(Account account, b bVar, String str, String str2) {
        r7.a aVar = r7.a.f14086a;
        this.f15769a = account;
        Set emptySet = bVar == null ? Collections.emptySet() : Collections.unmodifiableSet(bVar);
        this.f15770b = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.f15772d = emptyMap;
        this.f15773e = str;
        this.f15774f = str2;
        this.f15775g = aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (x xVar : emptyMap.values()) {
            xVar.getClass();
            hashSet.addAll((Collection) null);
        }
        this.f15771c = Collections.unmodifiableSet(hashSet);
    }
}
