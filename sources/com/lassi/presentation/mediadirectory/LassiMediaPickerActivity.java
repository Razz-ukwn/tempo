package com.lassi.presentation.mediadirectory;

import ag.n2;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import androidx.activity.result.e;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.i0;
import androidx.fragment.app.j0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import com.lassi.presentation.videopreview.VideoPreviewActivity;
import com.quickkonnect.silencio.R;
import ec.g;
import ec.i;
import ff.j;
import ff.m;
import gc.f;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import rf.l;
import sf.k;
import t1.a;
import yb.d;

public final class LassiMediaPickerActivity extends d<cc.d> {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ int f6646b0 = 0;
    public MenuItem W;
    public MenuItem X;
    public final e Y;
    public final j Z;

    /* renamed from: a0  reason: collision with root package name */
    public final LinkedHashMap f6647a0 = new LinkedHashMap();

    public static final class a extends k implements rf.a<g> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LassiMediaPickerActivity f6648a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(LassiMediaPickerActivity lassiMediaPickerActivity) {
            super(0);
            this.f6648a = lassiMediaPickerActivity;
        }

        public final Object d() {
            LassiMediaPickerActivity lassiMediaPickerActivity = this.f6648a;
            return (g) new m0((p0) lassiMediaPickerActivity, (m0.b) new i(lassiMediaPickerActivity)).a(g.class);
        }
    }

    public /* synthetic */ class b extends sf.i implements l<ArrayList<nb.b>, m> {
        public b(Object obj) {
            super(1, obj, LassiMediaPickerActivity.class, "handleSelectedMedia", "handleSelectedMedia(Ljava/util/ArrayList;)V");
        }

        public final Object invoke(Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            sf.j.f(arrayList, "p0");
            LassiMediaPickerActivity lassiMediaPickerActivity = (LassiMediaPickerActivity) this.f14944b;
            int i8 = LassiMediaPickerActivity.f6646b0;
            lassiMediaPickerActivity.T(arrayList);
            MenuItem menuItem = lassiMediaPickerActivity.W;
            if (menuItem != null) {
                menuItem.setVisible(!arrayList.isEmpty());
            }
            return m.f8717a;
        }
    }

    public static final class c implements f {
        public final void a(Bundle bundle, Object obj) {
            sf.j.f(obj, "target");
        }

        public final void b(Object obj) {
            sf.j.f(obj, "target");
        }
    }

    public LassiMediaPickerActivity() {
        c.b bVar = new c.b();
        sb.a aVar = new sb.a(this, 1);
        this.Y = this.H.c("activity_rq#" + this.G.getAndIncrement(), this, bVar, aVar);
        this.Z = b7.a.x(new a(this));
    }

    public final int M() {
        return R.layout.activity_media_picker;
    }

    public final void N() {
        Context applicationContext = getApplicationContext();
        c cVar = new c();
        synchronized (gc.b.class) {
            gc.b.f8931a = new gc.e(applicationContext, cVar);
        }
        rb.a aVar = rb.a.V;
        T(aVar.E);
        K().x((Toolbar) R(R.id.toolbar));
        e.a L = L();
        if (L != null) {
            L.n(true);
        }
        ((Toolbar) R(R.id.toolbar)).setBackground(new ColorDrawable(aVar.f14186a));
        ((Toolbar) R(R.id.toolbar)).setTitleTextColor(aVar.f14188c);
        e.a L2 = L();
        if (L2 != null) {
            int i8 = aVar.f14188c;
            Object obj = t1.a.f15323a;
            Drawable b10 = a.c.b(this, R.drawable.ic_back_white);
            if (b10 != null) {
                b10.setColorFilter(i8, PorterDuff.Mode.SRC_ATOP);
            }
            L2.o(b10);
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(aVar.f14187b);
        if (aVar.I == 1) {
            j0 I = I();
            I.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a((i0) I);
            aVar2.e(R.id.ftContainer, new sb.e(), (String) null);
            aVar2.h();
            return;
        }
        int c3 = q.g.c(aVar.F);
        if (c3 == 3) {
            j0 I2 = I();
            I2.getClass();
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a((i0) I2);
            aVar3.e(R.id.ftContainer, new bc.f(), (String) null);
            aVar3.h();
        } else if (c3 != 4) {
            j0 I3 = I();
            I3.getClass();
            androidx.fragment.app.a aVar4 = new androidx.fragment.app.a((i0) I3);
            aVar4.e(R.id.ftContainer, new ec.e(), (String) null);
            aVar4.h();
        } else {
            ArrayList arrayList = new ArrayList();
            for (String mimeTypeFromExtension : aVar.M) {
                String mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mimeTypeFromExtension);
                if (mimeTypeFromExtension2 != null) {
                    arrayList.add(mimeTypeFromExtension2);
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            sf.j.e(array, "mimeTypesList.toArray(mMimeTypeArray)");
            this.Y.a((String[]) array);
        }
    }

    public final yb.c O() {
        return (cc.d) new m0((p0) this, (m0.b) new bc.j(this, 1)).a(cc.d.class);
    }

    public final void Q() {
        ((cc.d) P()).f3965f.e(this, new qb.a(new b(this)));
    }

    public final View R(int i8) {
        LinkedHashMap linkedHashMap = this.f6647a0;
        Integer valueOf = Integer.valueOf(R.id.toolbar);
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.toolbar);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final void S(ArrayList<nb.b> arrayList) {
        Intent intent = new Intent();
        intent.putExtra("selected_media", arrayList);
        setResult(-1, intent);
        finish();
    }

    public final void T(ArrayList<nb.b> arrayList) {
        Parcelable.Creator<rb.a> creator = rb.a.CREATOR;
        int i8 = rb.a.V.G;
        if (i8 > 1) {
            String string = getString(R.string.selected_items);
            sf.j.e(string, "getString(R.string.selected_items)");
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(arrayList.size()), Integer.valueOf(i8)}, 2));
            sf.j.e(format, "format(format, *args)");
            ((Toolbar) R(R.id.toolbar)).setTitle((CharSequence) format);
            return;
        }
        ((Toolbar) R(R.id.toolbar)).setTitle((CharSequence) "");
    }

    public final void onActivityResult(int i8, int i10, Intent intent) {
        super.onActivityResult(i8, i10, intent);
        if (i8 == 203 && i10 == -1 && intent != null) {
            boolean hasExtra = intent.hasExtra("selected_media");
            j jVar = this.Z;
            if (hasExtra) {
                Serializable serializableExtra = intent.getSerializableExtra("selected_media");
                sf.j.d(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.lassi.data.media.MiMedia>{ kotlin.collections.TypeAliasesKt.ArrayList<com.lassi.data.media.MiMedia> }");
                ArrayList arrayList = (ArrayList) serializableExtra;
                rb.a aVar = rb.a.V;
                aVar.E.addAll(arrayList);
                ((cc.d) P()).e(arrayList);
                ((g) jVar.getValue()).g();
                int i11 = aVar.I;
                if (i11 == 3 || i11 == 2) {
                    j0 I = I();
                    I.getClass();
                    I.v(new i0.n((String) null, -1, 0), false);
                }
            } else if (intent.hasExtra("mediaPreview")) {
                nb.b bVar = (nb.b) intent.getParcelableExtra("mediaPreview");
                rb.a aVar2 = rb.a.V;
                if (aVar2.G == 1 || aVar2.I == 1) {
                    sf.j.c(bVar);
                    S(cb.d.m(bVar));
                    return;
                }
                ArrayList<nb.b> arrayList2 = aVar2.E;
                sf.j.c(bVar);
                arrayList2.add(bVar);
                cc.d dVar = (cc.d) P();
                dVar.getClass();
                dVar.f3966g.add(bVar);
                ArrayList<nb.b> arrayList3 = dVar.f3966g;
                HashSet hashSet = new HashSet();
                ArrayList<nb.b> arrayList4 = new ArrayList<>();
                for (T next : arrayList3) {
                    if (hashSet.add(((nb.b) next).f11620c)) {
                        arrayList4.add(next);
                    }
                }
                dVar.f3966g = arrayList4;
                dVar.f3965f.k(arrayList4);
                ((g) jVar.getValue()).g();
                int i12 = rb.a.V.I;
                if (i12 == 3 || i12 == 2) {
                    j0 I2 = I();
                    I2.getClass();
                    I2.v(new i0.n((String) null, -1, 0), false);
                }
            }
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        sf.j.f(menu, "menu");
        getMenuInflater().inflate(R.menu.media_picker_menu, menu);
        this.W = menu.findItem(R.id.menuDone);
        this.X = menu.findItem(R.id.menuCamera);
        MenuItem menuItem = this.W;
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
        MenuItem menuItem2 = this.X;
        if (menuItem2 != null) {
            menuItem2.setVisible(false);
        }
        MenuItem menuItem3 = this.W;
        if (menuItem3 != null) {
            Parcelable.Creator<rb.a> creator = rb.a.CREATOR;
            int i8 = rb.a.V.f14188c;
            Object obj = t1.a.f15323a;
            Drawable b10 = a.c.b(this, R.drawable.ic_done_white);
            if (b10 != null) {
                b10.setColorFilter(i8, PorterDuff.Mode.SRC_ATOP);
            }
            menuItem3.setIcon(b10);
        }
        MenuItem menuItem4 = this.X;
        if (menuItem4 != null) {
            Parcelable.Creator<rb.a> creator2 = rb.a.CREATOR;
            int i10 = rb.a.V.f14188c;
            Object obj2 = t1.a.f15323a;
            Drawable b11 = a.c.b(this, R.drawable.ic_camera_white);
            if (b11 != null) {
                b11.setColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
            }
            menuItem4.setIcon(b11);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        sf.j.f(menuItem, "item");
        int itemId = menuItem.getItemId();
        boolean z10 = true;
        if (itemId == R.id.menuCamera) {
            ArrayList d10 = ((cc.d) P()).f3965f.d();
            if (d10 != null && d10.size() == rb.a.V.G) {
                Toast toast = n2.f452c;
                if (toast != null) {
                    toast.cancel();
                }
                Toast makeText = Toast.makeText(this, R.string.already_selected_max_items, 0);
                sf.j.e(makeText, "makeText(context, message, duration.value)");
                n2.f452c = makeText;
                makeText.show();
            } else {
                j0 I = I();
                I.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a((i0) I);
                aVar.d(R.id.ftContainer, new sb.e(), (String) null, 1);
                aVar.c(sb.e.class.getSimpleName());
                aVar.h();
            }
        } else if (itemId == R.id.menuDone) {
            rb.a aVar2 = rb.a.V;
            int c3 = q.g.c(aVar2.F);
            if (c3 == 0) {
                if (!(aVar2.G == 1 || aVar2.I == 1)) {
                    z10 = false;
                }
                if (!z10 || !aVar2.U) {
                    S(((cc.d) P()).f3965f.d());
                } else {
                    ArrayList<nb.b> d11 = ((cc.d) P()).f3965f.d();
                    sf.j.c(d11);
                    String str = ((nb.b) d11.get(0)).f11620c;
                    sf.j.c(str);
                    Uri fromFile = Uri.fromFile(new File(str));
                    sf.j.e(fromFile, "uri");
                    gf.c(this, fromFile);
                }
            } else if (c3 == 1 || c3 == 2 || c3 == 3) {
                if (!(aVar2.G == 1 || aVar2.I == 1)) {
                    z10 = false;
                }
                if (z10) {
                    ArrayList<nb.b> d12 = ((cc.d) P()).f3965f.d();
                    sf.j.c(d12);
                    String str2 = ((nb.b) d12.get(0)).f11620c;
                    sf.j.c(str2);
                    Intent intent = new Intent(this, VideoPreviewActivity.class);
                    intent.putExtra("videoPath", str2);
                    startActivityForResult(intent, 203);
                } else {
                    S(((cc.d) P()).f3965f.d());
                }
            }
        } else if (itemId == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        sf.j.f(menu, "menu");
        MenuItem menuItem = this.X;
        boolean z10 = false;
        if (menuItem != null) {
            int i8 = rb.a.V.I;
            menuItem.setVisible(i8 == 1 || i8 == 3);
        }
        MenuItem menuItem2 = this.W;
        if (menuItem2 != null) {
            Collection d10 = ((cc.d) P()).f3965f.d();
            if (d10 == null || d10.isEmpty()) {
                z10 = true;
            }
            menuItem2.setVisible(!z10);
        }
        return super.onPrepareOptionsMenu(menu);
    }
}
