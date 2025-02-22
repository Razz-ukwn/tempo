package vd;

import android.content.Intent;
import android.net.Uri;
import com.quickkonnect.silencio.ui.tabs.map.MapFragment;
import ff.m;
import rf.a;
import sf.j;
import sf.k;

public final class i extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MapFragment f16427a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(MapFragment mapFragment) {
        super(0);
        this.f16427a = mapFragment;
    }

    public final Object d() {
        MapFragment mapFragment = this.f16427a;
        j.f(mapFragment, "<this>");
        try {
            ag.m.c(mapFragment).o();
        } catch (Exception e10) {
            bh.a.f3654a.c(e10);
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        Uri fromParts = Uri.fromParts("package", mapFragment.e0().getPackageName(), (String) null);
        j.e(fromParts, "fromParts(\"package\", req…text().packageName, null)");
        intent.setData(fromParts);
        mapFragment.m0(intent);
        return m.f8717a;
    }
}
