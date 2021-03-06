package com.wisedu.scc.love.activity.image;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import com.wisedu.scc.love.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_image_show)
public class ImageShowActivity extends Activity {

    @ViewById(R.id.id_showImage)
	public ImageView mImageView;

	@AfterViews
	protected void doAfterViews() {
		byte[] b = getIntent().getByteArrayExtra("bitmap");
		Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);
		if (bitmap != null) {
			mImageView.setImageBitmap(bitmap);
		}
	}

}