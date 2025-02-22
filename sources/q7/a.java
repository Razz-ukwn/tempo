package q7;

import u6.q;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12886a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f12887b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z0 f12888c;

    public a(z0 z0Var, String str, long j10) {
        this.f12888c = z0Var;
        this.f12886a = str;
        this.f12887b = j10;
    }

    public final void run() {
        z0 z0Var = this.f12888c;
        z0Var.i();
        String str = this.f12886a;
        q.f(str);
        o.a aVar = z0Var.f13457c;
        boolean isEmpty = aVar.isEmpty();
        long j10 = this.f12887b;
        if (isEmpty) {
            z0Var.f13458d = j10;
        }
        Integer num = (Integer) aVar.getOrDefault(str, null);
        if (num != null) {
            aVar.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (aVar.f12032c >= 100) {
            s2 s2Var = ((x3) z0Var.f13121a).E;
            x3.l(s2Var);
            s2Var.E.b("Too many ads visible");
        } else {
            aVar.put(str, 1);
            z0Var.f13456b.put(str, Long.valueOf(j10));
        }
    }
}
