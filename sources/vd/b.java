package vd;

import android.content.Intent;
import com.quickkonnect.silencio.ui.tabs.map.MapFragment;
import ff.m;
import rf.a;
import sf.k;

public final class b extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MapFragment f16419a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(MapFragment mapFragment) {
        super(0);
        this.f16419a = mapFragment;
    }

    public final Object d() {
        this.f16419a.m0(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        return m.f8717a;
    }
}
