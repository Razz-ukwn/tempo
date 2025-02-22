package droidninja.filepicker;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bumptech.glide.b;
import com.bumptech.glide.m;
import com.quickkonnect.silencio.R;
import java.util.Arrays;
import java.util.List;
import je.a;
import je.c;
import je.d;
import ke.i;
import me.e;
import oe.g;
import sf.j;

public final class MediaDetailsActivity extends a implements ke.a {

    /* renamed from: f0  reason: collision with root package name */
    public static final /* synthetic */ int f7598f0 = 0;
    public RecyclerView V;
    public TextView W;
    public m X;
    public i Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f7599a0 = Integer.MAX_VALUE;

    /* renamed from: b0  reason: collision with root package name */
    public int f7600b0 = Integer.MAX_VALUE;

    /* renamed from: c0  reason: collision with root package name */
    public MenuItem f7601c0;

    /* renamed from: d0  reason: collision with root package name */
    public e f7602d0;

    /* renamed from: e0  reason: collision with root package name */
    public oe.i f7603e0;

    public static final void O(MediaDetailsActivity mediaDetailsActivity) {
        if (!mediaDetailsActivity.isDestroyed() && !mediaDetailsActivity.isFinishing()) {
            m mVar = mediaDetailsActivity.X;
            if (mVar != null) {
                mVar.n();
            } else {
                j.l("mGlideRequestManager");
                throw null;
            }
        }
    }

    public final void M() {
        this.f7603e0 = (oe.i) new m0((p0) this, (m0.b) new m0.a(getApplication())).a(oe.i.class);
        m c3 = b.c(this).c(this);
        j.e(c3, "Glide.with(this)");
        this.X = c3;
        Intent intent = getIntent();
        if (intent != null) {
            this.Z = intent.getIntExtra("EXTRA_FILE_TYPE", 1);
            this.f7599a0 = intent.getIntExtra("EXTRA_IMAGE_FILE_SIZE", Integer.MAX_VALUE);
            this.f7600b0 = intent.getIntExtra("EXTRA__VIDEO_FILE_SIZE", Integer.MAX_VALUE);
            e eVar = (e) intent.getParcelableExtra(e.class.getSimpleName());
            this.f7602d0 = eVar;
            if (eVar != null) {
                this.V = (RecyclerView) findViewById(R.id.recyclerview);
                this.W = (TextView) findViewById(R.id.empty_view);
                Integer num = (Integer) je.e.f10002j.get(je.b.f9989b);
                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(num != null ? num.intValue() : 3);
                staggeredGridLayoutManager.d1();
                RecyclerView recyclerView = this.V;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(staggeredGridLayoutManager);
                }
                RecyclerView recyclerView2 = this.V;
                if (recyclerView2 != null) {
                    recyclerView2.setItemAnimator(new androidx.recyclerview.widget.e());
                }
                RecyclerView recyclerView3 = this.V;
                if (recyclerView3 != null) {
                    recyclerView3.h(new c(this));
                }
                oe.i iVar = this.f7603e0;
                String str = null;
                if (iVar != null) {
                    iVar.f12345h.e(this, new d(this));
                    oe.i iVar2 = this.f7603e0;
                    if (iVar2 != null) {
                        e eVar2 = this.f7602d0;
                        if (eVar2 != null) {
                            str = eVar2.f11474b;
                        }
                        iVar2.f(new g(iVar2, str, this.Z, this.f7599a0, this.f7600b0, (jf.d) null));
                        setTitle(0);
                        return;
                    }
                    j.l("viewModel");
                    throw null;
                }
                j.l("viewModel");
                throw null;
            }
        }
    }

    public final void a() {
        if (je.e.f9993a == 1) {
            setResult(-1, (Intent) null);
            finish();
        }
        setTitle(je.e.c());
    }

    public final void onBackPressed() {
        setResult(0, (Intent) null);
        finish();
    }

    @SuppressLint({"MissingSuperCall"})
    public final void onCreate(Bundle bundle) {
        N(R.layout.activity_media_details, bundle);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        j.f(menu, "menu");
        getMenuInflater().inflate(R.menu.media_detail_menu, menu);
        MenuItem findItem = menu.findItem(R.id.action_select);
        this.f7601c0 = findItem;
        boolean z10 = false;
        if (findItem != null) {
            int i8 = je.e.f9993a;
            findItem.setVisible(false);
        }
        MenuItem findItem2 = menu.findItem(R.id.action_done);
        if (findItem2 != null) {
            int i10 = je.e.f9993a;
            if (je.e.f9993a > 1) {
                z10 = true;
            }
            findItem2.setVisible(z10);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i iVar;
        j.f(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_done) {
            setResult(-1, (Intent) null);
            finish();
            return true;
        } else if (itemId == R.id.action_select) {
            MenuItem menuItem2 = this.f7601c0;
            if (!(menuItem2 == null || (iVar = this.Y) == null)) {
                if (menuItem2.isChecked()) {
                    int i8 = je.e.f9993a;
                    List<Uri> list = iVar.f10463e;
                    j.f(list, "paths");
                    je.e.f9994b.removeAll(list);
                    iVar.f10463e.clear();
                    iVar.g();
                    menuItem2.setIcon(R.drawable.ic_deselect_all);
                } else {
                    iVar.q();
                    int i10 = je.e.f9993a;
                    je.e.a(1, iVar.f10463e);
                    menuItem2.setIcon(R.drawable.ic_select_all);
                }
                menuItem2.setChecked(!menuItem2.isChecked());
                setTitle(je.e.c());
            }
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    public final void setTitle(int i8) {
        e.a L = L();
        if (L != null) {
            L.n(true);
            int i10 = je.e.f9993a;
            if (i10 == -1 && i8 > 0) {
                String string = getString(R.string.attachments_num);
                j.e(string, "getString(R.string.attachments_num)");
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i8)}, 1));
                j.e(format, "java.lang.String.format(format, *args)");
                L.r(format);
            } else if (i10 <= 0 || i8 <= 0) {
                e eVar = this.f7602d0;
                L.r(eVar != null ? eVar.f11476d : null);
            } else {
                String string2 = getString(R.string.attachments_title_text);
                j.e(string2, "getString(R.string.attachments_title_text)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i8), Integer.valueOf(i10)}, 2));
                j.e(format2, "java.lang.String.format(format, *args)");
                L.r(format2);
            }
        }
    }
}
