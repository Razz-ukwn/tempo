package com.lassi.presentation.cropper;

import ac.a;
import ac.b;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.c;
import com.lassi.presentation.cropper.CropImageView;
import com.quickkonnect.silencio.R;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import sf.j;
import t1.a;

public class CropImageActivity extends c implements CropImageView.i, CropImageView.e {
    public static final /* synthetic */ int Z = 0;
    public final String V = "CropImageActivity";
    public Uri W;
    public d X;
    public final LinkedHashMap Y = new LinkedHashMap();

    public static void N(Menu menu, int i8, int i10) {
        Drawable icon;
        MenuItem findItem = menu.findItem(i8);
        if (findItem != null && (icon = findItem.getIcon()) != null) {
            try {
                icon.mutate();
                icon.setColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (Exception e10) {
                Log.w("AIC", "Failed to update menu item color", e10);
            }
        }
    }

    public final View M(int i8) {
        LinkedHashMap linkedHashMap = this.Y;
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

    public final void m(CropImageView cropImageView, Uri uri, Exception exc) {
        j.f(uri, "uri");
        if (exc == null) {
            d dVar = this.X;
            j.c(dVar);
            if (dVar.f6624i0 != null) {
                CropImageView cropImageView2 = (CropImageView) M(R.id.cropImageView);
                j.c(cropImageView2);
                d dVar2 = this.X;
                j.c(dVar2);
                cropImageView2.setCropRect(dVar2.f6624i0);
            }
            d dVar3 = this.X;
            j.c(dVar3);
            if (dVar3.f6625j0 > -1) {
                CropImageView cropImageView3 = (CropImageView) M(R.id.cropImageView);
                j.c(cropImageView3);
                d dVar4 = this.X;
                j.c(dVar4);
                cropImageView3.setRotatedDegrees(dVar4.f6625j0);
            }
        }
    }

    @SuppressLint({"NewApi"})
    public final void onActivityResult(int i8, int i10, Intent intent) {
        Uri uri;
        String action;
        super.onActivityResult(i8, i10, intent);
        if (i8 == 200) {
            boolean z10 = false;
            if (i10 == 0) {
                setResult(0);
                finish();
            }
            if (i10 == -1) {
                if (intent == null || intent.getData() == null || ((action = intent.getAction()) != null && action.equals("android.media.action.IMAGE_CAPTURE"))) {
                    z10 = true;
                }
                if (z10 || intent.getData() == null) {
                    File externalCacheDir = getExternalCacheDir();
                    uri = externalCacheDir != null ? Uri.fromFile(new File(externalCacheDir.getPath(), "pickImageResult.jpeg")) : null;
                } else {
                    uri = intent.getData();
                }
                this.W = uri;
                j.c(uri);
                if (a.c(this, uri)) {
                    requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                    return;
                }
                CropImageView cropImageView = (CropImageView) M(R.id.cropImageView);
                j.c(cropImageView);
                cropImageView.setImageUriAsync(this.W);
            }
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        finish();
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r0 = 2131492933(0x7f0c0045, float:1.8609332E38)
            r4.setContentView((int) r0)
            r0 = 2131297349(0x7f090445, float:1.821264E38)
            android.view.View r1 = r4.M(r0)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            java.lang.String r2 = ""
            r1.setTitle((java.lang.CharSequence) r2)
            android.view.View r1 = r4.M(r0)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            e.e r2 = r4.K()
            r2.x(r1)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "CROP_IMAGE_EXTRA_BUNDLE"
            android.os.Bundle r1 = r1.getBundleExtra(r2)
            r2 = 0
            if (r1 == 0) goto L_0x003a
            java.lang.String r3 = "CROP_IMAGE_EXTRA_SOURCE"
            android.os.Parcelable r3 = r1.getParcelable(r3)
            android.net.Uri r3 = (android.net.Uri) r3
            goto L_0x003b
        L_0x003a:
            r3 = r2
        L_0x003b:
            r4.W = r3
            if (r1 == 0) goto L_0x0048
            java.lang.String r2 = "CROP_IMAGE_EXTRA_OPTIONS"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            r2 = r1
            com.lassi.presentation.cropper.d r2 = (com.lassi.presentation.cropper.d) r2
        L_0x0048:
            r4.X = r2
            if (r5 != 0) goto L_0x0094
            android.net.Uri r5 = r4.W
            if (r5 == 0) goto L_0x007f
            android.net.Uri r1 = android.net.Uri.EMPTY
            boolean r5 = sf.j.a(r5, r1)
            if (r5 == 0) goto L_0x0059
            goto L_0x007f
        L_0x0059:
            android.net.Uri r5 = r4.W
            sf.j.c(r5)
            boolean r5 = ac.a.c(r4, r5)
            if (r5 == 0) goto L_0x0070
            java.lang.String r5 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r1 = 201(0xc9, float:2.82E-43)
            r4.requestPermissions(r5, r1)
            goto L_0x0094
        L_0x0070:
            r5 = 2131296653(0x7f09018d, float:1.8211229E38)
            android.view.View r5 = r4.M(r5)
            com.lassi.presentation.cropper.CropImageView r5 = (com.lassi.presentation.cropper.CropImageView) r5
            android.net.Uri r1 = r4.W
            r5.setImageUriAsync(r1)
            goto L_0x0094
        L_0x007f:
            boolean r5 = ac.a.b(r4)
            if (r5 == 0) goto L_0x0091
            java.lang.String r5 = "android.permission.CAMERA"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r1 = 2011(0x7db, float:2.818E-42)
            r4.requestPermissions(r5, r1)
            goto L_0x0094
        L_0x0091:
            ac.a.d(r4)
        L_0x0094:
            e.a r5 = r4.L()
            if (r5 == 0) goto L_0x009e
            r1 = 1
            r5.n(r1)
        L_0x009e:
            rb.a r5 = rb.a.V
            android.view.View r1 = r4.M(r0)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            int r3 = r5.f14186a
            r2.<init>(r3)
            r1.setBackground(r2)
            android.view.View r0 = r4.M(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            int r1 = r5.f14188c
            r0.setTitleTextColor((int) r1)
            java.lang.Object r0 = t1.a.f15323a
            r0 = 2131165629(0x7f0701bd, float:1.794548E38)
            android.graphics.drawable.Drawable r0 = t1.a.c.b(r4, r0)
            if (r0 == 0) goto L_0x00cd
            int r1 = r5.f14188c
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0.setColorFilter(r1, r2)
        L_0x00cd:
            e.a r1 = r4.L()
            if (r1 == 0) goto L_0x00d6
            r1.o(r0)
        L_0x00d6:
            android.view.Window r0 = r4.getWindow()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r1)
            android.view.Window r0 = r4.getWindow()
            int r5 = r5.f14187b
            r0.setStatusBarColor(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lassi.presentation.cropper.CropImageActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        j.f(menu, "menu");
        getMenuInflater().inflate(R.menu.crop_image_menu, menu);
        MenuItem findItem = menu.findItem(R.id.crop_image_menu_rotate_left);
        if (findItem != null) {
            int i8 = rb.a.V.f14188c;
            Object obj = t1.a.f15323a;
            Drawable b10 = a.c.b(this, R.drawable.ic_crop_image_menu_rotate_left);
            if (b10 != null) {
                b10.setColorFilter(i8, PorterDuff.Mode.SRC_ATOP);
            }
            findItem.setIcon(b10);
        }
        MenuItem findItem2 = menu.findItem(R.id.crop_image_menu_rotate_right);
        if (findItem2 != null) {
            int i10 = rb.a.V.f14188c;
            Object obj2 = t1.a.f15323a;
            Drawable b11 = a.c.b(this, R.drawable.ic_crop_image_menu_rotate_right);
            if (b11 != null) {
                b11.setColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
            }
            findItem2.setIcon(b11);
        }
        MenuItem findItem3 = menu.findItem(R.id.crop_image_menu_flip);
        if (findItem3 != null) {
            int i11 = rb.a.V.f14188c;
            Object obj3 = t1.a.f15323a;
            Drawable b12 = a.c.b(this, R.drawable.ic_crop_image_menu_flip);
            if (b12 != null) {
                b12.setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
            }
            findItem3.setIcon(b12);
        }
        MenuItem findItem4 = menu.findItem(R.id.crop_image_menu_crop);
        if (findItem4 != null) {
            int i12 = rb.a.V.f14188c;
            Object obj4 = t1.a.f15323a;
            Drawable b13 = a.c.b(this, R.drawable.ic_done_white);
            if (b13 != null) {
                b13.setColorFilter(i12, PorterDuff.Mode.SRC_ATOP);
            }
            findItem4.setIcon(b13);
        }
        d dVar = this.X;
        j.c(dVar);
        if (!dVar.f6626k0) {
            menu.removeItem(R.id.crop_image_menu_rotate_left);
            menu.removeItem(R.id.crop_image_menu_rotate_right);
        } else {
            d dVar2 = this.X;
            j.c(dVar2);
            if (dVar2.f6628m0) {
                menu.findItem(R.id.crop_image_menu_rotate_left).setVisible(true);
            }
        }
        d dVar3 = this.X;
        j.c(dVar3);
        if (!dVar3.f6627l0) {
            menu.removeItem(R.id.crop_image_menu_flip);
        }
        d dVar4 = this.X;
        j.c(dVar4);
        if (dVar4.f6632q0 != null) {
            MenuItem findItem5 = menu.findItem(R.id.crop_image_menu_crop);
            d dVar5 = this.X;
            j.c(dVar5);
            findItem5.setTitle(dVar5.f6632q0);
        }
        Drawable drawable = null;
        try {
            d dVar6 = this.X;
            j.c(dVar6);
            if (dVar6.f6633r0 != 0) {
                d dVar7 = this.X;
                j.c(dVar7);
                int i13 = dVar7.f6633r0;
                Object obj5 = t1.a.f15323a;
                drawable = a.c.b(this, i13);
                menu.findItem(R.id.crop_image_menu_crop).setIcon(drawable);
            }
        } catch (Exception e10) {
            Log.w("AIC", "Failed to read menu crop drawable", e10);
        }
        d dVar8 = this.X;
        j.c(dVar8);
        if (dVar8.f6612a0 != 0) {
            d dVar9 = this.X;
            j.c(dVar9);
            N(menu, R.id.crop_image_menu_rotate_left, dVar9.f6612a0);
            d dVar10 = this.X;
            j.c(dVar10);
            N(menu, R.id.crop_image_menu_rotate_right, dVar10.f6612a0);
            d dVar11 = this.X;
            j.c(dVar11);
            N(menu, R.id.crop_image_menu_flip, dVar11.f6612a0);
            if (drawable != null) {
                d dVar12 = this.X;
                j.c(dVar12);
                N(menu, R.id.crop_image_menu_crop, dVar12.f6612a0);
            }
        }
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        j.f(menuItem, "item");
        if (menuItem.getItemId() == R.id.crop_image_menu_crop) {
            d dVar = this.X;
            j.c(dVar);
            if (!dVar.f6623h0) {
                d dVar2 = this.X;
                Bitmap.CompressFormat compressFormat = null;
                Uri uri = dVar2 != null ? dVar2.f6614b0 : null;
                if (uri == null || j.a(uri, Uri.EMPTY)) {
                    try {
                        d dVar3 = this.X;
                        if ((dVar3 != null ? dVar3.f6616c0 : null) == Bitmap.CompressFormat.JPEG) {
                            str = ".jpg";
                        } else {
                            if (dVar3 != null) {
                                compressFormat = dVar3.f6616c0;
                            }
                            str = compressFormat == Bitmap.CompressFormat.PNG ? ".png" : ".webp";
                        }
                        uri = Uri.fromFile(File.createTempFile("cropped", str, getCacheDir()));
                    } catch (IOException e10) {
                        throw new RuntimeException("Failed to create temp file for output image", e10);
                    }
                }
                Uri uri2 = uri;
                j.c(uri2);
                CropImageView cropImageView = (CropImageView) M(R.id.cropImageView);
                j.c(cropImageView);
                d dVar4 = this.X;
                j.c(dVar4);
                Bitmap.CompressFormat compressFormat2 = dVar4.f6616c0;
                d dVar5 = this.X;
                j.c(dVar5);
                int i8 = dVar5.f6618d0;
                d dVar6 = this.X;
                j.c(dVar6);
                int i10 = dVar6.f6620e0;
                d dVar7 = this.X;
                j.c(dVar7);
                int i11 = dVar7.f6621f0;
                d dVar8 = this.X;
                j.c(dVar8);
                int i12 = dVar8.f6622g0;
                if (cropImageView.T != null) {
                    cropImageView.i(i10, i11, i8, compressFormat2, uri2, i12);
                } else {
                    throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
                }
            }
            return true;
        } else if (menuItem.getItemId() == R.id.crop_image_menu_rotate_left) {
            d dVar9 = this.X;
            j.c(dVar9);
            CropImageView cropImageView2 = (CropImageView) M(R.id.cropImageView);
            j.c(cropImageView2);
            cropImageView2.e(-dVar9.f6629n0);
            return true;
        } else if (menuItem.getItemId() == R.id.crop_image_menu_rotate_right) {
            d dVar10 = this.X;
            j.c(dVar10);
            CropImageView cropImageView3 = (CropImageView) M(R.id.cropImageView);
            j.c(cropImageView3);
            cropImageView3.e(dVar10.f6629n0);
            return true;
        } else if (menuItem.getItemId() == R.id.crop_image_menu_flip_horizontally) {
            CropImageView cropImageView4 = (CropImageView) M(R.id.cropImageView);
            j.c(cropImageView4);
            cropImageView4.H = !cropImageView4.H;
            cropImageView4.a((float) cropImageView4.getWidth(), (float) cropImageView4.getHeight(), true, false);
            return true;
        } else if (menuItem.getItemId() == R.id.crop_image_menu_flip_vertically) {
            CropImageView cropImageView5 = (CropImageView) M(R.id.cropImageView);
            j.c(cropImageView5);
            cropImageView5.I = !cropImageView5.I;
            cropImageView5.a((float) cropImageView5.getWidth(), (float) cropImageView5.getHeight(), true, false);
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            setResult(0);
            finish();
            return true;
        }
    }

    public final void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        j.f(strArr, "permissions");
        j.f(iArr, "grantResults");
        if (i8 == 201) {
            if (this.W != null) {
                if ((!(iArr.length == 0)) && iArr[0] == 0) {
                    CropImageView cropImageView = (CropImageView) M(R.id.cropImageView);
                    j.c(cropImageView);
                    cropImageView.setImageUriAsync(this.W);
                }
            }
            Toast.makeText(this, R.string.crop_image_activity_no_permissions, 1).show();
            setResult(0);
            finish();
        }
        if (i8 == 2011) {
            ac.a.d(this);
        }
    }

    public final void onStart() {
        super.onStart();
        CropImageView cropImageView = (CropImageView) M(R.id.cropImageView);
        j.c(cropImageView);
        cropImageView.setOnSetImageUriCompleteListener(this);
        CropImageView cropImageView2 = (CropImageView) M(R.id.cropImageView);
        j.c(cropImageView2);
        cropImageView2.setOnCropImageCompleteListener(this);
    }

    public final void onStop() {
        super.onStop();
        CropImageView cropImageView = (CropImageView) M(R.id.cropImageView);
        j.c(cropImageView);
        cropImageView.setOnSetImageUriCompleteListener((CropImageView.i) null);
        CropImageView cropImageView2 = (CropImageView) M(R.id.cropImageView);
        j.c(cropImageView2);
        cropImageView2.setOnCropImageCompleteListener((CropImageView.e) null);
    }

    public final void r(CropImageView cropImageView, CropImageView.b bVar) {
        String path;
        Uri uri = bVar.f6550a;
        if (uri != null && (path = uri.getPath()) != null) {
            String[] strArr = {path};
            MediaScannerConnection.scanFile(this, strArr, new String[]{"image/*"}, new lb.a(new b(this)));
        }
    }
}
