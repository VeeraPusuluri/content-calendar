package vsg.veera.contentcalendar.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import vsg.veera.contentcalendar.model.Content;
import vsg.veera.contentcalendar.model.Status;
import vsg.veera.contentcalendar.model.Type;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    public List<Content> getContentList() {
        return contentList;
    }

    private final List<Content> contentList = new ArrayList<>();

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id){
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content){
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    @PostConstruct
    private void init(){
        Content c = new Content(1, "first title","first desc", Status.IDEA, Type.ARTICLE, LocalDateTime.now(),null,"");
        contentList.add(c);
    }


    public boolean existById(Integer id) {
       return contentList.stream().anyMatch(c -> c.id().equals(id));
    }

    public void delete(Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }
}
