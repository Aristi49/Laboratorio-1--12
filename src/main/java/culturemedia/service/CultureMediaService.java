package culturemedia.service;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.model.View;

import java.util.List;

public interface CultureMediaService {
    List<Video> findAll()throws VideoNotFoundException;;
    Video save(Video video)throws VideoNotFoundException;;
    View save(View view);

}
