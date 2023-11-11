package api;

import java.util.List;

public class ApiResponse {
    private static final String BASE_URL = "https://rickandmortyapi.com/api/";

    public static RickAndMortyApiService createService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(RickAndMortyApiService.class);
    }
}

