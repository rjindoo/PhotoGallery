package ryan.d.photogallery.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {

    @GET("/" +
            "services/rest/?method=flickr.interestingness.getList" +
            "&api_key=bdd310184df7d772108cc95289ac0a54"+
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s")
    fun fetchPhotos(): Call<FlickrResponse>

}