package vsg.veera.contentcalendar.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vsg.veera.contentcalendar.model.Content;
import vsg.veera.contentcalendar.model.Status;
import vsg.veera.contentcalendar.model.Type;
import vsg.veera.contentcalendar.repository.ContentRepository;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.List;


@Component
public class DataLoader implements CommandLineRunner {


    ContentRepository contentRepository;
    ObjectMapper objectMapper;

    public DataLoader(ContentRepository contentRepository, ObjectMapper objectMapper) {
        this.contentRepository = contentRepository;
        this.objectMapper = objectMapper;
    }


    @Override
    public void run(String... args) throws Exception {
//        if(contentRepository.count() == 0) {
//            try (InputStream inputStream = TypeReference.class.getResourceAsStream("/data/content.json")) {
//                contentRepository.saveAll(objectMapper.readValue(inputStream,new TypeReference<List<Content>>(){}));
//            }
//        }
//        Content content = new Content( null,"first title", "first desc", Status.IDEA, Type.ARTICLE, LocalDateTime.now(), LocalDateTime.now(), null);
//        Content content1 = new Content(null, "second title", "second desc", Status.IDEA, Type.ARTICLE, LocalDateTime.now(), LocalDateTime.now(), null);
//
//        contentRepository.save(content);
    }
}
