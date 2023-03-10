package org.home;

import lombok.*;

import java.net.URL;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Movie {

    @NonNull private Long id;
    @NonNull private String title;
    private String description;
    private String country;
    @NonNull private int rating;
    @Setter(AccessLevel.PROTECTED)
    private URL officialSite;
    private String language;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PRIVATE)

    private final int minutes = 120;
}
