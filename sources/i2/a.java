package i2;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.fragment.app.q;
import i2.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {
    public b B = new b();
    public b C;

    /* renamed from: a  reason: collision with root package name */
    public boolean f9418a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9419b = true;

    /* renamed from: c  reason: collision with root package name */
    public Cursor f9420c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f9421d = -1;

    /* renamed from: e  reason: collision with root package name */
    public C0171a f9422e = new C0171a();

    /* renamed from: i2.a$a  reason: collision with other inner class name */
    public class C0171a extends ContentObserver {
        public C0171a() {
            super(new Handler());
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z10) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f9419b && (cursor = aVar.f9420c) != null && !cursor.isClosed()) {
                aVar.f9418a = aVar.f9420c.requery();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public final void onChanged() {
            a aVar = a.this;
            aVar.f9418a = true;
            aVar.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f9418a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context) {
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f9420c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0171a aVar = this.f9422e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.B;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f9420c = cursor;
            if (cursor != null) {
                C0171a aVar2 = this.f9422e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.B;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f9421d = cursor.getColumnIndexOrThrow("_id");
                this.f9418a = true;
                notifyDataSetChanged();
            } else {
                this.f9421d = -1;
                this.f9418a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    public final int getCount() {
        Cursor cursor;
        if (!this.f9418a || (cursor = this.f9420c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i8, View view, ViewGroup viewGroup) {
        if (!this.f9418a) {
            return null;
        }
        this.f9420c.moveToPosition(i8);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.F.inflate(cVar.E, viewGroup, false);
        }
        b(view, this.f9420c);
        return view;
    }

    public final Filter getFilter() {
        if (this.C == null) {
            this.C = new b(this);
        }
        return this.C;
    }

    public final Object getItem(int i8) {
        Cursor cursor;
        if (!this.f9418a || (cursor = this.f9420c) == null) {
            return null;
        }
        cursor.moveToPosition(i8);
        return this.f9420c;
    }

    public final long getItemId(int i8) {
        Cursor cursor;
        if (!this.f9418a || (cursor = this.f9420c) == null || !cursor.moveToPosition(i8)) {
            return 0;
        }
        return this.f9420c.getLong(this.f9421d);
    }

    public View getView(int i8, View view, ViewGroup viewGroup) {
        if (!this.f9418a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f9420c.moveToPosition(i8)) {
            if (view == null) {
                view = e(viewGroup);
            }
            b(view, this.f9420c);
            return view;
        } else {
            throw new IllegalStateException(q.a("couldn't move cursor to position ", i8));
        }
    }
}
