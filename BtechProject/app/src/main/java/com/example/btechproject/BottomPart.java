
package com.example.btechproject;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;


public class BottomPart extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Bundle image = getIntent().getExtras();
        Bitmap bitmap  = image.getParcelable("image");
        ImageView view = (ImageView) findViewById(R.id.imageView);
        /*Bitmap bitmap = (Bitmap)this.getIntent().getParcelableExtra("Bitmap");
        ImageView viewBitmap = (ImageView)findViewById(R.id.bitmapview);
        viewBitmap.setImageBitmap(bitmap);*/
    }
}
