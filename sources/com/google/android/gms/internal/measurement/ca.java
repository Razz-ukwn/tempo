package com.google.android.gms.internal.measurement;

import com.google.android.recaptcha.RecaptchaDefinitions;

public final class ca implements ba {
    public static final s4 A;
    public static final s4 B;
    public static final s4 C;
    public static final s4 D;
    public static final s4 E;
    public static final s4 F;
    public static final s4 G;
    public static final s4 H;
    public static final s4 I;
    public static final s4 J;
    public static final v4 K;
    public static final s4 L;

    /* renamed from: a  reason: collision with root package name */
    public static final s4 f5182a;

    /* renamed from: b  reason: collision with root package name */
    public static final s4 f5183b;

    /* renamed from: c  reason: collision with root package name */
    public static final s4 f5184c;

    /* renamed from: d  reason: collision with root package name */
    public static final s4 f5185d;

    /* renamed from: e  reason: collision with root package name */
    public static final v4 f5186e;

    /* renamed from: f  reason: collision with root package name */
    public static final v4 f5187f;

    /* renamed from: g  reason: collision with root package name */
    public static final s4 f5188g;

    /* renamed from: h  reason: collision with root package name */
    public static final s4 f5189h;

    /* renamed from: i  reason: collision with root package name */
    public static final s4 f5190i;

    /* renamed from: j  reason: collision with root package name */
    public static final s4 f5191j;

    /* renamed from: k  reason: collision with root package name */
    public static final s4 f5192k;

    /* renamed from: l  reason: collision with root package name */
    public static final s4 f5193l;
    public static final s4 m;

    /* renamed from: n  reason: collision with root package name */
    public static final s4 f5194n;

    /* renamed from: o  reason: collision with root package name */
    public static final s4 f5195o;

    /* renamed from: p  reason: collision with root package name */
    public static final s4 f5196p;

    /* renamed from: q  reason: collision with root package name */
    public static final s4 f5197q;

    /* renamed from: r  reason: collision with root package name */
    public static final s4 f5198r;

    /* renamed from: s  reason: collision with root package name */
    public static final s4 f5199s;

    /* renamed from: t  reason: collision with root package name */
    public static final s4 f5200t;

    /* renamed from: u  reason: collision with root package name */
    public static final s4 f5201u;

    /* renamed from: v  reason: collision with root package name */
    public static final s4 f5202v;

    /* renamed from: w  reason: collision with root package name */
    public static final s4 f5203w;

    /* renamed from: x  reason: collision with root package name */
    public static final s4 f5204x;

    /* renamed from: y  reason: collision with root package name */
    public static final s4 f5205y;

    /* renamed from: z  reason: collision with root package name */
    public static final s4 f5206z;

    static {
        w4 w4Var = new w4(q4.a(), false, true);
        f5182a = w4Var.a("measurement.ad_id_cache_time", RecaptchaDefinitions.DEFAULT_TIMEOUT_INIT);
        f5183b = w4Var.a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000);
        f5184c = w4Var.a("measurement.max_bundles_per_iteration", 100);
        f5185d = w4Var.a("measurement.config.cache_time", 86400000);
        w4Var.b("measurement.log_tag", "FA");
        f5186e = new v4(w4Var, "measurement.config.url_authority", "app-measurement.com");
        f5187f = new v4(w4Var, "measurement.config.url_scheme", "https");
        f5188g = w4Var.a("measurement.upload.debug_upload_interval", 1000);
        f5189h = w4Var.a("measurement.lifetimevalue.max_currency_tracked", 4);
        f5190i = w4Var.a("measurement.store.max_stored_events_per_app", 100000);
        f5191j = w4Var.a("measurement.experiment.max_ids", 50);
        f5192k = w4Var.a("measurement.audience.filter_result_max_count", 200);
        f5193l = w4Var.a("measurement.upload.max_item_scoped_custom_parameters", 27);
        m = w4Var.a("measurement.alarm_manager.minimum_interval", 60000);
        f5194n = w4Var.a("measurement.upload.minimum_delay", 500);
        f5195o = w4Var.a("measurement.monitoring.sample_period_millis", 86400000);
        f5196p = w4Var.a("measurement.upload.realtime_upload_interval", RecaptchaDefinitions.DEFAULT_TIMEOUT_INIT);
        f5197q = w4Var.a("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        w4Var.a("measurement.config.cache_time.service", 3600000);
        f5198r = w4Var.a("measurement.service_client.idle_disconnect_millis", 5000);
        w4Var.b("measurement.log_tag.service", "FA-SVC");
        f5199s = w4Var.a("measurement.upload.stale_data_deletion_interval", 86400000);
        f5200t = w4Var.a("measurement.sdk.attribution.cache.ttl", 604800000);
        f5201u = w4Var.a("measurement.redaction.app_instance_id.ttl", 7200000);
        f5202v = w4Var.a("measurement.upload.backoff_period", 43200000);
        f5203w = w4Var.a("measurement.upload.initial_upload_delay_time", 15000);
        f5204x = w4Var.a("measurement.upload.interval", 3600000);
        f5205y = w4Var.a("measurement.upload.max_bundle_size", 65536);
        f5206z = w4Var.a("measurement.upload.max_bundles", 100);
        A = w4Var.a("measurement.upload.max_conversions_per_day", 500);
        B = w4Var.a("measurement.upload.max_error_events_per_day", 1000);
        C = w4Var.a("measurement.upload.max_events_per_bundle", 1000);
        D = w4Var.a("measurement.upload.max_events_per_day", 100000);
        E = w4Var.a("measurement.upload.max_public_events_per_day", 50000);
        F = w4Var.a("measurement.upload.max_queue_time", 2419200000L);
        G = w4Var.a("measurement.upload.max_realtime_events_per_day", 10);
        H = w4Var.a("measurement.upload.max_batch_size", 65536);
        I = w4Var.a("measurement.upload.retry_count", 6);
        J = w4Var.a("measurement.upload.retry_time", 1800000);
        K = new v4(w4Var, "measurement.upload.url", "https://app-measurement.com/a");
        L = w4Var.a("measurement.upload.window_interval", 3600000);
    }

