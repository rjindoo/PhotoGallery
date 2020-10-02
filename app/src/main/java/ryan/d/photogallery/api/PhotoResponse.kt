package ryan.d.photogallery.api

import com.google.gson.annotations.SerializedName
import ryan.d.photogallery.GalleryItem

class PhotoResponse {
    @SerializedName("photo") // indicates that we want the "photo" data from JSON
    lateinit var galleryItems: List<GalleryItem>
}