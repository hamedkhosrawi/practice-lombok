package org.home;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder(toBuilder = true)
@EqualsAndHashCode
@CustomLog
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
    @Builder.Default
    private final int minutes = 120;
    @Singular("cast")
    List<String> cast;
    public int getMinutesPlusX(@NonNull int x){

        log.info("Adding  " + x);
        return this.minutes + x;
    }

}