    public final long a() {
        return ((Long) f5199s.b()).longValue();
    }

    public final long b() {
        return ((Long) E.b()).longValue();
    }

    public final long c() {
        return ((Long) H.b()).longValue();
    }

    public final long d() {
        return ((Long) A.b()).longValue();
    }

    public final long e() {
        return ((Long) B.b()).longValue();
    }

    public final long f() {
        return ((Long) I.b()).longValue();
    }

    public final String g() {
        return (String) K.b();
    }

    public final long h() {
        return ((Long) f5205y.b()).longValue();
    }

    public final long i() {
        return ((Long) F.b()).longValue();
    }

    public final long j() {
        return ((Long) G.b()).longValue();
    }

    public final long k() {
        return ((Long) f5206z.b()).longValue();
    }

    public final String l() {
        return (String) f5186e.b();
    }

    public final long m() {
        return ((Long) D.b()).longValue();
    }

    public final long n() {
        return ((Long) f5203w.b()).longValue();
    }

    public final String o() {
        return (String) f5187f.b();
    }

    public final long p() {
        return ((Long) f5204x.b()).longValue();
    }

    public final long q() {
        return ((Long) J.b()).longValue();
    }

    public final long r() {
        return ((Long) L.b()).longValue();
    }

    public final long s() {
        return ((Long) C.b()).longValue();
    }

    public final long t() {
        return ((Long) f5202v.b()).longValue();
    }

    public final long zza() {
        return ((Long) f5182a.b()).longValue();
    }

    public final long zzb() {
        return ((Long) f5183b.b()).longValue();
    }

    public final long zzc() {
        return ((Long) f5184c.b()).longValue();
    }

    public final long zzd() {
        return ((Long) f5185d.b()).longValue();
    }

    public final long zze() {
        return ((Long) f5188g.b()).longValue();
    }

    public final long zzf() {
        return ((Long) f5189h.b()).longValue();
    }

    public final long zzg() {
        return ((Long) f5190i.b()).longValue();
    }

    public final long zzh() {
        return ((Long) f5191j.b()).longValue();
    }

    public final long zzi() {
        return ((Long) f5192k.b()).longValue();
    }

    public final long zzj() {
        return ((Long) f5193l.b()).longValue();
    }

    public final long zzk() {
        return ((Long) m.b()).longValue();
    }

    public final long zzl() {
        return ((Long) f5194n.b()).longValue();
    }

    public final long zzm() {
        return ((Long) f5195o.b()).longValue();
    }

    public final long zzn() {
        return ((Long) f5196p.b()).longValue();
    }

    public final long zzo() {
        return ((Long) f5197q.b()).longValue();
    }

    public final long zzp() {
        return ((Long) f5198r.b()).longValue();
    }

    public final long zzr() {
        return ((Long) f5200t.b()).longValue();
    }

    public final long zzs() {
        return ((Long) f5201u.b()).longValue();
    }
}
