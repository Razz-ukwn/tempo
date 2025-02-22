package com.lassi.presentation.videopreview;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.widget.Toolbar;
import com.quickkonnect.silencio.R;
import e9.c;
import ff.m;
import java.io.File;
import java.util.LinkedHashMap;
import nb.b;
import rf.p;
import sf.i;
import sf.j;
import t1.a;

public final class VideoPreviewActivity extends yb.a {
    public static final /* synthetic */ int X = 0;
    public String V;
    public final LinkedHashMap W = new LinkedHashMap();

    public /* synthetic */ class a extends i implements p<Uri, String, m> {
        public a(Object obj) {
            super(2, obj, VideoPreviewActivity.class, "onFileScanComplete", "onFileScanComplete(Landroid/net/Uri;Ljava/lang/String;)V");
        }

        public final Object invoke(Object obj, Object obj2) {
            Uri uri = (Uri) obj;
            String str = (String) obj2;
            VideoPreviewActivity videoPreviewActivity = (VideoPreviewActivity) this.f14944b;
            int i8 = VideoPreviewActivity.X;
            if (uri != null) {
                Cursor query = videoPreviewActivity.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
                if (query != null) {
                    try {
                        query.moveToFirst();
                        try {
                            b bVar = new b(query.getLong(query.getColumnIndex("_id")), query.getString(query.getColumnIndex("_display_name")), query.getString(query.getColumnIndex("_data")), query.getLong(query.getColumnIndex("duration")), (String) null, 0, false, 112);
                            Intent intent = new Intent();
                            intent.putExtra("mediaPreview", bVar);
                            videoPreviewActivity.setResult(-1, intent);
                            videoPreviewActivity.finish();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        query.close();
                        m mVar = m.f8717a;
                        c.c(query, (Throwable) null);
                        return m.f8717a;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            Throwable th4 = th3;
                            c.c(query, th2);
                            throw th4;
                        }
                    }
                }
            } else {
                videoPreviewActivity.getClass();
            }
            if (str != null) {
                b bVar2 = new b(0, (String) null, str, 0, (String) null, 0, false, 123);
                Intent intent2 = new Intent();
                intent2.putExtra("mediaPreview", bVar2);
                videoPreviewActivity.setResult(-1, intent2);
                videoPreviewActivity.finish();
            }
            return m.f8717a;
        }
    }

    public final int M() {
        return R.layout.activity_video_preview;
    }

    public final void N() {
        ((Toolbar) O(R.id.toolbar)).setTitle((CharSequence) "");
        K().x((Toolbar) O(R.id.toolbar));
        e.a L = L();
        if (L != null) {
            L.n(true);
        }
        ((Toolbar) O(R.id.toolbar)).setTitle((CharSequence) "");
        rb.a aVar = rb.a.V;
        ((Toolbar) O(R.id.toolbar)).setBackground(new ColorDrawable(aVar.f14186a));
        ((Toolbar) O(R.id.toolbar)).setTitleTextColor(aVar.f14188c);
        Object obj = t1.a.f15323a;
        Drawable b10 = a.c.b(this, R.drawable.ic_back_white);
        if (b10 != null) {
            b10.setColorFilter(v1.a.a(aVar.f14188c));
        }
        e.a L2 = L();
        if (L2 != null) {
            L2.o(b10);
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(aVar.f14187b);
        if (!((VideoView) O(R.id.videoView)).isPlaying()) {
            ((VideoView) O(R.id.videoView)).start();
        }
        if (getIntent() == null) {
            finish();
            return;
        }
        this.V = getIntent().getStringExtra("videoPath");
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView((VideoView) O(R.id.videoView));
        mediaController.setMediaPlayer((VideoView) O(R.id.videoView));
        ((VideoView) O(R.id.videoView)).setMediaController(mediaController);
        ((VideoView) O(R.id.videoView)).setVideoURI(Uri.fromFile(new File(this.V)));
    }

    public final View O(int i8) {
        LinkedHashMap linkedHashMap = this.W;
        View view = (View) linkedHashMap.get(Integer.valueOf(i8));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i8);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i8), findViewById);
        return findViewById;
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        j.f(menu, "menu");
        getMenuInflater().inflate(R.menu.video_preview_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        j.f(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuDone) {
            String str = this.V;
            if (str != null) {
                String[] strArr = {str};
                String[] strArr2 = {"video/mp4"};
                MediaScannerConnection.scanFile(this, strArr, strArr2, new lb.a(new a(this)));
            }
        } else if (itemId == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
