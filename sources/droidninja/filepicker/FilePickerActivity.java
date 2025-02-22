package droidninja.filepicker;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.i0;
import androidx.fragment.app.j0;
import com.quickkonnect.silencio.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import je.a;
import je.e;
import le.b;
import le.c;
import le.k;
import le.l;
import sf.j;

public final class FilePickerActivity extends a implements l, b.a, c.a, k.a {
    public int V;

    public final void M() {
        Intent intent = getIntent();
        if (intent != null) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("SELECTED_PHOTOS");
            this.V = intent.getIntExtra("EXTRA_PICKER_TYPE", 17);
            if (parcelableArrayListExtra != null) {
                if (e.f9993a == 1) {
                    parcelableArrayListExtra.clear();
                }
                e.f9994b.clear();
                e.f9995c.clear();
                if (this.V == 17) {
                    e.a(1, parcelableArrayListExtra);
                } else {
                    e.a(2, parcelableArrayListExtra);
                }
            }
            P(e.c());
            if (this.V == 17) {
                k kVar = new k();
                j0 I = I();
                I.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a((i0) I);
                aVar.f2107b = R.anim.slide_left_in;
                aVar.f2108c = R.anim.slide_left_out;
                aVar.f2109d = 0;
                aVar.f2110e = 0;
                aVar.e(R.id.container, kVar, k.class.getSimpleName());
                aVar.c((String) null);
                aVar.g();
                return;
            }
            if (e.f10000h) {
                LinkedHashSet<me.c> linkedHashSet = e.f9996d;
                linkedHashSet.add(new me.c("PDF", new String[]{"pdf"}, R.drawable.icon_file_pdf));
                linkedHashSet.add(new me.c("DOC", new String[]{"doc", "docx", "dot", "dotx"}, R.drawable.icon_file_doc));
                linkedHashSet.add(new me.c("PPT", new String[]{"ppt", "pptx"}, R.drawable.icon_file_ppt));
                linkedHashSet.add(new me.c("XLS", new String[]{"xls", "xlsx"}, R.drawable.icon_file_xls));
                linkedHashSet.add(new me.c("TXT", new String[]{"txt"}, R.drawable.icon_file_unknown));
            }
            c cVar = new c();
            j0 I2 = I();
            I2.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a((i0) I2);
            aVar2.f2107b = R.anim.slide_left_in;
            aVar2.f2108c = R.anim.slide_left_out;
            aVar2.f2109d = 0;
            aVar2.f2110e = 0;
            aVar2.e(R.id.container, cVar, c.class.getSimpleName());
            aVar2.c((String) null);
            aVar2.g();
        }
    }

    public final void O(ArrayList<Uri> arrayList) {
        Intent intent = new Intent();
        if (this.V == 17) {
            intent.putParcelableArrayListExtra("SELECTED_PHOTOS", arrayList);
        } else {
            intent.putParcelableArrayListExtra("SELECTED_DOCS", arrayList);
        }
        setResult(-1, intent);
        finish();
    }

    public final void P(int i8) {
        e.a L = L();
        if (L != null) {
            int i10 = e.f9993a;
            if (i10 == -1 && i8 > 0) {
                String string = getString(R.string.attachments_num);
                j.e(string, "getString(R.string.attachments_num)");
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i8)}, 1));
                j.e(format, "java.lang.String.format(format, *args)");
                L.r(format);
            } else if (i10 > 0 && i8 > 0) {
                String string2 = getString(R.string.attachments_title_text);
                j.e(string2, "getString(R.string.attachments_title_text)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i8), Integer.valueOf(i10)}, 2));
                j.e(format2, "java.lang.String.format(format, *args)");
                L.r(format2);
            } else if (!TextUtils.isEmpty((CharSequence) null)) {
                L.r((String) null);
            } else if (this.V == 17) {
                L.q(R.string.select_photo_text);
            } else {
                L.q(R.string.select_doc_text);
            }
        }
    }

    public final void a() {
        int c3 = e.c();
        P(c3);
        if (e.f9993a == 1 && c3 == 1) {
            O(this.V == 17 ? e.f9994b : e.f9995c);
        }
    }

    public final void onActivityResult(int i8, int i10, Intent intent) {
        super.onActivityResult(i8, i10, intent);
        if (i8 == 235) {
            if (i10 != -1) {
                P(e.c());
            } else if (this.V == 17) {
                O(e.f9994b);
            } else {
                O(e.f9995c);
            }
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        finish();
    }

    @SuppressLint({"MissingSuperCall"})
    public final void onCreate(Bundle bundle) {
        N(R.layout.activity_file_picker, bundle);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        j.f(menu, "menu");
        getMenuInflater().inflate(R.menu.picker_menu, menu);
        MenuItem findItem = menu.findItem(R.id.action_done);
        if (findItem != null) {
            int i8 = e.f9993a;
            boolean z10 = true;
            if (e.f9993a == 1) {
                z10 = false;
            }
            findItem.setVisible(z10);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final void onDestroy() {
        int i8 = e.f9993a;
        e.f9995c.clear();
        e.f9994b.clear();
        e.f9996d.clear();
        e.f9993a = -1;
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        j.f(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_done) {
            if (this.V == 17) {
                int i8 = e.f9993a;
                O(e.f9994b);
            } else {
                int i10 = e.f9993a;
                O(e.f9995c);
            }
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }
}
