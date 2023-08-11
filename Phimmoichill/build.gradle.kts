// use an integer for version numbers
version = 12


cloudstream {
    language = "vi"
    // All of these properties are optional, you can safely remove them

    // description = "List phim hay vietsub"
     authors = listOf("TuaSan")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "AsianDrama",
        "Anime",
        "TvSeries",
        "Movie",
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=phimmoichilld.net&sz=%size%"
}
