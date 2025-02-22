package q7;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.k0;

public final class l6 extends n6 {
    public Integer B;

    /* renamed from: d  reason: collision with root package name */
    public final AlarmManager f13192d = ((AlarmManager) ((x3) this.f13121a).f13419a.getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    public k6 f13193e;

    public l6(t6 t6Var) {
        super(t6Var);
    }

    public final boolean l() {
        AlarmManager alarmManager = this.f13192d;
        if (alarmManager != null) {
            alarmManager.cancel(o());
        }
        q();
        return false;
    }

    public final void m() {
        j();
        s2 s2Var = ((x3) this.f13121a).E;
        x3.l(s2Var);
        s2Var.J.b("Unscheduling upload");
        AlarmManager alarmManager = this.f13192d;
        if (alarmManager != null) {
            alarmManager.cancel(o());
        }
        p().a();
        q();
    }

    public final int n() {
        if (this.B == null) {
            this.B = Integer.valueOf("measurement".concat(String.valueOf(((x3) this.f13121a).f13419a.getPackageName())).hashCode());
        }
        return this.B.intValue();
    }

    public final PendingIntent o() {
        Context context = ((x3) this.f13121a).f13419a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), k0.f5346a);
    }

    public final m p() {
        if (this.f13193e == null) {
            this.f13193e = new k6(this, this.f13208b.H);
        }
        return this.f13193e;
    }

    @TargetApi(24)
    public final void q() {
        JobScheduler jobScheduler = (JobScheduler) ((x3) this.f13121a).f13419a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(n());
        }
    }
}
