package com.example.finalproject

class options {// ActivityOne.kt
fun launchComposeView() {
    // first parameter is the context, second is the class of the activity to launch
    val i = Intent(this@ActivityOne, ActivityTwo::class.java)
    startActivity(i) // brings up the second activity
}
}
// ActivityTwo.kt
fun onSubmit(v: View) {
    // closes the activity and returns to first screen
    this.finish();
}
Glide.with(context)
.load("http://via.placeholder.com/300.png")
.placeholder(R.drawable.placeholder)
.error(R.drawable.imagenotfound)
.into(ivImg)
@GlideModule
class MyAppGlideModule : AppGlideModule() {
    fun applyOptions(context: Context?, builder: GlideBuilder) {
        // Glide default Bitmap Format is set to RGB_565 since it
        // consumed just 50% memory footprint compared to ARGB_8888.
        // Increase memory usage for quality with:
        builder.setDefaultRequestOptions(RequestOptions().format(DecodeFormat.PREFER_ARGB_8888))
    }
}
Glide.with(context)
.load("http://via.placeholder.com/300.png")
.override(100, Target.SIZE_ORIGINAL) // resizes width to 100, preserves original height, does not respect aspect ratio
.into(ivImg);