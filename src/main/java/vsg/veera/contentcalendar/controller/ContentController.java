package vsg.veera.contentcalendar.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import vsg.veera.contentcalendar.model.Content;
import vsg.veera.contentcalendar.repository.ContentRepository;


@RestController
@RequestMapping("/api/content")
@CrossOrigin()
public class ContentController {


    ContentRepository repository;

    public ContentController(ContentRepository repository) {
        this.repository = repository;
    }


    @GetMapping("")
    public Iterable<Content> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Content findById(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "content not found"));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void saveContent(@Valid @RequestBody Content content) {
        repository.save(content);
    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("{id}")
    public void update(@RequestBody Content content, @PathVariable Integer id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "no content found");
        } else repository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }

}
