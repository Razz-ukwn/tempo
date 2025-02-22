package q7;

import ag.b1;
import ag.m;
import ag.n2;
import ag.v1;
import androidx.compose.ui.platform.b3;
import androidx.fragment.app.z0;
import androidx.lifecycle.s0;
import b3.l0;
import b7.a;
import cb.b;
import cb.c;
import cb.d;
import cb.f;
import com.google.android.gms.internal.p000firebaseauthapi.cc;
import com.google.android.gms.internal.p000firebaseauthapi.g;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import com.google.android.gms.internal.p000firebaseauthapi.nc;
import com.google.android.recaptcha.RecaptchaDefinitions;
import d2.f1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.internal.o;

public final class g2 {
    public static final f2 A = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, a.f3271e);
    public static final f2 B = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, o.f10732a);
    public static final f2 C = a("measurement.upload.retry_time", 1800000L, 1800000L, b.C);
    public static final f2 D = a("measurement.upload.retry_count", 6, 6, s0.f2317b);
    public static final f2 E = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, c.B);
    public static final f2 F = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, d.f3891b);
    public static final f2 G = a("measurement.audience.filter_result_max_count", 200, 200, w.f13390a);
    public static final f2 H = a("measurement.upload.max_public_user_properties", 25, 25, (e2) null);
    public static final f2 I = a("measurement.upload.max_event_name_cardinality", 500, 500, (e2) null);
    public static final f2 J = a("measurement.upload.max_public_event_params", 25, 25, (e2) null);
    public static final f2 K = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, ag.d.f408c);
    public static final f2 L;
    public static final f2 M = a("measurement.test.string_flag", "---", "---", f.f3902c);
    public static final f2 N = a("measurement.test.long_flag", -1L, -1L, m.C);
    public static final f2 O = a("measurement.test.int_flag", -2, -2, x.f13414a);
    public static final f2 P;
    public static final f2 Q = a("measurement.experiment.max_ids", 50, 50, y.f13435a);
    public static final f2 R = a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, z.f13455a);
    public static final f2 S = a("measurement.max_bundles_per_iteration", 100, 100, c0.f12931a);
    public static final f2 T = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, d0.f12953a);
    public static final f2 U = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, e0.f12970a);
    public static final f2 V;
    public static final f2 W;
    public static final f2 X;
    public static final f2 Y;
    public static final f2 Z;

    /* renamed from: a  reason: collision with root package name */
    public static final List f13022a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0  reason: collision with root package name */
    public static final f2 f13023a0;

    /* renamed from: b  reason: collision with root package name */
    public static final Set f13024b = Collections.synchronizedSet(new HashSet());

    /* renamed from: b0  reason: collision with root package name */
    public static final f2 f13025b0;

    /* renamed from: c  reason: collision with root package name */
    public static final f2 f13026c;

    /* renamed from: c0  reason: collision with root package name */
    public static final f2 f13027c0;

    /* renamed from: d  reason: collision with root package name */
    public static final f2 f13028d = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, l0.f3100b);

    /* renamed from: d0  reason: collision with root package name */
    public static final f2 f13029d0;

    /* renamed from: e  reason: collision with root package name */
    public static final f2 f13030e = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, v1.F);

    /* renamed from: e0  reason: collision with root package name */
    public static final f2 f13031e0;

    /* renamed from: f  reason: collision with root package name */
    public static final f2 f13032f = a("measurement.config.cache_time", 86400000L, 3600000L, a0.f12889a);

    /* renamed from: f0  reason: collision with root package name */
    public static final f2 f13033f0;

    /* renamed from: g  reason: collision with root package name */
    public static final f2 f13034g = a("measurement.config.url_scheme", "https", "https", m0.f13198a);

    /* renamed from: g0  reason: collision with root package name */
    public static final f2 f13035g0 = a("measurement.service.storage_consent_support_version", 203600, 203600, s0.f13315a);

    /* renamed from: h  reason: collision with root package name */
    public static final f2 f13036h = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", w0.f13391a);

    /* renamed from: h0  reason: collision with root package name */
    public static final f2 f13037h0;

    /* renamed from: i  reason: collision with root package name */
    public static final f2 f13038i = a("measurement.upload.max_bundles", 100, 100, j1.f13135a);

    /* renamed from: i0  reason: collision with root package name */
    public static final f2 f13039i0;

    /* renamed from: j  reason: collision with root package name */
    public static final f2 f13040j = a("measurement.upload.max_batch_size", 65536, 65536, v1.f13374a);

    /* renamed from: j0  reason: collision with root package name */
    public static final f2 f13041j0;

    /* renamed from: k  reason: collision with root package name */
    public static final f2 f13042k = a("measurement.upload.max_bundle_size", 65536, 65536, z1.f13459a);

    /* renamed from: k0  reason: collision with root package name */
    public static final f2 f13043k0;

    /* renamed from: l  reason: collision with root package name */
    public static final f2 f13044l = a("measurement.upload.max_events_per_bundle", 1000, 1000, b2.f12914a);

    /* renamed from: l0  reason: collision with root package name */
    public static final f2 f13045l0;
    public static final f2 m = a("measurement.upload.max_events_per_day", 100000, 100000, b3.B);

    /* renamed from: m0  reason: collision with root package name */
    public static final f2 f13046m0;

    /* renamed from: n  reason: collision with root package name */
    public static final f2 f13047n = a("measurement.upload.max_error_events_per_day", 1000, 1000, h0.f13095a);

    /* renamed from: n0  reason: collision with root package name */
    public static final f2 f13048n0;

    /* renamed from: o  reason: collision with root package name */
    public static final f2 f13049o = a("measurement.upload.max_public_events_per_day", 50000, 50000, q0.f13276a);

    /* renamed from: o0  reason: collision with root package name */
    public static final f2 f13050o0;

    /* renamed from: p  reason: collision with root package name */
    public static final f2 f13051p = a("measurement.upload.max_conversions_per_day", 10000, 10000, b1.f12913a);

    /* renamed from: p0  reason: collision with root package name */
    public static final f2 f13052p0;

    /* renamed from: q  reason: collision with root package name */
    public static final f2 f13053q = a("measurement.upload.max_realtime_events_per_day", 10, 10, m1.f13199a);

    /* renamed from: q0  reason: collision with root package name */
    public static final f2 f13054q0;

    /* renamed from: r  reason: collision with root package name */
    public static final f2 f13055r = a("measurement.store.max_stored_events_per_app", 100000, 100000, x1.f13416a);

    /* renamed from: r0  reason: collision with root package name */
    public static final f2 f13056r0;

    /* renamed from: s  reason: collision with root package name */
    public static final f2 f13057s = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", c2.f12933a);

    /* renamed from: s0  reason: collision with root package name */
    public static final f2 f13058s0;

    /* renamed from: t  reason: collision with root package name */
    public static final f2 f13059t = a("measurement.upload.backoff_period", 43200000L, 43200000L, d2.f12955a);

    /* renamed from: t0  reason: collision with root package name */
    public static final f2 f13060t0;

    /* renamed from: u  reason: collision with root package name */
    public static final f2 f13061u = a("measurement.upload.interval", 3600000L, 3600000L, n2.f454d);

    /* renamed from: u0  reason: collision with root package name */
    public static final f2 f13062u0;

    /* renamed from: v  reason: collision with root package name */
    public static final f2 f13063v;

    /* renamed from: v0  reason: collision with root package name */
    public static final f2 f13064v0;

    /* renamed from: w  reason: collision with root package name */
    public static final f2 f13065w = a("measurement.upload.debug_upload_interval", 1000L, 1000L, m9.b.B);

    /* renamed from: w0  reason: collision with root package name */
    public static final f2 f13066w0;

    /* renamed from: x  reason: collision with root package name */
    public static final f2 f13067x = a("measurement.upload.minimum_delay", 500L, 500L, g.B);

    /* renamed from: x0  reason: collision with root package name */
    public static final f2 f13068x0;

    /* renamed from: y  reason: collision with root package name */
    public static final f2 f13069y = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, androidx.databinding.a.f1766c);

    /* renamed from: y0  reason: collision with root package name */
    public static final f2 f13070y0;

    /* renamed from: z  reason: collision with root package name */
    public static final f2 f13071z = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, b1.f397c);

    static {
        Long valueOf = Long.valueOf(RecaptchaDefinitions.DEFAULT_TIMEOUT_INIT);
        f13026c = a("measurement.ad_id_cache_time", valueOf, valueOf, f1.f7215d);
        a("measurement.upload.window_interval", 3600000L, 3600000L, gf.J);
        f13063v = a("measurement.upload.realtime_upload_interval", valueOf, valueOf, b1.b.C);
        Boolean bool = Boolean.FALSE;
        L = a("measurement.test.boolean_flag", bool, bool, gc.b.I);
        Double valueOf2 = Double.valueOf(-3.0d);
        P = a("measurement.test.double_flag", valueOf2, valueOf2, z0.G);
        Boolean bool2 = Boolean.TRUE;
        a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, f0.f12985a);
        V = a("measurement.quality.checksum", bool, bool, (e2) null);
        W = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, g0.f13020a);
        X = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, cc.f4469b);
        Y = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, i0.f13117a);
        Z = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, j0.f13134a);
        f13023a0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, k0.f13147a);
        f13025b0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, l0.f13158a);
        f13027c0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, nc.f4765b);
        f13029d0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, n0.f13212a);
        f13031e0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, o0.f13240a);
        f13033f0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, p0.f13264a);
        a("measurement.collection.synthetic_data_mitigation", bool, bool, r0.f13295a);
        a("measurement.client.click_identifier_control.dev", bool, bool, t0.f13330a);
        a("measurement.service.click_identifier_control", bool, bool, u0.f13354a);
        f13037h0 = a("measurement.service.store_null_safelist", bool2, bool2, v0.f13373a);
        f13039i0 = a("measurement.service.store_safelist", bool2, bool2, e9.c.f7879d);
        f13041j0 = a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, x0.f13415a);
        f13043k0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, y0.f13436a);
        f13045l0 = a("measurement.session_stitching_token_enabled", bool, bool, a1.f12890a);
        a("measurement.sgtm.client.dev", bool, bool, c1.f12932a);
        f13046m0 = a("measurement.sgtm.service", bool, bool, d1.f12954a);
        f13048n0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, e1.f12971a);
        a("measurement.redaction.scion_payload_generator", bool2, bool2, f1.f12986a);
        f13050o0 = a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, g1.f13021a);
        f13052p0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, h1.f13096a);
        f13054q0 = a("measurement.sfmc.client", bool2, bool2, i1.f13118a);
        a("measurement.sfmc.service", bool2, bool2, k1.f13148a);
        f13056r0 = a("measurement.gmscore_feature_tracking", bool2, bool2, l1.f13159a);
        f13058s0 = a("measurement.fix_health_monitor_stack_trace", bool2, bool2, n1.f13213a);
        f13060t0 = a("measurement.item_scoped_custom_parameters.client", bool2, bool2, o1.f13241a);
        f13062u0 = a("measurement.item_scoped_custom_parameters.service", bool, bool, p1.f13265a);
        f13064v0 = a("measurement.remove_app_background.client", bool, bool, q1.f13277a);
        a("measurement.rb.attribution.service", bool, bool, r1.f13296a);
        f13066w0 = a("measurement.collection.client.log_target_api_version", bool2, bool2, s1.f13316a);
        f13068x0 = a("measurement.collection.service.log_target_api_version", bool2, bool2, t1.f13331a);
        f13070y0 = a("measurement.client.deep_link_referrer_fix", bool2, bool2, u1.f13355a);
        a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, w1.f13392a);
        a("measurement.link_sst_to_sid", bool, bool, y1.f13437a);
    }

    public static f2 a(String str, Object obj, Object obj2, e2 e2Var) {
        f2 f2Var = new f2(str, obj, obj2, e2Var);
        f13022a.add(f2Var);
        return f2Var;
    }
}
