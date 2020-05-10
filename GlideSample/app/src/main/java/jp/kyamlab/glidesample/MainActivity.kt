package jp.kyamlab.glidesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageUrl = "https://user-images.githubusercontent.com/11660859/81490064-3e97e080-92b8-11ea-9227-630029a6a70b.JPG"
        Glide.with(this).load(imageUrl).into(image_view)
    }
}
